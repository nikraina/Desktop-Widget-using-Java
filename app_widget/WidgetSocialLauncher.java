package app_widget;

import java.awt.Color;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author nraina
 */

public class WidgetSocialLauncher extends javax.swing.JDialog 
{   
	private JLabel Gmail;
    private JLabel Background;
    private JLabel Facebook;
    private JLabel LinkedIn;
    private JLabel YouTube;
    
	int width = (Toolkit.getDefaultToolkit().getScreenSize().width);
	int xMouse, yMouse;
	LaunchInBrowser launch = new LaunchInBrowser();
	
    public WidgetSocialLauncher(Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocation(width-300, 20);
    }

    private void initComponents() {

        YouTube = new JLabel();
        Gmail = new JLabel();
        LinkedIn = new JLabel();
        Facebook = new JLabel();
        Background = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widget");
        setMaximumSize(new Dimension(280, 75));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("YouTube.png"))); 
        YouTube.setAutoscrolls(true);
        YouTube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(YouTube, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, 54, 54));
        YouTube.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                YouTubeMousePressed(evt);
            }});
        

        Gmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("Gmail.png"))); 
        Gmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 13, 54, 54));
        Gmail.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt){
        		GmailMousePressed(evt);
        	}});

        LinkedIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("LinkedIn.png"))); 
        LinkedIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LinkedIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 13, 54, 54));
        LinkedIn.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt){
        		LinkedInMousePressed(evt);
        	}});

        Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("Facebook.png"))); // NOI18N
        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, 54, 54));
        Facebook.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacebookMousePressed(evt);
            }});
        	


        Background.setBackground(new java.awt.Color(22, 160, 133));
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 75));
        Background.getAccessibleContext().setAccessibleDescription("");
        Background.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }});
        Background.addMouseMotionListener(new java.awt.event.MouseAdapter(){
        	public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }
    
    private void BackgroundMousePressed(java.awt.event.MouseEvent event){
    	xMouse = event.getX();
    	yMouse = event.getY();    	
    }
    
    private void BackgroundMouseDragged(java.awt.event.MouseEvent event){
    	int x = event.getXOnScreen();
    	int y = event.getYOnScreen();
    	this.setLocation(x - xMouse, y - yMouse);
    }
    
    private void FacebookMousePressed(MouseEvent evt){
    	launch.LaunchFacebook();
    }
    
    
    private void YouTubeMousePressed(MouseEvent evt){
    	launch.LaunchYouTube();
    }
    
    private void GmailMousePressed(MouseEvent evt){
    	launch.LaunchGmail();
    }
    
    private void LinkedInMousePressed(MouseEvent evt){
    	launch.LaunchLinkedIn();
    }
    

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetSocialLauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetSocialLauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetSocialLauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetSocialLauncher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
            	WidgetSocialLauncher dialog = new WidgetSocialLauncher(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

}
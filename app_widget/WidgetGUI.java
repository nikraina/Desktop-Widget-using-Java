package app_widget;

import java.awt.Color;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

/**
 *
 * @author nraina
 */

public class WidgetGUI extends javax.swing.JDialog 
{    
	int width = (Toolkit.getDefaultToolkit().getScreenSize().width);
	int xMouse, yMouse;
	LaunchInBrowser launch = new LaunchInBrowser();
	
    public WidgetGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocation(width-300, 20);
    }

    //@SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YouTube = new javax.swing.JLabel();
        Gmail = new javax.swing.JLabel();
        LinkedIn = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widget");
        setMaximumSize(new java.awt.Dimension(280, 75));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("YouTube.png"))); // NOI18N
        YouTube.setAutoscrolls(true);
        YouTube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(YouTube, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, 54, 54));
        YouTube.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                YouTubeMousePressed(evt);
            }});
        
        	/*public void mouseReleased(java.awt.event.MouseEvent evt) {
                YouTubeMouseReleased(evt);
                //System.out.println("Iam here");
            }});*/

        Gmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("Gmail.png"))); // NOI18N
        Gmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 13, 54, 54));
        Gmail.addMouseListener(new java.awt.event.MouseAdapter(){
        	public void mouseClicked(java.awt.event.MouseEvent evt){
        		GmailMousePressed(evt);
        	}});

        LinkedIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("LinkedIn.png"))); // NOI18N
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
        	
        	/*public void mouseReleased(java.awt.event.MouseEvent evt) {
                FacebookMouseReleased(evt);
                //System.out.println("Iam here");
            }});*/

        Background.setBackground(new java.awt.Color(22, 160, 133));
        //Background.setBackground(Color.darkGray);
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
    }// </editor-fold>//GEN-END:initComponents
    
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
    	//ImageIcon v2 = new ImageIcon(getClass().getResource("Facebook.png"));
    	//Facebook.setIcon(v2);
    	launch.LaunchFacebook();
    }
    
    /*private void FacebookMouseReleased(MouseEvent evt){
    	ImageIcon v2 = new ImageIcon(getClass().getResource("Facebook.png"));
    	Facebook.setIcon(v2);
    	//launch.LaunchFacebook();
    	//System.out.println("Iam here");
    }*/
    
    private void YouTubeMousePressed(MouseEvent evt){
    	//ImageIcon v2 = new ImageIcon(getClass().getResource("YouTube.png"));
    	//YouTube.setIcon(v2);
    	launch.LaunchYouTube();
    }
    private void GmailMousePressed(MouseEvent evt){
    	//ImageIcon v2 = new ImageIcon(getClass().getResource("YouTube.png"));
    	//YouTube.setIcon(v2);
    	launch.LaunchGmail();
    }
    private void LinkedInMousePressed(MouseEvent evt){
    	//ImageIcon v2 = new ImageIcon(getClass().getResource("YouTube.png"));
    	//YouTube.setIcon(v2);
    	launch.LaunchLinkedIn();
    }
    
    /*private void YouTubeMouseReleased(MouseEvent evt){
    	ImageIcon v2 = new ImageIcon(getClass().getResource("YouTube.png"));
    	YouTube.setIcon(v2);
    	//System.out.println("Iam here");
    }*/

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                WidgetGUI dialog = new WidgetGUI(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gmail;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel LinkedIn;
    private javax.swing.JLabel YouTube;
    // End of variables declaration//GEN-END:variables
}
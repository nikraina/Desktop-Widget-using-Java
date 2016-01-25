package app_widget;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class LaunchInBrowser {

	/**
	 * @param args
	 */
	HelperLaunchAPI h_api = new HelperLaunchAPI();
	public void LaunchFacebook(){
		try{
			Desktop.getDesktop().browse(URI.create("www.facebook.com"));
			
		}
		catch(IOException e){
			/*if(api.browse(URI.create("www.facebook.com"))){
				System.out.println("Success");
			}else{
				System.out.println("This fails in ubuntu");
			}*/
			h_api.launch("www.facebook.com");
		}
	}
	
	public void LaunchGmail(){
		try{
			Desktop.getDesktop().browse(URI.create("www.gmail.com"));
			
		}
		catch(IOException e){
			/*if(api.browse(URI.create("www.facebook.com"))){
				System.out.println("Success");
			}else{
				System.out.println("This fails in ubuntu");
			}*/
			h_api.launch("www.gmail.com");
		}
	}
	public void LaunchLinkedIn(){
		try{
			Desktop.getDesktop().browse(URI.create("www.linkedin.com"));
			
		}
		catch(IOException e){
			/*if(api.browse(URI.create("www.facebook.com"))){
				System.out.println("Success");
			}else{
				System.out.println("This fails in ubuntu");
			}*/
			h_api.launch("www.linkedin.com");
		}
	}
	public void LaunchYouTube(){
		try{
			Desktop.getDesktop().browse(URI.create("www.youtube.com"));
			
		}
		catch(IOException e){
			/*if(api.browse(URI.create("www.facebook.com"))){
				System.out.println("Success");
			}else{
				System.out.println("This fails in ubuntu");
			}*/
			h_api.launch("www.youtube.com");
		}
	}

}

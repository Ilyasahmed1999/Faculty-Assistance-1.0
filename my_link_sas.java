package testing;

import java.awt.Desktop;
import java.net.URI;

public class my_link_sas 
{
	String labels[]= {      "",
			 		        "https://www.tutorialspoint.com/dip/signals_and_system_introduction.htm",
			 		        "https://www.tutorialspoint.com/signals_and_systems/signals_analysis.htm",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
			 		        "https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
					  		"https://mrcet.com/downloads/ECE/S&S.pdf",
			 		 };
	
	void HyperLink(int i)
	  	{
				try {
							Desktop d=Desktop.getDesktop();
							d.browse(new URI(labels[i]));
					}
				catch(Exception e)
					{
								System.out.println("Error to Load Website");
					}	
		}
}

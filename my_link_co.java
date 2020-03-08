package testing;

import java.awt.Desktop;
import java.net.URI;

public class my_link_co 
{
	String labels[]= {      "",
							"https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
							"https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		       "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
							"https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		       "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		       "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
							"https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		       "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
							"https://www.mriet.ac.in/images/pdf/csett2k16.pdf",
			 		        "https://www.mriet.ac.in/images/pdf/csett2k16.pdf",				  			 		 
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

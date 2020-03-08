package testing;

import java.awt.Desktop;
import java.net.URI;

public class my_link_java 
{
	String labels[]= {      "",
			 		        "https://www.javatpoint.com/java-oops-concepts",
			 		        "https://www.tutorialspoint.com/java/java_overview.htm",
			 		        "https://www.tutorialspoint.com/java/java_basic_datatypes.htm",
			 		        "https://www.tutorialspoint.com/java/java_basic_operators.htm",
			 		        "https://www.tutorialspoint.com/java/java_loop_control.htm",
			 		        "https://www.tutorialspoint.com/java/java_object_classes.htm",
			 		        "https://www.tutorialspoint.com/java/java_inheritance.htm",
			 		        "https://www.tutorialspoint.com/java/java_packages.htm",
			 		        "https://www.tutorialspoint.com/java/java_interfaces.htm",
			 		        "",
			 		        "https://www.tutorialspoint.com/java/java_files_io.htm",
			 		        "https://www.tutorialspoint.com/java/java_files_io.htm",
			 		        "https://www.tutorialspoint.com/java/java_files_io.htm",
			 		        "https://www.tutorialspoint.com/java/java_files_io.htm",
			 		        "https://www.geeksforgeeks.org/java-io-printwriter-class-java-set-1/",
			 		        "https://www.tutorialspoint.com/java/java_strings.htm",
			 		        "https://www.tutorialspoint.com/java/java_exceptions.htm",
			 		        "https://www.tutorialspoint.com/java/java_multithreading.htm",
			 		        "",
			 		        "https://www.tutorialspoint.com/java/util/index.htm",
			 		        "https://www.tutorialspoint.com/java/util/java_util_collections.htm",
			 		        "https://www.tutorialspoint.com/java/util/java_util_collections.htm",
			 		        "https://www.geeksforgeeks.org/iterators-in-java/",
			 		        "https://www.tutorialspoint.com/java/util/java_util_interfaces.htm",
			 		        "https://www.javatpoint.com/java-map",
			 		        "https://www.javatpoint.com/Comparator-interface-in-collection-framework",
			 		        "https://www.studytonight.com/java/legacy-classes-and-interface.php",
			 		        "https://www.tutorialspoint.com/java/util/java_util_stringtokenizer.htm",
			 		        "https://www.tutorialspoint.com/java/util/java_util_bitset.htm",
			 		        "https://www.tutorialspoint.com/java/util/java_util_calendar.htm",
			 		        "",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "https://www.javatpoint.com/java-awt",
			 		        "",
			 		        "https://www.javatpoint.com/java-swing",
			 		        "https://www.javatpoint.com/java-io",
			 		        "https://www.javatpoint.com/java-swing",
			 		        "https://www.tutorialspoint.com/java/java_serialization.htm",
			 		        "https://www.tutorialspoint.com/java/java_networking.htm",
			 		        "https://www.geeksforgeeks.org/object-class-in-java/",
			 		        "https://docstore.mik.ua/orelly/java-ent/jfc/ch18_01.htm"
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

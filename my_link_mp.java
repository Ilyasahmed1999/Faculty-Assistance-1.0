package testing;

import java.awt.Desktop;
import java.net.URI;

public class my_link_mp 
{
	String labels[]= {      "",
			 		        "https://www.tutorialspoint.com/microprocessor/microprocessor_8085_architecture.htm",
			 		        "http://www.zseries.in/embedded%20lab/8085%20microprocessor/timing%20diagram.php#.XJG80aAzaM8",
			 		        "https://www.tutorialspoint.com/microprocessor/microprocessor_8085_instruction_sets.htm",
			 		        "https://www.tutorialspoint.com/microprocessor/microprocessor_8085_addressing_modes_and_interrupts.htm",
			 		        "http://www.eeeguide.com/programming-techniques-using-8085/",
			 		        "",
			 		        "http://www.aust.edu/cse/moinul/Stack_and_Subroutine.pdf",
			 		        "https://www.tutorialspoint.com/microprocessor/microprocessor_io_interfacing_overview.htm",
					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8085_addressing_modes_and_interrupts.htm",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8085_addressing_modes_and_interrupts.htm",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8257_dma_controller.htm",

					  		"https://nptel.ac.in/courses/108107029/module11/lecture59.pdf",

					  		"http://macao.communications.museum/eng/exhibition/secondfloor/moreinfo/adconverter.html",

					  		"",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_intel_8255a_programmable_peripheral_interface.htm",

					  		"https://nec.edu.np/faculty/pramodg/8251_PCI.pdf",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_intel_8253_programmable_interval_timer.htm",

					  		"https://www.geeksforgeeks.org/8259-pic-microprocessor/",

					  		"https://www.edgefx.in/fundamentals-of-rs232-communication-tutorial/",

					  		"",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8086_overview.htm",

					  		"http://www.ques10.com/p/10910/differentiate-between-minimum-and-maximum-mode-o-1/",

					  		"https://www.geeksforgeeks.org/memory-segmentation-8086-microprocessor/",

					  		"https://iitestudent.blogspot.com/2012/05/8086-memory-banks.html",

					  		"https://www.geeksforgeeks.org/interrupts-in-8086-microprocessor/",

					  		"https://www.ukessays.com/essays/education/interrupts-and-interrupt-applications.php",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8086_interrupts.htm",

					  		"",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8086_addressing_modes.htm",

					  		"https://www.tutorialspoint.com/microprocessor/microprocessor_8086_instruction_sets.htm",

					  		"https://www.tutorialspoint.com/assembly_programming/",

					  		"https://gradestack.com/Microprocessors-and/Assembly-Language/Modular-Programming/19312-3912-38123-study-wtw",

					  		"https://www.brainkart.com/article/8086-Microprocessor-Linking-and-Relocation_7850/",

					  		"https://www.shsu.edu/~csc_tjm/fall2005/cs272/stacks.html",

					  		"https://www.tutorialspoint.com/assembly_programming/assembly_macros.htm",
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

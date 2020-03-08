package testing; 
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
//class pair
//{ int no;
//  String Q;
//}
class Co2Objects
{ pair cov[][];
  pair col[][];
  Co2Objects()
  {  cov=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { cov[i][j]=new pair();
	      }
  		cov[0][0].no=1;
  		cov[0][0].Q="what are the different types of stack Organisation?";
  		cov[0][1].no=2;
  		cov[0][1].Q="What is Stack and Stack Organisation?";
  		cov[0][2].no=3;
  		cov[0][2].Q="what is Addressing modes ?explain any two?";
  		cov[1][0].no=1;
  		cov[1][0].Q="what is Main memory?";
  		cov[1][1].no=2;
  		cov[1][1].Q="Explain about Auxilary memory?";
  		cov[1][2].no=3;
  		cov[1][2].Q="Explain about Associative memory?";
  		cov[2][0].no=1;
  		cov[2][0].Q="What is pipelining?";
  		cov[2][1].no=2;
  		cov[2][1].Q="What is superscaling?";
  		cov[2][2].no=3;
  		cov[2][2].Q="What is serial communication?";
  		col=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { col[i][j]=new pair();
	      }
	    col[0][0].no=1;
	    col[0][0].Q="Explain about instruction Format?";
	    col[0][1].no=2;
	    col[0][1].Q="Explain about Addressing modes?";
	    col[0][2].no=3;
	    col[0][2].Q="Explain About different types of instruction?";
	    col[0][3].no=4;
	    col[0][3].Q="write about stack and subroutine?";
	    col[1][0].no=1;
	    col[1][0].Q="Explain about Cache Memory?";
	    col[1][1].no=2;
	    col[1][1].Q="With necessary Diagram ,show the address translation in virtual memeory?";
	    col[1][2].no=3;
	    col[1][2].Q="what is the basic principle of virtual memory and explain?";
	    col[1][3].no=4;
	    col[1][3].Q="Write a short note on secondary storage";
	    col[2][0].no=1;
	    col[2][0].Q="Write about modes of tranfer.";
	    col[2][1].no=2;
	    col[2][1].Q="Write about Asynchronous data transfer.";
	    col[2][2].no=3;
	    col[2][2].Q="Write about DMA.";
	    col[2][3].no=4;
	    col[2][3].Q="";
  }
  String findv(int x,int y)
  {   return (cov[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (col[x][y-1].Q);
  }
}

class CO2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Co2Objects O=new Co2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("CO_INTERNAL_2.docx"));
      
    //create Paragraphs
    XWPFParagraph paragraph = document.createParagraph();//main headings
    XWPFRun run = paragraph.createRun();
    paragraph.setAlignment(ParagraphAlignment.CENTER);
    run.setBold(true);
    run.setFontSize(13);
    run.setText("MUFFAKHAM JAH COLLEGE OF ENGINEERING AND TECHNOLOGY");
    run.addBreak();
    run.setText("DEPARTMENT OF COMPUTER SCIENCE AND ENGINEERING");
    run.addBreak();
    run.setText("BE (CSE) IV-SEM (Section-A&B) I-INTERNAL EXAMINATION,Feb 2019");
    XWPFParagraph paragraph1 = document.createParagraph();
    XWPFRun run1 = paragraph1.createRun();
    paragraph1.setAlignment(ParagraphAlignment.CENTER);
    run1.setBold(true);
    run1.setText("PART-A(Marks: 3*2=6)");//heading 1
    run1.addBreak();
    run1.setFontSize(12);
    run1.setText("Answer ALL questions");
    XWPFParagraph paragraphv = document.createParagraph();
    XWPFRun runv = paragraphv.createRun();
    runv.setText("1.     ");//1st question
    runv.setText(O.findv(0,questions[0]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("2.     ");//2nd question
    runv.setText(O.findv(1,questions[1]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("3.     ");//3rd question
    runv.setText(O.findv(2,questions[2]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    XWPFParagraph paragraph2 = document.createParagraph();//heading 2
    XWPFRun run2 = paragraph2.createRun();
    paragraph2.setAlignment(ParagraphAlignment.CENTER);
    run2.setBold(true);
    run2.setFontSize(12);
    run2.setText("PART-B(Marks: 2*7=14)");
    run2.addBreak();
    run2.setText("Answer any TWO questions");
    XWPFParagraph paragraphl = document.createParagraph();
    XWPFRun runl = paragraphl.createRun();
    runl.setText("4.a.   ");//4ath question
    runl.setText(O.findl(0,questions[3]=(int)(Math.random()*(4)+1)));
    runl.addBreak();
    runl.addBreak();
    int check;
    check =(int)(Math.random()*(4)+1);
    if(check==questions[3])
    {check++;
     check=check%4;
    }
    if(check==0) check=4;
     questions[4]=check;
    runl.setText("    b.  ");//4bth question
    runl.setText(O.findl(0,questions[4]));
    runl.addBreak();
    runl.addBreak();
    runl.setText("5.a.   ");//5ath question
    runl.setText(O.findl(1,questions[5]=(int)(Math.random()*(4)+1)));
    runl.addBreak();
    runl.addBreak();
    check =(int)(Math.random()*(4)+1);
    if(check==questions[5])
    {check++;
     check=check%4;
    }if(check==0) check=4;
     questions[6]=check;
    runl.setText("    b.  ");//5bth question
    runl.setText(O.findl(1,questions[6]));
    runl.addBreak();
    runl.addBreak();
    runl.setText("6.a.   ");//6ath question
    runl.setText(O.findl(2,questions[7]=(int)(Math.random()*(3)+1)));
    runl.addBreak();
    runl.addBreak();
    check =(int)(Math.random()*(3)+1);
    if(check==questions[7])
    {check++;
     check=check%3;
    }if(check==0) check=3;
     questions[8]=check;
    runl.setText("    b.  ");//6bth question
    runl.setText(O.findl(2,questions[8]));
    runl.addBreak();
    document.write(out);
    out.close();
    document.close();
    System.out.println("QP.docx written successfully");
	}

    void keypath()
    { switch(questions[0])
    	{ case 1: keyp[0]= new String("http://www.eazynotes.com/pages/computer-system-architecture/stack-organization.html");
    	          break;
    	case 2: keyp[0]=new String("https://www.geeksforgeeks.org/computer-organization-stack-based-cpu-organization/");
    			  break;
    	case 3: keyp[0]=new String("https://www.geeksforgeeks.org/addressing-modes/");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://www.techwalla.com/articles/what-is-main-memory-in-a-computer");
      break;
      case 2: keyp[1]=new String("https://www.quora.com/Computer-Organization-What-is-auxiliary-memory");
	  break;
      case 3: keyp[1]=new String("http://ecomputernotes.com/fundamental/input-output-and-memory/associative-memory");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("http://web.cs.iastate.edu/~prabhu/Tutorial/PIPELINE/pipe_title.html");
      break;
      case 2: keyp[2]=new String("https://www.ukessays.com/essays/information-technology/pipelining-and-superscalar-architecture-information-technology-essay.php");
	  break;
      case 3: keyp[2]=new String("https://www.techopedia.com/definition/22010/serial-communication");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/drive/u/2/folders/1RHoYRz2PxEimmRPfO2PYXD2wiPp2FzjE");
      break;
      case 2: keyp[3]=new String("https://www.geeksforgeeks.org/addressing-modes/");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/drive/u/2/folders/1cue-upj73D2vXR9VPd8zPVo3ksLW9-qU");
      break;
      case 4: keyp[3]=new String("https://www.engr.colostate.edu/ECE251/Labs/Lab3.pdf");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/drive/u/2/folders/1RHoYRz2PxEimmRPfO2PYXD2wiPp2FzjE");
      break;
      case 2: keyp[4]=new String("https://www.geeksforgeeks.org/addressing-modes/");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/drive/u/2/folders/1cue-upj73D2vXR9VPd8zPVo3ksLW9-qU");
      break;
      case 4: keyp[4]=new String("https://www.engr.colostate.edu/ECE251/Labs/Lab3.pdf");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://www.youtube.com/watch?v=fn9Hn__x6dA");
      break;
      case 2: keyp[5]=new String("http://williams.comp.ncat.edu/addrtrans.htm");
	  break;
      case 3: keyp[5]=new String("https://webdocs.cs.ualberta.ca/~tony/C379/Notes/PDF/08.4.pdf");
      break;
      case 4: keyp[5]=new String("https://www.computerhope.com/jargon/s/secostor.htm");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://www.youtube.com/watch?v=fn9Hn__x6dA");
      break;
      case 2: keyp[6]=new String("http://williams.comp.ncat.edu/addrtrans.htm");
	  break;
      case 3: keyp[6]=new String("https://webdocs.cs.ualberta.ca/~tony/C379/Notes/PDF/08.4.pdf");
      break;
      case 4: keyp[6]=new String("https://www.computerhope.com/jargon/s/secostor.htm");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://www.slideshare.net/ShahIshtiyaqMehfooze/modes-of-data-transfer");
      break;
      case 2: keyp[7]=new String("https://www.geeksforgeeks.org/computer-organization-asynchronous-input-output-synchronization/");
	  break;
      case 3: keyp[7]=new String("http://ecomputernotes.com/fundamental/introduction-to-computer/direct-memory-access");
      break;
      case 4: keyp[7]=new String("http://ecomputernotes.com/fundamental/introduction-to-computer/direct-memory-access");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://www.slideshare.net/ShahIshtiyaqMehfooze/modes-of-data-transfer");
      break;
      case 2: keyp[8]=new String("https://www.geeksforgeeks.org/computer-organization-asynchronous-input-output-synchronization/");
	  break;
      case 3: keyp[8]=new String("http://ecomputernotes.com/fundamental/introduction-to-computer/direct-memory-access");
      break;
      case 4: keyp[8]=new String("http://ecomputernotes.com/fundamental/introduction-to-computer/direct-memory-access");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("CO_KEY_2.docx"));
 	   XWPFParagraph keys=doc.createParagraph();
 	   XWPFRun run=keys.createRun();
        for(int i=0;i<9;i++)
        { 
     	   switch(i)
            {
            case 0: run.setText("Question no. 1:");
            break;
            case 1: run.setText("Question no. 2:");
            break;
            case 2: run.setText("Question no. 3:");
            break;
            case 3: run.setText("Question no. 4a:");
            break;
            case 4: run.setText("Question no. 4b:");
            break;
            case 5: run.setText("Question no. 5a:");
            break;
            case 6: run.setText("Question no. 5b:");
            break;
            case 7: run.setText("Question no. 6a:");
            break;
            case 8: run.setText("Question no. 6b:");
            break;
            }
             run.addBreak();
             run.addBreak();
             run.setText(keyp[i]);
     	   	 run.addBreak();
     	 	 run.addBreak();
          }
          
        
 	    //FileOutputStream fos = new FileOutputStream(new File("D:\\cse1722\\Myproject\\MiniProject\\Co1Key.docx"));
 	    doc.write(out1);
 	    doc.close();
 	    out1.close();
 	  //  fos.close();
    }
   
}


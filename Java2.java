package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Java2Objects
{ pair javav[][];
  pair javal[][];
  Java2Objects()
  {  javav=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { javav[i][j]=new pair();
	      }
	    javav[0][0].no=1;
	    javav[0][0].Q="List the 4 classes used for reading byte streams.";
	    javav[0][1].no=2;
	    javav[0][1].Q="What is the use of string tokenizer?";
	    javav[0][2].no=3;
	    javav[0][2].Q="What is the datatype returned by library functions a) CompareTo() b)Equals()";
	    javav[1][0].no=1;
	    javav[1][0].Q="Write about the vector class with example.";
	    javav[1][1].no=2;
	    javav[1][1].Q="What is serialization? which type of variables cannot be serialized?";
	    javav[1][2].no=3;
	    javav[1][2].Q="What is AWT?";
	    javav[2][0].no=1;
	    javav[2][0].Q="Define Adapter class. Why is it used?";
	    javav[2][1].no=2;
	    javav[2][1].Q="Write about delegation event model.";
	    javav[2][2].no=3;
	    javav[2][2].Q="List the different layout managers with example.";

	    javal=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { javal[i][j]=new pair();
	      }
	    javal[0][0].no=1;
	    javal[0][0].Q="Write a program to print the enrtries in the map.";
	    javal[0][1].no=2;
	    javal[0][1].Q="Write about Garbage Collection?";
	    javal[0][2].no=3;
	    javal[0][2].Q="Explain string tokenizer with an example.";
	    javal[0][3].no=4;
	    javal[0][3].Q="Why collection hierarchy does not include maps? how are the elements or key value pairs are converted into collection set.";
	    javal[1][0].no=1;
	    javal[1][0].Q="Write a program for mouse event handling.";
	    javal[1][1].no=2;
	    javal[1][1].Q="Write a program to read username and password for any application.";
	    javal[1][2].no=3;
	    javal[1][2].Q="What is a frame?Write a java program to illustrate the use of frames.";
	    javal[1][3].no=4;
	    javal[1][3].Q="";
	    javal[2][0].no=1;
	    javal[2][0].Q="Write a program to copy one file content into another file.";
	    javal[2][1].no=2;
	    javal[2][1].Q="Write a program to read n integer values from console and find the sum of them.";
	    javal[2][2].no=3;
	    javal[2][2].Q="Write a java program that uses I/O streams.";
	    javal[2][3].no=4;
	    javal[2][3].Q="";

  }
  String findv(int x,int y)
  {   return (javav[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (javal[x][y-1].Q);
  }
}

class Java2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Java2Objects O=new Java2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("JAVA_INTERNAL_2.docx"));
      
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
    int check =(int)(Math.random()*(4)+1);
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
    runl.setText(O.findl(1,questions[5]=(int)(Math.random()*(3)+1)));
    runl.addBreak();
    runl.addBreak();
    check =(int)(Math.random()*(3)+1);
    if(check==questions[5])
    {check++;
     check=check%3;
    }if(check==0) check=3;
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
    	{ case 1: keyp[0]= new String("https://www.decodejava.com/java-bytestream-classes.htm");
    	          break;
    	case 2: keyp[0]=new String("https://www.javatpoint.com/string-tokenizer-in-javaD:\\\\cse1722\\\\Myproject\\\\MiniProject\\\\g.jpg");
    			  break;
    	case 3: keyp[0]=new String("https://www.geeksforgeeks.org/java-equals-compareto-equalsignorecase-and-compare/");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://www.geeksforgeeks.org/java-util-vector-class-java/");
      break;
      case 2: keyp[1]=new String("https://www.geeksforgeeks.org/serialization-in-java/");
	  break;
      case 3: keyp[1]=new String("https://www.javatpoint.com/java-awt");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://www.javatpoint.com/java-adapter-classes");
      break;
      case 2: keyp[2]=new String("https://www.tutorialspoint.com/awt/awt_event_handling.htm");
	  break;
      case 3: keyp[2]=new String("https://www.javatpoint.com/java-layout-manager");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://www.geeksforgeeks.org/map-entry-interface-java-example/");
      break;
      case 2: keyp[3]=new String("https://www.geeksforgeeks.org/garbage-collection-java/");
	  break;
      case 3: keyp[3]=new String(" https://www.tutorialspoint.com/java/util/java_util_stringtokenizer.htm");
      break;
      case 4: keyp[3]=new String("https://www.geeksforgeeks.org/map-interface-java-examples/");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://www.geeksforgeeks.org/map-entry-interface-java-example/");
      break;
      case 2: keyp[4]=new String("https://www.geeksforgeeks.org/garbage-collection-java/");
	  break;
      case 3: keyp[4]=new String(" https://www.tutorialspoint.com/java/util/java_util_stringtokenizer.htm");
      break;
      case 4: keyp[4]=new String("https://www.geeksforgeeks.org/map-interface-java-examples/");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://www.tutorialspoint.com/awt/awt_mouse_event.htm");
      break;
      case 2: keyp[5]=new String("https://www.codeproject.com/Questions/1222768/Username-and-password-login-java-project");
	  break;
      case 3: keyp[5]=new String("https://www.tutorialspoint.com/awt/awt_frame.htm");
      break;
      case 4: keyp[5]=new String("https://www.tutorialspoint.com/awt/awt_frame.htm");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://www.tutorialspoint.com/awt/awt_mouse_event.htm");
      break;
      case 2: keyp[6]=new String("https://www.codeproject.com/Questions/1222768/Username-and-password-login-java-project");
	  break;
      case 3: keyp[6]=new String("https://www.tutorialspoint.com/awt/awt_frame.htm");
      break;
      case 4: keyp[6]=new String("https://www.tutorialspoint.com/awt/awt_frame.htm");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://www.tutorialspoint.com/javaexamples/file_copy.htm");
      break;
      case 2: keyp[7]=new String("https://study.com/academy/lesson/java-add-two-numbers-taking-input-from-user.html");
	  break;
      case 3: keyp[7]=new String("https://www.tutorialspoint.com/java/java_files_io.htm");
      break;
      case 4: keyp[7]=new String("https://www.tutorialspoint.com/java/java_files_io.htm");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://www.tutorialspoint.com/javaexamples/file_copy.htm");
      break;
      case 2: keyp[8]=new String("https://study.com/academy/lesson/java-add-two-numbers-taking-input-from-user.html");
	  break;
      case 3: keyp[8]=new String("https://www.tutorialspoint.com/java/java_files_io.htm");
      break;
      case 4: keyp[8]=new String("https://www.tutorialspoint.com/java/java_files_io.htm");
      break;
      }
    }
   void generateKey()throws IOException, InvalidFormatException
   {   
	   XWPFDocument doc = new XWPFDocument();
	    FileOutputStream out1 = new FileOutputStream(new File("JAVA_KEY_2.docx"));
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


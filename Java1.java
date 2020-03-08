package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Java1Objects
{ pair javav[][];
  pair javal[][];
  Java1Objects()
  {  javav=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { javav[i][j]=new pair();
	      }
	    javav[0][0].no=1;
	    javav[0][0].Q="What is Object Oriented Programming? List few advantages.";
	    javav[0][1].no=2;
	    javav[0][1].Q="Differentiate abstract class and class?";
	    javav[0][2].no=3;
	    javav[0][2].Q="What is the use of super keyword?";
	    javav[1][0].no=1;
	    javav[1][0].Q="List any four keywords in java. Provide one line explanation for each.";
	    javav[1][1].no=2;
	    javav[1][1].Q="What is the use of finally keyword?";
	    javav[1][2].no=3;
	    javav[1][2].Q="What is CLASSPATH? What is it used for?";
	    javal=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { javal[i][j]=new pair();
	      }
	    javal[0][0].no=1;
	    javal[0][0].Q="What is inheritance? What is the difference between single inheritance and multiple inheritance?";
	    javal[0][1].no=2;
	    javal[0][1].Q="What is abstract class? Discuss reasons and consequences with suitable examples.";
	    javal[0][2].no=3;
	    javal[0][2].Q="What is overriding? Discuss its use. Under What conditions overriding is not allowed?";
	    javal[0][3].no=4;
	    javal[0][3].Q="Explain how to create a Package with suitable example.";
	    javal[1][0].no=1;
	    javal[1][0].Q="What is an exception? Explain how exceptions are handled in java with suitable examples.";
	    javal[1][1].no=2;
	    javal[1][1].Q="Write a program to demonstrate threads synchronization.";
	    javal[1][2].no=3;
	    javal[1][2].Q="what is filehandling?Give an Example?";
	    javal[1][3].no=4;
	    javal[1][3].Q="Explain multithread concept. Write a program for producer-consumer problem using multithread concept.";
  }
  String findv(int x,int y)
  {   return (javav[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (javal[x][y-1].Q);
  }
}

class Java1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Java1Objects O=new Java1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("JAVA_INTERNAL_1.docx"));
      
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
    int check =(int)(Math.random()*(3)+1);
    if(check==questions[0])
    {check++;
     check=check%3;
    }
    if(check==0) check=3;
     questions[1]=check;
    runv.setText("2.     ");//2nd question
    runv.setText(O.findv(0,questions[1]));
    runv.addBreak();
    runv.addBreak();
    runv.setText("3.     ");//3rd question
    runv.setText(O.findv(1,questions[2]=(int)(Math.random()*(3)+1)));
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
    check=(int)(Math.random()*(4)+1);
    boolean reach=true;
    while(reach)
    { if(check==questions[3])
    	{ check++;
    	  check=check%4;
    	  reach=true;
    	}
      else reach=false;
      if(check==questions[4])
      	{ check++;
      	  check=check%4;
      	  reach=true;
    	}
      else reach=false;
    }
    if(check==0) check=4;
    questions[7]=check;
    runl.setText("6.a.   ");//6ath question
    runl.setText(O.findl(0,questions[7]));
    runl.addBreak();
    runl.addBreak();
    check=(int)(Math.random()*(4)+1);
    reach=true;
    while(reach)
    { if(check==questions[5])
    	{ check++;
    	  check=check%4;
    	  reach=true;
    	}
      else reach=false;
      if(check==questions[6])
      	{ check++;
      	  check=check%4;
      	  reach=true;
    	}
      else reach=false;
    }
    if(check==0) check=4;
    questions[8]=check;
    runl.setText("    b.  ");//6bth question
    runl.setText(O.findl(1,questions[8]));
    runl.addBreak();
    document.write(out);
    out.close();
    document.close();
    System.out.println("QP.docx written successfully");
	}
   
    void keypath()
    { switch(questions[0])
    	{ case 1: keyp[0]= new String("https://www.javatpoint.com/java-oops-concepts");
    	          break;
    	case 2: keyp[0]=new String("https://www.geeksforgeeks.org/difference-between-abstract-class-and-concrete-class-in-java/");
    			  break;
    	case 3: keyp[0]=new String("https://www.geeksforgeeks.org/super-keyword/");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://www.javatpoint.com/java-oops-concepts");
      break;
      case 2: keyp[1]=new String("https://www.geeksforgeeks.org/difference-between-abstract-class-and-concrete-class-in-java/");
	  break;
      case 3: keyp[1]=new String("https://www.geeksforgeeks.org/super-keyword/");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://www.geeksforgeeks.org/list-of-all-java-keywords/");
      break;
      case 2: keyp[2]=new String("https://www.geeksforgeeks.org/final-keyword-java/");
	  break;
      case 3: keyp[2]=new String("https://www.geeksforgeeks.org/classpath-in-java/");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://www.geeksforgeeks.org/inheritance-in-java/");
      break;
      case 2: keyp[3]=new String("https://www.geeksforgeeks.org/abstract-classes-in-java/");
	  break;
      case 3: keyp[3]=new String("https://www.geeksforgeeks.org/overriding-in-java/");
      break;
      case 4: keyp[3]=new String("https://www.geeksforgeeks.org/packages-in-java/");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://www.geeksforgeeks.org/inheritance-in-java/");
      break;
      case 2: keyp[4]=new String("https://www.geeksforgeeks.org/abstract-classes-in-java/");
	  break;
      case 3: keyp[4]=new String("https://www.geeksforgeeks.org/overriding-in-java/");
      break;
      case 4: keyp[4]=new String("https://www.geeksforgeeks.org/packages-in-java/");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://www.geeksforgeeks.org/exceptions-in-java/");
      break;
      case 2: keyp[5]=new String("https://www.geeksforgeeks.org/synchronized-in-java/");
	  break;
      case 3: keyp[5]=new String("D:\\\\cse1722\\\\Myproject\\\\MiniProject\\\\g.jpg");
      break;
      case 4: keyp[5]=new String("D:\\\\cse1722\\\\Myproject\\\\MiniProject\\\\g.jpg");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://www.geeksforgeeks.org/exceptions-in-java/");
      break;
      case 2: keyp[6]=new String("https://www.geeksforgeeks.org/synchronized-in-java/");
	  break;
      case 3: keyp[6]=new String("https://www.javatpoint.com/java-io");
      break;
      case 4: keyp[6]=new String("https://www.geeksforgeeks.org/multithreading-in-java/");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://www.geeksforgeeks.org/inheritance-in-java/");
      break;
      case 2: keyp[7]=new String("https://www.geeksforgeeks.org/abstract-classes-in-java/");
	  break;
      case 3: keyp[7]=new String("https://www.geeksforgeeks.org/overriding-in-java/");
      break;
      case 4: keyp[7]=new String("https://www.geeksforgeeks.org/packages-in-java/");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://www.geeksforgeeks.org/exceptions-in-java/");
      break;
      case 2: keyp[8]=new String("https://www.geeksforgeeks.org/synchronized-in-java/");
	  break;
      case 3: keyp[8]=new String("https://www.javatpoint.com/java-io");
      break;
      case 4: keyp[8]=new String("https://www.geeksforgeeks.org/multithreading-in-java/");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("JAVA_KEY_1.docx"));
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
 /* void generateKey()throws IOException, InvalidFormatException
   {   
	   XWPFDocument doc = new XWPFDocument();
	   XWPFParagraph keys=doc.createParagraph();
	   XWPFRun run=keys.createRun();
       for(int i=0;i<9;i++)
       { String imgfile= keyp[i];
         FileInputStream is=new FileInputStream(imgfile);
         run.addPicture(is,XWPFDocument.PICTURE_TYPE_JPEG ,imgfile, Units.toEMU(500), Units.toEMU(500));
         run.addBreak();
         is.close();
       }
	    FileOutputStream fos = new FileOutputStream("D:\\cse1722\\Myproject\\MiniProject\\Java1Key.docx");
	    doc.write(fos);
	    doc.close();
	    fos.close();
   }*/
   
}


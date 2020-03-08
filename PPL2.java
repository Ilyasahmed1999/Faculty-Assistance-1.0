package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Ppl2Objects
{ pair pplv[][];
  pair ppll[][];
  Ppl2Objects()
  {  pplv=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { pplv[i][j]=new pair();
	      }
	    pplv[0][0].no=1;
	    pplv[0][0].Q="differentiate between typecasting and type conversion?";
	    pplv[0][1].no=2;
	    pplv[0][1].Q="write the syntax of �for� statement in python,C and Ada Language?";
	    pplv[0][2].no=3;
	    pplv[0][2].Q="what are guarded commands?";
	    pplv[1][0].no=1;
	    pplv[1][0].Q="what is dynamic method binding";
	    pplv[1][1].no=2;
	    pplv[1][1].Q="Define task and Syncronisation";
	    pplv[1][2].no=3;
	    pplv[1][2].Q="explain about semaphores";
	    pplv[2][0].no=1;
	    pplv[2][0].Q="Describe the syntax and semantics of COND";
	    pplv[2][1].no=2;
	    pplv[2][1].Q="Describe the syntax and semantic of LET";
	    pplv[2][2].no=3;
	    pplv[2][2].Q="what is scripting languages?what are its characteristics?";

	    ppll=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { ppll[i][j]=new pair();
	      }
	    ppll[0][0].no=1;
	    ppll[0][0].Q="Explain how generic subprograms are implemented in java and C++?";
	    ppll[0][1].no=2;
	    ppll[0][1].Q="Describe any four parameter passing mechanism in detail?";
	    ppll[0][2].no=3;
	    ppll[0][2].Q="Explain briefly about nested  subprograms";
	    ppll[0][3].no=4;
	    ppll[0][3].Q="Discuss about packages in java?";
	    ppll[1][0].no=1;
	    ppll[1][0].Q="explain how exception are handled in Ada with Example?";
	    ppll[1][1].no=2;
	    ppll[1][1].Q="Explain about ADT representation in Ada and C++ with Example";
	    ppll[1][2].no=3;
	    ppll[1][2].Q="Explain different oop language aspects with an example";
	    ppll[1][3].no=4;
	    ppll[1][3].Q="write a short note on polymorphism and encapsulation";
	    ppll[2][0].no=1;
	    ppll[2][0].Q="Briefly Explain the features of Lisp Language";
	    ppll[2][1].no=2;
	    ppll[2][1].Q="Discuss negation problem in prolog.";
	    ppll[2][2].no=3;
	    ppll[2][2].Q="Give applications of logic programming";
	    ppll[2][3].no=4;
	    ppll[2][3].Q="Write a Prolog program that finds the maximum of a list of numbers";

  }
  String findv(int x,int y)
  {   return (pplv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (ppll[x][y-1].Q);
  }
}

class PPL2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Ppl2Objects O=new Ppl2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("PPL_INTERNAL_2.docx"));
      
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
    runv.setText("1.   ");//1st question
    runv.setText(O.findv(0,questions[0]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("2.   ");//2nd question
    runv.setText(O.findv(1,questions[1]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("3.   ");//3rd question
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
    runl.setText(O.findl(1,questions[5]=(int)(Math.random()*(4)+1)));
    runl.addBreak();
    runl.addBreak();
    check =(int)(Math.random()*(4)+1);
    if(check==questions[5])
    {check++;
     check=check%4;
    }
    if(check==0) check=4;
     questions[6]=check;
    runl.setText("    b.  ");//5bth question
    runl.setText(O.findl(1,questions[6]=(int)(Math.random()*(4)+1)));
    runl.addBreak();
    runl.addBreak();
    runl.setText("6.a.   ");//6ath question
    runl.setText(O.findl(2,questions[7]=(int)(Math.random()*(4)+1)));
    runl.addBreak();
    runl.addBreak();
    check =(int)(Math.random()*(4)+1);
    if(check==questions[7])
    {check++;
     check=check%4;
    }
    if(check==0) check=4;
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
    	{ case 1: keyp[0]= new String("https://techdifferences.com/difference-between-type-casting-and-type-conversion.html");
    	          break;
    	case 2: keyp[0]=new String("https://en.wikipedia.org/wiki/For_loop");
    			  break;
    	case 3: keyp[0]=new String("https://en.wikipedia.org/wiki/Guarded_Command_Language");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://en.wikipedia.org/wiki/Late_binding");
      break;
      case 2: keyp[1]=new String("https://www.adaic.org/resources/add_content/standards/05rm/html/RM-9.html");
	  break;
      case 3: keyp[1]=new String("https://en.wikipedia.org/wiki/Semaphore_(programming)");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://home.adelphi.edu/~siegfried/cs160/old.cs160/160l6.html");
      break;
      case 2: keyp[2]=new String("http://www.cs.cornell.edu/Info/Projects/NuPRL/book/node179.html");
	  break;
      case 3: keyp[2]=new String("https://www.sqa.org.uk/e-learning/ClientSide01CD/page_04.htm");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://www.geeksforgeeks.org/templates-in-c-vs-generics-in-java/");
      break;
      case 2: keyp[3]=new String("https://www.youtube.com/watch?v=qCiV7IPDWfQ");
	  break;
      case 3: keyp[3]=new String("https://en.wikipedia.org/wiki/Nested_function");
      break;
      case 4: keyp[3]=new String("https://www.javatpoint.com/package");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://www.geeksforgeeks.org/templates-in-c-vs-generics-in-java/");
      break;
      case 2: keyp[4]=new String("https://www.youtube.com/watch?v=qCiV7IPDWfQ");
	  break;
      case 3: keyp[4]=new String("https://en.wikipedia.org/wiki/Nested_function");
      break;
      case 4: keyp[4]=new String("https://www.javatpoint.com/package");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://www2.adacore.com/gap-static/GNAT_Book/html/aarm/AA-11-4-2.html");
      break;
      case 2: keyp[5]=new String("https://www.nku.edu/~foxr/CSC407/NOTES/ch11.ppt");
	  break;
      case 3: keyp[5]=new String("https://www.pcmag.com/encyclopedia/term/48238/object-oriented-programming");
      break;
      case 4: keyp[5]=new String("https://en.wikipedia.org/wiki/Object-oriented_programming");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://www2.adacore.com/gap-static/GNAT_Book/html/aarm/AA-11-4-2.html");
      break;
      case 2: keyp[6]=new String("https://www.nku.edu/~foxr/CSC407/NOTES/ch11.ppt");
	  break;
      case 3: keyp[6]=new String("https://www.pcmag.com/encyclopedia/term/48238/object-oriented-programming");
      break;
      case 4: keyp[6]=new String("https://en.wikipedia.org/wiki/Object-oriented_programming");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://www.tutorialspoint.com/lisp/lisp_overview.htm");
      break;
      case 2: keyp[7]=new String("https://www.cpp.edu/~jrfisher/www/prolog_tutorial/2_5.html");
	  break;
      case 3: keyp[7]=new String("https://www.quora.com/What-are-the-applications-of-logic-programming");
      break;
      case 4: keyp[7]=new String("https://www.codepoc.io/blog/prolog/5061/prolog-program-to-find-maximum-number-from-a-list");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://www.tutorialspoint.com/lisp/lisp_overview.htm");
      break;
      case 2: keyp[8]=new String("https://www.cpp.edu/~jrfisher/www/prolog_tutorial/2_5.html");
	  break;
      case 3: keyp[8]=new String("https://www.quora.com/What-are-the-applications-of-logic-programming");
      break;
      case 4: keyp[8]=new String("https://www.codepoc.io/blog/prolog/5061/prolog-program-to-find-maximum-number-from-a-list");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("PPL_KEY_2.docx"));
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


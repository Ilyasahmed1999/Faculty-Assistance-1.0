package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Ppl1Objects
{ pair pplv[][];
  pair ppll[][];
  Ppl1Objects()
  {  pplv=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { pplv[i][j]=new pair();
	      }
	    pplv[0][0].no=1;
	    pplv[0][0].Q="Difference between Compiler and Interpreter.";
	    pplv[0][1].no=2;
	    pplv[0][1].Q="List out different programming domains";
	    pplv[0][2].no=3;
	    pplv[0][2].Q="What is mean by orthogonality.";
	    pplv[1][0].no=1;
	    pplv[1][0].Q="What is 'Record' Datatype.";
	    pplv[1][1].no=2;
	    pplv[1][1].Q="List out some primitive datatypes.";
	    pplv[1][2].no=3;
	    pplv[1][2].Q="Difference between do-while and while loops.";
	    ppll=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { ppll[i][j]=new pair();
	      }
	    ppll[0][0].no=1;
	    ppll[0][0].Q="Write about Evolution of programming languages. ";
	    ppll[0][1].no=2;
	    ppll[0][1].Q="Write about Evaluation of programming languages.";
	    ppll[0][2].no=3;
	    ppll[0][2].Q="Explain about the Compilation procedure with a flowchart.";
	    ppll[0][3].no=4;
	    ppll[0][3].Q="Explain about Lexical analysis.";
	    ppll[1][0].no=1;
	    ppll[1][0].Q="Explain about Different types of Datatypes.";
	    ppll[1][1].no=2;
	    ppll[1][1].Q="Write about Statement level Control Structures.";
	    ppll[1][2].no=3;
	    ppll[1][2].Q="Write about Names and Storage classes.";
	    ppll[1][3].no=4;
	    ppll[1][3].Q="Explain about different types of statements.";
  }
  String findv(int x,int y)
  {   return (pplv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (ppll[x][y-1].Q);
  }
}

class PPL1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Ppl1Objects O=new Ppl1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("PPL_INTERNAL_1.docx"));
      
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
    int check =(int)(Math.random()*(3)+1);
    if(check==questions[0])
    {check++;
     check=check%3;
    }
    if(check==0) check=3;
     questions[1]=check;
    runv.setText("2.   ");//2nd question
    runv.setText(O.findv(0,questions[1]));
    runv.addBreak();
    runv.addBreak();
    runv.setText("3.   ");//3rd question
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
    }
    if(check==0) check=4;
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
    	{ case 1: keyp[0]= new String("https://techdifferences.com/difference-between-compiler-and-interpreter.html");
    	          break;
    	case 2: keyp[0]=new String("http://cs.loc.edu/~chu/COSI350/Ch1/Domain.html");
    			  break;
    	case 3: keyp[0]=new String("https://www.quora.com/How-can-you-define-orthogonality-in-a-programming-language");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://techdifferences.com/difference-between-compiler-and-interpreter.html");
      break;
      case 2: keyp[1]=new String("http://cs.loc.edu/~chu/COSI350/Ch1/Domain.html");
	  break;
      case 3: keyp[1]=new String("https://www.quora.com/How-can-you-define-orthogonality-in-a-programming-language");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://www.careerride.com/plsql-record-data-type.aspx");
      break;
      case 2: keyp[2]=new String("https://en.wikipedia.org/wiki/Data_type");
	  break;
      case 3: keyp[2]=new String("https://stackoverflow.com/questions/3625759/difference-between-while-loop-and-do-while-loop");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://www.gktoday.in/gk/evolution-of-programming-languages/");
      break;
      case 2: keyp[3]=new String("https://courses.cs.washington.edu/courses/cse341/02sp/concepts/evaluating-languages.html");
	  break;
      case 3: keyp[3]=new String("https://www.onlineclassnotes.com/2015/04/draw-flow-chart-of-process-of-compiling.html ");
      break;
      case 4: keyp[3]=new String("https://www.tutorialspoint.com/compiler_design/compiler_design_lexical_analysis.htm");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://www.gktoday.in/gk/evolution-of-programming-languages/");
      break;
      case 2: keyp[4]=new String("https://courses.cs.washington.edu/courses/cse341/02sp/concepts/evaluating-languages.html");
	  break;
      case 3: keyp[4]=new String("https://www.onlineclassnotes.com/2015/04/draw-flow-chart-of-process-of-compiling.html");
      break;
      case 4: keyp[4]=new String("https://www.tutorialspoint.com/compiler_design/compiler_design_lexical_analysis.htm");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://en.wikipedia.org/wiki/Data_type");
      break;
      case 2: keyp[5]=new String("https://en.wikipedia.org/wiki/Control_flow");
	  break;
      case 3: keyp[5]=new String("https://www.geeksforgeeks.org/storage-classes-in-c/");
      break;
      case 4: keyp[5]=new String("https://en.cppreference.com/w/cpp/language/statements");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://en.wikipedia.org/wiki/Data_type");
      break;
      case 2: keyp[6]=new String("https://en.wikipedia.org/wiki/Control_flow");
	  break;
      case 3: keyp[6]=new String("https://www.geeksforgeeks.org/storage-classes-in-c/");
      break;
      case 4: keyp[6]=new String("https://en.cppreference.com/w/cpp/language/statements");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://www.gktoday.in/gk/evolution-of-programming-languages/");
      break;
      case 2: keyp[7]=new String("https://courses.cs.washington.edu/courses/cse341/02sp/concepts/evaluating-languages.html");
	  break;
      case 3: keyp[7]=new String("https://www.onlineclassnotes.com/2015/04/draw-flow-chart-of-process-of-compiling.html");
      break;
      case 4: keyp[7]=new String("https://www.tutorialspoint.com/compiler_design/compiler_design_lexical_analysis.htm");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://en.wikipedia.org/wiki/Data_type");
      break;
      case 2: keyp[8]=new String("https://en.wikipedia.org/wiki/Control_flow");
	  break;
      case 3: keyp[8]=new String("https://www.geeksforgeeks.org/storage-classes-in-c/");
      break;
      case 4: keyp[8]=new String("https://en.cppreference.com/w/cpp/language/statements");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("PPL_KEY_1.docx"));
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


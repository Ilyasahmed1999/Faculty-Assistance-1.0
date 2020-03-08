package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Maths1Objects
{ pair mathsv[][];
  pair mathsl[][];
  Maths1Objects()
  {  mathsv=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { mathsv[i][j]=new pair();
	      }
	    mathsv[0][0].no=1;
	    mathsv[0][0].Q="Write the Lagrange's Interpolation formula.";
	    mathsv[0][1].no=2;
	    mathsv[0][1].Q="find (218)^(1/3) using Newton Raphson's method.";
	    mathsv[0][2].no=3;
	    mathsv[0][2].Q="Using bisection Method find roots of x^2-5x-1=0.";
	    mathsv[1][0].no=1;
	    mathsv[1][0].Q="Find the angle between two regression lines.";
	    mathsv[1][1].no=2;
	    mathsv[1][1].Q="Write normal equations to fit a straight line y=a+bx.";
	    mathsv[1][2].no=3;
	    mathsv[1][2].Q="Using the method of least squares fit straight line of the form y=a+bx to the given data x= {-1,1,2,5} and y= {-8,-2,1,10} respectively.";
	    mathsl=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { mathsl[i][j]=new pair();
	      }
	    mathsl[0][0].no=1;
	    mathsl[0][0].Q="Apply gauss elimination to find roots of x-y+5z=5,2x-3y+z=0,x+2y+7z=11.";
	    mathsl[0][1].no=2;
	    mathsl[0][1].Q="Apply RK method to find an approximate value of y for x=0.2 given dy/dx=x+y^2,y(0)=1.";
	    mathsl[0][2].no=3;
	    mathsl[0][2].Q="Using Newton's divided difference interpolation formula find polynomial for given data given x= {-3,-2,-1,1,2,3,5} and f(x)= {18,12,8,6,8,12,26}. ";
	    mathsl[0][3].no=4;
	    mathsl[0][3].Q="If y'=1+xy,y(0)=1 then find an approximation to solution y(x) using taylor series method.";
	    mathsl[1][0].no=1;
	    mathsl[1][0].Q="Using the method of least squares fit a curve y=a+bx+cx^2 to following data (x,y)= {(0,1),(1,0),(2,3),(3,10),(4,21)}.";
	    mathsl[1][1].no=2;
	    mathsl[1][1].Q="The ranking of 10 students in 2 subjects A&B are A= {3,5,8,4,7,10,2,1,6,9} and B= {6,4,9,8,1,2,3,10,5,7} Calculate rank Correlation Coefficient.";
	    mathsl[1][2].no=3;
	    mathsl[1][2].Q="Fit a parabola of second degree to a following data (x,y)= {(0,1),(1,1.8),(2,1.3),(3,2.5),(4,6.3)}.";
	    mathsl[1][3].no=4;
	    mathsl[1][3].Q="Evaluate the coefficient of correlation for the following data (x,y)= {(1,9),(2,8),(4,12),(5,11),(6,13),(7,14),(8,16),(9,15)}.";
  }
  String findv(int x,int y)
  {   return (mathsv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (mathsl[x][y-1].Q);
  }
}

class Maths1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Maths1Objects O=new Maths1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("MATHS_INTERNAL_1.docx"));
      
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
    questions[0]=(int)(Math.random()*(3)+1);
    runv.setText(O.findv(0,questions[0]));
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
    runl.addBreak();
    document.write(out);
    out.close();
    document.close();
    System.out.println("QP.docx written successfully");
	}
   void keypath()
    { switch(questions[0])
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1Nm6dq0gXCAxGsi40oL23IIvz21uRM5VI");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1-d9gFDcmgGrRal9BnSuR001xQuZ25LPn");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1EnYVY7w21aZtB51ve2fx264Uq0dVw1Ku");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1Nm6dq0gXCAxGsi40oL23IIvz21uRM5VI");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1-d9gFDcmgGrRal9BnSuR001xQuZ25LPn");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=1EnYVY7w21aZtB51ve2fx264Uq0dVw1Ku");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=16ONQeeZYe9IOxHhM9B23Ady6W6c3Oeh4");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=1sVNjOUAsIkq7iRf1eNDdi9HhRY-hVWhh");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=1BYXMg-pkOp7kI7iC__eKM6mHlOWPzV0a");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=1l3M_e9sMDOKcAONGnTAtPoEmVxlcIyCg");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=1Us_Sc96ydhTWg_ZGLXOl_DJ4x6GSpsu-");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1Ks2k9a0x7JWW0tMrGXQWG_QCNdmcrD_l");
      break;
      case 4: keyp[3]=new String("https://drive.google.com/open?id=1AGlEEOQxwqse1P6hLcGgSFEH1Ts1--mm");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=1l3M_e9sMDOKcAONGnTAtPoEmVxlcIyCg");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=1Us_Sc96ydhTWg_ZGLXOl_DJ4x6GSpsu-");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1Ks2k9a0x7JWW0tMrGXQWG_QCNdmcrD_l");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1AGlEEOQxwqse1P6hLcGgSFEH1Ts1--mm");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1O4SUOnP9DYOsN8fxvjsIsCFoxLZEYVqW");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=1cBkXqi2NthM230p9s2GhCQIc3_zm91Vn");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=1NihA2NjtHAqo3Sa7kIwF5zsdET52Akhx");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=18q4VyPb4CRn5HMgpjqvjkk2IFbaG53l9");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1O4SUOnP9DYOsN8fxvjsIsCFoxLZEYVqW");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=1cBkXqi2NthM230p9s2GhCQIc3_zm91Vn");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=1NihA2NjtHAqo3Sa7kIwF5zsdET52Akhx");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=18q4VyPb4CRn5HMgpjqvjkk2IFbaG53l9");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=1l3M_e9sMDOKcAONGnTAtPoEmVxlcIyCg");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1Us_Sc96ydhTWg_ZGLXOl_DJ4x6GSpsu-");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1Ks2k9a0x7JWW0tMrGXQWG_QCNdmcrD_l");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1AGlEEOQxwqse1P6hLcGgSFEH1Ts1--mm");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=1O4SUOnP9DYOsN8fxvjsIsCFoxLZEYVqW");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=1cBkXqi2NthM230p9s2GhCQIc3_zm91Vn");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=1NihA2NjtHAqo3Sa7kIwF5zsdET52Akhx");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=18q4VyPb4CRn5HMgpjqvjkk2IFbaG53l9");
      break;
      }
    }
   void generateKey()throws IOException, InvalidFormatException
   {   
	   XWPFDocument doc = new XWPFDocument();
	    FileOutputStream out1 = new FileOutputStream(new File("MATHS_KEY_1.docx"));
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


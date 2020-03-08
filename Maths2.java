package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Maths2Objects
{ pair mathsv[][];
  pair mathsl[][];
  Maths2Objects()
  {  mathsv=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { mathsv[i][j]=new pair();
	      }
	    mathsv[0][0].no=1;
	    mathsv[0][0].Q="A random variable X has the following probability distribution (X,P(X))= {(-2,0.1),(-1,k),(0,0.2),(1,2k),(2,0.3),(3,k)} find i)k, ii)Mean , ii)Variance.";
	    mathsv[0][1].no=2;
	    mathsv[0][1].Q="Define Exponential distribution and find its mean.";
	    mathsv[0][2].no=3;
	    mathsv[0][2].Q="Define uniform distribution and find its mean.";
	    mathsv[1][0].no=1;
	    mathsv[1][0].Q="Find the finite fourier sine transform of f(x)=3x,0<x<6.";
	    mathsv[1][1].no=2;
	    mathsv[1][1].Q="State convolution theorem for Fourier transform.";
	    mathsv[1][2].no=3;
	    mathsv[1][2].Q="Find the fourier cosine Integral for f(x)=e^-ax (a>0).";
	    mathsv[2][0].no=1;
	    mathsv[2][0].Q="Give the formula for F test?";
	    mathsv[2][1].no=2;
	    mathsv[2][1].Q="Give the formula for T test?";
	    mathsv[2][2].no=3;
	    mathsv[2][2].Q="Give the formula for X^2 test?";

	    mathsl=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { mathsl[i][j]=new pair();
	      }
	    mathsl[0][0].no=1;
	    mathsl[0][0].Q="A die is thrown 312 times and the result of these throws are given as (no. appeared,frequency)= {(1,46),(2,38),(3,35),(4,65),(5,63),(6,65)}";
	    mathsl[0][1].no=2;
	    mathsl[0][1].Q="Suppose x is a random variable which follows random distribution with mean 45 and standard deviation 5 then find i)P(41=<X=<50) ii)P(X>=55) ii)P(X=<30)";
	    mathsl[0][2].no=3;
	    mathsl[0][2].Q="Bag A contains 2 white balls and 3 red balls  and bag B contains 4 white balls and 5 red balls one ball is drawn at random from one of the bags and it is found to be red. Find probablity that the red is drawn from B.";
	    mathsl[0][3].no=4;
	    mathsl[0][3].Q="";
	    mathsl[1][0].no=1;
	    mathsl[1][0].Q="Find Fourier cosine and sine transform for f(x)=2e^(-5x)+5e^(-2x).";
	    mathsl[1][1].no=2;
	    mathsl[1][1].Q="Find the fourier cosine transform for e^(-x^2)";
	    mathsl[1][2].no=3;
	    mathsl[1][2].Q="Find Fourier cosine transform of f(x)=1/(1+x^2).";
	    mathsl[1][3].no=4;
	    mathsl[1][3].Q="";
	    mathsl[2][0].no=1;
	    mathsl[2][0].Q="Define Normal Distribution and Find mean,median and mode";
	    mathsl[2][1].no=2;
	    mathsl[2][1].Q="Find the root of the equatioon x^3-4x-9 by bisection method";
	    mathsl[2][2].no=3;
	    mathsl[2][2].Q="Define Bayes theorem and prove it.";
	    mathsl[2][3].no=4;
	    mathsl[2][3].Q="Find the root of the  equation by x3-3x-5 Newton Raphson Method";
 }
  String findv(int x,int y)
  {   return (mathsv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (mathsl[x][y-1].Q);
  }
}

class Maths2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Maths2Objects O=new Maths2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("MATHS_INTERNAL_2.docx"));
      
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
    runv.setText("2.     ");//2nd question
    runv.setText(O.findv(1,questions[1]=(int)(Math.random()*(3)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("3.     ");//3rd question
    runv.setText(O.findv(2,questions[2]=(int)(Math.random()*(2)+1)));
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
    }
    if(check==0) check=3;
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
    }
    if(check==0) check=3;
     questions[8]=check;
    runl.setText("    b.  ");//6bth question
    runl.setText(O.findl(2,questions[8]));
    runl.addBreak();
    runl.addBreak();
    document.write(out);
    out.close();
    document.close();
    System.out.println("QP.docx written successfully");
	}
    void keypath()
    { switch(questions[0])
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1vGWMwudhdm4nzmQZWNj5zBGk9aB_YUBE");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1iPxDKt8atjexHGf2rcmABZirbzyFjyCD");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1LeAR8ByIMxoHsfqQnblu8FEy5dowoDCR");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1g4STsoQP4VDNuNns_-yFV0N6zFnPCDZt");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1tcsrIdTDaAD3sK5jwm4e3dfozdkyDJi-");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=1qK3c__hoD5Nvjd6SPFjapiAPmMID_HPA");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=1DmrhqjDSe-DA5V_2cSwOtdqkOVQRW6YY");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=17k1dhWJvOJRS7tyT_RMvX7dxOmphTCN6");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=1bRQE5B0LLtHw5TQUZxaans8HXL2_MO7Y");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=1PKqPv09tDGlwOEotvDTrURsj6iMM8FKJ");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=1xNxrqwv7uMRZ0-GJy_OxcPm3Ts85M8DO");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1iJu0StnAwwHFN_Z0qHNmJuBe6UDo4W7c");
      break;
      case 4: keyp[3]=new String("https://drive.google.com/open?id=1a-q5DnjUG4NUxqH-uNpg3T8a3JLk3Ln4");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=1PKqPv09tDGlwOEotvDTrURsj6iMM8FKJ");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=1xNxrqwv7uMRZ0-GJy_OxcPm3Ts85M8DO");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1iJu0StnAwwHFN_Z0qHNmJuBe6UDo4W7c");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1a-q5DnjUG4NUxqH-uNpg3T8a3JLk3Ln4");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1PgInX02QfOBIqvMGWxYjzGzyuJB664hU");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=1PlKTD36PS8CRlHB29zPNyOTYJIida0vn");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=1kzUHidPiViLbPqrJYYhINYhB5clUdUlU");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=17omXorHQEjZC9sXdOss4176GYSprEkyM");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1PgInX02QfOBIqvMGWxYjzGzyuJB664hU");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=1PlKTD36PS8CRlHB29zPNyOTYJIida0vn");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=1kzUHidPiViLbPqrJYYhINYhB5clUdUlU");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=17omXorHQEjZC9sXdOss4176GYSprEkyM");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=1Vv_waHMsLd2FX_H6l7uEGm32X5O3d-fh");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1Juz7_vIo6l8iqx6A6-lvmC-qUUGeFq9_");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1RWLSUvyVN2mP3bNjAAg8zTX0r9JMQSg2");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1RWLSUvyVN2mP3bNjAAg8zTX0r9JMQSg2");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=1Vv_waHMsLd2FX_H6l7uEGm32X5O3d-fh");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=1Juz7_vIo6l8iqx6A6-lvmC-qUUGeFq9_");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=1RWLSUvyVN2mP3bNjAAg8zTX0r9JMQSg2");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=1RWLSUvyVN2mP3bNjAAg8zTX0r9JMQSg2");
      break;
      }
    }
	    
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("MATHS_KEY_2.docx"));
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


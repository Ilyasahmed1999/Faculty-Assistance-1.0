package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Sas2Objects
{ pair sasv[][];
  pair sasl[][];
  Sas2Objects()
  {  sasv=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { sasv[i][j]=new pair();
	      }
        sasv[0][0].no=1;
        sasv[0][0].Q="Explain the procedure to perform convolution using graphical method.";
        sasv[0][1].no=2;
        sasv[0][1].Q="Find the convolution of the given discrete sequences x1(n)= {1,2,3,4} and h(n)= {3,2,1,0}";
        sasv[0][2].no=3;
        sasv[0][2].Q="Find the convolution of the given discrete sequences x1(n)= {1,2,3,4} and h(n)= {3,2,1,0}";
        sasv[1][0].no=1;
        sasv[1][0].Q="Write the properties of ROC.";
        sasv[1][1].no=2;
        sasv[1][1].Q="Find the z-tranform of a^n[u(n)]";
        sasv[1][2].no=3;
        sasv[1][2].Q="Differentiate Laplace transform and Z-transform.";
        sasv[2][0].no=1;
        sasv[2][0].Q="Define Static and Dynamic System.";
        sasv[2][1].no=2;
        sasv[2][1].Q="Define a System. and give examples.";
        sasv[2][2].no=3;
        sasv[2][2].Q="Define Static and Dynamic System.";

        sasl=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { sasl[i][j]=new pair();
	      }
	    sasl[0][0].no=1;
	    sasl[0][0].Q="The input and impulse responce to a system are x(t)=u(t+2) and h(t)=u(t-3), Determine the output of the system.";
	    sasl[0][1].no=2;
	    sasl[0][1].Q="Determine the convolution of the following 2 sequennces x(n)=1 (-1=<n=<1)=0 (elsewhere) and h(n)=1 (-1=<n=<1) =0(elsewhere)";
	    sasl[0][2].no=3;
	    sasl[0][2].Q="Find the auto correlation of e^(-at)u(t).";
	    sasl[0][3].no=4;
	    sasl[0][3].Q="";
	    sasl[1][0].no=1;
	    sasl[1][0].Q="State and prove the following properties of z-transform. i)Linearity ii) Time Shifting iii)Time Reversal";
	    sasl[1][1].no=2;
	    sasl[1][1].Q="Using final value theorem find x(infinity) if x(z) is given by i) z+1/(z-0.6)^2 ii) z+2/4(z-1)(z+0.7)";
	    sasl[1][2].no=3;
	    sasl[1][2].Q="Using long division method determine the inverse laplace transform of x(z)=z^2+z+2/(z^3-2z^2+3z+4)";
	    sasl[1][3].no=4;
	    sasl[1][3].Q="";
	    sasl[2][0].no=1;
	    sasl[2][0].Q="Determine whether the following signals are time invariant or variant i)y(t)=t^2x(t) ii) y(n)=x(n/2) ii) y(t)=x(t^2).";
	    sasl[2][1].no=2;
	    sasl[2][1].Q="Explain about various classifications of Systems";
	    sasl[2][2].no=3;
	    sasl[2][2].Q="Check whether the following systems are causal or not i) y(t)=x(2-t)+x(t-4) ii)y(t)=x(t/2) ii)y(n)=x(-n)";
	    sasl[2][3].no=4;
	    sasl[2][3].Q="";

  }
  String findv(int x,int y)
  {   return (sasv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (sasl[x][y-1].Q);
  }
}

class SAS2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Sas2Objects O=new Sas2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("SAS_INTERNAL_2.docx"));
      
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
    runv.setText(O.findv(0,questions[0]=(int)(Math.random()*(2)+1)));
    runv.addBreak();
    runv.addBreak();
    runv.setText("2.     ");//2nd question
    runv.setText(O.findv(1,questions[1]=(int)(Math.random()*(2)+1)));
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
    runl.setText(O.findl(0,questions[3]=(int)(Math.random()*(3)+1)));
    runl.addBreak();
    runl.addBreak();
    int check =(int)(Math.random()*(3)+1);
    if(check==questions[3])
    {check++;
     check=check%3;
    }
    if(check==0) check=3;
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
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1vDIp9v5bzt8XfUjVSuHwrtTItKsaehXV");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1tV9DgluZN1GgT06ENNV6iDs_e69HOcHm");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1ntT1kVOy_ML9ibJSHUe2BUWAkuTntmGt");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1ntT1kVOy_ML9ibJSHUe2BUWAkuTntmGt");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1GzaLWzu5pPyLqMpg3ddjimu0ilW5ZiBh");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=1n-ZFJb2kCM9mlltmHAfWBVsR22K09PSq");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=15iB1Sty3kS_yZGu7em8F6G-GL_zewM4_");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=1r5Hy_TkHypGNjn9PnWDEQJ7bW0s0ZNv_");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=1i_8QHP2kka-i1yn9uPMZmlfyO4iKKZ6_");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=1F8zWS-ytzT2Bj93LU79EPlOaTlrulYHI");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=1gJh7BwAjaYKNGtgco4k4Cb0KEjQ2JD8d");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1nTyhRs4TplpSNy-CSakbVuInaCCrnkYf");
      break;
      case 4: keyp[3]=new String("https://drive.google.com/open?id=1nTyhRs4TplpSNy-CSakbVuInaCCrnkYf");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=1F8zWS-ytzT2Bj93LU79EPlOaTlrulYHI");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=1gJh7BwAjaYKNGtgco4k4Cb0KEjQ2JD8d");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1nTyhRs4TplpSNy-CSakbVuInaCCrnkYf");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1nTyhRs4TplpSNy-CSakbVuInaCCrnkYf");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1jSb1pIW7adKwaA1Ys-pHM1iYCttaCAuu");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=17XmzsuEZftR_z62yB8JJwffEQ0m6KgYX");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=1Ko4qsDh1P0yycoD7Rcw8DWA-DfZQMCqk");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=1Ko4qsDh1P0yycoD7Rcw8DWA-DfZQMCqk");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1jSb1pIW7adKwaA1Ys-pHM1iYCttaCAuu");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=17XmzsuEZftR_z62yB8JJwffEQ0m6KgYX");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=1Ko4qsDh1P0yycoD7Rcw8DWA-DfZQMCqk");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=1Ko4qsDh1P0yycoD7Rcw8DWA-DfZQMCqk");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=17ZlGv2Xs9E5ReM6Otn07dJtNE35BO6wR");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1jCL7kGXsoziErGUGmkiVepVavN3_VHNy");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1UljSVxrakr99phbEoSF-FSSu0WlQxA9V");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1UljSVxrakr99phbEoSF-FSSu0WlQxA9V");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=17ZlGv2Xs9E5ReM6Otn07dJtNE35BO6wR");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=1jCL7kGXsoziErGUGmkiVepVavN3_VHNy");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=1UljSVxrakr99phbEoSF-FSSu0WlQxA9V");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=1UljSVxrakr99phbEoSF-FSSu0WlQxA9V");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("SAS_KEY_2.docx"));
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

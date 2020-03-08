package  testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Sas1Objects
{ pair sasv[][];
  pair sasl[][];
  Sas1Objects()
  {  sasv=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { sasv[i][j]=new pair();
	      }
        sasv[0][0].no=1;
        sasv[0][0].Q="Determine whether the signal is periodic or not x(t)=cos2t+sin(sqrt(3)t).";
        sasv[0][1].no=2;
        sasv[0][1].Q="Check for the orthogonality of the following signals x1(t)=e^jnt and x2(t)=e^jmt.";
        sasv[0][2].no=3;
        sasv[0][2].Q="Find the even and odd components of x(t)=e^j2t.";
        sasv[1][0].no=1;
        sasv[1][0].Q="Find Fourier transform of single sided exponential x(t)=u(t)e^-at.";
        sasv[1][1].no=2;
        sasv[1][1].Q="Find the fourier transform of 1/(a+jt).";
        sasv[1][2].no=3;
        sasv[1][2].Q="State Dirichlet's conditions.";
        sasl=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { sasl[i][j]=new pair();
	      }
	    sasl[0][0].no=1;
	    sasl[0][0].Q="A rectangular function is defined as x(t)=A, for 0<t<pi/2 =-A, for pi/2<t<3pi/2 =A, for 3pi/2<t<2pi Approximate the above function by Acost between the interval (0,2pi) such that the mean square error is minimum.";
	    sasl[0][1].no=2;
	    sasl[0][1].Q="Derive the expression for mean square error.";
	    sasl[0][2].no=3;
	    sasl[0][2].Q="Determine whether the following signals are energy or power signals i)x(t)=tu(t) ii)x(t0=Au(t)e^-at.";
	    sasl[0][3].no=4;
	    sasl[0][3].Q="Explain the analogy between signals And vectors.";
	    sasl[1][0].no=1;
	    sasl[1][0].Q="State and prove the following properties of the fourier Tranform i)Time shift property ii)Differentiation in time domain property.";
	    sasl[1][1].no=2;
	    sasl[1][1].Q="Using Fourier transform,find the convulution of the following x1(t)=u(t)e^-2t and x2(t)=u(t)e^-3t.";
	    sasl[1][2].no=3;
	    sasl[1][2].Q="Find the Fourier transform using properties x(t)=tu(t)e^-2t.";
	    sasl[1][3].no=4;
	    sasl[1][3].Q="Find the Hilbert transform of i)sinwt ii)coswt.";
  }
  String findv(int x,int y)
  {   return (sasv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (sasl[x][y-1].Q);
  }
}

class SAS1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Sas1Objects O=new Sas1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("SAS_INTERNAL_1.docx"));
      
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
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1-t1rxaAe3s28kusNRiDL0jMJm3FBTtB6");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1-y_wHY1JAPP4phjt8fS_jJJAF3KtDoNv");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1096QjIpPr0fB4VJqKWYbT0Jf59O00EUT");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1-t1rxaAe3s28kusNRiDL0jMJm3FBTtB6");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1-y_wHY1JAPP4phjt8fS_jJJAF3KtDoNv");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=1096QjIpPr0fB4VJqKWYbT0Jf59O00EUT");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=100gwY5Me6tLgFIN8Y2vgwqxu5zznq1Ks");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=10JnMjmzXd8tiPpeNY0IZODFR1BEpCu5L");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=10KTrsUdUqAXb9Rpnjxn1XZZz-idCpGru");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=1-1hktARQOaSn_PFmvfa782EoVbOfij0_");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=1-4xrYoA_nnQK8i8iQxBDORGJaMySFMb2");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1J3R5XYnNexCFaHJHFeheXGhj2tORc4JE");
      break;
      case 4: keyp[3]=new String("https://drive.google.com/open?id=1-CFH-GedgyPN_CJvpLdjSvbo48B2qERx");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=1-1hktARQOaSn_PFmvfa782EoVbOfij0_");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=1-4xrYoA_nnQK8i8iQxBDORGJaMySFMb2");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1J3R5XYnNexCFaHJHFeheXGhj2tORc4JE");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1-CFH-GedgyPN_CJvpLdjSvbo48B2qERx");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1HNA3V4qTMiR1ebXjFyJaFUVO1AKh_EVi");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=1-UvcG7KONSzWMccILJvAqdoIgnQ4NyeW");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=16PaDf-5cexbYOyOPWUM-XYnVmCC82cBJ");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=1MY7MydhL0xmJSv25fuFm9XZkb0q9SaLC");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1HNA3V4qTMiR1ebXjFyJaFUVO1AKh_EVi");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=1-UvcG7KONSzWMccILJvAqdoIgnQ4NyeW");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=16PaDf-5cexbYOyOPWUM-XYnVmCC82cBJ");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=1MY7MydhL0xmJSv25fuFm9XZkb0q9SaLC");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=1-1hktARQOaSn_PFmvfa782EoVbOfij0_");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1-4xrYoA_nnQK8i8iQxBDORGJaMySFMb2");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1J3R5XYnNexCFaHJHFeheXGhj2tORc4JE");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1-CFH-GedgyPN_CJvpLdjSvbo48B2qERx");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=1HNA3V4qTMiR1ebXjFyJaFUVO1AKh_EVi");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=1-UvcG7KONSzWMccILJvAqdoIgnQ4NyeW");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=16PaDf-5cexbYOyOPWUM-XYnVmCC82cBJ");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=1MY7MydhL0xmJSv25fuFm9XZkb0q9SaLC");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("SAS_KEY_1.docx"));
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

package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Mp2Objects
{ pair mpv[][];
  pair mpl[][];
  Mp2Objects()
  {  mpv=new pair[3][3];
  for(int i=0;i<3;i++)
	     for(int j=0;j<3;j++)
	      { mpv[i][j]=new pair();
	      }
	    mpv[0][0].no=1;
	    mpv[0][0].Q="Mention the differences between Synchronous and Asynchronous Transmission.";
	    mpv[0][1].no=2;
	    mpv[0][1].Q="Give the Command Register Register of 8251A. ";
	    mpv[0][2].no=3;
	    mpv[0][2].Q="Give the applications of 8254 Interfacing device.";
	    mpv[1][0].no=1;
	    mpv[1][0].Q="Mention the differences between 8085 and 8086 microproccessors.";
	    mpv[1][1].no=2;
	    mpv[1][1].Q="Write about the general purpose registers in 8086 Microprocessor.";
	    mpv[1][2].no=3;
	    mpv[1][2].Q="Mention the differences between 8085 and 8086 microproccessors.";
	    mpv[2][0].no=1;
	    mpv[2][0].Q="Mention different branch intructions in 8086 microproccessors.";
	    mpv[2][1].no=2;
	    mpv[2][1].Q="";
	    mpv[2][2].no=3;
	    mpv[2][2].Q="";

	    mpl=new pair[3][4];
	    for(int i=0;i<3;i++)
	     for(int j=0;j<4;j++)
	      { mpl[i][j]=new pair();
	      }
	    mpl[0][0].no=1;
	    mpl[0][0].Q="With a neat block diagram , explain about 8259. ";
	    mpl[0][1].no=2;
	    mpl[0][1].Q="Discuss the 8254 Function block diagram.";
	    mpl[0][2].no=3;
	    mpl[0][2].Q="Draw and explain 8255 parallel Interfacing Device. ";
	    mpl[0][3].no=4;
	    mpl[0][3].Q="Describe the 8279 keyboard.";
	    mpl[1][0].no=1;
	    mpl[1][0].Q="With neat diagram explain about 8086 Microproccessor architecture.";
	    mpl[1][1].no=2;
	    mpl[1][1].Q="Write a short note on Interrupts";
	    mpl[1][2].no=3;
	    mpl[1][2].Q="Draw and Explain 8086 pin diagram.";
	    mpl[1][3].no=4;
	    mpl[1][3].Q="Write about the memory banks of 8086 microproccessor";
	    mpl[2][0].no=1;
	    mpl[2][0].Q="Explain the addressing modes of 8086 Microproccessor.";
	    mpl[2][1].no=2;
	    mpl[2][1].Q="Describe the assembler directives";
	    mpl[2][2].no=3;
	    mpl[2][2].Q="Discuss the Instruction set of 8086 microproccessor.";
	    mpl[2][3].no=4;
	    mpl[2][3].Q="Define the i)linking and relocation ii)procedures and macros.";

  }
  String findv(int x,int y)
  {   return (mpv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (mpl[x][y-1].Q);
  }
}

class MP2
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Mp2Objects O=new Mp2Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("MP_INTERNAL_2.docx"));
      
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
    runl.addBreak();
    document.write(out);
    out.close();
    document.close();
    System.out.println("QP.docx written successfully");
	}
   void keypath()
    { switch(questions[0])
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1KWSrVT5JvlOJfIPHaDDVfSGSUS1xTI6N");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1AzWLTTkz9V7uSn3xF95Ec82nPI6MiujL");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1ShU1wNVCU8kuelHJovmJqc-9oa94yWeZ");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1T6aB99UEDihwFqleIBFtquCisyyHdkga");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1Ym_FoGtiYQaNZh1qsai25sUWeyY6SC2O");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=10pFntn5y8_zSJnL8bw0AVyjcmz1mMF8T");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=13rp-e3J0SRT_GqgZz7DbL6K5F4Q4JGv_");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=18amvUdBSVw0jQdCZ-e7cOShRciyFZf7Q");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=18VqZNi6uqq8hrS68dEEY9_dYoBmr1n3r");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=1Jst_I0SqrfR9SISdwGJHlUrIaNp-9Xml");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=17Z-oNQaBNtF1PK7XlNHMuV9y1L42yk-M");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1qGiNRqzhk9DwRbC8E4zLBHoKD0qBF60L");
      break;
      case 4: keyp[3]=new String("https://drive.google.com/open?id=1OZUYAzNQKCIHiyxpng0HJQ1SkqztsgWd");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=1Jst_I0SqrfR9SISdwGJHlUrIaNp-9Xml");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=17Z-oNQaBNtF1PK7XlNHMuV9y1L42yk-M");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1qGiNRqzhk9DwRbC8E4zLBHoKD0qBF60L");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1OZUYAzNQKCIHiyxpng0HJQ1SkqztsgWd");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1xI-stnbCkauiYccVgVTkpOAgDiRrQ5Kv");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=1QMrGCOvIf-uQ1FihWVEEC1BhFJ1lwkrC");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=1dArO4rFo1BCru_Htjr1yL6yvK82xH56R");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=1_2IhKvUK4tiIvy-8s1EwdAZoNtZVwj0I");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1xI-stnbCkauiYccVgVTkpOAgDiRrQ5Kv");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=1QMrGCOvIf-uQ1FihWVEEC1BhFJ1lwkrC");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=1dArO4rFo1BCru_Htjr1yL6yvK82xH56R");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=1_2IhKvUK4tiIvy-8s1EwdAZoNtZVwj0I");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=1NqIMyP1v1tqS3Pey3x9_aN8o5121GIh8");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1yGl0HPSPYhEkLWRhcOYQGc3QKd9yZZSK");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1mr6lKFHXBaPjKAtctqB9saBFUgw14ETl");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1AzWLTTkz9V7uSn3xF95Ec82nPI6MiujL");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=1NqIMyP1v1tqS3Pey3x9_aN8o5121GIh8");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=1yGl0HPSPYhEkLWRhcOYQGc3QKd9yZZSK");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=1mr6lKFHXBaPjKAtctqB9saBFUgw14ETl");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=1AzWLTTkz9V7uSn3xF95Ec82nPI6MiujL");
      break;
      }
    }
   void generateKey()throws IOException, InvalidFormatException
   {   
	   XWPFDocument doc = new XWPFDocument();
	    FileOutputStream out1 = new FileOutputStream(new File("MP_KEY_2.docx"));
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


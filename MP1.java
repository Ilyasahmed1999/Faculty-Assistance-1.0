package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

class Mp1Objects
{ pair mpv[][];
  pair mpl[][];
  Mp1Objects()
  {  mpv=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { mpv[i][j]=new pair();
	      }
	    mpv[0][0].no=1;
	    mpv[0][0].Q="Write a program to find largest of two numbers.";
	    mpv[0][1].no=2;
	    mpv[0][1].Q="List the addressing modes in 8085 Microprocessor with examples";
	    mpv[0][2].no=3;
	    mpv[0][2].Q="Write about flag register of 8085 Microprocessor";
	    mpv[1][0].no=1;
	    mpv[1][0].Q="Differentiate between memory mapped I/O and peripheral mapped I/O";
	    mpv[1][1].no=2;
	    mpv[1][1].Q="Write about I/O instructions in 8085 Microprocessor";
	    mpv[1][2].no=3;
	    mpv[1][2].Q="write about Absolute and partial decoding";
	    mpl=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { mpl[i][j]=new pair();
	      }
	    mpl[0][0].no=1;
	    mpl[0][0].Q="Explain the pin Configuration of 8085 Microprocessor with a neat figure ";
	    mpl[0][1].no=2;
	    mpl[0][1].Q="Explain the architecture of 8085 Microproccessor with a neat diagram";
	    mpl[0][2].no=3;
	    mpl[0][2].Q="Write about the addressing modes in 8085 Microprocessor with examples ";
	    mpl[0][3].no=4;
	    mpl[0][3].Q="write about i)data transfer instructions and ii) Arithmetic instructions";
	    mpl[1][0].no=1;
	    mpl[1][0].Q="Explain about Stacks and instructions of stack operations";
	    mpl[1][1].no=2;
	    mpl[1][1].Q="Sketch the timing Diagram of STA instruction";
	    mpl[1][2].no=3;
	    mpl[1][2].Q="Explain the functional block Diagram of DMAC with neat Diagram";
	    mpl[1][3].no=4;
	    mpl[1][3].Q="Write about 8259A Programmable Interrupt controller with neat diagram.";
  }
  String findv(int x,int y)
  {   return (mpv[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (mpl[x][y-1].Q);
  }
}

class MP1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Mp1Objects O=new Mp1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("MP_INTERNAL_1.docx"));
      
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
    	{ case 1: keyp[0]= new String("https://drive.google.com/open?id=1gr8ysqRaXWbvbgJc6OOLXnW0o4-68-cF");
    	          break;
    	case 2: keyp[0]=new String("https://drive.google.com/open?id=1OAn05GEFAr6XEHf-kCv9H9vjNTqT2t_h");
    			  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1aC5NohFekFNgOb2I1Yl90hEnM1bvXtIn");
    	break;
    	}
      switch(questions[1])
      { case 1: keyp[1]= new String("https://drive.google.com/open?id=1gr8ysqRaXWbvbgJc6OOLXnW0o4-68-cF");
      break;
      case 2: keyp[1]=new String("https://drive.google.com/open?id=1OAn05GEFAr6XEHf-kCv9H9vjNTqT2t_h");
	  break;
      case 3: keyp[1]=new String("https://drive.google.com/open?id=1aC5NohFekFNgOb2I1Yl90hEnM1bvXtIn");
      break;
      }
      switch(questions[2])
      { case 1: keyp[2]= new String("https://drive.google.com/open?id=1IpBH2Uk9rSlstaVlu-BBdHWFr1R4cL9L");
      break;
      case 2: keyp[2]=new String("https://drive.google.com/open?id=1AWHoPihceQLpX---E_bsvwY5uVFMD0Km");
	  break;
      case 3: keyp[2]=new String("https://drive.google.com/open?id=15vyd8_D8Jmpcvvl7T5UOQCuJ-ujcncrJ");
      break;
      }
      switch(questions[3])
      { case 1: keyp[3]= new String("https://drive.google.com/open?id=19RZBbJFcUkr5-XHZRCzYs2PCnOm0O9-G");
      break;
      case 2: keyp[3]=new String("https://drive.google.com/open?id=1IWP7g_6YrKdJILe9jf2doJKUqX0J8X0y");
	  break;
      case 3: keyp[3]=new String("https://drive.google.com/open?id=1ZSt9R5RWdttNeSfg7qKbZ1l2DWnLjJ8p");
      break;
      case 4: keyp[3]=new String("");
      break;
      }
      switch(questions[4])
      { case 1: keyp[4]= new String("https://drive.google.com/open?id=19RZBbJFcUkr5-XHZRCzYs2PCnOm0O9-G");
      break;
      case 2: keyp[4]=new String("https://drive.google.com/open?id=1IWP7g_6YrKdJILe9jf2doJKUqX0J8X0y");
	  break;
      case 3: keyp[4]=new String("https://drive.google.com/open?id=1ZSt9R5RWdttNeSfg7qKbZ1l2DWnLjJ8p");
      break;
      case 4: keyp[4]=new String("https://drive.google.com/open?id=1oYVZnIWqSQeJyKvQJsUrqs-c8_HaEW_J");
      break;
      }
      switch(questions[5])
      { case 1: keyp[5]= new String("https://drive.google.com/open?id=1x4Dpulcyrb9kYV1DXF-9pUD4s1CQ9hN5");
      break;
      case 2: keyp[5]=new String("https://drive.google.com/open?id=14R0YxSU7M9o5lzNvS0_Rcj5MIPTY-1Y2");
	  break;
      case 3: keyp[5]=new String("https://drive.google.com/open?id=1sMqTVDDgycJ4RYJWKHnlb1DVRI_quQs_");
      break;
      case 4: keyp[5]=new String("https://drive.google.com/open?id=1nq6EDQOpu1Sga2yflDwCMhpLWssV_w6M");
      break;
      } 
      switch(questions[6])
      { case 1: keyp[6]= new String("https://drive.google.com/open?id=1x4Dpulcyrb9kYV1DXF-9pUD4s1CQ9hN5");
      break;
      case 2: keyp[6]=new String("https://drive.google.com/open?id=14R0YxSU7M9o5lzNvS0_Rcj5MIPTY-1Y2");
	  break;
      case 3: keyp[6]=new String("https://drive.google.com/open?id=1sMqTVDDgycJ4RYJWKHnlb1DVRI_quQs_");
      break;
      case 4: keyp[6]=new String("https://drive.google.com/open?id=1nq6EDQOpu1Sga2yflDwCMhpLWssV_w6M");
      break;
      } 
      switch(questions[7])
      { case 1: keyp[7]= new String("https://drive.google.com/open?id=19RZBbJFcUkr5-XHZRCzYs2PCnOm0O9-G");
      break;
      case 2: keyp[7]=new String("https://drive.google.com/open?id=1IWP7g_6YrKdJILe9jf2doJKUqX0J8X0y");
	  break;
      case 3: keyp[7]=new String("https://drive.google.com/open?id=1ZSt9R5RWdttNeSfg7qKbZ1l2DWnLjJ8p");
      break;
      case 4: keyp[7]=new String("https://drive.google.com/open?id=1oYVZnIWqSQeJyKvQJsUrqs-c8_HaEW_J");
      break;
      }
      switch(questions[8])
      { case 1: keyp[8]= new String("https://drive.google.com/open?id=1x4Dpulcyrb9kYV1DXF-9pUD4s1CQ9hN5");
      break;
      case 2: keyp[8]=new String("https://drive.google.com/open?id=14R0YxSU7M9o5lzNvS0_Rcj5MIPTY-1Y2");
	  break;
      case 3: keyp[8]=new String("https://drive.google.com/open?id=1sMqTVDDgycJ4RYJWKHnlb1DVRI_quQs_");
      break;
      case 4: keyp[8]=new String("https://drive.google.com/open?id=1nq6EDQOpu1Sga2yflDwCMhpLWssV_w6M");
      break;
      }
    }
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("MP_KEY_1.docx"));
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


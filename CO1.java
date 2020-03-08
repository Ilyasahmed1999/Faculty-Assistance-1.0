package testing;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
 class pair
{ int no;
  String Q;
}
class Co1Objects
{ pair cov[][];
  pair col[][];
  Co1Objects()
  {  cov=new pair[2][3];
  for(int i=0;i<2;i++)
	     for(int j=0;j<3;j++)
	      { cov[i][j]=new pair();
	      }
  		cov[0][0].no=1;
  		cov[0][0].Q="Give examples for r's and (r-1)'s complement";
  		cov[0][1].no=2;
  		cov[0][1].Q="Explain procedure to convert decimal to binary.";
  		cov[0][2].no=3;
  		cov[0][2].Q="Convert the given binary number to gray code i)100101 ii)1110101";
  		cov[1][0].no=1;
  		cov[1][0].Q="The contents of register A and b are '1101' and '0110' find the following microprogram sequence . T1:B<-B' T2:EA<-A+B";
  		cov[1][1].no=2;
  		cov[1][1].Q="Write about three-state Buffers.";
  		cov[1][2].no=3;
  		cov[1][2].Q="Draw the circuit diagram of 4-bit adder and subtracter";
  		col=new pair[2][4];
	    for(int i=0;i<2;i++)
	     for(int j=0;j<4;j++)
	      { col[i][j]=new pair();
	      }
	    col[0][0].no=1;
	    col[0][0].Q="Explain about Interconnection structure of computer system";
	    col[0][1].no=2;
	    col[0][1].Q="Discuss about Bus Interconnection Structure";
	    col[0][2].no=3;
	    col[0][2].Q="Explain about Functional Block diagram of Computer System ";
	    col[0][3].no=4;
	    col[0][3].Q="Explain about Performance of computer system with the factors affecting it.";
	    col[1][0].no=1;
	    col[1][0].Q="Explain Instruction Cycle and draw a flow chart to illustrate.";
	    col[1][1].no=2;
	    col[1][1].Q="Write about Common Bus System.";
	    col[1][2].no=3;
	    col[1][2].Q="Explain about Computer Registers and Various types of registers.";
	    col[1][3].no=4;
	    col[1][3].Q="Write about Different types of Computer Instructions ";
  }
  String findv(int x,int y)
  {   return (cov[x][y-1].Q);
  }
  String findl(int x,int y)
  {   return (col[x][y-1].Q);
  }
}

class CO1
{   int questions[]=new int[9];
    String keyp[]=new String[9];
    
    void generateQP() throws IOException
    {
	 Co1Objects O=new Co1Objects();
    //Blank Document
    XWPFDocument document = new XWPFDocument(); 
    
    //Write the Document in file system
    FileOutputStream out = new FileOutputStream(new File("CO_INTERNAL_1.docx"));
      
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
    {    
    	switch(questions[0])
    	
    	{ case 1: keyp[0]= new String("https://testbook.com/blog/how-to-find-rs-and-r-1s-complement-of-numbers/");
        break;
    	case 2: keyp[0]=new String("https://www.electronics-tutorials.ws/binary/bin_2.html");
		  break;
    	case 3: keyp[0]=new String("https://drive.google.com/open?id=1k3pQv42QvFm623oPI3O0Gzsn7otrPaXq ");
    		break;
    	}
    	switch(questions[1])
    	{ case 1: keyp[1]= new String("https://testbook.com/blog/how-to-find-rs-and-r-1s-complement-of-numbers/");
    		break;
    	case 2: keyp[1]=new String("https://www.electronics-tutorials.ws/binary/bin_2.html");
    	break;
    	case 3: keyp[1]=new String("https://drive.google.com/open?id=1k3pQv42QvFm623oPI3O0Gzsn7otrPaXq ");
    	break;
    	}
    	switch(questions[2])
    	{ case 1: keyp[2]= new String("https://drive.google.com/open?id=1Uy7lMUnwYdM1Q_DGntpr8kzqarOxxSPE");
    	break;
    	case 2: keyp[2]=new String("https://drive.google.com/open?id=1NwDgT5KVORAKKmWBDVwZ3PNSv1qbWEKN");
    	break;
    	case 3: keyp[2]=new String("https://drive.google.com/open?id=102aKGi1CwUmY4OTPz2U4bRw6DijdWgHy");
    	break;
    	}
    	switch(questions[3])
    	{ case 1: keyp[3]= new String("https://drive.google.com/drive/folders/1De6YN6iBVYr3vMYop8ft9W2PQjcQ4QvM");
    	break;
    	case 2: keyp[3]=new String("https://drive.google.com/drive/folders/1xacXde65eDs52j7B1gjxYDRT4_4ZApek");
    	break;
    	case 3: keyp[3]=new String("http://wikieducator.org/Block_diagram_of_computer");
    	break;
    	case 4: keyp[3]=new String("https://drive.google.com/drive/folders/1NmyHhMquArf-qFe04miu_RjXPiOxO5wP");
    	break;
    	}
    	switch(questions[4])
    	{ case 1: keyp[4]= new String("https://drive.google.com/drive/folders/1De6YN6iBVYr3vMYop8ft9W2PQjcQ4QvM");
    	break;
    	case 2: keyp[4]=new String("https://drive.google.com/drive/folders/1xacXde65eDs52j7B1gjxYDRT4_4ZApek");
    	break;
    	case 3: keyp[4]=new String("http://wikieducator.org/Block_diagram_of_computer");
    	break;
    	case 4: keyp[4]=new String("https://drive.google.com/drive/folders/1NmyHhMquArf-qFe04miu_RjXPiOxO5wP");
    	break;
    	}
    	switch(questions[5])
    	{ case 1: keyp[5]= new String("https://drive.google.com/drive/folders/1RsdVJN_Y-fojvH3SACsNDDV0wNLYrkum");
    	break;
    	case 2: keyp[5]=new String("https://drive.google.com/drive/folders/1Ou2vbTuReeM7V297GmFDPt6K-vQsIxQD");
    	break;
    	case 3: keyp[5]=new String("https://www.studytonight.com/computer-architecture/registers");
    	break;
    	case 4: keyp[5]=new String("https://www.geeksforgeeks.org/computer-organization-basic-computer-instructions/");
    	break;
    	} 
    	switch(questions[6])
    	{ case 1: keyp[6]= new String("https://drive.google.com/drive/folders/1RsdVJN_Y-fojvH3SACsNDDV0wNLYrkum");
    	break;
    	case 2: keyp[6]=new String("https://drive.google.com/drive/folders/1Ou2vbTuReeM7V297GmFDPt6K-vQsIxQD");
    	break;
    	case 3: keyp[6]=new String("https://www.studytonight.com/computer-architecture/registers");
    	break;
    	case 4: keyp[6]=new String("https://www.geeksforgeeks.org/computer-organization-basic-computer-instructions/");
    	break;
    		} 
    	switch(questions[7])
    	{ case 1: keyp[7]= new String("https://drive.google.com/drive/folders/1De6YN6iBVYr3vMYop8ft9W2PQjcQ4QvM");
    	break;
    	case 2: keyp[7]=new String("https://drive.google.com/drive/folders/1xacXde65eDs52j7B1gjxYDRT4_4ZApek");
    	break;
    	case 3: keyp[7]=new String("http://wikieducator.org/Block_diagram_of_computer");
    	break;
    	case 4: keyp[7]=new String("https://drive.google.com/drive/folders/1NmyHhMquArf-qFe04miu_RjXPiOxO5wP");
    	break;
    	}
    	switch(questions[8])
    	{ case 1: keyp[8]= new String("https://drive.google.com/drive/folders/1RsdVJN_Y-fojvH3SACsNDDV0wNLYrkum");
    	break;
    	case 2: keyp[8]=new String("https://drive.google.com/drive/folders/1Ou2vbTuReeM7V297GmFDPt6K-vQsIxQD");
    	break;
    	case 3: keyp[8]=new String("https://www.studytonight.com/computer-architecture/registers");
    	break;
    	case 4: keyp[8]=new String("https://www.geeksforgeeks.org/computer-organization-basic-computer-instructions/");
    	break;
    	}
}

   
    void generateKey()throws IOException, InvalidFormatException
    {   
 	   XWPFDocument doc = new XWPFDocument();
 	    FileOutputStream out1 = new FileOutputStream(new File("CO_KEY_1.docx"));
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


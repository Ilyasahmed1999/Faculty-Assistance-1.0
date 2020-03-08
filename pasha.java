package testing;

import java.io.File;
import java.io.FileOutputStream;


import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class pasha extends ReportCardDataI {
    String Templates[];
    int emarks[][];
    pasha()
    { Templates=new String[4];
     for(int i=0;i<4;i++)
     {
    	 Templates[i]=new String();
     }
     Templates[0]="Focus more on ";
     Templates[1]="Improve in ";
     Templates[2]="Can do better in ";
     Templates[3]="Work hard on ";
    

    }
    static String gradecal(int marks)
 	{
 		String grade;
 	             if(marks>=90)
 	              {
 	              grade="S";
 	              
 	              }
 	              else if(marks>=80 && marks<90)
 	              {
 	              grade="A";
 	              } 
 	              else if(marks>=70 && marks<80)
 	              {
 	              grade="B";
 	              }
 	              else if(marks>=60 && marks<70)
 	              {
 	              grade="C";
 	              }
 	              else if(marks>=50 && marks<60)
 	              {
 	              grade="D";
 	              }
 	              else if(marks>=40 && marks<50)
 	              {
 	              grade="E";
 	              }
 	              else
 	              {
 	              grade="F";
 	              }
 		return grade;
 		}
    String Getremarks(int marks[])
    { 
    	int min=marks[0];
    	int value=0;
    	for( int k=0;k<5;k++)
    	{
    		if(min>marks[k]) 
    			{ min=marks[k];
    			  value=k; 
    			}
    	}
    	switch(value)
    	{
    	case 0: return(Templates[(int)(Math.random()*(2)+1)]+"Mathematics and statistics.");
    	      
    	case 1: return(Templates[(int)(Math.random()*(2)+1)]+"Signals and Systems Analysis.");
                
    	case 2: return(Templates[(int)(Math.random()*(2)+1)]+"Computer Organization.");
             
    	case 3: return(Templates[(int)(Math.random()*(2)+1)]+"Programming Using Java.");
            
    	case 4: return(Templates[(int)(Math.random()*(2)+1)]+"Programming Languages.");
           
    	case 5: return(Templates[(int)(Math.random()*(2)+1)]+"Microprocessors and interfacing.");
           
    	       
    	}
    	return "-";
    }
    void GenerateIRC()throws Exception {

        
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File("INT_ReportCard.docx"));
 
        //int n=2;
        int total;
        int avg;
        emarks=new int[in][6];
        for(int j=0;j<in;j++) {   

        
        emarks[j][0]=imaths[j];
        emarks[j][1]=isas[j];
        emarks[j][2]=ico[j];
        emarks[j][3]=ijava[j];
        emarks[j][4]=ipl[j];
        emarks[j][5]=imp[j];
        
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setItalic(true);
        run.setFontSize(20);
        run.setText("Muffakham Jah College Of Enginering And Technology");
        run.setText("  ");
        run.setText("Student Report Card");
        XWPFParagraph paragraph1 = document.createParagraph();
        XWPFRun run1 = paragraph1.createRun();
        run1.setBold(true);
        run1.setText("NAME : "+ename[j]);
        XWPFParagraph paragraph2 = document.createParagraph();
        XWPFRun run2 = paragraph2.createRun();
        run2.setBold(true);
        run2.setText("ROLLNO : "+erollno[j]);
        XWPFParagraph paragraph3 = document.createParagraph();
        XWPFRun run3 = paragraph3.createRun();
        run3.setBold(true);
        run3.setText("CLASS :CSE ");
      
            
        XWPFTable table = document.createTable();
        table.setWidth(10000);
        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("SUBJECTS");
        //tableRowOne.addNewTableCell().setText("MAX MARKS");
        tableRowOne.addNewTableCell().setText("MARKS SECURED");
       
  		
        
        XWPFTableRow tableRowTwo = table.createRow();
     
          tableRowTwo.getCell(0).setText("MATHEMATICS AND STATISTICS");
          //tableRowTwo.addNewTableCell().setText("30");
          tableRowTwo.getCell(1).setText(Integer.toString(emarks[j][0]));
      
       
        XWPFTableRow tableRowThree = table.createRow();
        tableRowThree.getCell(0).setText("SIGNALS AND SYSTEM ANALYSIS");
        //tableRowThree.addNewTableCell().setText("30");
        tableRowThree.getCell(1).setText(Integer.toString(emarks[j][1]));
        
        
        XWPFTableRow tableRowFour = table.createRow();
        tableRowFour.getCell(0).setText("COMPUTER ORGANIZATION");       
        //tableRowFour.addNewTableCell().setText("30");
        tableRowFour.getCell(1).setText(Integer.toString(emarks[j][2]));     
        
        XWPFTableRow tableRowFive = table.createRow();
        tableRowFive.getCell(0).setText("PROGRAMMING USING JAVA");
        //tableRowFive.addNewTableCell().setText("30");
        tableRowFive.getCell(1).setText(Integer.toString(emarks[j][3]));   
        
        XWPFTableRow tableRowSix = table.createRow();
        tableRowSix.getCell(0).setText("PROGRAMMING LANGUAGES");
        //tableRowSix.addNewTableCell().setText("30");
        tableRowSix.getCell(1).setText(Integer.toString(emarks[j][4]));   
        
        XWPFTableRow tableRowSeven = table.createRow();
        tableRowSeven.getCell(0).setText("MICROPROCESSOR AND INTERFACING");
        //tableRowSeven.addNewTableCell().setText("30");
        tableRowSeven.getCell(1).setText(Integer.toString(emarks[j][5]));   
        
        XWPFTableRow tableRowEight = table.createRow();
        tableRowEight.getCell(0).setText("TOTAL : ");
        tableRowEight.getCell(1).setText(Integer.toString(total=emarks[j][0]+emarks[j][1]+emarks[j][2]+emarks[j][3]+emarks[j][4]+emarks[j][5]));
        avg=total*100/180;
        XWPFTableRow tableRowNine = table.createRow();
        tableRowNine.getCell(0).setText("GRADE : ");
        tableRowNine.getCell(1).setText(gradecal(avg));
       
        XWPFParagraph paragraph4 = document.createParagraph();
        XWPFRun run4 = paragraph4.createRun();
        run4.setText("   ");
        XWPFParagraph paragraph5 = document.createParagraph();
        XWPFRun run5 = paragraph5.createRun();
        run5.setBold(true);
        run5.setText("REMARKS : ");
        run5.setText(Getremarks(emarks[j]));
        XWPFParagraph paragraph6 = document.createParagraph();
        paragraph6.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run6 = paragraph6.createRun();
        run6.setText("  ");
        XWPFParagraph paragraph7 = document.createParagraph();
        XWPFRun run7 = paragraph7.createRun();
        run7.setText("   ");
        XWPFParagraph paragraph8 = document.createParagraph();
        XWPFRun run8 = paragraph8.createRun();
        run8.setBold(true);
        run8.setText("SIGNATURE OF INCHARGE                                                                                                SIGNATURE OF HOD");
        XWPFParagraph paragraph9 = document.createParagraph();
        XWPFRun run9 = paragraph9.createRun();
        run9.setText("   ");
        XWPFParagraph paragraph10 = document.createParagraph();
        XWPFRun run10 = paragraph10.createRun();
        run10.setText("   ");
        XWPFParagraph paragraph11 = document.createParagraph();
        XWPFRun run11 = paragraph11.createRun();
        run11.setText("   ");
        XWPFParagraph paragraph12 = document.createParagraph();
        XWPFRun run12 = paragraph11.createRun();
        run12.setText("   ");
        XWPFParagraph paragraph13 = document.createParagraph();
        XWPFRun run13 = paragraph3.createRun();
        run13.setText("   ");
        XWPFParagraph paragraph14 = document.createParagraph();
        XWPFRun run14 = paragraph14.createRun();
        run14.setText("   ");
        XWPFParagraph paragraph15 = document.createParagraph();
        XWPFRun run15 = paragraph15.createRun();
        run15.setText("   ");
        XWPFParagraph paragraph16 = document.createParagraph();
        XWPFRun run16 = paragraph16.createRun();
        run16.setText("   ");
        
        }
        document.write(out);
        out.close();
        document.close();
        System.out.println("INT_ReportCard.docx generated successully");
    }
	public static void main(String args[])
	{
		pasha p=new pasha();
		try {
			p.GenerateIRC();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
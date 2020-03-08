package testing;
import java.io.File;
import java.io.*;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.util.Units;


public class External_Report extends ReportCardDataE{
	String G;
	int emarks[][];
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
	static int pointcal(int marks)
 	{
 		int point;
 	             if(marks>=90)
 	              {
 	              point=10;
 	              
 	              }
 	              else if(marks>=80 && marks<90)
 	              {
 	            	 point=9;
 	              } 
 	              else if(marks>=70 && marks<80)
 	              {
 	            	 point=8;
 	              }
 	              else if(marks>=60 && marks<70)
 	              {
 	            	 point=7;
 	              }
 	              else if(marks>=50 && marks<60)
 	              {
 	            	 point=6;
 	              }
 	              else if(marks>=40 && marks<50)
 	              {
 	            	 point=5;
 	              }
 	              else
 	              {
 	            	 point=0;
 	              }
 		return point;
 		}
	static String gradecalp(int marks)
 	{
 		String grade;
 	             if(marks>=67.5)
 	              {
 	              grade="S";
 	              
 	              }
 	              else if(marks>=60 && marks<67.5)
 	              {
 	              grade="A";
 	              } 
 	              else if(marks>=52.5 && marks<60)
 	              {
 	              grade="B";
 	              }
 	              else if(marks>=45 && marks<52.5)
 	              {
 	              grade="C";
 	              }
 	              else if(marks>=37.5 && marks<45)
 	              {
 	              grade="D";
 	              }
 	              else if(marks>=30 && marks<37.5)
 	              {
 	              grade="E";
 	              }
 	              else
 	              {
 	              grade="F";
 	              }
 		return grade;
 		}
	static int pointcalp(int marks)
 	{
 		int point;
 	             if(marks>=67.5)
 	              {
 	              point=10;
 	              
 	              }
 	              else if(marks>=60 && marks<67.5)
 	              {
 	            	 point=9;
 	              } 
 	              else if(marks>=52.5 && marks<60)
 	              {
 	            	 point=8;
 	              }
 	              else if(marks>=45 && marks<52.5)
 	              {
 	            	 point=7;
 	              }
 	              else if(marks>=37.5 && marks<45)
 	              {
 	            	 point=6;
 	              }
 	              else if(marks>=30 && marks<37.5)
 	              {
 	            	 point=5;
 	              }
 	              else
 	              {
 	            	 point=0;
 	              }
 		return point;
 		}
	double GetSGPA(int[] points)
	{    for(int k=0;k<9;k++)
		  if(points[k]==0) return 0.0;
		double sgpa=((3*points[2])+(3*points[1])+(3*points[2])+(3*points[3])+(3*points[4])+(3*points[5])+(1*points[6])+(1*points[7])+(2*points[8]))/22;
		return sgpa;
	}
  public  void GenerateERC() throws Exception
    {    int n=2;
         int N=in;
         int points[]=new int[9];
System.out.println(in);
XWPFDocument document = new XWPFDocument();

FileOutputStream out = new FileOutputStream(new File("External_Report_Card.docx"));
         for(int j=0;j<N;j++)
         {  
        	 emarks=new int[N][9];
         emarks[j][0]=imaths[j];
         emarks[j][1]=isas[j];
         emarks[j][2]=ico[j];
         emarks[j][3]=ijava[j];
         emarks[j][4]=ipl[j];
         emarks[j][5]=imp[j];
         emarks[j][6]=ijl[j];
         emarks[j][7]=impl[j];
         emarks[j][8]=imini[j];
      
         
    	
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(30);
        run.setText("OSMANIA UNIVERSITY");
        XWPFParagraph paragraph1 = document.createParagraph();
        paragraph1.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run1 = paragraph1.createRun();
        run1.setBold(true);
        run1.setFontSize(15);
        run1.setText("SEMESTER GRADE REPORT");
        XWPFParagraph paragraph2 = document.createParagraph();
        paragraph2.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run2 = paragraph2.createRun();
        run2.setBold(true);
        run2.setFontSize(10);
        run2.setText("(Choice Based Credit System)");
        XWPFParagraph paragraph3 = document.createParagraph();
        paragraph3.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run3 = paragraph3.createRun();
        run3.setText("  ");
        XWPFParagraph paragraph4 = document.createParagraph();
        paragraph4.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run4 = paragraph4.createRun();
        run4.setBold(true);
        run4.setFontSize(10);
        run4.setText("EXAMINATION : B.E.(C.S.E.) IV-SEM. MAY 2019 \t\t\t\t      DATE      :03-04-2019 ");
        XWPFParagraph paragraph5 = document.createParagraph();
        XWPFRun run5 = paragraph5.createRun();
        run5.setBold(true);
        run5.setText("NAME              :  "+ename[i]+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ "ROLLNO : "+erollno[i]);
        
       
        XWPFTable table = document.createTable();
        table.setWidth(10000);
        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("SUBJECT CODE");
        tableRowOne.addNewTableCell().setText("SUBJECT");
        tableRowOne.addNewTableCell().setText("CREDITS");
        tableRowOne.addNewTableCell().setText("GRADE AWARDED");
  	   XWPFTableRow tableRowTwo = table.createRow();
  	   tableRowTwo.getCell(0).setText("001");
         tableRowTwo.getCell(1).setText("MATHEMATICS AND STATISTICS");
         tableRowTwo.getCell(2).setText("3");
         G=gradecal(emarks[j][0]);
         points[0]=pointcal(emarks[j][0]);
         tableRowTwo.getCell(3).setText(G);
       XWPFTableRow tableRowThree = table.createRow();
        tableRowThree.getCell(0).setText("002");
        tableRowThree.getCell(1).setText("SIGNALS AND SYSTEM ANALYSIS");
        tableRowThree.getCell(2).setText("3");
        G=gradecal(emarks[j][1]);
        points[1]=pointcal(emarks[j][1]);
        tableRowThree.getCell(3).setText(G);
        XWPFTableRow tableRowFour = table.createRow();
        tableRowFour.getCell(0).setText("003");
        tableRowFour.getCell(1).setText("COMPUTER ORGANIZATION");     
        tableRowFour.getCell(2).setText("3");
        G=gradecal(emarks[j][2]);
        points[2]=pointcal(emarks[j][2]);
        tableRowFour.getCell(3).setText(G);
        XWPFTableRow tableRowFive = table.createRow();
        tableRowFive.getCell(0).setText("004");
       tableRowFive.getCell(1).setText("PROGRAMMING USING JAVA");   
       tableRowFive.getCell(2).setText("3");
       G=gradecal(emarks[j][3]);
       points[3]=pointcal(emarks[j][3]);
       tableRowFive.getCell(3).setText(G);
         XWPFTableRow tableRowSix = table.createRow();
        tableRowSix.getCell(0).setText("005");
        tableRowSix.getCell(1).setText("PROGRAMMING LANGUAGES");   
        tableRowSix.getCell(2).setText("3");
        G=gradecal(emarks[j][4]);
        points[4]=pointcal(emarks[j][4]);
        tableRowSix.getCell(3).setText(G);
         XWPFTableRow tableRowSeven = table.createRow();
        tableRowSeven.getCell(0).setText("006");
        tableRowSeven.getCell(1).setText("MICROPROCESSOR AND INTERFACING");   
        tableRowSeven.getCell(2).setText("3");
        G=gradecal(emarks[j][5]);
        points[5]=pointcal(emarks[j][5]);
        tableRowSeven.getCell(3).setText(G);
        XWPFTableRow tableRowEight = table.createRow();
        tableRowEight.getCell(0).setText("007");
        tableRowEight.getCell(1).setText("JAVA PROGRAMMING LAB");   
        tableRowEight.getCell(2).setText("1");
        G=gradecalp(emarks[j][6]);
        points[6]=pointcalp(emarks[j][6]);
        tableRowEight.getCell(3).setText(G);
        XWPFTableRow tableRowNine = table.createRow();
        tableRowNine.getCell(0).setText("008");
        tableRowNine.getCell(1).setText("MICROPROCESSOR LAB");   
        tableRowNine.getCell(2).setText("1");
        G=gradecalp(emarks[j][7]);
        points[7]=pointcalp(emarks[j][7]);
        tableRowNine.getCell(3).setText(G);
        XWPFTableRow tableRowTen = table.createRow();
        tableRowTen.getCell(0).setText("009");
        tableRowTen.getCell(1).setText("MINI PROJECT LAB");   
        tableRowTen.getCell(2).setText("2");
        G=gradecalp(emarks[j][8]);
        points[8]=pointcalp(emarks[j][8]);
        tableRowTen.getCell(3).setText(G);
        XWPFParagraph paragraph6 = document.createParagraph();
        paragraph6.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run6 = paragraph6.createRun();
        run6.setText("  ");
        XWPFParagraph paragraph7 = document.createParagraph();
        paragraph7.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run7 = paragraph7.createRun();
        run7.setBold(true);
        run7.setText("SGPA(Semester Grade Point Average) :");
        String gpa=Double.toString(GetSGPA(points));
        String result="PASS";
        
        //if(gpa=="0.0") result="PROMOTED"; 
        run7.setText(gpa);
        run7.setText("                                                        ");
         //XWPFParagraph paragraph8 = document.createParagraph();
       // paragraph8.setAlignment(ParagraphAlignment.RIGHT);
        //XWPFRun run8 = paragraph8.createRun();
        //run8.setBold(true);
       // String result="PASS";
        
    	int count=0;
        for(int z=0;z<9;z++)
        {
        	if(points[z]==0) count++;
        }
        if(count>4) result="DETAINED";
        else if(count>0&&count<=4)
        	result="PROMOTED"; 
        run7.setText("Result :"+result);
      //  XWPFParagraph paragraph9 = document.createParagraph();
       // paragraph9.setAlignment(ParagraphAlignment.CENTER);
        //XWPFRun run9 = paragraph9.createRun();

       XWPFParagraph paragraph10 = document.createParagraph();
        paragraph10.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run10 = paragraph10.createRun();
        run10.setBold(true);
        run10.setText("Section-Incharge                                                                                                        Controller of Examinations");
        run10.addBreak();
        run10.addBreak();

        //XWPFParagraph paragraph11 = document.createParagraph();
        //paragraph11.setAlignment(ParagraphAlignment.LEFT);
        //XWPFRun run11 = paragraph11.createRun();
        //run11.setBold(true);
        //run11.setFontSize(10);
        //run11.addBreak();
       // XWPFParagraph paragraph12 = document.createParagraph();
        //paragraph12.setAlignment(ParagraphAlignment.CENTER);
        //XWPFRun run12 = paragraph12.createRun();
        String imgfile= new String("E:\\MiniProject2018-2019\\pictures\\grade.jpeg");
        FileInputStream is=new FileInputStream(imgfile);
        run10.addPicture(is,XWPFDocument.PICTURE_TYPE_JPEG ,imgfile, Units.toEMU(500), Units.toEMU(110));
        run10.addBreak();
       }document.write(out);
        out.close();
        document.close();
        System.out.println("create_table.docx written successully");
    }
 		
 	
}


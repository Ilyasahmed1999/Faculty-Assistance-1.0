package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_sas
{
	
	String data[][]= {
			          {"            ","               1    ","                                      ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Introduction to signals                           "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Analogy between vectors and signals and problems      "},
                      {"         3  ","                    ","          20-09-2019     ","","   Signal approximation using orthoganal functions                        "},
                      {"         4  ","                    ","          20-09-2019     ","","   Mean square error and problems                                                           "},
                      {"         5  ","                    ","          20-09-2019     ","","   Closed or complete set of Orthogonal functions 	                     "},
                      {"         6  ","                    ","          20-09-2019     ","","   Orthogonality in complex functions and problems    	                     "},
                      {"         7  ","                    ","          20-09-2019     ","","   Concepts of Standard signals 	                     "},
                      {"         8  ","                    ","          20-09-2019     ","","   Operations performed on Standard Signals   	                     "},
                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Deriving Fourier transform from fourier series                 		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","   Fourier transform of arbitary signals                            "},
                      {"         3  ","                    ","          20-09-2019     ","","   Fourier transform of standard signals                                                "},
                      {"         4  ","                    ","          20-09-2019     ","","   Properties of Fourier transform                                                 "},
                      {"         5  ","                    ","          20-09-2019     ","","   Fourier transform of periodic signals                               "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Fourier transforms invloving impulse function and signum function                               "},
                      {"         7  ","                    ","          20-09-2019     ","","   Introduction to Hilbert Transform      "},
                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Introduction to Systems                              "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Classification of Systems                                 "},
                      {"         3  ","                    ","          20-09-2019     ","","   Basics of Laplace Transform                               "},
                      {"         4  ","                    ","          20-09-2019     ","","   Impulse Response                         "},
                      {"         5  ","                    ","          20-09-2019     ","","   Transfer function of LTI systems            	             "},
                      {"         6  ","                    ","          20-09-2019     ","","   Filter characteristics of linear systems          	             "},
                      {"         7  ","                    ","          20-09-2019     ","","   Distortion less transmission through a system           	             "},
                      {"         8  ","                    ","          20-09-2019     ","","   Signal bandwidth and system bandwidth            	             "},
                      {"         9  ","                    ","          20-09-2019     ","","   Ideal LPF,HPF,and BPF characteristics             	             "},
                      {"         10 ","                    ","          20-09-2019     ","","   Causality and Poly-Wiener creterion for physical realization             	             "},
                      {"         11 ","                    ","          20-09-2019     ","","   Relationship between bandwidth and rise time             	             "},

                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Concept of convolution in time domain and frequency domain                              "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Graphical representation of convolution                                "},
                      {"         3  ","                    ","          20-09-2019     ","","   Convolution property of fourier transforms                              "},
                      {"         4  ","                    ","          20-09-2019     ","","   Cross correlation and auto correlation of functions                          "},
                      {"         5  ","                    ","          20-09-2019     ","","   Properties of correlation function            	             "},
                      {"         6  ","                    ","          20-09-2019     ","","   Energy density spectrum             	             "},
                      {"         7  ","                    ","          20-09-2019     ","","   Parseval's theorem,Power density spectrum         	             "},
                      {"         8  ","                    ","          20-09-2019     ","","   Relation between auto correlation function and energy/power spectral density function          	             "},
                      {"         9  ","                    ","          20-09-2019     ","","   Relation between convolution and correlation            	             "},
                      {"         10 ","                    ","          20-09-2019     ","","   Detection of periodic signals in the presence of noise by correlation          	             "},
                      {"         11 ","                    ","          20-09-2019     ","","   Extraction of signal from noise by filtering             	             "},

                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","  Descrete time signal representation using complex exponential and sinusoidal components           		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","  Periodicity of descrete time using complex exponential signal                             "},
                      {"         3  ","                    ","          20-09-2019     ","","  Concept of Z-Transform of a discrete sequence and ROC                                                 "},
                      {"         4  ","                    ","          20-09-2019     ","","  Z-Transform of standard signals                                                       "},
                      {"         5  ","                    ","          20-09-2019     ","","  Inverse Z-transform and problems                                                       "},	
                      {"         6  ","                    ","          20-09-2019     ","","  Distinction between laplace ,Fourier and Z transforms                                                             "},
                      {"         7  ","                    ","          20-09-2019     ","","  Constraints on ROC for various classes of signals                                                                   "},
                   	};

  	String column[]= {"SNo","UNIT NO","Date","NoofClassesPlanned","  Topics"};
	JTable mytable=new JTable(data,column);
	
	JTable Table()
	{
		
			mytable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			mytable.getColumnModel().getColumn(0).setPreferredWidth(100);
			mytable.getColumnModel().getColumn(1).setPreferredWidth(150);
			mytable.getColumnModel().getColumn(2).setPreferredWidth(200);
			mytable.getColumnModel().getColumn(3).setPreferredWidth(150);
			mytable.getColumnModel().getColumn(4).setPreferredWidth(900);
			mytable.setRowHeight(30);
			mytable.setFont(new Font("Serif",Font.PLAIN,17));
			mytable.setEnabled(false);
  	
			mytable.addMouseListener(new MouseAdapter()
        	{
					public void mouseClicked(MouseEvent e)
					{
							my_link_sas mp=new my_link_sas();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	


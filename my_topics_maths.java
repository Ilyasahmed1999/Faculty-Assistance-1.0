package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_maths
{
	
	String data[][]= {
			          {"            ","               1    ","                         ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","    Bisection and NewtonRaphson's method                                  "},		 
                      {"         2  ","                    ","          20-09-2019     ","","    Gauss elimination and Gauss seidal iteration method      "},
                      {"         3  ","                    ","          20-09-2019     ","","    Interpolation-Newton's forward and backward difference                       "},
                      {"         4  ","                    ","          20-09-2019     ","","    Lagrange's interpolation                                                              "},
                      {"         5  ","                    ","          20-09-2019     ","","    Newton's divided difference interpolation  	                     "},
                      {"         6  ","                    ","          20-09-2019     ","","    Numerical differentiation                                                             "},
                      {"         7  ","                    ","          20-09-2019     ","","    Solution of differential equations by Euler's method and Taylor's series method                                                           "},
                      {"         8  ","                    ","          20-09-2019     ","","    Runge-Kutta method of order four                                                         "},

                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","    Introduction,Fourier integrals            		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","    Fourier sine and cosine integrals                     "},
                      {"         3  ","                    ","          20-09-2019     ","","    Complex form fo fourier integral                                                "},
                      {"         4  ","                    ","          20-09-2019     ","","    Fourier transform,fourier sine and cosine transform                                                  "},
                      {"         5  ","                    ","          20-09-2019     ","","    Finite fourier sine and cosine transform                         "},	
                      {"         6  ","                    ","          20-09-2019     ","","    Convolution theorem for fourier transform                              "},
                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","    Divisibility and Modular arithmetic                             "},		 
                      {"         2  ","                    ","          20-09-2019     ","","    integer representation                                  "},
                      {"         3  ","                    ","          20-09-2019     ","","    Primes and GCD                          "},
                      {"         4  ","                    ","          20-09-2019     ","","    solving congruences and applications                      "},
                      {"         5  ","                    ","          20-09-2019     ","","    Introduction to Cryptography             	             "},
                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","    Random Variables         "},		 
                      {"         2  ","                    ","          20-09-2019     ","","    Uniform,Normal,exponential distributions                                                     "},
                      {"         3  ","                    ","          20-09-2019     ","","    Mean,Median,Mode and Standard Deviation                                                             "},		 
                      {"         4  ","                    ","          20-09-2019     ","","    Conditional Probability and BayesTheorem                                                              "},
                      {"         5  ","                     ","          20-09-2019     ","","   Test of significance t,F,X-test                                             "},		 
                   
                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","    Curve fitting by the method of least squares         		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","    Correlation and regression                            "},
                      {"         3  ","                    ","          20-09-2019     ","","    Types of correlations                                               "},
                      {"         4  ","                    ","          20-09-2019     ","","    Karl Pearson's coefficient of correlation                                                     "},
                      {"         5  ","                    ","          20-09-2019     ","","    Spearman's rank correlation coefficent                                                   "},	
                      {"         6  ","                    ","          20-09-2019     ","","    Equations of the lines of regression                                                            "},
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
							my_link_maths mp=new my_link_maths();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	


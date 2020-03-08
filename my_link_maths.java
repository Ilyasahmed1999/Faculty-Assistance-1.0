package testing;

import java.awt.Desktop;
import java.net.URI;

public class my_link_maths 
{
	String labels[]= {      "",
			 		        "https://mav.vic.edu.au/files/2017/MAV17-Conference/MAV17_presentations/Bisection__Newtons_Method_MM_MAV_CD_8.6.2016.pdf",
			 		        "http://www.iecivil.com/2018/05/gauss-seidal-gauss-elimination-gauss.html",
			 		        "https://nptel.ac.in/courses/122104018/node109.html",
			 		        "https://mat.iitm.ac.in/home/sryedida/public_html/caimna/interpolation/lagrange.html",
			 		        " https://mat.iitm.ac.in/home/sryedida/public_html/caimna/interpolation/nddf.html",
			 		        "https://www.uio.no/studier/emner/matnat/math/MAT-INF1100/h10/kompendiet/kap11.pdf",
			 		        "https://www.youtube.com/watch?v=ejqSmlV4lSc",
			 		        "http://mathforcollege.com/nm/mws/gen/08ode/mws_gen_ode_txt_runge4th.pdf",
			 		        "",
						
			 		        "https://www.encyclopediaofmath.org/index.php/Fourier_integral",
			 		        "https://www.youtube.com/watch?v=OWFm2sZ2Rxg",
			 		        "https://www.youtube.com/watch?v=pUymQJ1i3ro",
			 		        "https://www.youtube.com/watch?v=zkkqTpXMeVo",
			 		        "https://www.quora.com/What-is-the-formula-for-Fourier-finite-and-infinite-cosine-and-sine-transform",
			 		        "https://www.youtube.com/watch?v=W1EJH7a1oEQ",
                             "",
              			   	"https://math.la.asu.edu/~boerner/mat243/4.1%20Divisibility%20and%20Modular%20Arithmetic.pdf",
              			   	"https://www.slideshare.net/gavhays/integer-representation",
              			   	"https://www.cs.sfu.ca/~ggbaker/zju/math/primes.html",
              			   	"https://www.youtube.com/watch?v=75rjaZeWkF4",
              			   	"https://www.math.brown.edu/~jhs/MathCryptoHome.html",
              			   	"",
              			   	"http://www.henry.k12.ga.us/ugh/apstat/chapternotes/7supplement.html",
              			   	"https://www.geeksforgeeks.org/probability-distributions-part-2-exponential-distribution/",
              			   	"http://www.henry.k12.ga.us/ugh/apstat/chapternotes/7supplement.html",
              			   	"https://www.analyticsvidhya.com/blog/2017/03/conditional-probability-bayes-theorem/",
              			   	"http://theengineeringmaths.com/2018/03/08/tests-of-significance-based-on-chi-square/",
              			   	"",
              			   	"https://www.efunda.com/math/leastsquares/leastsquares.cfm",
              			   	"http://math.arizona.edu/~jwatkins/c-regression.pdf",
              			   	"http://math.arizona.edu/~jwatkins/c-regression.pdf",
              			   	"http://math.arizona.edu/~jwatkins/c-regression.pdf",
              			   	"http://math.arizona.edu/~jwatkins/c-regression.pdf",
              			   	"http://math.arizona.edu/~jwatkins/c-regression.pdf",
			 		 };
	
	void HyperLink(int i)
	  	{
				try {
							Desktop d=Desktop.getDesktop();
							d.browse(new URI(labels[i]));
					}
				catch(Exception e)
					{
								System.out.println("Error to Load Website");
					}	
		}
}

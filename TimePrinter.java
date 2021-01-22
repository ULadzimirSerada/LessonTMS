public class TimePrinter{
		public static void main(String[] args){
			int s=4500;
			int sec=s%60;
			int m=(s-sec)/60;
			int min=m%60;
			int h=(m-min)/60;
			int hr=h%24;
			int d=(h-hr)/24;
			int ds=d%24;
			int w=(d-ds)/7;
			
			System.out.println(m+" minute "+sec+"second");
			 System.out.println(h+"hour"+min+" minute "+sec+"second");
			  System.out.println(d+"days"+h + "hour"+min+" minute "+sec+"second");
			   System.out.println(w+"week"+d+"days"+h + "hour"+min+" minute "+sec+"second");
			 		}
}
			
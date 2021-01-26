public class Lesson3 {
	public static void main (String[] args ) {
	    int n = 1423;
		/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
	    int b = n / 1000;
		int c = (n - b * 1000) / 100;
		int e = (n - b * 1000-c*100) / 10;
		int d = n - b * 1000-c*100 - e*10;

        int a = d * 1000 + e * 100 + c * 10 + b;

		System.out.println(a);
		 
			
		
	}
}
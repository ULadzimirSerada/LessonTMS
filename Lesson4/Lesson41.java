public class Lesson41 {
	public static void main (String[] args ) {
	    
		/*Задание 7
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/
	    int r = 22;
		int a = 11;
	    int b = 33;
			if (r * r >= (a * a + b * b) / 4)
			{
               System.out.println("YES");
	        }else {
			   System.out.println("NO");
			}
			
		 
		 
			
		
	
}
}
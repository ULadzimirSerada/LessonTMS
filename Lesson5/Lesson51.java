package com.max.idea;
    /*Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа. */
	    import java.util.Random;
    public class Lesson51 {
        public static void main(String[] args) {
            double averageSum = 1;
            double sum = 1;
            int n = 1;
            int x = (int) (Math.random() * 20);
            while (x != 0) {
                sum *= x;
                n++;
                x = (int) (Math.random() * 20);
            }
            if (n != 0) {
                averageSum = sum / n;
            } else {
                averageSum = 0;
            }
            System.out.println("среднее:" + averageSum);
        }
    }




package com.max.idea;
    /*Задание 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/
/*1- рубль 2- рубля 3- рубля 4- рубля 5- рублей 6- рублей 7- рублей 8- рублей
 9- рублей 10- рублей 11- рублей 12- рублей 13- рублей 14- рублей 15- рублей
 16- рублей 17- рублей 18- рублей 19- рублей 20- рублей */
	    import java.util.Random;
    public class Lesson42 {
        public static void main(String[] args) {
            Random rand = new Random();
            int x = rand.nextInt();
          int x1 = x % 10;
            if (x<0){
                x=x*(-1);
            }
            if (x % 100 >= 11 && x % 100 <= 14) {
                System.out.println(x + " рублей");
            }
            else
                { switch (x1)
                { case 1:
                    System.out.println(x+ " рубль");
                    break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.println(x+ " рубля");
                            break;
                        default:
                            System.out.println(x+ " рублей");
                    }
                }
            }


        }



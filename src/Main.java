import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        domashka();
        task1();
        task2();
        task3();
        task4();

    }

    static void domashka() {

        String name ="Алексей";
        byte age = 36;
        System.out.println("меня зовут " + name + ", мне " + age + " лет");

        short m = 32000;
        System.out.println("Monitor ctoit " + m + " rubley");


        String kolichestvoBanok = "x";
        String whitePaint = "a";
        String brownPaint = "b";
        byte x = 120;      // на ремонт школы требуется такое количество банок
        byte a = 2;       // на 1 класс требуется столько банок
        byte b = 4;       // на 1 класс требуется столько банок
        System.out.println("В школе, где на " + (x / (a + b)) + " классов, нужно " + (x / (a + b)) * a + " банок белой краски и " + (x / (a + b)) * b + " банок коричневой краски");


        String Masha = "q";
        String Denis = "w";
        String Kristina = "e";
        String GodovoyDohod = "r";
        int q = 67760;
        int w = 83690;
        int e = 76230;
        double r = 0.1;
        System.out.println("Годовой доход Маши вырос на " + q * r + " рублей и теперь она получает " + ((q * r) + q) + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + w * r + " рублей и теперь он получает " + ((w * r) + w) + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + e * r + " рублей и теперь она получает " +((e * r) + e) + " рублей");


       String gradus = "g";
        String holodno = "h";
      String teplo = "t";
        int g = 5;
      int h = -5;
        int t = 10;
        System.out.println();
    }


     static void task1() {

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 8)+1;
        }
        System.out.println(Arrays.toString(arr));

    }

     static void task2() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.println(arr1[i]);
            }

        }

    }



     static double task3() {

        double arr3[] = { 3.4, 5.9, 7.0, 12.6 };
        int i = 0;
        double sum = 0;
        while (i < arr3.length) {
            sum += arr3[i];
           i++;
        }
         System.out.println(sum);
         return sum;
     }



    public static void task4() {
        String[] arr4 = new String[]{"Я", "учусь", "писать", "Hello", "World", "!!!"};
        String myString = concat(arr4);
        System.out.println(myString);
     }
    static String concat(String[] myArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myArr.length; i++) {
            sb.append(myArr[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}







import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String bestOfVariable;
        final int NUM = 100;
        String word = "hello";
        bestOfVariable = NUM + " " + word;
        System.out.print(bestOfVariable + " ");
        System.out.print(NUM + " ");
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String x = s.nextLine();
        while (x == word) {
            System.out.println("Пока, " + x);
        }
        System.out.println("Привет, " + x);
    }
}
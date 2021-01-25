package be;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Загадай число от 1 до 100, а я попытаюсь его угадать!");
        Scanner sc = new Scanner(System.in);
        int userNumb = sc.nextInt();
        int computerNumb = (int) (Math.random() * 100) + 1;
        int count = 0;
        while (userNumb != computerNumb) {
            computerNumb = (int) (Math.random() * 100) + 1;
            count++;
            System.out.print("Попытка номер " + count + ": ");
            System.out.println(" я предполагаю, что это " + computerNumb);
            if (userNumb == computerNumb) {
                System.out.println("Ура, я угадал. Ты загадал число :" + userNumb);
                System.out.println("Я угадал с " + count + " попытки");
            }
        }
    }
}


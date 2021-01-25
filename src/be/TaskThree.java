package be;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries = 5;
        int numberOfTries = 0;
        boolean win = false;
        int rightAnswer = 88;

        System.out.println("Hello friend! У меня есть вопрос: Сколько клавишь у пианино? У тебя 5 попыток!");
        System.out.println("Угадаешь?: ");
        System.out.println("Сдаешься?: ");
        String looser = sc.nextLine();

        switch (looser) {
            case "Да":
                while (win == false) {

                    System.out.println("Твой ответ: ");
                    int answer = sc.nextInt();
                    numberOfTries++;

                    if (answer == rightAnswer) {
                        win = true;
                        System.out.println("Молодец,ты знал ответ!");
                        break;

                    } else if (tries - numberOfTries == 0) {
                        System.out.println("Попытки закончились, ты проиграл, у пианино 88 клавишь!");
                        break;


                    } else if (answer != rightAnswer) {
                        System.out.println("Не угадал! У тебя осталось " + (tries - numberOfTries) + " попыток.");
                        System.out.println("Если желаешь сдаться, признай - Сдаюсь!");
                        System.out.println("Продолжим?");
                    }

                }
                break;
            case "Сдаюсь":
                System.out.println("Ошибается тот, кто не пробует! Вы - самое слабое звено!");
                break;
        }
    }
}

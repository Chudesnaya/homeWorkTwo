package be;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int i, j, k, a;

        Scanner input = new Scanner(System.in);

        System.out.print("Введи количество столбцов: ");

        int rows = input.nextInt();
        a = rows;

       int length = ("" + rows).length();

        String str = " %" + length + "s";

        for (i = 1; i <= rows; i++) {
            for (j = a; j > 1; j--) {
                System.out.printf(str, " ");
            }

            for (k = i; k != 0; k--) {
                String str1 = "" + k;
                System.out.printf(str, str1);
            }
            a--;

            for (int l = 2; l <= i; l++) {
                String str2 = "" + l;
                System.out.printf(str, str2);

            }

            System.out.println();
        }
    }
}
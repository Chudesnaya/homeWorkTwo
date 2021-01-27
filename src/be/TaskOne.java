package be;

import java.util.Scanner;

public class TaskOne {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введи количество столбцов: ");

        int size = input.nextInt();

        for (int i = 1; i <= size; i++)
        {
            buildHorizontalSquareHalf(i, size);

            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--)
        {
            buildHorizontalSquareHalf(i, size);

            System.out.println();
        }
    }

    private static void buildHorizontalSquareHalf(int i, int size){
        //Print right triangle of pyramid
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j);
        }

        for (int k = i; k < size; k++)
        {
            System.out.print(i);
        }

        for (int f = i; f >= 1; f--)
        {
            if (f != size)
            {
                System.out.print(f);
            }
        }

        for (int g = i; g < size - 1; g++)
        {
            System.out.print(i);
        }
    }
}

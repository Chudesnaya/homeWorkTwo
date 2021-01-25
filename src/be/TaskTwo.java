package be;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня: ");
        int userDay = sc.nextInt();
        System.out.println("Введите номер месяца: ");
        int userMonth = sc.nextInt();
               int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int indMonth = userMonth - 1;
        if (userMonth < 1 || userMonth > 12) {
            System.out.println("Вы ввели некоректный номер месяца");
        } else if (months[indMonth] >= userDay && userDay > 1) {
            System.out.println("Число " + userDay + " есть в выбранном Вами месяце!");
        } else {
            System.out.println("Указанного числа нет в выбранном Вами месяце!");
        }
    }
}





           /* int ind = -1;
            for (int i = 0; i < oddMonth.length; i++) {
                if (oddMonth[i] != userDay) {
                    ind++;
                } else {
                    ind = i;
                    System.out.println("Число " + userDay + " есть в выбранном Вами месяце!");
                    continue;
                }
            }
            if (userMonth % 2 == 0 && userMonth != 2) {
                int[] evenMonth = new int[31];
                for (int index = 1; index < evenMonth.length; index++) {
                    evenMonth[index] = index;
                }
                int ind1 = -1;
                for (int i = 0; i < evenMonth.length; i++) {
                    if (evenMonth[i] != userDay) {
                        ind1++;
                    }
                    if (userDay < 1 && userDay > 30) {
                        ind1 = i;
                        System.out.println("Число " + userDay + " есть в выбранном Вами месяце!");
                        continue;
                    }
                    if (userDay<1 && userDay>31) {
                        System.out.println("Такого дня не судествует в выбранном месяце.");
                    }
                }
                    if (userMonth == 2) {
                        int[] februaryMonth = new int[29];
                        for (int index = 1; index < februaryMonth.length; index++) {
                            februaryMonth[index] = index;
                        }
                        int ind2 = -1;
                        for (int i = 0; i < oddMonth.length; i++) {
                            if (oddMonth[i] != userDay) {
                                ind2++;
                            } else {
                                ind2 = i;
                                System.out.println("Число " + userDay + " есть в выбранном Вами месяце!");
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }


/*        int[] oddMonth = new int[31];
        for (int i = 1; i < oddMonth.length; i++) {
            oddMonth[i] = i;
        }
        int[] evenMonth = new int[30];
        for (int i = 1; i < evenMonth.length; i++) {
            evenMonth[i] = i;
        }
        int[] februaryMonth = new int[28];
        for (int i = 1; i < februaryMonth.length; i++) {
            februaryMonth[i] = i;
        }
        switch (userMonth) {
            case userMonth % 2 == 0 && userMonth != 2;

        }
        userMonth % 2 == 0 && userMonth != 2) {
            if (userDay > 30 && userDay < 1) {
                System.out.println("Такого дня нет в этом месяце");
            }
        }
        if (userMonth % 2 == 1) {
            if (userDay > 31 && userDay < 1) {
                System.out.println("Такого дня нет в этом месяце");
            }
        }
        if (userMonth == 2) {
            if (userDay > 28 && userDay < 1) {
                System.out.println("Такого дня нет в этом месяце");
            }
        }
    }
}*/


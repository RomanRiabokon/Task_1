package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите номер программы(всего программ 6)");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();



            switch (n) {
                case 1:
                    System.out.println("Введите ваше имя и нажмите <Enter>:");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Привет, " + name);
                    scanner1.close();
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    String s = scan.next();
                    char[] str = s.toCharArray();
                    for (int q = str.length - 1; q >= 0; q--) {
                        System.out.print(str[q]);

                    }
                    scan.close();
                    break;
                case 3:
                    System.out.println("Введите кол-во чисел");
                    Scanner scann = new Scanner(System.in);
                    final Random random = new Random();
                    int as = Integer.parseInt(scann.next());
                    String result = "";
                    for (int i = 0; i < as; i++) {
                        result += String.valueOf(random.nextInt(6)) + ": ";
                    }
                    System.out.println(result);
                    for (int i = 0; i < as; i++) {
                        System.out.println(String.valueOf(random.nextInt(6)) + ": ");
                    }
                    scann.close();
                    break;
                case 4:
                    String string = "24235";
                    char[] l = string.toCharArray();
                    System.out.println("Password-->" + string+"  "+"нужно вводить кол-во знаоков не меньше чем в пароле");
                    Scanner sc = new Scanner(System.in);
                    String p = sc.next();
                    char[] pr = p.toCharArray();
                    int b = 0;
                    for (int m = 0; m < l.length; m++) {
                        if (pr[m] == l[m]) b++;
                    }
                    System.out.println("Количество совпадений= " + b);
                    if (b == (l.length)) System.out.println("Пароль подтвержден");
                    else System.out.println("Повторите попытку.");
                    sc.close();
                    break;
                case 5:
                    System.out.println("Для завершения программы нажмите 0");
                    Scanner scanner2 = new Scanner(System.in);
                    int s1 = 0, sum = 0;
                    do {
                        s1 = scanner2.nextInt();
                        sum += s1;
                        System.out.println("Сумма чисел=" + sum);
                    }
                    while (s1 != 0);
                    scanner2.close();
                    break;
                case 6:
                    System.out.print("Введите количество чисел ");
                    Scanner scanner3 = new Scanner(System.in);
                    int n2 = scanner3.nextInt();
                    int[] mass = new int[n2];
                    String nechet = "", chet = "";
                    System.out.print("Введите целые числа через пробел ");
                    for (int w = 0; w < n2; w++) {
                        mass[w] = scanner3.nextInt();
                    }
                    for (int a = 0; a < n2; a++)
                        if (mass[a] % 2 != 0)
                            nechet += (mass[a] + "; ");
                        else if (mass[a] % 2 == 0)
                            chet += (mass[a] + "; ");
                    System.out.println("Нечётные=" + nechet + " Чётные=" + chet);
                    int min = 1000;
                    int max = -1000;
                    for (int c= 0; c< n2; c++) {
                        if (min > mass[c])
                            min = mass[c];
                        if (max < mass[c])
                            max = mass[c];
                    }
                    System.out.println("Минимум=" + min + " Максимум=" + max);
                    String sdel9 = "", sdel7 = "";
                    for (int v = 0; v < n2; v++) {
                        if (mass[v] % 3 == 0 | mass[v] % 9 == 0)
                            sdel9 += (mass[v] + "; ");
                        if (mass[v] % 5 == 0 | mass[v] % 7 == 0)
                            sdel7 += (mass[v] + "; ");
                    }
                    System.out.println("Числа, которые делятся на 3 и на 9= " + sdel9 + " Числа, которые делятся на 5 и на 7= " + sdel7);
                    for (int j = 0; j < n2 - 2; j++)
                        if (((mass[j]) + (mass[j + 2])) / 2 == mass[j + 1]) {
                            System.out.println("Элементы, которые равны полусумме соседних элементов: " + mass[j + 1]);

                        }
                    scanner3.close();
                    break;
            }

        }
    }



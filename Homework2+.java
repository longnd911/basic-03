/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int thaythe;
        Scanner sc = new Scanner(System.in);
        int day[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap vao so thu " + (i + 1) + ":");
            day[i] = sc.nextInt();

        }
        System.out.print("Day so ban dau: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(day[i] + "   ");
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (day[i] > day[j]) {
                    thaythe = day[i];
                    day[i] = day[j];
                    day[j] = thaythe;

                }

            }

        }
        System.out.println("Day so da dc sap xep lai");
        for (int i = 0; i < 5; i++) {
            System.out.print(day[i] + "  ");

        }
    }
}

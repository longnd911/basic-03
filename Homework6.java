/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        if (1 <= n && n <= 1000) {
            for (int i = 1; i < n + 1; i++) {
                if (i % 5 == 0) {
                    d++;
                }
                if (i % 25 == 0) {
                    d++;
                }
                if (i % 125 == 0) {
                    d++;
                }
                if (i % 625 == 0) {
                    d++;
                }
            }
            System.out.println(n + "! co tan cung " + d + " chu so 0");
        } else {
            System.out.println("Tu di ma tinh");
        }
        int n0 = n;
        int du = 0;
        int tong = 0;
        while (n0 > 0) {
            du = n0 % 10;
            n0 = n0 / 10;
            tong += du;
        }
        if (n % tong == 0) {
            System.out.println("Va la so dac biet");
        } else {
            System.out.println("Va la so vo van");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        boolean check = check(a);
        System.out.println(check);

//        char[] c = a.toCharArray();
//
//        char[] kq = sap_xep(c);
//        System.out.println("Ket qua sau khi sap xep lai cac ki tu: ");
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(kq[i] + " ");
//        }
    }

    public static boolean check(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int a) {
        int count = 0;
        if (a == 0 || a == 1) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

    public static char[] sap_xep(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        return c;
    }
}

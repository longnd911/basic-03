/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework7 {

    public static Scanner sc = new Scanner(System.in);
    public static int h, m, s, giay, gio;
    public static String status;
    public static void main(String[] args) {
        input();
        tinhThoiGian();
        show();
    }

    private static void input() {
        System.out.print("nhap so giay: ");
        s = sc.nextInt();
        while (true) {
            if (s < 0 || s > 59) {
                System.out.print("giay vuot gioi han!!! Nhap lai: ");
                s = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("nhap so phut: ");
        m = sc.nextInt();
        while (true) {
            if (m < 0 || m > 59) {
                System.out.print("phut vuot gioi han!!! Nhap lai: ");
                m = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("nhap so gio: ");
        h = sc.nextInt();
        while (true) {
            if (h < 0 || h > 11) {
                System.out.print("gio vuot gioi han!!! Nhap lai: ");
                h = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("nhap trang thai sang(AM) hay chieu(PM): ");
        status = sc.next();
        while (true) {
            if (status.equalsIgnoreCase("AM") || status.equalsIgnoreCase("PM")) {
                break;
            } else {
                System.out.print("trang thai khong hop le!!! Nhap lai: ");
                status = sc.next();
            }
        }
        System.out.println("thoi gian ban dau la: " + h + "h" + m + "m" + s + "s " + status);
        System.out.print("nhap vao so giay tang them: ");
        giay = sc.nextInt();
    }

    private static void tinhThoiGian() {
        int a = giay / 3600;
        int b = giay % 3600;
        int c = b / 60;
        int d = b % 60;
        gio = h + a + (m + c + (s + d) / 60) / 60;
        h = gio % 12;
        m = (m + c + (s + d) / 60) % 60;
        s = (s + d) % 60;

    }

    private static void show() {
        if (status.equalsIgnoreCase("AM")) {
            if ((gio / 12) % 2 == 0) {
                System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s AM");
            } else {
                System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s PM");
            }
        } else {
            if ((gio / 12) % 2 == 0) {
                System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s PM");
            } else {
                System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s AM");
            }
        }
        int n = Dodaimang();
        int[] a = new int[n];
        NhapMang(a, n);
        XuatMang(a, n);
        Fourth(a, n);
        Second(a, n);
        KQ(a, n);
    }

    private static int Dodaimang() {
        int N;
        do {
            System.out.print("Nhap so luong phan tu (n>5): ");
            N = sc.nextInt();
        } while (N <= 5);
        return N;
    }

    private static void NhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    private static void XuatMang(int[] a, int n) {
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static void Fourth(int[] a, int n) {
        System.out.print("=====================\n");
        int t = a[3];
        for (int i = 3; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    private static void Second(int[] a, int n) {
        System.out.println("");
        int t = a[1];
        a[1] = a[0];
        a[0] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void KQ(int[] a, int n) {
        System.out.println("\nKQ cuoi cung: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}

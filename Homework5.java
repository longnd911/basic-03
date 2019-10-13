/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu bat ki: ");
        String s = sc.nextLine();
        boolean check = containSpecial(s);
        System.out.println(check);
        int n = sc.nextInt();
        String t = Integer.toString(n);
        int X = t.length();
        if (X < 4) {
            System.out.println(n + "vnd");
        } else if (X >= 4 && X <= 6) {
            String baso1 = t.substring(X - 3, X);
            String baso2 = t.substring(0, X - 3);
            String SoTien = baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);

        } else if (X > 6 && X <= 9) {
            String baso1 = t.substring(X - 3, X);
            String baso2 = t.substring(X - 6, X - 3);
            String baso3 = t.substring(0, X - 6);
            String SoTien = baso3 + "," + baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);

        } else if (X > 9 && X <= 12) {
            String baso1 = t.substring(X - 3, X);
            String baso2 = t.substring(X - 6, X - 3);
            String baso3 = t.substring(X - 9, X - 6);
            String baso4 = t.substring(0, X - 9);
            String SoTien = baso4 + "," + baso3 + "," + baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);
        }
    }

    public static boolean containSpecial(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if (c[i] == '!' || c[i] == '@' || c[i] == '#' || c[i] == '$' || c[i] == '%' || c[i] == '^' || c[i] == '&' || c[i] == '*' || c[i] == '(' || c[i] == ')') {
                return true;
            }
        }
        return false;
    }
}

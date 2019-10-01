/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mangA = {4, 3, 6, 0, 4, 8, 1, 0, 7, 4};
        int sum = 0;
        for (int i = 0; i < mangA.length; i++) {
            sum += mangA[i];
        }
        System.out.println("sum = " + sum);
        int sumc=0;
        System.out.println("Nhung phan tu o vi tri chan trong mang:");
        for (int i = 0; i < mangA.length; i=i+2) {
            System.out.println(mangA[i]);
            sumc+=mangA[i];
        }
        System.out.println("Tong nhung phan tu chan cua mang: "+sumc);
        System.out.println("Nhung phan tu o vi tri le trong mang:");
        for (int i = 1; i < mangA.length; i=i+2) {
            System.out.println(mangA[i]);
        }
        System.out.println("Nhung phan tu chia cho 5 du 1: ");
        for (int i = 0; i < mangA.length; i++) {
            if(mangA[i]%5==1)
                System.out.println(mangA[i]+" ");
        }
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao gia tri n: ");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Nhap vao tat ca cac phan tu trong ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ma tran a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

}

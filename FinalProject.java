/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FinalProject {

    static Scanner sc=new Scanner(System.in);
    static int[][] board1=new int[5][5];
    static int[][] board2=new int[5][5];
    static int count1=0;
    static int count2=0;
    public static void main(String[] args) {
        prepare();
        while(true){
            call();
            check();
            swap();
            show();
        }
    }

    private static int prepare() {
        System.out.println("Nguoi choi 1 hoan thanh bang: ");
        int array1[]=new int[25];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board1[i][j]=sc.nextInt();
                while(true){
                    if(board1[i][j]<1||board1[i][j]>25){
                        System.out.println("Gia tri khong ton tai! Nhap lai: ");
                    board1[i][j]=sc.nextInt();
                }else{
                        array1[board1[i][j]-1]++;
                        for (int k = 0; k < 25; k++) {
                            if(array1[k]==2){
                                System.out.println("Gia tri da ton tai! Nhap lai: ");
                                board1[i][j]=sc.nextInt();
                                return board1[i][j];
                            }
                        }
                        return board1[i][j];                        
                    }
            }
        }
    }
    }

    private static void call() {
        System.out.println("Ban chon so: ");
        int chosen=sc.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(board1[i][j]==chosen){
                    board1[i][j]=0;
                }
                if(board2[i][j]==chosen){
                    board2[i][j]=0;
                }
            }
        }
    }

    private static void check() {
        for (int i = 0; i < 5; i++) {
            if(board1[i][0]!=0){
        }else{count1++;}
            if(board1[i][1]!=0){
        }else{count1++;}
            if(board1[i][2]!=0){
        }else{count1++;}
            if(board1[i][3]!=0){
        }else{count1++;}
            if(board1[i][4]!=0){
        }else{count1++;}
            if(board1[0][i]!=0){
        }else{count1++;}
            if(board1[1][i]!=0){
        }else{count1++;}
            if(board1[2][i]!=0){
        }else{count1++;}
            if(board1[3][i]!=0){
        }else{count1++;}
            if(board1[4][i]!=0){
        }else{count1++;}
            if(board1[i][i]!=0){
        }else{count1++;}
            if(board1[i][4-i]!=0){
        }else{count1++;}
        }
    }

    private static void swap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so cot: ");
        int c = sc.nextInt();
        System.out.println("Nhap vao so dong: ");
        int d = sc.nextInt();
        
        int a[][] = new int[d][c];
        taomangrd(a,d,c);
        xuat(a,d,c);
        System.out.println("Nhap vao dong thu k: ");
        int k = sc.nextInt();
        System.out.println("Tong dong thu "+k+": "+tongdong(a, d, k));
    }
    public static void taomangrd(int a[][],int d,int c){
        for (int i=0;i<d;i++){
            for (int j = 0; j < c; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public static void xuat(int a[][],int d,int c){
        for (int i=0;i<d;i++){
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");  
        }
    }
    public static int tongdong(int a[][],int d,int k){
        int tongdong =0;
        for (int j = 0; j < d-1; j++) {
            tongdong +=a[k][j];
        }
        return tongdong;
    }
    
}

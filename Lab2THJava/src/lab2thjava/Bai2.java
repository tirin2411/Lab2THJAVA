/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Random rd = new Random(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        random(a,rd);
        xuat(a);
        System.out.println("Cac so nguyen to trong mang: ");
        xuatsonguyento(a);

    }
    static void random(int a[], Random rd){
        for (int i=0;i<a.length;i++)
            a[i] = rd.nextInt(100);
 
    }
    public static void xuat(int a[]){
        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); 
    }
    public static boolean ktsonguyento(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void xuatsonguyento(int a[]){
    for (int i=0; i<a.length;i++){
        if(ktsonguyento(a[i])){
            System.out.print(a[i]);
        }
        System.out.print(" ");
        }
    }
    
}

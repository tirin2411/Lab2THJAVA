/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import static lab2thjava.Bai2.random;

/**
 *
 * @author Admin
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        try(
            FileOutputStream os = new FileOutputStream("Intdata.txt")){
            //file duoc tao luu cung vi tri file chuong trinh
            Random rd = new Random();
            int n = 100;
            int[] a = new int[n];
            random(a,rd);
            for (int i=0;i<a.length;i++){
                String s = a[i]+" ";
                for(int j=0;j<s.length();j++)
                    os.write(s.charAt(j));
            }
        }
        try ( // mo 1 file abc.txt de doc vao chuong trinh (input)
                FileInputStream is = new FileInputStream("Intdata.txt")){
                int ibyts = is.available();
                byte ibuf[]=new byte[ibyts];
                int byrd = is.read(ibuf,0,ibyts);
                StringTokenizer strToken= new StringTokenizer(new String(ibuf)," ,\t,\r");
                System.out.println("Chuoi so nguyen la: "+new String(ibuf));

        }
    }
    static void random(int a[], Random rd){
        for (int i=0;i<a.length;i++)
            a[i] = rd.nextInt();
    }
}

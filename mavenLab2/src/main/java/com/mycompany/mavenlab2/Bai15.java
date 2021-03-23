/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenlab2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Bai15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        String inputPath = "D:\\HocKy2N4\\ThucHanhJava\\Lab2\\Lab2THJava\\src\\main\\java\\com\\mycompany\\mavenlab2\\dsnhanvien.dat";
        String thisLine;
        try {
            BufferedReader myInput = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath))));
            int Tong=0,max=0;
            String nvmax ="";
            while ((thisLine = myInput.readLine()) != null) {
                if (thisLine.isEmpty()) {
                    continue;
                }
                //tach chuoi
                String[] sp = thisLine.split("SP: ");
                //System.out.println(sp[1]);
                String c = sp[1];
                int i = Integer.parseInt(c);
                //tim so sp lon nhat
                if(max<i){
                    max =i;
                        nvmax = thisLine;
                }
                //tinh tong sp 
                Tong += i;
            }
            
            System.out.println("NV co so sp lon nhat: "+nvmax);
            System.out.println("Tong so sp: "+Tong);
        } catch (IOException e) {
        }
    }
    
}

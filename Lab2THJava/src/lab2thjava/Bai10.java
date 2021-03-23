/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //tao doi tuong file
        String fileName ="";
        File f = new File("");
        fileName = f.getAbsolutePath()+"\\src\\lab2thjava\\data.txt";
        f=new File(fileName);
        if(f.exists()){
            System.out.println("File da ton tai");
            System.exit(0);
        }
        //ghi du lieu vao file
        PrintWriter pw = new PrintWriter(f);
        pw.print("Copyright by Duong Thanh Phet - ");
        pw.println(2015);
        pw.print("htpp://thayphet.net");
        pw.close();
        System.out.println("Da ghi file xong");
        //doc file
        Scanner inp = new Scanner(f);
        while(inp.hasNext()){
            String ten = inp.next();
            System.out.print(ten +" ");
            String maso = inp.nextLine();
            System.out.println(maso);
            String link = inp.next();
            System.out.print(link +" ");
        }
    }
    
    
}

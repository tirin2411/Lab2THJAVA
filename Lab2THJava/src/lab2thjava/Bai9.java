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

/**
 *
 * @author Admin
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        try(
            //tao moi 1 file abc.txt de ghi du lieu (output)
            FileOutputStream os = new FileOutputStream("abc.txt")){
            //file duoc tao luu cung vi tri file chuong trinh
            String s = "Chao cac ban den voi chuong trinh doc xuat file";
            for(int i=0;i<s.length();i++)
                os.write(s.charAt(i));
        }
        try ( // mo 1 file abc.txt de doc vao chuong trinh (input)
                FileInputStream is = new FileInputStream("abc.txt")){
                int ibyts = is.available();
                System.out.println("File co tat ca "+ibyts+" ky tu");
                byte ibuf[]=new byte[ibyts];
                int byrd = is.read(ibuf,0,ibyts);
                System.out.println("Tong so ky tu duoc duoc la: "+byrd);
                System.out.println("Chuoi ky tu la: "+new String(ibuf));

        }
        //xoa file neu co
        File fl = new File("abc.txt");
        fl.delete();
    }
    
}

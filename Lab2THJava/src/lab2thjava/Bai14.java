/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int soNhanVien = 10;
        NhanVien[] nhanVien = new NhanVien[soNhanVien];
         
        System.out.println("Nhap thong tin cho nv");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap thong tin nv thứ " + (i + 1) + ":");
            nhanVien[i] = new NhanVien();
            nhanVien[i].nhap();
        }
         
        System.out.println("Thong tin cac nv: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }
        
        String fileName ="";
        File f = new File("");
        fileName = f.getAbsolutePath()+("\\src\\lab2thjava\\dsnhanvien.dat");
        f=new File(fileName);
        FileWriter pw = new FileWriter(f);
        for (int i = 0; i < soNhanVien; i++) {
             pw.write(nhanVien[i].toString()+"\n");
        }
        pw.close();
        System.out.println("da ghi file xong");
         
    }
}

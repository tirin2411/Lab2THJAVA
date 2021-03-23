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
public class NhanVien {

    /**
     * @param args the command line arguments
     */
    private String MaNV, Hoten;
    private int Namsinh;
    private int SP;
    Scanner scanner = new Scanner(System.in);
    
    public NhanVien() {
    }

    public NhanVien(String MaNV, String Hoten, int Namsinh, int SP) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.Namsinh = Namsinh;
        this.SP = SP;
    }

    public String getMaNhanVien() {
        return MaNV;
    }

    public void setMaNhanVien(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return Hoten;
    }

    public void setHoTen(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }
    
    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }
    
    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public void nhap() {

        System.out.print("Nhap ma nhan vien: ");
        MaNV = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        Hoten = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        Namsinh = scanner.nextInt();
        System.out.print("Nhap SP: ");
        SP = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Ma nhan vien: " + MaNV + ", Ho ten: " + Hoten+ ", Nam sinh: " + Namsinh +", SP: "+SP;
    }
    
}

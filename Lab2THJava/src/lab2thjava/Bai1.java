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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so a: ");
        float hesoA = sc.nextFloat();
        System.out.println("Nhap vao he so b: ");
        float hesoB = sc.nextFloat();
        System.out.println("Nhap vao he so c: ");
        float hesoC = sc.nextFloat();
        giaiPTBac2(hesoA,hesoB,hesoC);
    }
    public static void giaiPTBac2(float hesoA, float hesoB, float hesoC) {
        if (hesoA == 0) {
            if (hesoB == 0) {
                System.out.println("PT vo nghiem!");
            } else {
                System.out.println("PT co mot nghiem: "
                        + "x = " + (-hesoC / hesoB));
            }
            return;
        }
        float delta = hesoB*hesoB - 4*hesoA*hesoC;
        float nghiemthu1;
        float nghiemthu2;
        if (delta > 0) {
            nghiemthu1 = (float) ((-hesoB + Math.sqrt(delta)) / (2*hesoA));
            nghiemthu2 = (float) ((-hesoB - Math.sqrt(delta)) / (2*hesoA));
            System.out.println("PT co 2 nghiem la: "
                    + "x1 = " + nghiemthu1 + " và x2 = " + nghiemthu2);
        } else if (delta == 0) {
            nghiemthu1 = (-hesoB / (2 * hesoA));
            System.out.println("PT co nghiem kep: "
                    + "x1 = x2 = " + nghiemthu1);
        } else {
            System.out.println("PT vo nghiem!");
        }
    }
    
}

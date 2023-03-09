/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chayhoaqua;

import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class ChayHoaQua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoaQua tp = new HoaQua();
        QuaCam cp = new QuaCam();
        
        System.out.print("Nhap ten cua hoa qua: ");
        tp.setTen(sc.nextLine());
        System.out.print("Co xuat xu tu: ");
        tp.setXuatxu(sc.nextLine());
        System.out.print("Nhap so luong: ");
        tp.setSoLuong(sc.nextInt());
        System.out.print("Nhap gia cua hoa qua tren: ");
        tp.setGia(sc.nextDouble());
        System.out.print("Nhap ngay nhap hoa qua tren: ");
        tp.setNgaynhap(sc.nextInt());;
        
        cp.Retien();
        System.out.println(tp);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cty;

import java.util.Scanner;

public class Cty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       NhanVien nv = new  NhanVien();
       nv.TinhLuong();
       
       nv = new NhanVienFullTime();
       nv.TinhLuong();
       
       nv = new NhanVienPartTime();
       nv.TinhLuong();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cty;

/**
 *
 * @author DINH CHAU
 */
public class NhanVienPartTime extends NhanVien{
    public int Giolamviec=12;
    
    public void NhanVienPartTime(String Ten, int Giolamviec){
        
    }
    public String loaiNhanVien(){
        return null;
    }
    
    @Override
    public void  TinhLuong(){
        double Tientra = this.Luong * this.Giolamviec;
    }
}

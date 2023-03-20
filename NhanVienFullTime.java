/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cty;

/**
 *
 * @author DINH CHAU
 */
public class NhanVienFullTime extends NhanVien{
    public int Loaichucvu;
    public int ngaylamthem=3;
    
    public void NhanVienFullTime(String Ten, int ngaylamthem, int Loaichucvu){
        this.Ten = Ten;
        this.ngaylamthem = ngaylamthem;
        this.Loaichucvu = Loaichucvu;
    }
    
    public String loaiNhanVien(){
        return null;
    }
    
    @Override
    public void TinhLuong(){
        double Tien = this.Luong * this.ngaylamthem;
   
    }
}

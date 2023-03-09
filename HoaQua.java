/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhoaqua;

/**
 *
 * @author DINH CHAU
 */
public class HoaQua {
    private  String Ten;
    private double  Gia;
    private  int SoLuong;
    private  String xuatxu;
    private  int Ngaynhap;
    
    public HoaQua(){
        
    }
    public HoaQua(String Ten, double Gia, int SoLuong, String xuatxu, int Ngaynhap){
        this.Ten = Ten;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.xuatxu = xuatxu;
        this.Ngaynhap =Ngaynhap;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(int Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    @Override
    public String toString() {
        return "HoaQua{" + "Ten=" + Ten + ", Gia=" + Gia + ", SoLuong=" + SoLuong + ", xuatxu=" + xuatxu + ", Ngaynhap=" + Ngaynhap + '}';
    }
    
}

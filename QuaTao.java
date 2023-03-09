/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhoaqua;

/**
 *
 * @author DINH CHAU
 */
public class QuaTao extends HoaQua {
    private String ViNgot;
    private String Mau="do";
    
    public QuaTao(){
        
    }
    public QuaTao(String ViNgot, String Mau){
        this.ViNgot = ViNgot;
        this.Mau = Mau;
    }

    public String getViNgot() {
        return ViNgot;
    }

    public void setViNgot(String ViNgot) {
        this.ViNgot = ViNgot;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }
    
    public void Dattien(){
        System.out.println("Co gia thanh dat.");
    }
}

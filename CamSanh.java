/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhoaqua;

/**
 *
 * @author DINH CHAU
 */
public class CamSanh {
    private  String Mau="xanh";
    
    public CamSanh(){
        
    }
    public CamSanh(String Mau){
        this.Mau = Mau;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }
    public void Covichua(){
        System.out.println("Co vi chua dung pha nuoc uong.");
    }
}

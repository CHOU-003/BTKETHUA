/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhoaqua;

/**
 *
 * @author DINH CHAU
 */
public class QuaCam extends HoaQua {
    private String chua;
    private String Mau;
    
    public QuaCam(){
        
    }
    public QuaCam(String chua, String mau){
        this.chua = chua;
        this.Mau = mau;
    }

    public String getChua() {
        return chua;
    }

    public void setChua(String chua) {
        this.chua = chua;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }
    
    public void Retien(){
        System.out.println("Gia thanh re.");
    }
}

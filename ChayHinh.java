/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chayhinh;

/**
 *
 * @author DINH CHAU
 */
public class ChayHinh {
    public static void main(String[] args) {
        Circle cc = new Circle();
        cc.getRadius(); 
        cc.getArea();
        cc.getPerimeter();
        
        System.out.println("Ban kinh hinh tron la: " + cc.getRadius());
        System.out.println("Dien tich hinh tron la: "  + cc.getArea());
        System.out.println("Chu vi hinh tron la: " + cc.getPerimeter());
        
    }
    
}

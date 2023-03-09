/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhinh;

/**
 *
 * @author DINH CHAU
 */
// khai báo lớp cha Shape
public class Shape {
    private String color="RED";
    private  boolean  filled=true;
    
    // công khai Shape
    public Shape(){
        
    }
    public Shape(String color, boolean filled){
        this.color = color="RED";
        this.filled = filled=true;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}

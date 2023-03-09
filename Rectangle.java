/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhinh;

/**
 *
 * @author DINH CHAU
 */
// lớp Retangle kế thừa lớp cha Shape
public class Rectangle extends Shape{
    private  double  width=1.0;
    private double  lenght=1.0;
    
    public Rectangle(){
        
    }
    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", lenght=" + lenght + '}';
    }
    
}


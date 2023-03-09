/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayhinh;

/**
 *
 * @author DINH CHAU
 */
// lớp circle kế thừa lớp cha Shape
public class Circle extends Shape{
    private  double radius=1.0;
    // dùng Final cho PI vì số Pi là cố định không thay đổi giá trị.
    final double PI=3.14;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius=1.0;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double DIENTICH = this.radius*this.radius*PI;
        return DIENTICH;
    }
    public double  getPerimeter(){
        double CHUVI = this.radius*2*PI;
        return CHUVI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}

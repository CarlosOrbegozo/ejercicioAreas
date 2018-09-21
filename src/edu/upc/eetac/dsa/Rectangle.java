package edu.upc.eetac.dsa;

public class Rectangle extends Figura {
    private double base;
    private double altura;
    public Rectangle(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    public double area(){
        double area = this.base*this.altura;
        return area;
    }

}

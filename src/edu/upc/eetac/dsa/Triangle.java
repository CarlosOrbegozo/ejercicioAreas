package edu.upc.eetac.dsa;

public class Triangle extends Figura {
    private double base;
    private double altura;
    public Triangle(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    public double area(){
        double area = (this.base*this.altura)/2;
        return area;
    }
}

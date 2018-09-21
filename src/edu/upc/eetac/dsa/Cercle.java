package edu.upc.eetac.dsa;

public class Cercle extends Figura {
    private double radi;
    public Cercle(double radi){
        this.radi = radi;
    }
    public double area(){
        double area = 3.14159*Math.pow(this.radi,2);
        return area;
    }
}


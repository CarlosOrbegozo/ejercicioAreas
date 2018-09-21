package edu.upc.eetac.dsa;

import java.util.Comparator;

public abstract class Figura implements FiguraGeometrica {
    public double area(){
        return 0;
    }

}
class SortbyArea implements Comparator<Figura> {
    // Used for sorting in ascending order of
    // Area number
    public int compare(Figura a, Figura b)
    {
        double comp = a.area() - b.area();
        return (int)comp;
    }
}
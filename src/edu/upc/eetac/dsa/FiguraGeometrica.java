package edu.upc.eetac.dsa;

import java.util.Arrays;

public interface FiguraGeometrica {
    static void sort(Figura[] f){
        Arrays.sort(f,new SortbyArea());

    }
    static double suma(Figura[] l){
        double suma=0;
        for(Figura f:l){
            suma +=f.area();
        }
        return suma;
    }
}

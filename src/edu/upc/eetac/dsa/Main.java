package edu.upc.eetac.dsa;

public class Main {
    // Comment
    public static void main(String[] args){
        Rectangle rec = new Rectangle(4,4);
        Cercle cer = new Cercle(4);
        Triangle tri = new Triangle(3,2);
        Quadrat qua = new Quadrat(4);
        Figura[] listFigures = {rec,cer,tri,qua};
        double suma=0;
        for(Figura f:listFigures){
            suma +=f.area();
        }
        System.out.println(suma);
        double suma2 = FiguraGeometrica.suma(listFigures);
        System.out.println(suma2);
        for (Figura f:listFigures){
            System.out.println(f.getClass()+ " "+ f.area());
        }
        FiguraGeometrica.sort(listFigures);
        for (Figura f:listFigures) {
            System.out.println(f.getClass()+ " "+ f.area());
        }

    }
}

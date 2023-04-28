package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        Locale.setDefault(Locale.US);

        System.out.println("Coloque as medidas do triangulo X");
        x.a = s.nextDouble();
        x.b = s.nextDouble();
        x.c = s.nextDouble();

        System.out.println("Coloque as medidas do triangulo Y");
        y.a = s.nextDouble();
        y.b = s.nextDouble();
        y.c = s.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triangulo X: %.4f%n",areaX);
        System.out.printf("Área do triangulo Y: %.4f%n%n",areaY);

        if(areaX > areaY){
            System.out.printf("A maior área é a do triangulo X com %.4f%n",areaX);
        } else{

            System.out.printf("A maior área é a do triangulo Y com %.4f%n",areaY);
        }

        s.close();
    }
}

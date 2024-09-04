package Udemy.JavaEE.Operadores;

import java.util.Scanner;
public class OperadoresUnarios {

    public static void main(String[] args){

        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);

        //incremento
        //Pre incremento
        int e = 3;
        int f = ++e;
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);

        //post incremento
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Drecremento
        //pre decremento
        int i = 2;
        int j = --i;
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);

        //post decremento
        int k=4;
        int l=k--;
        System.out.println("k = "+k);
        System.out.println("l = "+l);

    }

}

package Udemy.JavaEE.Operadores;

//Operadores de igualdad y ralación
public class OperadoresIgualdadyRelacion {

    public static void main (String[] args){
        int a=3, b=23;
        //operador == sólo para tipos primitivos

        boolean c =  (a == b);
        System.out.println("c = "+ c);

        c = (a != b);// pregunta si dos elemento son difrrentes.
        System.out.println("c 2 = "+ c);

        String cadena = "hola";
        String cadena2 = "hola";
        System.out.println("Comparación de cadenas "+cadena.equals(cadena2));

        //Operadores relacionales

        boolean d = a > b;//> < >= <=
        System.out.println("valor de d = "+d);

        if(b % 2 == 0){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero inpar");
        }

        int edad = 38;
        int adulto = 18;

        if(edad >= adulto)
            System.out.println("Es adulto");
        else
            System.out.println("Es menor de edad");






    }
}

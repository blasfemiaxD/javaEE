package Udemy.JavaEE.Operadores;

public class OperadoresCondicionales {

    public static void main(String[] args){

        // && and las dos verdaderas para que sea verdadero
        // || or una verdadero para que sea verdadero

        int a = -100;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resutado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = "+ resutado);

        boolean vacaciones = false;
        boolean diaDescanso = true;

        if(vacaciones || diaDescanso)
            System.out.println("padre puede asistir al juego del hijo");
        else
            System.out.println("padre ocupado");


    }
}

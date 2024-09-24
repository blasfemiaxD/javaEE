package Udemy.JavaEE.SentenciasDeControl;

import java.util.Scanner;

public class If {
    public static void main(String args[]){
        /*System.out.println("if");

        var condicion = false;

        if(condicion){
            System.out.println("Condición Verdadera");
        }else {
            System.out.println("Condición falsa");
        }


        var numero = 3;
        var numeroTexto = "numero descococido";

        if(numero == 1){
            numeroTexto = "numero uno";
        }else if(numero == 2){
            numeroTexto = "numero dos";
        }else if (numero == 3){
            numeroTexto = "numero tres";
        } else {
            numeroTexto = "valor desconocido";
        }
        System.out.println("Valor texto: "+ numeroTexto);*/
        var scanner = new Scanner(System.in);
        System.out.println("Proprciona el mes del año");
        var mes = scanner.nextInt(); //7;//Mes del año
        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else  if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }else {
            estacion = "Mes incorrecto";
        }
        System.out.println("Estación Seleccionada: "+ estacion +" para el mes "+ mes);

    }
}

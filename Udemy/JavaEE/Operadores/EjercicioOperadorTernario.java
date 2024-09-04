package Udemy.JavaEE.Operadores;

public class EjercicioOperadorTernario {

//Operador ternario viane a reemplazar lo que es el if else
// esto se utiliza sólo con la variable var

    public static void main(String[] args){
        //var resultado = (10>3) ? true: false;
        var resultado = (1>3) ? "Verdadero": false;
        System.out.println("resultado = "+ resultado);

        //Numero es par o impar
        var numero = 27;
        var par = (numero % 2 == 0)? "numero "+ numero +" par": "numero "+ numero +" impar";
        System.out.println("par: "+ par);



    }

}

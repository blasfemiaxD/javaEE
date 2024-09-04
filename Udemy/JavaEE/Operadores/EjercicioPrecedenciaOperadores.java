package Udemy.JavaEE.Operadores;

public class EjercicioPrecedenciaOperadores {
    public static void main(String[] args){

        //cual es el valor de la variable z
        var x = 5;
        var y = 10;
        var z = ++x +y--;//x = 6, y=10, z=16
        System.out.println("valor de x: "+ x);//x=6
        System.out.println("valor de y: "+ y);//y=9
        System.out.println("valor de z: "+ z);
    }
}

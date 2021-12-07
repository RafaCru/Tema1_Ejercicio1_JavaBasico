package EjercicioSesión1;

/*Enunciado Ejercicio 1*/
/*Para este primer ejercicio tendréis que realizar lo siguiente:

 - Crea un proyecto de Java desde 0
 - Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 - Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han
 visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.*/

public class Main {
    public static void main(String[] args) {
        //tipo de datos
        //1. Numericos

        //1.1 Enteros
        byte tipo1=127;
        short tipo2=32767;
        int tipo3=2311;
        long tipo4=2^63-1;

        //1.2 Decimales
        float tipo5=2E2f;
        double tipo6=56.2d;

        //2. Boleano
        boolean tipo7=true;
        boolean tipo8=false;

        //3. Texto
        char tipo9='a';
        String tipo10= "Esto es un ejemplo";
        System.out.println("Tipo de dato byte: " + tipo1);
        System.out.println("Tipo de dato short: " + tipo2);
        System.out.println("Tipo de dato int: " + tipo3);
        System.out.println("Tipo de dato long: " + tipo4);
        System.out.println("Tipo de dato float: " + tipo5);
        System.out.println("Tipo de dato double: " + tipo6);
        System.out.println("Tipo de dato boolean: " + tipo7);
        System.out.println("Tipo de dato boolean: " + tipo8);
        System.out.println("Tipo de dato char: " + tipo9);
        System.out.println("Tipo de dato Spring: " + tipo10);

    }

}

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1,valor2,valor3;

        System.out.println("Introduzca la distancia recorrida en Km: ");
        valor1 = teclado.nextDouble();
        //Introducimos el valor  370.0
        System.out.println("Introduzca el tiempo recorrido en minutos: ");
        valor2 = teclado.nextDouble();
        //Introducimos el valor  240.0
        valor3 = valor1 / (valor2 / 60);
        System.out.println("Se ha desplazado a una velocidad de: " + valor3 + " Km/h");
        //Se imprime el valor de valor3 que es la velocidad en Km/h -> Se ha desplazado a una velocidad de: 92.5 Km/h
    }
}
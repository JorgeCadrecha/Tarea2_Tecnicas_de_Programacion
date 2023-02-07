import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        double valor1,valor2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un valor: ");
        valor1 = teclado.nextDouble();
        System.out.println("Introduce otro valor: ");
        valor2 = teclado.nextDouble();

        valor1= valor2;
        valor2 = valor1;
        System.out.println("Valor1 = " + valor1 + " y Valor2 = " + valor2);
        //Se imprime el valor de valor1  y el valor2 , ambos muestran el mismo valor aunque tu al principio pondas distintos.
        // Ejemplo: Valor1= 2.0 y Valor2 = 1.0  -> Valor1 = 1.0  y Valor2 = 1.0 
    }
}
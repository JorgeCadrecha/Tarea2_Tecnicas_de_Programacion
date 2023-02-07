# Tarea2_Tecnicas_de_Programacion
Tarea 2 2023

## Nota:
Mi repositorio es: https://github.com/JorgeCadrecha/Tarea2_Tecnicas_de_Programacion.git



## Enunciado
1. Valores de las variables
* ¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?

  Algo ValoresDeLasVariables  
    variable a, b: entero  
  Inicio 
     a <- 3  
    escribir("a = " & a)  
    b<-a+5  
    escribir("a = " & a & " y b = " & b)  
    a<-7  
    escribir("a = " & a & " y b = " & b)  
    
  Fin 
  
      public class ejercicio1 {
        public static void main(String[] args) {
               int a,b;
               a=3;
               System.out.println("a = " + a );
               //Se impreme el valor de a que es 3 en este caso
               b=a+5;
               System.out.println("a = " + a + " y b = " + b);
                //Se imprime el valor de a que es 3 y el valor de b que es 8
               a=7;
               System.out.println("a = " + a + " y b = " + b);
               //Se imprime el valor de a que es 7 y el valor de b que es 8
        }
    }
  
2. ¿Qué se muestra?
 * ¿Qué veremos al ejecutar el siguiente algoritmo?
 
    Variable valor1, valor2: entero  
    Variable cadena1: texto  
    Constante CST: real <- 49,78  
    Inicio
      valor1 <- 92 % 8  
      valor2 <- 2 * valor1  
      cadena1 <- "Test"  
      escribir(cadena1 & " , valor2 = " & valor2)  
      escribir(valor1 & " # " & CST)
      
    Fin 
         
        public class ejercicio2 {
        public static void main(String[] args) {
            int valor1,valor2;
            String cadena1;
            double CST = 49.78;

            valor1 = 92 % 8;
            valor2 = 2 * valor1;
            cadena1 = "Test";
            System.out.println(cadena1 + ", valor2 = " + valor2);
            //Se imprime el valor de cadena1 que es Test y el valor de valor2 que es 8 -> Test, valor2 = 8
            System.out.println(valor1 + " # " + CST);
            //Se imprime el valor de valor1 que es 4 y el valor de CST que es 49.78  -> 4 # 49.78
         }
        }

3. ¿Qué hace?
* ¿Qué hace este algoritmo?

    Algo QueHace   
    Variable valor1, valor2: real  
    Inicio 
      valor1 <- enter("Introduza un valor: ")  
      valor2 <- enter("Introduza otro valor: ")  
      //# tratamiento
      valor1 <- valor2  
      valor2 <- valor1  
      escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
      
    Fin 
    
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
              //Ejemplo: Valor1= 2.0 y Valor2 = 1.0  -> Valor1 = 1.0  y Valor2 = 1.0 
          }
      }
    
       

4. Velocidad media
* Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.
 
A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

   Introduzca la distancia recorrida (km).
   
   **370**
   Introduzca el tiempo del recorrido (min).
   
   **240**
   
   Se ha desplazado a una velocidad de 92,5 km/h.
   
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
            //Se imprime el valor de valor3 que es la velocidad en Km/h ->
             //Se ha desplazado a     una velocidad de: 92.5 Km/h
        }
    }

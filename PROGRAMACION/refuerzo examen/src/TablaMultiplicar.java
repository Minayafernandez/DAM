import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //utilizare tres tipos de bucle : for, while , do while
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero menor a 30:");
        int numero = teclado.nextInt();
        if (numero >= 30) {
            System.out.print("El numero es mayor a 30, introducir un numero inferior.");
        }else{
            System.out.println("Tabla de multiplicar del:" + numero);
            //Iniciamos Bucle For.
            System.out.println("------Bucle FOR------");
            for (int i= 1; i <=10; i++){
                System.out.println(numero + " x " + i + " = " +(numero * i));

            }
            // Iniciamos BUCLE WHILE.
            System.out.println("------Bucle While------");
            int j = 1;
            while (j <= 10){
                System.out.println(numero + " x " + j + " = " +(numero * j));
                j++;
            }
            // Iniciamos Bucle Do While.
            System.out.println("------Bucle Do While------");
            int k= 1;
            do {
                System.out.println(numero + " x " + k + " = " + (numero * k));
                k++;
            } while (k <= 10);
            }
        teclado.close();


        }
    }



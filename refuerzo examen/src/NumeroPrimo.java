import java.util.Scanner;

public class NumeroPrimo {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Introducir número: ");
            numero = teclado.nextInt();
            if (numero < 0)
                System.out.println("el numero es es negativo");
            else if (numero == 0) {
                System.out.println(" el numero es cero");
            } else {
                if (esPrimo(numero)) {
                    System.out.println("El numero es primo");
                } else {
                    System.out.println("el numero no es primo");
                }
            }
            public static boolean esPrimo(int numero) {
                for (int i=2;i<=numero/2; i++){
                    if (numero% i==0) {
                        return false;
                    }
                }
                return true;
            }
            }

        } //a
    }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Implementa un programa no que se tecleen dous números de tipo short .
        Se o primeiro é maior ou igual que o segundo,visualizaremos a resta .
        En calquera caso visualizaremos a suma .
         */
        /*
        Inicio
        Leer num1;
        Leer num2;
        si num1 > num2 hacer resta=num1-num2; mostrar "resta =" +resta;
        hacer num1+num2;
        mostrar suma;
        FIn
         */
        System.out.println("Este programa muestra la suma de dos numeros, y la resta cuando el num1 es mayor que el num2.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        short num1 = sc.nextShort();
        System.out.println("Introduce el segundo numero: ");
        short num2 = sc.nextShort();
        System.out.println("la suma es " + (num1+num2));
        if (num1 > num2){
            System.out.println("la resta es " + (num1 - num2));
        }
    }
}
package com.calculadora;
import java.util.Scanner;

/**
 *
 * @author Katherine Bonilla
 */

public class main {


    public static int option;
    public static double num1, num2, resultado;
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */

    public static void main (String[] args) {

        num1 = capturaNumero();
        do {
            option = opcionMenu();
            evaluar(option);
        }while (option!=0);
    }

    public static double capturaNumero(){
        System.out.println("Calculadora TSK");
        System.out.println("Ingrese un número ");
        return input.nextDouble();
    }

    public static int opcionMenu(){

        System.out.println("1. Sumar + ");
        System.out.println("2. Restar -");
        System.out.println("3. Multiplicar *");
        System.out.println("4. Dividir /");
        System.out.println("5. Modulo %");
        System.out.println("6. Salir ");
        return input.nextInt();
    }

    public static void evaluar(int option){
        switch (option){

            case 1:

                System.out.println("Ingrese numero");
                num2 = input.nextDouble();
                resultado = num1 + num2;
                num1 = resultado;
                System.out.println(resultado);
                break;
            case 2:

                System.out.println("Ingrese numero");
                num2 = input.nextDouble();
                resultado = num1 - num2;
                num1 = resultado;
                System.out.println(resultado);
                break;
            case 3:

                System.out.println("Escriba el segundo numero");
                num2 = input.nextDouble();
                resultado = num1 * num2;
                num1 = resultado;
                System.out.println(resultado);
                break;
            case 4:

                System.out.println("Ingrese numero");
                num2 = input.nextDouble();

                if (num2 == 0){

                    System.out.println("No se puede dividir por 0");
                }else {
                    resultado = (num1 / num2);
                    num1 = resultado;
                    System.out.println(resultado);
                }
                break;
            case 5:
                System.out.println("Ingrese numero");
                num2 = input.nextInt();
                resultado = num1 % num2;
                num1 = resultado;
                System.out.println(resultado);

            case 0:
                System.exit(0);


            default:

                System.out.println("la opción no es valida");
        }
    }
}

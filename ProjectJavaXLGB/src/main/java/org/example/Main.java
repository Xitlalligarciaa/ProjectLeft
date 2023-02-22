package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.println("Xitlalli L. García Bustos");
        int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5f;
        String miTexto = "Hola soy un texto en Java";
        char micaracter = 'a';


        Scanner miescaner = new Scanner(System.in);

        int numero;
        numero = miescaner.nextInt();

        System.out.println("Mi numero que acabo de ingresar es:" + numero);*/

        /*int numero = 0;
         //Desarrollar un programa en java que lea 2 numeros, que sume y me muestre el resultado
        Scanner midosnum = new Scanner(System.in);
                int numero1;
                int numero2;
                int resultado;


        System.out.println("Ingresa el numero uno:");
        numero1 = midosnum.nextInt();
        System.out.println("Ingresa el numero uno:");
        numero2 = midosnum.nextInt();
        resultado = numero1 + numero2;
        System.out.println("El resultado es: "+ resultado);+/
         */
        //Desarrolar un programa que pida nombre, edad, su peso y su altura y que calcule el imc
            //imc peso/altura^2 al final mostraruna ficha completa con los datos
       Scanner datop = new Scanner(System.in);
       String nombre, edad;
       double peso, altura;
       double imc;
       String registro;

        System.out.println("Ingresa tú nombre completo:");
        nombre = datop.nextLine();

        System.out.println("Ingresa tú edad:");
        edad = datop.nextLine();

        System.out.println("Ingresa tú peso:");
        peso = datop.nextDouble();

        System.out.println("Ingresa tú altura:");
        altura = datop.nextDouble();

       imc = peso / (altura * altura);
        System.out.println("El imc es:"+ imc);


        System.out.println("El nombre es:"+ nombre);
        System.out.println("La edad es:"+ edad);
        System.out.println("El peso es:"+ peso);
        System.out.println("La altura es:"+ altura);
        System.out.println("El imc es:"+ imc);


    }
}
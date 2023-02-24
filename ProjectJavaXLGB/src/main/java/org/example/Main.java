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
      /* Scanner datop = new Scanner(System.in);
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

       */
        /*Desarrollar un programa que pida a el usuario su nombre, apellido, domicilio,cuanto cotizo en 2022
          cuanto impuesto va a pagar.
          Declarar constante de icr-12% */
       /* Scanner usuario = new Scanner(System.in);
        String nombre, apellido, domicilio;
        double c2022;
        final double isr = .12;
        double iva;

        System.out.println("Ingresa tú nombre nombre:");
        nombre = usuario.nextLine();

        System.out.println("Ingresa tú apellido:");
        apellido = usuario.nextLine();

        System.out.println("Ingresa tú domicilio:");
        domicilio = usuario.nextLine();

        System.out.println("Ingresa cuanto cotizaste en 2022:");
        c2022 = usuario.nextDouble();

        iva =  c2022 * isr;
        System.out.println("El impuesto por pagar es:"+ iva);*/

        /* Pedir al usuario nombre, apellido, domicilio, precio de su carro, calcular el impuesto de
         tenencia (1.3% de lo que cuesta el carro)
         */
       /* Scanner usuario = new Scanner(System.in);
        String nombre, apellido, domicilio;
        double precioca;
        final double impuesto = 0.013;
        double pagar;

        System.out.println("Ingresa tú nombre nombre:");
        nombre = usuario.nextLine();

        System.out.println("Ingresa tú apellido:");
        apellido = usuario.nextLine();

        System.out.println("Ingresa tú domicilio:");
        domicilio = usuario.nextLine();

        System.out.println("¿Cual es el precio de tú coche?");
        precioca = usuario.nextDouble();

        System.out.println("El nombre es:"+ nombre);
        System.out.println("La apellido es:"+ apellido);
        System.out.println("El domicilio:"+ domicilio);
        System.out.println("El precio de tú coche es es:"+ precioca);

        pagar = precioca * impuesto;
        System.out.println("El impuesto de tenecia por pagar es " + pagar);*/

        int a = 10;
        int b = 5;
        int c = 3;

        if(a>b){
            System.out.println("a es mayor que b");

        }else{
            System.out.println("a es menor que b");
        }











    }
}
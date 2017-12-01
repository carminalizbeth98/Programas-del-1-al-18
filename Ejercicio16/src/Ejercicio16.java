/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */


/**
 *
 * @author Carmina Lizbeth Flores Solano
 */
import java.util.Scanner;


public class Ejercicio16 {
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        int num;

        System.out.println("Potencia de 2");
        System.out.print("Ingresa un  numero: ");

        num = ingreso.nextInt();
        poten(num);
    }

    public static void poten(int numero){
        int e;
        for(e = 1; e <= numero; e++){

            System.out.println(e + "^2 = " + (int)(Math.pow(e,2)) );
        }
    }


}
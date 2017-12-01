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
public class Ejercicio7{
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        int num;

        System.out.print("Ingresa un numero: ");
        num= ingreso.nextInt();

        if(num % 2 == 0){
            System.out.println("el numero que ingreso es par");
        }
        else{
            System.out.println("el numero que ingreso es impar");
        }

    }
}
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
public class Ejercicio10{
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        int divid, ndivisor;

        System.out.print("Ingrese el n dividendo: ");
        divid = ingreso.nextInt();

        System.out.print("Ingrese el n divisor: ");
        ndivisor = ingreso.nextInt();

        if(divid % ndivisor == 0){
            System.out.println("La division es exacta");
        }
        else{
            System.out.println("La division no es exacta");
        }
    }
}
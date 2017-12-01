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
public class Ejercicio8{
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        double nreal, ndecimal;
        int nrealEntero;

        System.out.print("Ingresa numero real: ");
        nreal = ingreso.nextDouble();
        nrealEntero = (int)nreal;
        ndecimal = nreal - nrealEntero;

        System.out.printf("La parte decimal es: %f\n", ndecimal);

    }
}
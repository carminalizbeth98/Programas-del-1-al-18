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

public class Programa6{
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        int a, b, sumacts;
        double hipotenusa;

        System.out.print("Cateto a: ");
        a = ingreso.nextInt();
        System.out.print("Cateto b: ");
        b = ingreso.nextInt();

        a = a * a;
        b = b * b;
        sumacts = a + b;
        hipotenusa = Math.sqrt(sumacts);

        System.out.println("Su hipotenusa es: "+ hipotenusa);

    }
}
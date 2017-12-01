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
public class Ejercicio9{
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        int num;

        System.out.print("Año: ");
        num = ingreso.nextInt();

        if(num %4 == 0)
        {
            System.out.println("El año es bisiesto");
        }
        else{
            System.out.println("El año no es bisiesto");
        }

    }
}
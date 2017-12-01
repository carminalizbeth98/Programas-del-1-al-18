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
public class Ejercicio12{
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        char letra = ingreso.next().charAt(0);
        int mm = (int)letra;

        if(mm >= 65 && mm <= 90 ){
            System.out.println("es letra");
        }
        if(mm >= 97 && mm <= 122 ){
            System.out.println("es letra");
        }
        if(mm >= 48 && mm <= 57 ){
            System.out.println("es numero");
        }

        System.out.println("n  = " + mm);
    }

}

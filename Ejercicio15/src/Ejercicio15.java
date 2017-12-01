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
public class Ejercicio15{
    public static void main(String[]args){

        Scanner ingreso = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero: ");
        num = ingreso.nextInt();
        Ejercicio15(num);

    }
    public static void Ejercicio15(int numero){
        int a;
        for(a = 1; a<=10; a++){
            System.out.printf
                    ("%d x %d = %d\n",numero, a, (a * numero) );
        }
    }

}
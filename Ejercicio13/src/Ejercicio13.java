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
public class Ejercicio13{
    public static void main(String[]args){
        int desigual = 0,ld1, ld2, ld3;

        Scanner ingreso;
        ingreso = new Scanner(System.in);

        System.out.println("Desigualdad");
        System.out.print("Coloque el lado lado 1: ");
        ld1 = ingreso.nextInt();

        System.out.print("Coloque el lado 2: ");
        ld2 = ingreso.nextInt();

        System.out.print("Coloque  el lado 3: ");
        ld3 = ingreso.nextInt();

        if((ld1 + ld2) < ld3){
            desigual++;
        }
        if((ld1 + ld3) < ld2){
            desigual++;
        }
        if((ld2 + ld3) < ld1){
            desigual++;
        }
        if (desigual > 0){
            System.out.println("triangulo no valido");
        }
        else{
            tipo(ld1,ld2,ld3);
        }

    }

    public static void tipo(int lado1, int lado2, int lado3){
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilatero");
        }
        if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1){
            System.out.println("Isosceles");
        }
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Escaleno");
        }
    }

}
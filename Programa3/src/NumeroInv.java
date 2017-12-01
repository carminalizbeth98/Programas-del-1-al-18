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
public class NumeroInv {
    public static  void main(String[]args){

        Scanner obtener = new Scanner(System.in);
        System.out.println("coloque el numero que va a invertir");

        int num = obtener.nextInt();
        if (num > 100 & num < 1000){
            int a = num / 1000;
            int e = num - (a * 1000);
            int i = e / 100;
            int o = e - (i * 100);
            int u= o / 10;
            int x = o - (e * 10);
            int z = (x*100) + (e * 100) + ( i * 10 ) +a;
            System.out.println("numeor invertido es " + z);
        }
    }
}
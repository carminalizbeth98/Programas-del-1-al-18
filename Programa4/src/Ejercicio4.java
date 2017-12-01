import java.util.Scanner;

public class Ejercicio4{
    public  static  void  main(String args[]){

        Scanner t = new Scanner(System.in);
        double valorpulg = 2.54;
        double cm,pulg;

        System.out.println("Centrimetros: ");
        cm = t.nextDouble();

        pulg = cm + valorpulg;
        System.out.println("Enn pulgadas es : " + pulg);
    }
}
/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

/**
 *
 * @author Carmina Lizbeth Flores Solano
 */
import javax.swing.*;
public class Promedio {
    public static void main(String[] arg){

        Double not1 = Double.parseDouble(JOptionPane.showInputDialog("Promedio de primera nota "));
        Double not2 = Double.parseDouble(JOptionPane.showInputDialog("Promedio de la segunda nota "));
        Double not3 = Double.parseDouble(JOptionPane.showInputDialog("Promedio de la tercera nota "));
        Double not4 = Double.parseDouble(JOptionPane.showInputDialog("Promedio de la cuarta nota"));

        Double prom=(not1+not2+not3+not4)/4;

        JOptionPane.showMessageDialog(null,"El promedio final es " + prom);

    }
}
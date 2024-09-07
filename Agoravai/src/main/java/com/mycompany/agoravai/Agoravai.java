/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agoravai;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Agoravai {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto é o valor "));
        Double vdesconto = Double.parseDouble(JOptionPane.showInputDialog("Quanto é o desconto? "));
        Double vjuros = Double.parseDouble(JOptionPane.showInputDialog("Quanto é o juros?" ));
        Double contaju = valor - (vdesconto * valor);
        Double contadesconto = valor + (vjuros * valor);
        JOptionPane.showMessageDialog(null,"compra 10% Desconto. " + contadesconto);
        JOptionPane.showMessageDialog(null,"compra 10% juros " + contaju);
    }
}

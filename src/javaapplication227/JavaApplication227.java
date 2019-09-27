/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication227;

import javax.swing.JOptionPane;

/**
 *
 * @author Verosffy
 */
public class JavaApplication227 {

    /**
     * @param args the command line arguments
     */
    static boolean polindrome(long ertek) {
        String munka = "" + ertek;
        boolean poli = true;

        for (int i = 0; i < munka.length(); i++) {

            if (munka.charAt(munka.length()-1 - i) != munka.charAt(i)) {
                poli = false;
                break;
            }
        }

        return poli;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "polindrom számot készítek több jegyű számok szorzatából. Váassz majd.");
        int szamjegyek = (Integer.parseInt(JOptionPane.showInputDialog("hány jegyű számokkal játszunk?")));
        long ertek = 1;
        for (int i = 1; i <= szamjegyek; i++) {
            ertek *= 10;
        }
        ertek--;
        long szorzat;
        long poliszorzat = 0;
        boolean polie;
        for (long i = ertek; i > 0; i--) {
            for (long j = ertek; j > 0; j--) {
                szorzat = i * j;
                if (polindrome(szorzat)) {
                    if (szorzat > poliszorzat) {
                        poliszorzat = szorzat;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, " A legnagyobb polindromszorzat a " + poliszorzat);
        System.exit(0);
    }

}

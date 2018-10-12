/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package joptionrata;



import java.awt.HeadlessException;

import javax.swing.JOptionPane;

/**

 *

 * @author user

 */

public class JOptionRata {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        int nil1, nil2,nil3;
        double rata;

        try {

            nil1 = Integer.parseInt(JOptionPane.showInputDialog("Angka 1 = "));
            nil2 = Integer.parseInt(JOptionPane.showInputDialog("Angka 2 = "));
            nil3 = Integer.parseInt(JOptionPane.showInputDialog("Angka 3 = "));

            rata = (nil1+nil2+nil3)/3;

            String msg = "Rata-rata = " + rata;

                JOptionPane.showMessageDialog(null,msg);

        }catch(HeadlessException | NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Error!");

        }

    }

    

}
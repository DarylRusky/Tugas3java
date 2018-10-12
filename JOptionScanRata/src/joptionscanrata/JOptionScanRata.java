/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionscanrata;
import java.util.Scanner;

import java.io.IOException;

/**
 *
 * @author dharyl
 */
public class JOptionScanRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int nil1,nil2,nil3;

        double rata;

        try{

            System.out.print("Masukkan Angka 1 = ");
            nil1 = input.nextInt();

            System.out.print("Masukkan Angka 2 = ");
            nil2 = input.nextInt();

            System.out.print("Masukkan Angka 3 = ");
            nil3 = input.nextInt();

            rata = (nil1+nil2+nil3)/3;

            System.out.println("Rata-rata = " + rata);

        } catch (Exception e) {

            System.out.println("Error!");

        }
    }
}
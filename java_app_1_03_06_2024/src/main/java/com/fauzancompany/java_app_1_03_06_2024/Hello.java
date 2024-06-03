/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzancompany.java_app_1_03_06_2024;
import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author D-23
 */
public class Hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int inputNilai;
        int nilaikkm = 85;
        
        System.out.println("Input Nilai"); 
        inputNilai = myObj.nextInt();  
        
        if (inputNilai <= nilaikkm) {
            System.out.println("Saya Tidak Lulus");
        } else {
            System.out.println("Saya Lulus gais");
        }
        
        // Init Variabel
        int umur = 99;
        String nama = "Ahmad Fauzan Arif";
        String akademik = "Institut Asia Malang";
        String hobi = "Makan dan Tidur";
        
        
        // Output
        System.out.println("-------------------------------------------");
        System.out.println("----------------FIRST PROGRAM--------------");
        System.out.print("Hello Aku "+ nama);
        System.out.println("Salam kenal teman-teman");
        System.out.println("Aku berumur berapa hayoooo?" + "Apa?" + umur);
        System.out.println("Aku sedang kuliah di " + akademik);
        System.out.println("Hobiku adalah " + hobi);
        System.out.println("");
        System.out.println("-------------------------------------------");
    }
}

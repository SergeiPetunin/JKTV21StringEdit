/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----Строки в Java-----");
        System.out.println("-----Введите текст-----");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("kol simv " + str.length());
        String[] words = str.split(" ");
        System.out.println("kol slov " + words.length);
        
        
    }
    
}

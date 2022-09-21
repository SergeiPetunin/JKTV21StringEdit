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
       do{
        System.out.println("Выберете номер функции: ");
        System.out.println("0 Выход: ");
        System.out.println("1 Вывести количество символов: ");
        System.out.println("2 Вывести количество слов: ");
        System.out.println("3 Найти слово в строке: ");
        System.out.println("4 Заменить указанное слово в строке: ");
        
        int number = scanner.nextInt();
        if(number == 0){
            System.out.println("Vqhod");
            break;
            
        }else if (number == 1){
            System.out.println("Vqbrali punkt " + number);
            System.out.println("Количество символов " + str.length());
        }else if (number == 2){
            System.out.println("Vqbrali punkt " + number);
            String[] words = str.split(" ");
            System.out.println("Количество слов " + words.length);
        }else if ( number == 3){
            System.out.println("Vqbrali punkt " + number);
        }else if (number == 4){
            System.out.println("Vqbrali punkt " + number);
        }
        
        }while(true);
        
    }
    
}

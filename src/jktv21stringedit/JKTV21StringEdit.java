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
        scanner.nextLine();
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
            System.out.println("Вы выбрали пункт "+number);
            System.out.println("Какое слово найти: ");
            String subStr = scanner.nextLine();
            System.out.println(subStr);
            int index = str.indexOf(subStr);
            if(index < 0){
                System.out.println("Такого слова нет в строке");
            }else{
                index++;
                System.out.println("Указанное слово находится на "+index+" позиции");
            }
        }else if (number == 4){
            System.out.println("Vqbrali punkt " + number);
            System.out.println(str);
            System.out.println("Введите именяемую строку: ");
            String editStr = scanner.nextLine();
            String newStr;
            int index = str.indexOf(editStr);
            if(index < 0) {
                System.out.println("Такой строки в тескте нет");
            }else{
                System.out.println("На какую строку заменить: ");
                newStr = scanner.nextLine();
                System.out.println("Измененная строка выглядит так: ");
                System.out.println(str.replace(editStr, newStr));
            }  
        }
        }while(true);
    }
}

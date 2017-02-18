/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creeaza un calculator
        Computer cmp = new Computer();
        String sirCitit = "";
        // interpreteaza "ce am apasat"
        // daca ai apasat "stop" atunci inchide programul
        while(!"stop".equals(sirCitit)){
            // citeste o linie de la tastatura
            Scanner scanner = new Scanner(System.in);
            sirCitit = scanner.nextLine();
            cmp.doOperation(sirCitit);
        }
        // altfel du-te inapoi la inceput
    }
}

package com.calculadora;

import javax.swing.*;

import java.nio.IntBuffer;

public class Main {

    static int option;
    static String menu;

    public static void main(String[] arg) {
        OperacoesBasicas object = new OperacoesBasicas();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. soma\n" + "2. subtracao\n" + "3. divisao\n" + "4. multiplicacao\n" + "5. sair\n");

            option = Integer.parseInt(menu);

            switch (option){
                case 1:
                    object.soma();
                    break;
                case 2:
                    object.subtracao();
                    break;
                case 3:
                    object.divisao();
                    break;
                case 4:
                    object.multiplicacao();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "A opção " + option + " é incorreta");
            }
        }while(option !=5);

    }
}


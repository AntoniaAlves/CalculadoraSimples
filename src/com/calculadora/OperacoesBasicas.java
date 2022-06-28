package com.calculadora;
import javax.swing.*;

public class OperacoesBasicas {

    double number1;
    double number2;
    double resultado;

    public OperacoesBasicas() {
       number1 = 0;
       number2 = 0;
       resultado = 0;
    }
    public void soma(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = number1 + number2;
        JOptionPane.showInputDialog(null, "O resultado é " + resultado);
    }
    public void subtracao(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = number1 - number2;
        JOptionPane.showInputDialog(null, "O resultado é " + resultado);
    }
    public void divisao(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = number1 / number2;
        JOptionPane.showInputDialog(null, "O resultado é " + resultado);
    }
    public void multiplicacao(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = number1 * number2;
        JOptionPane.showInputDialog(null, "O resultado é " + resultado);
    }

}

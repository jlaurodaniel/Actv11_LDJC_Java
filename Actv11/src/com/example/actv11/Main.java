package com.example.actv11;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Boolean menu = true;

        while (menu) {
            int answer0 = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para cuadrado" +
                    " \n Escribe 2 para circulo "+
                    " \n Escribe 3 para triangulo "+
                    " \n Escribe 0 para salir "));
            switch (answer0) {
                case 1:
                   double answer = Integer.parseInt(JOptionPane.showInputDialog("Medida de un lado del cuadrado?:"));
                    Square cuadrado = new Square(answer);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para perimetro  \nEscribe 2 para area"));
                    if (answer == 1) {
                        JOptionPane.showMessageDialog(null, "El perimetro es: " + cuadrado.getPerimeter());
                    } else if (answer == 2) {
                        JOptionPane.showMessageDialog(null, "El area es: " + cuadrado.getArea());
                    }
                    break;
                case 2:
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Radio del circulo?:"));
                    circle circulo = new circle(answer);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para perimetro  \nEscribe 2 para area"));
                    if (answer == 1) {
                        JOptionPane.showMessageDialog(null, "El perimetro es: " + circulo.getPerimeter());
                    } else if (answer == 2) {
                        JOptionPane.showMessageDialog(null, "El area es: " + circulo.getArea());
                    }
                    break;
                case 3:
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Medida de un lado del triangulo equilatero?:"));
                    EquilateralTriangle triangulo = new EquilateralTriangle(answer);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 para perimetro  \nEscribe 2 para area"));
                    if (answer == 1) {
                        JOptionPane.showMessageDialog(null, "El perimetro es: " + triangulo.getPerimeter());
                    } else if (answer == 2) {
                        JOptionPane.showMessageDialog(null, "El area es: " + triangulo.getArea());
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Hasta luego...");
                    menu=false;
                    break;
            }
        }
    }
}

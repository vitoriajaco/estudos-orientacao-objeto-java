package exercicio2.application;

import exercicio2.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Enter rectangle width and height");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();
        System.out.println("Area: " + retangulo.area()
                + " Perimeter"
                + retangulo.perimeter()
                + " Diagonal: "
                + retangulo.diagonal());
        // Poderia usar antes dos metodos o printf assim:
        // System.out.printf("AREA = %.2f%n", rect.area());
        //Afim de arrendondar para duas casas decimais caso o número nao fosse inteiro

        sc.close();
    }
}

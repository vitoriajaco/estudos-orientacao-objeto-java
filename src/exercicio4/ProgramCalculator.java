package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculator {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Calculator calc = new Calculator(); -> Como os metodos são staticos não precisa instanciar.
    System.out.println("Enter radius: ");
    double radius = sc.nextDouble();

    double c = Calculator.circumference(radius); // Chama a classe pois como é estatico nao precisa ser instanciado.

    double v = Calculator.volume(radius); //Caso nao fosse estatico ficaria double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}

package exercicio4;

public class Calculator {

    public static final double PI = 3.14159; //sendo static ela independe de qualquer objeto do tipo Calculator

    public static double circumference (double radius) { //circumference sendo static ela pode ser calculada independente de objeto
        return 2.0 * PI * radius;
    }

    public static double volume (double radius) {
        return 4.0 * PI * radius * radius * radius/ 3.0;
    }
}

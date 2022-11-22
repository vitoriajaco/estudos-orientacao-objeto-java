package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter employee name:");
        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary: "); //salario bruto
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();


        System.out.println("Employee: " + employee );

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble(); //Primeiro declaro a variavel que terá no método
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data " + employee); //Chama o objeto para ser atualizado
        sc.close();


    }
}

package exercicio1.application;

import exercicio1.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Enter product area: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.print("Price: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println();
       //Por conta do método toString não precisa passar o parametro de baixo.
        System.out.println("Product data " + products);
        /*  System.out.println(products.name + " " +products.price + " " + products.quantity);*/
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); // Aqui o usuario digitará uma quantidade
        products.addProducts(quantity); //Aqui faz a atualização do objeto passada pelo usuario dentro do objeto product

        System.out.println("Updated data: " + products);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + products);


        sc.close();
    }
}

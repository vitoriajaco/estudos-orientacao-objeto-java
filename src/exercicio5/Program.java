package exercicio5;

import exercicio1.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product area: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        //Criando construtor a instanciação vem depois a solução é criar variaveis temporarias para receber esses parametros.
        Product product = new Product(name, price, quantity);

        System.out.println();
        //Por conta do método toString não precisa passar o parametro de baixo.
        System.out.println("Product data " + product);
        /*  System.out.println(products.name + " " +products.price + " " + products.quantity);*/
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt(); // Aqui o usuario digitará uma quantidade
        product.addProducts(quantity); //Aqui faz a atualização do objeto passada pelo usuario dentro do objeto product

        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}


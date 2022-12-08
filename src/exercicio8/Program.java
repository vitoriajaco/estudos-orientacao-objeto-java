package exercicio8;


//Tratamento de Exceções:
// Bloco try(tente): Contém o código que representa
// a execução normal do trecho do código que pode acarretar em uma exceção

import java.util.InputMismatchException;
import java.util.Scanner;

//Bloco catch(capturar) contem o código a ser executado caso uma exceção ocorra.
//Deve ser especificado o tipo da exceçao a ser tratada
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split( " ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!"); //Quando se digita um numero que nao tem vetor
        }
        catch (InputMismatchException e){
            System.out.println("Input error"); //Se digitar uma letra a por exemplo quando se esperava um numero
        }
        System.out.println("End of program");
        sc.close();
    }
}

package exercicio2.entities;

public class Retangulo {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width + height) * 2;
    }

    public double diagonal(){
        //Retorna a raiz quadrada positiva arrendoda corretamente de um valor double
        return Math.sqrt(width * width + height * height);

    }
}

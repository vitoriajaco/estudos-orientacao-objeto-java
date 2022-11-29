package exercicio5;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) { //O construtor serve para obrigar que seja passado
                                                   // parametros obrigatorios ao instanciar um objeto para que ele n seja null ou 0;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;

    }
    //Esse método recebe o quantity que se inicializou com o argumento
    //como soma com o que passou na classe.
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity; // O primeiro quantity refere-se ao da classe, e o segundo ao que foi inicializado nos parenteses
    }
    //Sobreposição
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price ) //converte em duas casas decimais
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}



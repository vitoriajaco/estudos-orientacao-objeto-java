package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

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


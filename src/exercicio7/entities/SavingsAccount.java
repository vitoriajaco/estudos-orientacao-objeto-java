package exercicio7.entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override //Sobreposição
    public final void withdraw(double amount) { //convem colocar final em sobreposiçoes para evitar gerar sobreposiçoes multiplas e vim a dar erro no codigo
        balance -= amount;
    }
}

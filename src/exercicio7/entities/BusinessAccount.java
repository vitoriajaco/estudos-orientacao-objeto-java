package exercicio7.entities;



public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(){
        super (); // O super serve para executar o construtor da classe base, no caso a Account

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // O super serve para executar o construtor da classe base, no caso a Account
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}

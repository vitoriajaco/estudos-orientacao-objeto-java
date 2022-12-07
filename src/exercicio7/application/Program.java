package exercicio7.application;

import exercicio7.entities.Account;
import exercicio7.entities.BusinessAccount;
import exercicio7.entities.SavingsAccount;

public class Program {

    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING - É pegar um objeto do tipo BusinessAcount e atribui-lo para uma variavel do tipo Account

    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    //DOWNCASTING - É converter um objeto da super classe para sub classe




}

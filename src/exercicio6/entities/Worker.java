package exercicio6.entities;

//Projeto de composição

import exercicio6.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level; //Chama a enum
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();
    //Quando se tem uma lista do tipo tem muitos, não se inicia a lista no construtor. Somente instancia a lista no parametro

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
        //Não adicionará a Lista de contratos
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

   /* public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }*/

    // ATENÇÃO!!!! >>> ESSA LISTA DE SET CONTRACTS NAO PODE EXISTIR POIS NÃO PODE TROCAR ESSA LISTA DE CIMA POR OUTRA LISTA.

    //metodos

    public void addContract(HourContract contract){ // vai pegar a lista de contratos de cima e adicionar o contrato que foi passado no parenteses como argumento
        contracts.add(contract);
    }

    public void removeContract (HourContract contract){
        contracts.remove(contracts);
    }

    public double income (int year, int month){
        double sum = baseSalary; // O Proximo metodo serve para acumular na soma o calculo dos contratos do trabalhador
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract: contracts){
            calendar.setTime(contract.getDate());
            int contact_year = calendar.get(Calendar.YEAR); // a variavel representa o ano do contrato.
            int contract_month = 1 + calendar.get(Calendar.MONTH); // Adiciona o +1 pq começa em zero.
            if (year == contact_year && month == contract_month){ // O metodo testa se o contrato foi o mesmo do passado no parametro
                sum += contract.totalValue();
            }
        }
        return sum;

    }


}

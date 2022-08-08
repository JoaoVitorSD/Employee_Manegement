package entities;

public abstract class Account {
    private String name;
    protected Double income;

    public Account(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public Double getIncome() {
        return income;
    }
    public abstract Double calcTaxes();
}

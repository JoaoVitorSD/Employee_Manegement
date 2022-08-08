package entities;

import enums.WorkerLevel;

import java.util.LinkedList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private LinkedList<HourContract> contracts = new LinkedList<HourContract>();

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
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

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer month, Integer year) {
        if (year == null || month == null||contracts.size() == 0) {
            return 0.0;
        }
        Double amount = 0.00;
        for (HourContract contract : contracts) {
            if (contract.getDate().getYear()+1900 == year) {
                if (contract.getDate().getMonth() +1== month) {
                    amount += contract.totalValue();
                }
            }
        }
        return amount+baseSalary;
    }
    public String getInfo(String department,String date) {
        Integer month = Integer.parseInt(date.substring(0,2));
        Integer year = Integer.parseInt(date.substring(3,7));
        return "Name: "+name+"\nDepartment: "+department+"\nIncome for "+date+": "+income(month,year);
    }
}

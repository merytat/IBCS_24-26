package UnitP3;

import java.util.Objects;

public class Employee {
    //attributes
    private String name;
    private double totalSales;
    private double yearlyBonus;

    public Employee(String name, double totalSales) {
        this.name = name;
        this.totalSales = totalSales;
    }

    public void determineBonus(){
        if (totalSales > 5000000){
            yearlyBonus = 750;
        }
        else{
            yearlyBonus = 250;
        }
    }

//    @Override
//    public boolean equals(Object a){
//        Employee e = (Employee)a;
//        return this.name.equals(e.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalSales, yearlyBonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", totalSales=" + totalSales +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}

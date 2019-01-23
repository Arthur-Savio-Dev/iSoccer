package br.com.ufal.iSoccer.persons;

public class Fan extends Person{
    private double rateValue;
    private int typeFan;

    public Fan(String name, String cpf, String tel, String email,
               double salary, String type, double rateValue, int typeFan) {

        super(name, cpf, tel, email, salary, type);
        this.rateValue = rateValue;
        this.typeFan = typeFan;
    }

    public double getRateValue() {
        return rateValue;
    }

    public void setRateValue(double rateValue) {
        this.rateValue = rateValue;
    }

    public int getTypeFan() {
        return typeFan;
    }

    public void setTypeFan(int typeFan) {
        this.typeFan = typeFan;
    }
}

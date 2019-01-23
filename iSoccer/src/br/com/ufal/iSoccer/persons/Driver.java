package br.com.ufal.iSoccer.persons;

public class Driver extends Person{
    private String enabling;

    public Driver(String name, String cpf, String tel, String email, double salary, String type,
                  String enabling) {
        super(name, cpf, tel, email, salary, type);
        this.enabling = enabling;
    }

    public String getEnabling() {
        return enabling;
    }

    public void setEnabling(String enabling) {
        this.enabling = enabling;
    }
}

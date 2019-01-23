package br.com.ufal.iSoccer.persons;

public class Doctor extends Person{
    private String crm;

    public Doctor(String name, String cpf, String tel, String email, double salary, String type,
                  String crm) {
        super(name, cpf, tel, email, salary, type);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}

package br.com.ufal.iSoccer.persons;

public class Player extends Person{
    private String playerFunction;
    private boolean available;

    public Player(String name, String cpf, String tel, String email, double salary, String type,
                  String playerFunction) {
        super(name, cpf, tel, email, salary, type);
        this.playerFunction = playerFunction;
    }

    public String getPlayerFunction() {
        return playerFunction;
    }

    public void setPlayerFunction(String playerFunction) {
        this.playerFunction = playerFunction;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

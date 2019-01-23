package br.com.ufal.iSoccer.physicalResources;

public class Bus {
    private boolean exist;
    private boolean available;

    public Bus(boolean exist, boolean available) {
        this.exist = exist;
        this.available = available;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}



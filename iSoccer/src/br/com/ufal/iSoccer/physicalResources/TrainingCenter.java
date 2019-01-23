package br.com.ufal.iSoccer.physicalResources;

public class TrainingCenter {
    private boolean exist;
    private boolean available;
    private int bedroomsNumber;

    public TrainingCenter(boolean exist, boolean available, int bedroomsNumber) {
        this.exist = exist;
        this.available = available;
        this.bedroomsNumber = bedroomsNumber;
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

    public int getBedroomsNumber() {
        return bedroomsNumber;
    }

    public void setBedroomsNumber(int bedroomsNumber) {
        this.bedroomsNumber = bedroomsNumber;
    }
}

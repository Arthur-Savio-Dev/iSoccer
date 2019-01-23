package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.persons.*;
import br.com.ufal.iSoccer.physicalResources.Bus;
import br.com.ufal.iSoccer.physicalResources.Stadium;
import br.com.ufal.iSoccer.physicalResources.TrainingCenter;

import java.util.ArrayList;

public class SystemDatas {
    private Person president;
    private Person techinician;
    private ArrayList<Cooker> cookers = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<Lawyer> lawyers = new ArrayList<>();
    private ArrayList<PersonalTrainer> personalTrainers = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Fan> fans = new ArrayList<>();
    private ArrayList<Person> allEmployees = new ArrayList<>();
    private Stadium stadium = new Stadium(true, true, 30000, 1000, 20);
    private Bus bus = new Bus(true, true);
    private TrainingCenter trainingCenter = new TrainingCenter(true, true, 50);

    public Person getPresident() {
        return president;
    }

    public void setPresident(Person president) {
        this.president = president;
    }

    public Person getTechinician() {
        return techinician;
    }

    public void setTechinician(Person techinician) {
        this.techinician = techinician;
    }

    public ArrayList<Cooker> getCookers() {
        return cookers;
    }

    public void setCookers(ArrayList<Cooker> cookers) {
        this.cookers = cookers;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Lawyer> getLawyers() {
        return lawyers;
    }

    public void setLawyers(ArrayList<Lawyer> lawyers) {
        this.lawyers = lawyers;
    }

    public ArrayList<PersonalTrainer> getPersonalTrainers() {
        return personalTrainers;
    }

    public void setPersonalTrainers(ArrayList<PersonalTrainer> personalTrainers) {
        this.personalTrainers = personalTrainers;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Fan> getFans() {
        return fans;
    }

    public void setFans(ArrayList<Fan> fans) {
        this.fans = fans;
    }

    public ArrayList<Person> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(ArrayList<Person> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public TrainingCenter getTrainingCenter() {
        return trainingCenter;
    }

    public void setTrainingCenter(TrainingCenter trainingCenter) {
        this.trainingCenter = trainingCenter;
    }
}

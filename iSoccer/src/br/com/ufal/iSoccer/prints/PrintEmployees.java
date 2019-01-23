package br.com.ufal.iSoccer.prints;

import br.com.ufal.iSoccer.adminsystem.*;
import br.com.ufal.iSoccer.persons.*;

public class PrintEmployees {
    private SystemDatas systemDatas;

    public PrintEmployees(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
    }

    public void printEmployeeDetails(Person person){
        System.out.println("------------------");
        System.out.println("Nome: " + person.getName());
        System.out.println("Tel: " + person.getTel());
        System.out.println("E-mail: " + person.getEmail());
        System.out.println("Função: " + person.getType());
    }

    public void printDoctorDetails(Doctor doctor){
        printEmployeeDetails(doctor);
        System.out.println("CRM :" + doctor.getCrm());
        System.out.println("------------------");
    }

    public void printDriverDetails(Driver driver){
        printEmployeeDetails(driver);
        System.out.println("CNH: " + driver.getEnabling());
        System.out.println("------------------");
    }

    public void printPlayerDetails(Player player){
        printEmployeeDetails(player);
        System.out.println("Função do jogador: " + player.getPlayerFunction());
        System.out.printf("Apto: ");
        if(player.isAvailable())
            System.out.println("Apto para jogar");
        else
            System.out.println("Inapto");
        System.out.println("------------------");
    }

    public void printAllEmployees(){
        for(Person i: systemDatas.getAllEmployees()){
            if(!i.getType().equals("médico") && !i.getType().equals("motorista")
                    && !i.getType().equals("jogador")){
                printEmployeeDetails(i);
                System.out.println("------------------");
            }
        }
        for(Doctor i: systemDatas.getDoctors()){
            printDoctorDetails(i);
        }
        for(Driver i: systemDatas.getDrivers()){
            printDriverDetails(i);
        }
        for(Player i: systemDatas.getPlayers()){
            printPlayerDetails(i);
        }
    }

    public void printJustEmployeeNameAndType(){
        for(Person i: systemDatas.getAllEmployees()){
            System.out.println("Name: " + i.getName());
            System.out.println("Função: " + i.getType());
            System.out.println("-------------------------");
        }
    }
}

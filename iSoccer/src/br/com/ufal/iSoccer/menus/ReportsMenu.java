package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.EmployeeAdmin;
import br.com.ufal.iSoccer.adminsystem.FanAdmin;
import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.persons.Fan;
import br.com.ufal.iSoccer.persons.Person;
import br.com.ufal.iSoccer.persons.Player;
import br.com.ufal.iSoccer.prints.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReportsMenu {
    PrintMenus printMenus = new PrintMenus();
    PrintEmployees printEmployees;
    PrintFans printFans;
    SystemDatas systemDatas;
    EmployeeAdmin employeeAdmin;
    FanAdmin fanAdmin;

    public ReportsMenu(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
        this.employeeAdmin = new EmployeeAdmin(systemDatas);
        this.printEmployees = new PrintEmployees(systemDatas);
        this.fanAdmin = new FanAdmin(systemDatas);
        this.printFans = new PrintFans(systemDatas);
    }

    public void reportsMenu (){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 8){
            try{
                printMenus.printReportsMenu();
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        teamReports();
                        break;
                    case 2:
                        generalServicesReports();
                        break;
                    case 3:
                        transportReports();
                        break;
                    case 4:
                        trainigCenterReports();
                        break;
                    case 5:
                        stadiumReports();
                        break;
                    case 6:
                        fanReports();
                        break;
                    case 7:
                        allRports();
                        break;
                    default:
                        System.out.println("Escolha apenas uma das opções disponíveis.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros.");
                scanner.nextLine();
            }
        }
    }

    public void allRports(){
        teamReports();
        generalServicesReports();
        transportReports();
        trainigCenterReports();
        stadiumReports();
        fanReports();
    }

    public void teamReports(){
        System.out.println("\n - Relatório sobre o time - \n");

        try{
            printEmployees.printEmployeeDetails(systemDatas.getTechinician());
        }catch (NullPointerException e){
            System.out.println("Não existe um técnico cadastrado.");
        }

        for(Player i: systemDatas.getPlayers()){
            printEmployees.printPlayerDetails(i);
        }
        System.out.println();
    }

    public void  generalServicesReports(){
        System.out.println("\n - Relatório sobre serviços gerais - \n");
        for (Person i: systemDatas.getAllEmployees()){
            if(!i.getType().equals("jogador") && !i.getType().equals("técnico")){
                printEmployees.printEmployeeDetails(i);
            }
        }
        System.out.println();
    }

    public void transportReports(){
        System.out.println("\n - Relátorio sobre Ônibus - \n");

        System.out.printf("Existência: ");
        if(systemDatas.getBus().isExist())
            System.out.println("Recurso existente");
        else
            System.out.println("Recurso não existente");

        System.out.printf("Disponibilidade: ");
        if(systemDatas.getBus().isAvailable())
            System.out.println("Disponível");
        else
            System.out.println("Indisponível");

        System.out.println();
    }

    public void trainigCenterReports(){
        System.out.println("\n - Relátorio sobre CT - \n");

        System.out.printf("Existência: ");
        if(systemDatas.getTrainingCenter().isExist())
            System.out.println("Recurso existente");
        else
            System.out.println("Recurso não existente");

        System.out.printf("Disponibilidade: ");
        if(systemDatas.getTrainingCenter().isAvailable())
            System.out.println("Disponível");
        else
            System.out.println("Indisponível");

        System.out.println("Dormitórios: " + systemDatas.getTrainingCenter().getBedroomsNumber());

        System.out.println();
    }

    public void stadiumReports(){
        System.out.println("\n - Relátorio sobre Estádio - \n");

        System.out.printf("Existência: ");
        if(systemDatas.getStadium().isExist())
            System.out.println("Recurso existente");
        else
            System.out.println("Recurso não existente");

        System.out.printf("Disponibilidade: ");
        if(systemDatas.getStadium().isAvailable())
            System.out.println("Disponível");
        else
            System.out.println("Indisponível");

        System.out.println("Capacidade: " + systemDatas.getStadium().getChairsNumber());
        System.out.println("Banheiros: " + systemDatas.getStadium().getBathroomNumber());
        System.out.println("Lanchonetes: " + systemDatas.getStadium().getSnackBarNumber());

        System.out.println();
    }

    public void fanReports(){
        System.out.println("\n - Relatório de Sócio Torcedores - \n");
        System.out.println("Quantidade: " + systemDatas.getFans().size());
        printFans.printAllFans();

        System.out.println();
    }
}

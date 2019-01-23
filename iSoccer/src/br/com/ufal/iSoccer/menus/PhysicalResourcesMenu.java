package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.physicalResources.*;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhysicalResourcesMenu {
    Scanner scanner = new Scanner(System.in);
    Stadium stadium;
    Bus bus;
    TrainingCenter trainingCenter;
    StadiumManagementMenu stadiumManagementMenu;
    BusManagementMenu busManagementMenu;
    TrainingCenterManagementMenu trainingCenterManagementMenu;
    PrintMenus printMenus = new PrintMenus();

    public PhysicalResourcesMenu(Stadium stadium, Bus bus, TrainingCenter trainingCenter) {
        this.stadium = stadium;
        this.bus = bus;
        this.trainingCenter = trainingCenter;
        this.stadiumManagementMenu = new StadiumManagementMenu(stadium);
        this.busManagementMenu = new BusManagementMenu(bus);
        this.trainingCenterManagementMenu = new TrainingCenterManagementMenu(trainingCenter);
    }

    public void resourcesMenu(){
        int option = 0;

        while(option != 4){
            try{
                printMenus.printPhysicalResourcesMenu();
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        stadiumManagementMenu.stadiumMenu();
                        break;
                    case 2:
                        busManagementMenu.busMenu();
                        break;
                    case 3:
                        trainingCenterManagementMenu.trainingCenterMenu();
                        break;
                    default:
                        System.out.println("Escolha apenas entre as opções disponíveis.");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros.");
                scanner.nextLine();
            }
        }
    }
}

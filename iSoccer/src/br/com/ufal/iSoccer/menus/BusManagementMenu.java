package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.BusManagement;
import br.com.ufal.iSoccer.physicalResources.Bus;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusManagementMenu {
    private Scanner scanner = new Scanner(System.in);
    BusManagement busManagement;
    Bus bus;

    public BusManagementMenu(Bus bus) {
        this.bus = bus;
        this.busManagement = new BusManagement(bus);
    }

    public void busMenu(){
        PrintMenus printMenus = new PrintMenus();
        int option = 0;

        while(option != 4){
            try{
                printMenus.printBusManagementMenu();
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        busManagement.checkBusAvailable();
                        break;
                    case 2:
                        busManagement.changeBusExisting();
                        break;
                    case 3:
                        busManagement.changeBusAvailability();
                        break;
                    default:
                        System.out.println("Escolha apenas entre as opções acima.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros. Tente novamente.");
                scanner.nextLine();
            }
        }
    }
}

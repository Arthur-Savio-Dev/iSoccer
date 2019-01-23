package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.StadiumManagement;
import br.com.ufal.iSoccer.physicalResources.*;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StadiumManagementMenu {
    private Stadium stadium;
    private StadiumManagement stadiumManagement;
    private Scanner scanner = new Scanner(System.in);

    public StadiumManagementMenu(Stadium stadium) {
        this.stadium = stadium;
        this.stadiumManagement = new StadiumManagement(stadium);
    }

    public void stadiumMenu(){
        PrintMenus printMenus = new PrintMenus();
        int option = 0;

        while(option != 5){
            try{
                printMenus.printStadiumManagementMenu();
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        stadiumManagement.checkStadiumAvailability();
                        break;
                    case 2:
                        stadiumManagement.changeStadiumExisting();
                        break;
                    case 3:
                        stadiumManagement.changeStadiumAvailability();
                        break;
                    case 4:
                        stadiumManagement.changeResourcesStadiumNumber();
                        break;
                    case 5:
                        stadiumManagement.returnStadiumInformations();
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

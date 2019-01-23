package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.TrainingCenterManagement;
import br.com.ufal.iSoccer.physicalResources.TrainingCenter;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrainingCenterManagementMenu {
    Scanner scanner = new Scanner(System.in);
    PrintMenus printMenus = new PrintMenus();
    TrainingCenter trainingCenter;
    TrainingCenterManagement trainingCenterManagement;

    public TrainingCenterManagementMenu(TrainingCenter trainingCenter) {
        this.trainingCenter = trainingCenter;
        this.trainingCenterManagement = new TrainingCenterManagement(trainingCenter);
    }

    public void trainingCenterMenu() {
        int option = 0;

        while(option != 5){
            try{
                printMenus.printTrainingCenterMenu();
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        trainingCenterManagement.checkTrainingCenterAvailable();
                        break;
                    case 2:
                        trainingCenterManagement.changeTrainingCenterExisting();
                        break;
                    case 3:
                        trainingCenterManagement.changeTrainingCenterAvailability();
                        break;
                    case 4:
                        trainingCenterManagement.printBedroomsNumber();
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

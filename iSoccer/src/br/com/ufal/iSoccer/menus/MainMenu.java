package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.prints.*;
import br.com.ufal.iSoccer.adminsystem.*;

import java.rmi.server.LoaderHandler;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private SystemDatas systemDatas;
    private PrintMenus printMenus = new PrintMenus();;
    private PrintEmployees printEmployees;
    private EmployeeAdmin employeeAdmin;
    private FanAdmin fanAdmin;
    private EmployeeMenuManagement employeeMenuManagement;
    private FanMenuManagement managementFanMenu;
    private PhysicalResourcesMenu physicalResourcesMenu;
    private ReportsMenu reportsMenu;

    public MainMenu(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
        this.printEmployees = new PrintEmployees(systemDatas);
        this.employeeAdmin = new EmployeeAdmin(systemDatas);
        this.fanAdmin = new FanAdmin(systemDatas);
        this.employeeMenuManagement = new EmployeeMenuManagement(systemDatas);
        this.managementFanMenu = new FanMenuManagement(systemDatas);
        this.physicalResourcesMenu = new PhysicalResourcesMenu(systemDatas.getStadium(),
                systemDatas.getBus(), systemDatas.getTrainingCenter());
        this.reportsMenu = new ReportsMenu(systemDatas);
    }

    public void mainMenuControl(){
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while(option != 7){
            printMenus.printMainMenu();
            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        employeeAdmin.receiveDatasAndAddEmployeeToSystem();
                        break;
                    case 2:
                        employeeMenuManagement.employeeManagement();
                        break;
                    case 3:
                        fanAdmin.receieveDatasAndAddFanToSystem();
                        break;
                    case 4:
                        managementFanMenu.fanManagement();
                        break;
                    case 5:
                        physicalResourcesMenu.resourcesMenu();
                        break;
                    case 6:
                        reportsMenu.reportsMenu();
                        break;
                    case 7:
                        LoginMenu loginMenu = new LoginMenu(systemDatas);
                        loginMenu.loginMenuAndValidateAndOpenMainMenu();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números.\n");
                e.getMessage();
                scanner.nextLine();
            }
        }
    }
}

package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.AdminFunctions;
import br.com.ufal.iSoccer.adminsystem.EmployeeAdmin;
import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.prints.PrintEmployees;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMenuManagement {
    private SystemDatas systemDatas;
    private EmployeeAdmin employeeAdmin;
    private PrintEmployees printEmployees;
    private PrintMenus printMenus = new PrintMenus();

    public EmployeeMenuManagement(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
        this.printEmployees = new PrintEmployees(systemDatas);
        this.employeeAdmin = new EmployeeAdmin(systemDatas);
    }

    public void employeeManagement(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 5){
            printMenus.printEmployeeManagementMenu();
            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        printEmployees.printJustEmployeeNameAndType();
                        break;
                    case 2:
                        employeeAdmin.checkExistingAndDeleteEmployee();
                        break;
                    case 3:
                        employeeAdmin.changeEmployeeSalary();
                        break;
                    case 4:
                        employeeAdmin.changePlayerAvailability();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Informe apenas números. Tente novamente!");
                e.getMessage();
            }
        }
    }

}

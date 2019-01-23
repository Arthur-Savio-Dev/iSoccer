package br.com.ufal.iSoccer.menus;

import br.com.ufal.iSoccer.adminsystem.EmployeeAdmin;
import br.com.ufal.iSoccer.adminsystem.FanAdmin;
import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.prints.PrintFans;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FanMenuManagement {
    private SystemDatas systemDatas;
    private PrintFans printFans;
    private PrintMenus printMenus = new PrintMenus();
    private FanAdmin fanAdmin;

    public FanMenuManagement(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
        this.printFans = new PrintFans(systemDatas);
        this.fanAdmin = new FanAdmin(systemDatas);
    }

    public void fanManagement(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 4){
            printMenus.printFanManagementMenu();
            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        printFans.printAllFans();
                        break;
                    case 2:
                        fanAdmin.deleteFan();
                        break;
                    case 3:
                        fanAdmin.changeRateOfAllFanTypes();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números.");
            }
        }
    }
}

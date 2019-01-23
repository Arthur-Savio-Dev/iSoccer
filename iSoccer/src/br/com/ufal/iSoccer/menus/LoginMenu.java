package br.com.ufal.iSoccer.menus;
import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.prints.PrintMenus;

import java.util.Scanner;

public class LoginMenu {
    private SystemDatas systemDatas;

    public LoginMenu(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
    }

    public void loginMenuAndValidateAndOpenMainMenu(){
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(systemDatas);
        String login, password;

        while(true){
            System.out.println("---- Login do Sistema ----");
            System.out.println("Login: ");
            login = scanner.nextLine();
            System.out.println("Senha: ");
            password = scanner.nextLine();
            if(validateDatasToLogin(login, password))
                break;
            else
                System.out.println("Dados incorretos. Tente novamente.");
        }
        mainMenu.mainMenuControl();
    }

    public boolean validateDatasToLogin(String login, String password){
        if(login.equals("admin") && password.equals("123"))
            return true;
        else
            return false;
    }
}

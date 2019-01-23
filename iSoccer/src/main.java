import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.menus.LoginMenu;

public class main {
    public static void main(String [] args){
        SystemDatas systemDatas = new SystemDatas();
        LoginMenu loginMenu = new LoginMenu(systemDatas);
        loginMenu.loginMenuAndValidateAndOpenMainMenu();
    }
}



package br.com.ufal.iSoccer.prints;

import br.com.ufal.iSoccer.adminsystem.SystemDatas;
import br.com.ufal.iSoccer.persons.Fan;

public class PrintFans {
    private SystemDatas systemDatas;

    public PrintFans(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
    }

    public void printAllFans(){
        if(systemDatas.getFans().size() == 0)
            System.out.println("- Não existem sócios associados. - \n");
        else{
            for(Fan i: systemDatas.getFans()){
                printFanDetails(i);
            }
        }
    }

    public void printFanDetails(Fan fan){
        System.out.println("---------------");
        System.out.println("Nome: " + fan.getName());
        System.out.println("E-mail: " + fan.getEmail());
        System.out.printf("Tipo: ");
        switch (fan.getTypeFan()){
            case 1:
                System.out.println("Júnior");
                break;
            case 2:
                System.out.println("Sênior");
                break;
            case 3:
                System.out.println("Elite");
                break;
        }
    }
}

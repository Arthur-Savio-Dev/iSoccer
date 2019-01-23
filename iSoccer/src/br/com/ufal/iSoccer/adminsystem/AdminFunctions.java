package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.persons.Person;
import br.com.ufal.iSoccer.persons.Fan;
import br.com.ufal.iSoccer.adminsystem.*;

import java.util.*;

public class AdminFunctions {
    private SystemDatas systemDatas;

    public AdminFunctions(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
    }

    public ArrayList<String> receiveCommonDatasToPersons(int typePerson){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datas = new ArrayList<>();

        while(true){
            System.out.println("Informe o nome: ");
            datas.add(scanner.nextLine());
            if(typePerson == 1){
                if(checkExistingEmployee(datas.get(0)))
                    System.out.println("Funcionário já existente! Tente novamente.");
                else
                    break;
            }else{
                if(checkExistingFan(datas.get(0)))
                    System.out.println("Torcedor já existente! Tente novamente.");
                else
                    break;
            }
        }
        System.out.println("Informe o CPF: ");
        datas.add(scanner.nextLine());

        System.out.println("Informe o e-mail: ");
        datas.add(scanner.nextLine());

        System.out.println("Informe o telefone: ");
        datas.add(scanner.nextLine());

        return datas;
    }

    public boolean checkExistingEmployee(String name){
        for(Person i: systemDatas.getAllEmployees()){
            if(i.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean checkExistingFan(String name){
        for(Person i: systemDatas.getFans()){
            if(i.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public Person returnEmployee(String name){
        for(Person i: systemDatas.getAllEmployees()){
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }

    public Fan returnFan(String name){
        for(Fan i: systemDatas.getFans()){
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }
}

package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.adminsystem.*;
import br.com.ufal.iSoccer.persons.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FanAdmin {
    private SystemDatas systemDatas;

    public FanAdmin(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
    }

    public void receieveDatasAndAddFanToSystem(){
        AdminFunctions adminFunctions = new AdminFunctions(systemDatas);
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datas = new ArrayList<>();
        double rate = 0;
        int typeFan;

        datas = adminFunctions.receiveCommonDatasToPersons(2);
        typeFan = choiceFanType();

        switch (typeFan){
            case 1:
                rate = 150.00;
                break;
            case 2:
                rate = 225.00;
                break;
            case 3:
                rate = 364.45;
                break;
        }
        Fan newFan = new Fan(datas.get(0), datas.get(1), datas.get(2), datas.get(3),
                0,"Fan", rate, typeFan);

        try{
            systemDatas.getFans().add(newFan);
        }catch (Exception e){
            System.out.println("Erro ao adicionar sócio-torcedor.");
        }
    }

    public int choiceFanType(){
        Scanner scanner = new Scanner(System.in);
        int type;
        while(true){
            System.out.println("Informe o tipo de torcedor: ");
            System.out.println("1 - Júnior, 2 - Sênior, 3 - Elite");
            try{
                type = scanner.nextInt();
                return type;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números. Tente novamente");
                scanner.nextLine();
            }
        }
    }

    public void changeRateOfAllFanTypes(){
        Scanner scanner = new Scanner(System.in);
        int type;
        double value;

        while(true){
            System.out.println("Selecione o tipo: ");
            System.out.println("1 - Júnior, 2 - Sênior, 3 - Elite");
            try{
                type = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números. ");
            }
        }
        while(true){
            System.out.println("Informe o novo valor: ");
            try{
                value = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números separados por vírgula.");
                scanner.nextLine();
            }
        }
        selectTypeToChangeRateValue(type, value);
    }

    public void selectTypeToChangeRateValue(int type, double value){
        switch (type){
            case 1:
                changeJuniorRate(value);
            case 2:
                changeSeniorRate(value);
                break;
            case 3:
                changeEliteRate(value);
                break;
            default:
                System.out.printf("ERRO. Tipo de associado não existente. Tente novamente.");
        }
    }

    public void changeJuniorRate(double value){
        for(Fan i: systemDatas.getFans()){
            if(i.getTypeFan() == 1)
                i.setRateValue(value);
        }
    }

    public void changeSeniorRate(double value){
        for(Fan i: systemDatas.getFans()){
            if(i.getTypeFan() == 2)
                i.setRateValue(value);
        }
    }

    public void changeEliteRate(double value){
        for(Fan i: systemDatas.getFans()){
            if(i.getTypeFan() == 3)
                i.setRateValue(value);
        }
    }

    public void deleteFan(){
        Scanner scanner = new Scanner(System.in);
        AdminFunctions adminFunctions = new AdminFunctions(systemDatas);
        String name;
        Fan fan;

        while(true){
            System.out.println("Informe o nome: ");
            name = scanner.nextLine();
            fan = adminFunctions.returnFan(name);

            if(fan != null){
                systemDatas.getFans().remove(fan);
                break;
            }else{
                System.out.println("ERRO. Não existe um sócio com esse nome. Tente novamente.");
            }
        }
    }
}

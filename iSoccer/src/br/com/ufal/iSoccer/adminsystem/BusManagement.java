package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.physicalResources.Bus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusManagement {
    private Bus bus;

    public BusManagement(Bus bus) {
        this.bus = bus;
    }

    public void checkBusAvailable(){
        if(bus.isExist()){
            if(bus.isAvailable())
                System.out.println("\n - Ônibus disponível para uso - \n");
            else
                System.out.println("\n - Ônibus não disponível para uso - \n");
        }else{
            System.out.println("\n - O time não possui ônibus. - \n");
        }
    }

    public void changeBusExisting(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 1 && option != 2){
            if(bus.isExist()){
                System.out.println("O time possui ônibus. Deseja alterar a existência do recurso ?");
            }else{
                System.out.println("O time não possui ônibus. Deseja alterar esse estado e adicionar o recurso ?");
            }
            System.out.println("1 - Manter, 2 - Alterar");

            try{
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        break;
                    case 2:
                        if(bus.isExist())
                            bus.setExist(false);
                        else
                            bus.setExist(true);
                        break;
                    default:
                        System.out.println("\n - Escolha apenas entre as duas opções. -\n");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros.");
                scanner.nextLine();
            }
        }
    }

    public void changeBusAvailability(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 1 && option != 2){
            System.out.println("Alterar disponibilidade do ônibus: ");
            System.out.println("1 - Disponível, 2 - Não disponível");

            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        bus.setAvailable(true);
                        break;
                    case 2:
                        bus.setAvailable(false);
                        break;
                    default:
                        System.out.println("Escolha apenas entre as duas opções.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros.");
                scanner.nextLine();
            }
        }
    }
}

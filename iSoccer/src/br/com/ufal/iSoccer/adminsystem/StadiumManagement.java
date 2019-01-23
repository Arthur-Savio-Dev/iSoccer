package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.physicalResources.Stadium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StadiumManagement {
    private Stadium stadium;
    private Scanner scanner = new Scanner(System.in);

    public StadiumManagement(Stadium stadium) {
        this.stadium = stadium;
    }

    public void checkStadiumAvailability(){
        if(stadium.isExist()){
            if(stadium.isAvailable())
                System.out.println("\n - Estádio disponível para uso - \n");
            else
                System.out.println("\n - Estádio não disponível para uso - \n");
        }else{
            System.out.println("\n - O time não possui estádio. - \n");
        }
    }

    public void changeStadiumExisting(){
        int option = 0;

        while(option != 1 && option != 2){
            if(stadium.isExist())
                System.out.println("O time possui estádio. Deseja alterar a existência desse recruso?");
            else
                System.out.println("O time não possui estádio. Deseja alterar a existência desse recurso?");
            System.out.println("1 - Manter, 2 - Alterar");

            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        break;
                    case 2:
                        if(stadium.isExist() == true)
                            stadium.setExist(false);
                        else
                            stadium.setExist(true);
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

    public void changeStadiumAvailability(){
        int option = 0;

        while(option != 1 && option != 2){
            System.out.println("Alterar disponibilidade do estádio: ");
            System.out.println("1 - Disponível, 2 - Não disponível");

            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        stadium.setAvailable(true);
                        break;
                    case 2:
                        stadium.setAvailable(false);
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

    public void changeResourcesStadiumNumber(){
        int newChairsValue, newBathroomValue, newSnackBarNumber;

        while(true){
            try{
                System.out.println("Informe o novo número de assentos: ");
                newChairsValue = scanner.nextInt();
                stadium.setChairsNumber(newChairsValue);

                System.out.println("Informe o novo número de banheiros: ");
                newBathroomValue = scanner.nextInt();
                stadium.setBathroomNumber(newBathroomValue);

                System.out.println("Informe o novo número de lanchonetes: ");
                newSnackBarNumber = scanner.nextInt();
                stadium.setSnackBarNumber(newSnackBarNumber);

                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números inteiros.");
                scanner.nextLine();
            }
        }
    }

    public void returnStadiumInformations(){
        System.out.println("------------------------------------------");
        System.out.println("Capacidade máxima do estádio: " + stadium.getChairsNumber());
        System.out.println("Número de banheiros: " + stadium.getBathroomNumber());
        System.out.println("Número de lanchonetes: " + stadium.getSnackBarNumber());
        System.out.println("------------------------------------------");
    }
}

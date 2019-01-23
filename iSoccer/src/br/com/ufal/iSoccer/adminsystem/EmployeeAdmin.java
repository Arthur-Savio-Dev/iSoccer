package br.com.ufal.iSoccer.adminsystem;

import br.com.ufal.iSoccer.persons.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeAdmin {
    private SystemDatas systemDatas;
    private AdminFunctions adminFunctions;

    public EmployeeAdmin(SystemDatas systemDatas) {
        this.systemDatas = systemDatas;
        this.adminFunctions = new AdminFunctions(systemDatas);
    }

    public void receiveDatasAndAddEmployeeToSystem(){
        Scanner scanner = new Scanner(System.in);
        String type, additionalData = new String();
        ArrayList<String> datas = new ArrayList<>();
        double salary;

        datas = adminFunctions.receiveCommonDatasToPersons(1);

        System.out.println("Informe o cargo do funcionário: ");
        type = scanner.nextLine();

        switch (type){
            case "médico":
                System.out.println("Informe o CRM: ");
                additionalData = scanner.nextLine();
                break;
            case "motorista":
                System.out.println("Informe o número de habilitação: ");
                additionalData = scanner.nextLine();
                break;
            case "jogador":
                System.out.println("Informe a posição de jogo: ");
                additionalData = scanner.nextLine();
                break;
        }

        while(true){
            System.out.println("Informe o salário: ");
            try{
                salary = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Informe o salário apenas em números. ");
                scanner.nextLine();
            }
        }
        checkTypeEmployeeAndAddToSystem(datas.get(0), datas.get(1), datas.get(2), datas.get(3),
                type, salary, additionalData);
    }

    public void checkTypeEmployeeAndAddToSystem(String name, String cpf, String email, String tel,
                                                String type, double salary, String additionalData){
        switch (type){
            case "cozinheiro":
                Cooker newCooker = new Cooker(name, cpf, tel, email, salary, type);
                systemDatas.getCookers().add(newCooker);
                systemDatas.getAllEmployees().add(newCooker);
                break;
            case "médico":
                Doctor newDoctor = new Doctor(name, cpf, tel, email, salary, type, additionalData);
                systemDatas.getDoctors().add(newDoctor);
                systemDatas.getAllEmployees().add(newDoctor);
                break;
            case "motorista":
                Driver newDriver = new Driver(name, cpf, tel, email, salary, type, additionalData);
                systemDatas.getDrivers().add(newDriver);
                systemDatas.getAllEmployees().add(newDriver);
                break;
            case "preparador físico":
                PersonalTrainer newPT = new PersonalTrainer(name, cpf, tel, email, salary, type);
                systemDatas.getPersonalTrainers().add(newPT);
                systemDatas.getAllEmployees().add(newPT);
                break;
            case "jogador":
                Player newPlayer = new Player(name, cpf, tel, email, salary, type, additionalData);
                systemDatas.getPlayers().add(newPlayer);
                systemDatas.getAllEmployees().add(newPlayer);
                break;
            case "presidente":
                President newPresident = new President(name, cpf, tel, email, salary, type);
                systemDatas.setPresident(newPresident);
                systemDatas.getAllEmployees().add(newPresident);
                break;
            case "técnico":
                Techinician newTec = new Techinician(name, cpf, tel, email, salary, type);
                systemDatas.setTechinician(newTec);
                systemDatas.getAllEmployees().add(newTec);
                break;
            default:
                System.out.println("Não existe um cargo com essas especificações. Tente novamente.");
                break;
        }
    }
    public void changeEmployeeSalary(){
        Person person = searchForResearcherByName();
        Scanner scanner = new Scanner(System.in);
        double newSalary, oldSalary;

        while (true){
            System.out.println("Informe o novo salário: ");
            try{
                newSalary = scanner.nextDouble();
                oldSalary = person.getSalary();
                person.setSalary(newSalary);
                System.out.println("Salário alterado de R$ " + oldSalary + " para R$ " + newSalary);
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números separados por vírgula.");
                e.getMessage();
            }
        }
    }

    public void checkExistingAndDeleteEmployee(){
        deleteEmployee(searchForResearcherByName());
    }

    public Person searchForResearcherByName(){
        Scanner scanner = new Scanner(System.in);
        String name;
        Person person;

        while(true){
            System.out.println("Informe o nome: ");
            name = scanner.nextLine();
            person = adminFunctions.returnEmployee(name);

            if(person != null){
                return person;
            }else{
                System.out.println("ERRO. Funcionário não existente. Tente novamente!");
            }
        }
    }

    public Player searchAndReturnPlayerByName(String name){
        for(Player i: systemDatas.getPlayers()){
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }

    public void deleteEmployee(Person person){
        String type = person.getType();
        switch (type){
            case "cozinheiro":
                systemDatas.getCookers().remove(person);
                break;
            case "médico":
                systemDatas.getDoctors().remove(person);
                break;
            case "motorista":
                systemDatas.getDrivers().remove(person);
                break;
            case"preparador físico":
                systemDatas.getPersonalTrainers().remove(person);
                break;
            case "player":
                systemDatas.getPlayers().remove(person);
                break;
            case "presidente":
                receiveDatasAndAddEmployeeToSystem();
                break;
            case "técnico":
                receiveDatasAndAddEmployeeToSystem();
                break;
        }
        systemDatas.getAllEmployees().remove(person);
    }

    public void changePlayerAvailability(){
        Scanner scanner = new Scanner(System.in);
        Player player;
        String name;

        System.out.println("Informe o nome: ");
        name = scanner.nextLine();

        player = searchAndReturnPlayerByName(name);
        if(player == null)
            System.out.println("Jogador não existente.");
        else{
            if(player.isAvailable()){
                System.out.println("O jogador estava apto. Seu estado agora é: INAPTO");
                player.setAvailable(false);
            }else{
                System.out.println("O jogador estava inapto. Seu estado agora é: APTO");
                player.setAvailable(true);
            }
        }
    }
}

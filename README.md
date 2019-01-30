# iSoccer

## Funcionalidades

### Gerenciar Funcionários
O sistema permite que o administrador possa gerenciar os funcionários com os métodos de adicionar e deletar o funcionário ao sistema, alterar o salário de um funcionário, mudar a disponibilidade de um jogador e listar todos os funcionários. 

### Gerenciar Sócio Torcedores
A gerência dos torcedores permite além das funções básicas de adicionar e deletar ao sistema, listar todos os torcedores,  alterar o tipo de sócio (júnior, sênior, master) e alterar o valor de contribuição dos tipos de sócio.

### Gerência de Estádio
O sistema permite a verificação da existência e disponibilidade desse recurso, bem como alterá-las. Poderá ser solicitado informações a respeito dos recursos do estádio e edição da quantidade de banheiros, assentos e lanchonetes. 

### Gerência do Ônibus
O sistema irá permitir a verificação de existência e disponibilidade do recurso. Também será possível alterá-la.

### Gerência do Centro de Treinamento
Permite a verificação de sua existência e disponibilidade. Além de alterá-las, o sistema possibilita alterar o número de dormitórios. 

### Relatório sobre Funcionários
O sistema irá listar todos os funcionários do time, informando seus dados: nome, profissão, e-mail, telefone e, se preciso, dados específicos.

### Relatório do Time
O sistema informará o técnico do time seguido da lista de jogadores, se estão aptos a jogar e suas devidas posições.

### Reatório dos Torcedores
Será informado todos os torcedores, seu tipo e seus detalhes.

### Relatório dos Recursos Físicos
O sistema irá informar os detalhes sobre os recursos físicos: Estádio, Centro de Treinamento, Ônibus. Suas disponibilidades e existência também serão informados.

### Relatório Geral
O sistema irá gerar um relatório geral contendo todos os outros sub-relatórios. 

## Classes
### Person
> Motivação: Armazenar dados comuns a todos as classes que extendem o tipo pessoa

> Solução: Criar uma classe que tenha atributos comuns à pessoa. Ex: nome, cpf, e-mail.

> Vantagem: Evitar o uso de duplicação de código. Agora as subclasses apenas armazenam dados específico.

### Cooker - Lawyer - Personal Trainer - Techinician - President - Doctor - Driver - Player - Fan
> Motivação: Extender um novo tipo espcífico de pessoa.

> Solução: Criar uma nova classe com o tipo exigido.

> Vantagem: Poder armazenar dados específicos utilizando conceitos de POO. Possibilitando maior facilidade de manutenção do código e agilidade para encontrar possíveis bugs.

> Desvantagem: Maior número de classes no sistema. 

### AdminFunction
> Motivação: Agrupar todos os métodos para consultas gerais e gerenciamento de dados que sejam comuns entre os tipos que extendem Person. 

> Solução: Criada uma classe contendo métodos de consulta(checkExistingEmployee, checkExistingFan), 
>retornos(returnEmployee, returnFan) e métodos reutilizáveis para receber dados comuns.

> Vantagem: Classes desse tipo possibilitam menores métodos, melhor manutenção do código, evitam repetição de código.
>seu atributo é utilizado pela maioria dos métodos da própria classe.

### EmployeeAdmin
> Motivação: Organizar os métodos que fazem gerência dos funcionários do time.

> Solução: Criar classe que agrupe os métodos para realizar esta operação. Seus métodos permitem receber os dados específicos de cada tipo de funcionário (caso precise), adicionar, deletar, alterar alguns atributos e alterar estado de alguns tipos.

> Vantagem: Seus atributos são muito usados pelo métodos da classe obedecendo um padrão de Clean Code. Separados em  uma classe específica, sua manutenção é mais fácil. 

> Desvantagem: Poderia ser ainda mais refatorado. Alguns métodos são longos.

###  FanAdmin
> Motivação: Organizar os métodos que gerenciam os sócio torcedores do time.

> Solução: Criar uma classe que contenha os métodos necessários a todos os requisitidos de gerenciamento de um sócio. Lá estão métodos que alteram as contribuições, tipo de torcedor, deleta e adiciona ao sistema.

> Vantagem: Facilitar o uso desses métodos. Desse jeito, eles podem ser facilmente acessados, refatorados e entendidos.

### BusManagemet - StadiumManagement - TrainingCenterManagement
> Motivação: Organizar os métodos que fazem gerência dos recursos físicos do time.

> Solução: Classes específicas para tratar os dados dos recursos físicos, como verificar disponibilidade, alterar seu estado e gerenciar os recursos de cada recurso físico, como o número de assentos, no caso do estádio.

> Vantagem: Atributos muito bem usados pelos métodos da própria classe. Facilita manutenção de código e usabilidade.

### SystemDatas
> Motivaçao: Armazenar todos os dados do sistema em um único lugar.

> Solução: Criar uma classe que contenha todos os dados do sistema. 

> Vantagem: Atributos acessíveis de um único lugar para evitar que hajam muitas classes contendo os dados do sistema, aumentando o número de instâncias nas classes que fossem reutilizá-la. 

### Bus - TrainingCenter - Stadium
> Motivação: Representar os recursos como objetos, a fim de ter seus atributos específicos organizados.

> Solução: Criar uma classe que representasse cada recurso.

> Vantagem: Organizar os dados separados é uma boa maneira de manter o código mais legível e manusável. 

### LoginMenu
> Motivação: Organizar e administrar o login do usuário. 

> Solução: Criar uma classe que trate do login com seus métodos.

> Vantagem: Organização e maior facilidade de manutenção.

### MainMenu
> Motivação: Organizar e administrar o menu principal. 

> Solução: Criar uma classe para tratar do switch de controle, chamando a partir dele os métodos de outras classes.

> Vantagem: Os métodos de outras classes podem ser acessados a partir de um único método de gerência do menu, facilitando a manutenção e usabilidade.

### ReportsMenu
> Motivação: Manter a gerência dos relatórios em um só lugar.

> Solução: Criar uma classe para administrar a demanda dos relatórios atraveś de um menu. 

> Vantagem: A classe possui todos os métodos necessários para emitir relatórios.

### BusManagementMenu - StadiumManagementMenu - TrainingCenterManagementMenu
> Motivação: Ter um menu para administrar os recursos físicos.

> Solução: Criar uma classe para cada recurso físico, contendo o menu de gerência para cada um. 

> Vantagem: Separar a gerência dos recursos físicos do menu principal facilita o uso do sistema, manutenção do código.

### EmployeeMenu
> Motivação: Gerenciar os métodos que fazem a gerência dos funcionários.

> Solução: Uma classe contendo o switch de controle das funcionalidades que gerenciam os funcionários. 

> Vantagem: Todos os atributos são utilizados pelo método. Organização de código.

### FanMenu
> Motivação: Gerenciar os métodos que fazem a gerência dos sócio torcedores.

> Solução: Uma classe contendo o switch de controle das funcionalidades que gerenciam os sócio torcedores. 

> Vantagem: Todos os atributos são utilizados pelo método. Organização de código.

### PrintEmployees - PrintFans
> Motivação: Organizar em um único lugar os métodos de print dos funcionários/sócio torcedores.

> Solução: Criar uma classe que cotenha todos os métodos úteis para prints. Métodos para printar todos os detalhes, detalhes específicos.

> Vantagem: Desafoga a responsabilidade de outras classes que por acaso tivessem de utilizar desses prints. Organizado numa classe só, a facilidade de uso e manutenção são maiores.

### PrintMenus
> Motivação: Agregar em um único lugar os prints dos menus.

> Solução: Criar uma classe que contenha os métodos de prints para cada menu do sistema. 

> Vantagem: Organização e melhoria na manutenção.

## Distribuição dos Métodos
|Método                |Classe                     |Motivo da distruibuição                 |
|----------------------|---------------------------|----------------------------------------|
|receiveCommonDatasToPersons | AdminFunctions | Método de adminstração comum para adição |
|checkExistingEmployee | AdminFunctions | Método de adminstração comum para funcionários |
|checkExistingFan      | AdminFunctions | Método de adminstração comum torcedores |
|returnEmployee        | AdminFunctions | Método utilizado por outro método da classe |
|returnFan             | AdminFunctions | Método utilizado por outro método da classe |
|checkBusAvailable | BusManagement | Consultar dados referente à disponibilidade do ônibus |
|changeBusExisting | BusManagement | Consultar dados referente à existência do ônibus
|changeBusAvailability | BusManagement | Mudança nos atributos do ônibus |
|receiveDatasAndAddEmployeeToSystem | EmployeeAdmin | Receber dados para funcionários |
|checkTypeEmployeeAndAddToSystem | EmployeeAdmin | Checar o tipo para poder adicionar à lista certa 
|changeEmployeeSalary | EmployeeAdmin | Método para gerenciar atributo de funcionário |
|checkExistingAndDeleteEmployee | EmployeeAdmin | Método para gerenciar instância de funcionário
|searchForResearcherByName | EmployeeAdmin | Método para retornar funcionário | 
|searchAndReturnPlayerByName | EmployeeAdmin | Método para retornar jogador |
|deleteEmployee | EmployeeAdmin | Método para gerenciar instância de funcionário |
|changePlayerAvailability | EmployeeAdmin | Método para gerenciar instância de funcionário |
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|
|

## Tratamento de Exceções
* Try/Catch: Uso principal para captar erros quando o usuário informar valores diferentes do esperado para uma determinada entrada. 
Ex:
```java
// Exemplo do uso do Try/Catch com a exceção InputMismatchExeption

System.out.println("Selecione o tipo: ");
            System.out.println("1 - Júnior, 2 - Sênior, 3 - Elite");
            try{
                type = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO. Informe apenas números. ");
}
```
Também utilizado quando tentar acessar objetos nulos.
Ex:
```java
// Exemplo do uso do Try/Catch com a exceção NullPointerException

try{
      printEmployees.printEmployeeDetails(systemDatas.getTechinician());
    }catch (NullPointerException e){
      System.out.println("Não existe um técnico cadastrado.");
}
```


## Herança
> Motivação: Utilizar os conceitos de POO e permitir que novos tipos possam ser criados, se adaptando ao sistema. 

> Solução: Criar uma Classe Person, contendo os atributos comuns aos tipos e extender ela às várias subclasses. 

> Vantagem: Organização e melhor facilidade de manutenção.

Ex: 
```java

// Exemplo do uso de Herança e como ela facilita a manutenção do sistema.
//Note que a subclasse apenas armazena o dados específico para o médico. 

package br.com.ufal.iSoccer.persons;

public class Doctor extends Person{
    private String crm;

    public Doctor(String name, String cpf, String tel, String email, double salary, String type,
                  String crm) {
        super(name, cpf, tel, email, salary, type);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
```


```java
package br.com.ufal.iSoccer.persons;

public class Driver extends Person{
    private String enabling;

    public Driver(String name, String cpf, String tel, String email, double salary, String type,
                  String enabling) {
        super(name, cpf, tel, email, salary, type);
        this.enabling = enabling;
    }

    public String getEnabling() {
        return enabling;
    }

    public void setEnabling(String enabling) {
        this.enabling = enabling;
    }
}
```
## Extensibilidade
> O sistema possui uma extensibilidade das classes: SystemDatas, Person, EmployeeAdmin. Segue os exemplos de alguns trechos onde ocorreram essa extensibilidade.

```java
public boolean checkExistingEmployee(String name){
        for(Person i: systemDatas.getAllEmployees()){
            if(i.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
```

```java

    public boolean checkExistingFan(String name){
        for(Person i: systemDatas.getFans()){
            if(i.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
```


```java
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
```

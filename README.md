# iSoccer

## Funcionalidades
* Permite adicionar/deletar funcionários
* Permite adicionar/deletar sócio torcedores
* Gerenciar salários, aptadão dos jogadores
* Gerenciar os recursos físicos (Ônibus, Estádio, Centro de Treinamento)
* Gerar relatórios sobre os recursos
* Gerar relátorios sobre os funcionários e sócio torcedores

## Classes
### Person
> Motivação: Armazenar dados comuns a todos as classes que extendem o tipo pessoa

> Solução: Criar uma classe que tenha atributos comuns à pessoa. Ex: nome, cpf, e-mail.

> Vantagem: Evitar o uso de duplicação de código. Agora as subclasses apenas armazenam dados específico.

## Cooker - Lawyer - Personal Trainer - Techinician - President - Doctor - Driver - Player - Fan
> Motivação: Extender um novo tipo espcífico de pessoa.

> Solução: Criar uma nova classe com o tipo exigido.

> Vantagem: Poder armazenar dados específicos utilizando conceitos de POO. Possibilitando maior facilidade
>de manutenção do código e agilidade para encontrar possíveis bugs.

> Desvantagem: Maior número de classes no sistema. 

## AdminFunction
> Motivação: Métodos para consultas gerais entre os tipos que extendem Person (nessa situação, apenas dois: Person e Fan) e >recebimento de dados comuns aos dois
>para adição dos mesmos no sistema.

> Solução: Criada uma classe contendo métodos de consulta(checkExistingEmployee, checkExistingFan), 
>retornos(returnEmployee, returnFan) e método reutilizável para receber dados comuns.

> Vantagem: Classes desse tipo possibilitam menores métodos, melhor manutenção do código, evitam repetição de código.
>seu atributo é utilizado pela maioria dos métodos da própria classe.

## EmployeeAdmin - FanAdmin
> Motivação: Organizar os métodos que fazem gerência dos funcionários.

> Solução: Criar classes específicas para isso. Seus métodos permitem receber os dados específicos de cada tipo, caso precise, >adicionar, deletar, alterar alguns atributos e alterar estado de alguns tipos.

> Vantagem: Seus atributos são muito usados pelos próprios métodos da classe obedecendo um padrão de Clean Code. Separados em  uma classe específica, sua manutenção é mais fácil. 

> Desvantagem: Poderia ser ainda mais refatorado. Alguns métodos são longos.

## BusManagemet - StadiumManagement - TrainingCenterManagement
> Motivação: Organizar os métodos que fazem gerência dos recursos físicos do time.

> Solução: Classes específicas para tratar os dados dos recursos, como verificar disponibilidade e alterar seu estado.

> Vantagem: Atributos muito bem usados pelos métodos da própria classe. Facilita manutenção de código.

## SystemDatas
> Motivaçao: Armazenar todos os dados do sistema em um único lugar.

> Solução: Criar uma classe com as listas dos funcionários, separados por tipos, sócio torcedores, dados dos recursos físicos.

> Vantagem: Atributos acessíveis de um único lugar para evitar que hajam muitas instâncias de classes que possam conter dados em outras classes. Dessa maneira há apenas uma instância.

## Bus - TrainingCenter - Stadium
> Motivação: Representar os recursos como objetos, a fim de ter seus atributos específicos organizados.

> Solução: Criar uma classe que representasse cada recurso.

> Vantagem: Organizar os dados separados é uma boa maneira de manter o código mais legível e manusável. 

## LoginMenu
> Motivação: Organizar e administrar o login do usuário. 

> Solução: Criar uma classe que trate do login com seus métodos.

> Vantagem: Organização.

## MainMenu
> Motivação: Organizar e administrar o menu principal. 

> Solução: Criar uma classe para tratar do switch de controle. Chamando a partir dele os métodos de outras classes.

> Vantagem: Organização.

> Desvantagem: Sem o print do menu por perto, fica pouco complicado o que significa cada case. Mas os nomes dos métodos podem ajudar.

## ReportsMenu
> Motivação: Manter a gerência dos relatórios em um só lugar.

> Solução: Criar uma classe para administrar a demanda dos relatórios atraveś de um menu e métodos.

> Vantagem: Organização.

> Desvantagem: Repetição de prints e métodos de controle na mesma classe que a de gerênciar o menu.

## BusManagementMenu - StadiumManagementMenu - TrainingCenterManagementMenu
> Motivação: Criar um menu para administrar recrusos e disponibilidades dos recursos físicos do time.

> Solução: Criar uma classe para cada recurso físico, contendo o menu de gerência para cada um. 

> Vantagem: Organização.

## EmployeeMenu
> Motivação: Criar um menu que pudesse gerenciar todas as funcionalidades de adminstração dos funcionários.

> Solução: Uma classe contendo o switch de controle das funcionalidades. 

> Vantagem: Todos os atributos são utilizados pelo método. Organização de código.

## FanMenu
> Motivação: Criar um menu que pudesse gerenciar todas as funcionalidades de adminstração dos sócio torcedores.

> Solução: Uma classe contendo o switch de controle das funcionalidades. 

> Vantagem: Todos os atributos são utilizados pelo método. Organização de código.

## PrintEmployees
> Motivação: Organizar em um único lugar os métodos de print dos funcionários.

> Solução: Criar uma classe que cotenha todos os métodos úteis para prints. Métodos para printar todos, específicos, detalhes dos >funcionários.

> Vantagem: Organização.

## PrintFans
> Motivação: Organizar em um único lugar os métodos de print dos sócio torcedores.

> Solução: Criar uma classe com os métodos úteis para os prints dos relatórios sobre os torcedores. 

> Vantagem: Organização.

## PrintMenus
> Motivação: Separar os prints das classes de controle para facilitar o uso e manutenção.

> Solução: Criar uma classe que contenha os métodos de prints para cada menu do sistema. 

> Vantagem: Organização e melhori na manutenção.

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


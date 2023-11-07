-- Exercício proposto

1. Construa uma aplicação usando Spring Boot com interface web 
(OK)

2. Desenvolva as classes Funcionário, Cargo e Associado. 
   a) Model
(OK)

3. Construa as seguintes classes para Funcionário e Cargo:
   a) Controle            
   b) Repositório
   c) Serviços
(OK)

4. Construa as respectivas páginas para manipular os dados de Funcionário e Cargo:
   a) Listar
   b) Incluir
   c) Alterar
(OK)

5. Grave as informações no banco de dados MySql.

6. Escolha o nome que você achar mais adequado para o banco de dado
(OK)

7. Ao definir as classes como Entidades, atribua um nome de tabela para cada classe com a inicial "TB_" 
(OK)

8. Os atributos indicados como <<chave primária>> deverão ser de autoincremento, controlado pelo servidor de banco de dados MySql.
(OK)

9. Todos os atributos das classes são obrigatórios.
(OK)

10. Defina os tamanhos dos atributos das tabelas de forma que os atributos do tipo String não sejam maiores que 30 caracteres.
(OK)

11. Os controladores devem possuir os seguintes mapeamentos

get :
Classe/listar; 
(OK) 
Classe/inserir; 
(OK)
Classe/editar(int id)

post:
Classe/novo(Classe objeto); 
Classe/atualizar(int id; Classe objeto)

* onde Classe deve ser trocado pelo nome da classe que será manipulada.

-- Arquivos base:
introducaospring
heranca_br_singleTable ou heranca_br

    Explicação do professor:

1. controller - responde solicitações http
2. service - regras bd
3. repository - indicar as classes de utilização do repositorio padrão
4. model - definição dos campos da tabela (por classe)



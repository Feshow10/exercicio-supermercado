# Exercício do Supermercado (JAVA / SpringFramework)

Uma rede de Super Mercados está expandindo a sua rede de lojas e por causa disso os gerentes regionais precisam ter um controle dos estoques de cada unidade. 

Hoje esse controle é feito através de planilhas compartilhadas via e-mail todos os dias às 08:00. Como a planilha não tem atualização em tempo real, a rede tem dificuldades de transferir produtos entre as unidades, gerando desasbatecimento de alguns produtos.

Como solução, a rede decidiu construir um sistema Web, pois os gerentes regionais terão os dados em tempo real e não será necessário instalar nenhum software nos computadores.

O projeto foi divido em quatro etapas:
1) Cadastro e listagem das unidades;
2) Alteração e desativação de unidades;
3) Cadastro de produtos e listagem de produtos das unidades;
4) Alteração e desativação de produtos em uma unidade;

ETAPA 1
Crie dois serviços Web em um projeto Spring Boot. Um serviço deverá cadastrar as unidades da rede do Super Mercado e o outro serviço deverá listar a unidades cadastradas.

- SERVIÇO DE CADASTRO DE UNIDADES
Obrigatório:
1) O endpoint do serviço deverá respeitar o padrão Restfull;
2) O serviço de cadastro deverá receber APENAS uma unidade por requisição;
3) A unidade da rede deverá ter os seguintes atributos: nome, endereço, número do endereço, complemento do endereço, CEP e volume máximo (em M3 - metros cúbicos) do estoque;
4) O valor MÍNIMO do volume máximo do estoque deverá ser 1.000,00;
5) O valor MÁXIMO do volume máximo do estoque deverá ser 99.999,99;
6) Os seguintes campos são obrigatórios: nome, endereço, número do endereço, CEP e volume máximo do estoque. Valores null ou com apenas espaços (exemplo: "      ") não deverão ser aceitos;
7) O serviço deverá aceitar APENAS payloads com JSON. Não será aceito XML;
8) Caso alguma regra de validação dos itens 4, 5 e 7 seja violada, o serviço web deverá devolver response com status 400 (Bas Request) com um JSON que deverá ter os seguintes atributos: dataHora (data e hora do ocorrido), 
mensagem (mensagem de erro de validação correspondente à regra violada);
9) Caso o cadastro seja realizado com sucesso, o response deverá ter status 201 (Created) e nada no body;

Opcional:
1) O valor do volume máximo do estoque deverá ter até duas casas decimais;
2) O valor do campo dataHora do payload do response de erro com status 400 deverá ter estar no seguinte formato: yyyy-MM-dd'T'hh:mm:ss.SSS (ano-mês-dia'T'hora:minuto:segundo.milisegundos);
3) O valor do campo dataHora do payload do response de erro com status 400 deverá devolver o timestamp no fuso-horário +0 ao invés de -3:00 (Horário de Brasília);
4) O payload de response de erro com status 400 deverá ter o atributo path, que receberá a URI (path) do serviço chamado;
5) Caso o cadastro seja realizado com sucesso, o response deverá ter o header location, que deverá ter a URI do recurso criado;

-------------------------------------------------------------------

- SERVIÇO DE LISTAGEM DE UNIDADES
Obrigatório:
1) O endpoint do serviço deverá respeitar o padrão Restfull;
2) O serviço deverá devolver TODAS as unidades cadastradas;
3) Caso não haja nenhum problema na consulta, o response deverá ter status 200 (OK);
4) O serviço deverá devolver um JSON no body do response;
5) O serviço NÃO poderá devolver diretamente um array com as unidades. Esse array deverá estar dentro de do atributo unidades e esse atributo deverá estar dentro do objeto que será devolvido no body do response;
6) O array de unidades deverá ter objetos, onde cada um deverá ter os seguintes atributos: id (ID do registro no banco de dados), nome, endereço, número do endereço, complemento do endereço, CEP e volume máximo do estoque;

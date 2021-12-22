# Teste-BackEnd

 Teste backend para o processo seletivo para a vaga de desenvolvedor junior.
 
 O projeto foi desenvolvido em Java 8, com o framework SpringTools, utilizando a API REST para a insercao dos dados, podendo ser alterado ou deletado.
 
 O resultado do calculo de rentabilidade se encontra na variavel montanteFinal da classe CalculoRentabilidade.

 A aplicacao pode ser testada atraves do Swagger pelo navegador ou atraves do Postman. 

Para testar:
- Baixar o STS e o Xampp (este para subir o banco de dados);
- Apos instala-los, fazer um git clone do projeto https://github.com/RodrigoLazaro14/Teste-BackEnd.git
- Importar o projeto para o STS;
- Abrir o Xampp-control e subir o Apache e o MySql;
- Na classe princial do projeto, botão direito> Run As> Java Aplication;
- No navegador abrir a seguinte url: http://localhost:8080/swagger-ui.html#/
- Expandir o dropdown calculo-rentabilidade-controller;
- Primeiramente para adicionar um novo investimento, clicar no botão POST> Try it out> Editar os campos conforme os valores desejados> Execute;
- Logo após fazer o execute, a aplicação salvará no banco de dados as informações e em seguida trará as informações já com o calculo de rentabilidade aplicado, onde o resultado final estará salvo na variável montanteFinal;
- Caso queira editar o investimento utilize o botão POST, e repita os passos anteriores;
- Para buscar todos os investimentos, utilize o ultimo botão GET com a descrição "Retorna uma lista de investimentos com resultado do calculo de rentabilidade" e clique em Try it out> Execute;
- Para buscar um investimento em específico a partir do nome, utilize o primeiro GET com a descrição "Busca u;m investimento pelo nome", clique em Try it out, digite o nome desejado (lembrando que deve ser um nome de algum investimento já cadastrado no banco) e clique em executar;
- Para deletar um investimento, clique no botão DELETE> Try it out> Editar os campos conforme os valores do investimento que você desejada deletar> Execute.

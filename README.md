
Estrutura do projeto Teste Automação Loja em formato BDD Cucumber

Utilização da linguagem Java

Passo a passo da instalação:

Baixe o projeto e descompacte
Abra o IntelliJ IDEA
Clique em Import Project
Identifique o caminho do projeto baixado
Selecione import project from external model > escolha maven > selecione import Maven project automatically > next > ok > next > finish.


Agora com a IDE aberta, siga pelos diretórios: src>test>java>com.testeautomacao>runner>TestRunner e execute o teste através dessa classe.

Obs.: Atentar para o comportamento e BDD das classes dentro dos pacotes features(ComprarProdutoLoja.feature) e steps (ComprarProdutoLoja).

Os objetos são mapeados nas classes do diretorio "PAGEOBJECTS", as suas ações e comportamentos são executado na "TASKS" e as suas validações no "VERIFICATIONPOINTS"

 - A classe STEPS instancia e chama as ações das classes "TASKS" para executar o comportamento definido nas FEATURES
 
 Se houver qualquer problema no projeto, verifique as dependências nos arquivos POM.XML
 
 O teste foi rodado no Chrome browser.



Esse projeto foi feito utilizando:

IDE: IntelliJ IDEA 2019.2.3 (ULTIMATE EDITION)
JAVA VERSION: jdk1.1.8.0_221
APACHE MAVEN VERSION: 3.6.1

O desafio contempla o cenário:

Caso de teste: realizar uma compra com sucesso.
1.              Acessar o site: www.automationpractice.com.
2.              Escolha um produto qualquer na loja.
3.              Adicione o produto escolhido ao carrinho.
4.              Prossiga para o checkout.
5.              Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo.
6.              Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.
7.              Valide se o endereço está correto e prossiga.
8.              Aceite os termos de serviço e prossiga.
9.              Valide o valor total da compra.
10.          Selecione um método de pagamento e prossiga.
11.          Confirme a compra e valide se foi finalizada com sucesso.






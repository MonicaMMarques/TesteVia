#Author: your.email@your.domain.com
#Author: your.email@your.domain.com#Keywords Summary :

Feature: Adiconar produto no carrinho
Cmo usuario quero acessar o site para adicionar dois produtos no carrinho de compras
  
  Scenario: Adicionar produto no carrinho
    Given que eu esteja na url "http://lojaebac.ebaconline.art.br"
    When clicar em comprar
    And selecionar os produtos desejados
    And adiciono-os no carrinho de compras
    Then URL validada com sucesso


# Teste Mobile
Esta pasta contém os arquivos do Teste Mobile.


PROJETO: Exercícios Práticos - ITEM 3
CURSOS: Início Rápido em Teste de Software
APLICATIVO ALVO: icarros - Versão 4.19.3

                               -ESPECIFICAÇÕES DO AMBIENTE DE TESTE-
------------------------------------------------------------------------------------------------------------
- 1 - Sistema Operacional: Linux Fedora 31
- 2-  IDE: IntelliJ IDEA 2020.1.2 Build #IC-201.7846.76, built on June 1, 2020
- 3-  Test Automation Framework: Appium 1.17.1-1 (Node.js 12.8.1 Electron 7.2.4)
- 4 - Browser : Google Chrome Versão 83.0.4103.61 (Versão oficial) 64 bits
- 5 - Android Studio:Android Studio 4.0 Build #AI-193.6911.18.40.6514223, built on May 20, 2020
- 6 - Android Version: 8.1 Oreo API Level 27 System Image x86_64 / 9.0 Pie API Level 28 System Image x86_64
- 7 - JUnit version : 4.12
- 8 - Gradle version: 7.0
- 9 - Json-simple version: 1.1.1

------------------------------------------------------------------------------------------------------------
Versão do Teste : v1.0


O script `Mytest.java` é responsável por fazer a consulta de 4 carros com os seguintes filtros:
- Marca: Jeep
- Modelo: Renegade
- Ano mínimo: 2016
- Ano máximo: 2017
- Preço mínimo: R$ 54 mil
- Preço máximo: R$ 54 mil  

Ao fazer a consulta, os dados (marca, modelo, ano, km, cor, câmbio e preço) são coletados e gravados no arquivo `carros.json` e depois compara os dados presentes no site com os dados no arquivo.
Obs.: É necessário ter o arquivo `carros.json` na estrutura do projeto.

Para executá-lo via IDE: run `Mytest.java`

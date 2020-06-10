# Teste Web
Esta pasta contém os arquivos do teste web.
Os scripts foram feitos em python, usando as seguintes dependências:  
- `selenium 3.141.0`
- `Python 3.7.7`
O browser utilizado pelo selenium é o Google Chrome, na versão `83.0.4103.61`.

O script `consultor.py` é responsável por fazer a consulta de 4 carros com os seguintes filtros:
- Marca: Jeep
- Modelo: Renegade
- Ano mínimo: 2016
- Ano máximo: 2017
- Preço mínimo: R$ 60 mil
- Preço máximo: R$ 70 mil  
Ao fazer a consulta, os dados (marca, modelo, ano, km, cor, câmbio e preço) são coletados e gravados no arquivo `carros.json`

Para executá-lo via cli: `python3 consultor.py`

O script `test.py` é responsável por ler o arquivo gravado anteriormente `carros.json`, e fazer uma nova consulta, e compara os dados presentes no site com os dados no arquivo.

Para executá-lo via cli: `python3 test.py -v`

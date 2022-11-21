# alticci-api
________________________________________________________________________________________________________________________________

### API REST do cálculo com Swagger-ui. Disponível em: https://alticci-api.herokuapp.com/swagger-ui.html

### Método GET - Api para listar todos os indices com cálculos: https://alticci-api.herokuapp.com/alticci

### Método GET - Api para listar um único indice e retornando o cálculo: https://alticci-api.herokuapp.com/alticci/{index}

### Método POST - Api para calcular um indice e retorna o valor, salvando em banco: https://alticci-api.herokuapp.com/alticci/
__________________________________________________________________________________________________________________________________

# Docker

## Gerar a imagem doccker
### mvn clean package
### docker build  -t alticci:1.0.0 .
### docker run --name alticci -p 8080:8080  -d alticci:1.0.0



## AlkeParking Exercicio | Integrador Android BootCamp Android
### Desenvolvedores: [Lucas Petzinger](https://github.com/lpetzinger) e [Oryange Strifezze](https://github.com/oryangestrifezze)
#### Todo o projeto foi executado em formato de Pair Programming, com finalidade de consolidar os conhecimentos adquiridos ao longo do primeiro módulo do Bootcamp de Android.

###AlkeParking
É um estacionamento que permite estacionar diversos tipos de veículos (carro, motocicleta, micro-ônibus e ônibus) com capacidade máxima de 20 veículos.

###Requisitos do Sistema
- Quando um veículo vai entrar no estacionamento a placa e o tipo são inseridos, sendo verificado que não haja outro veículo com a mesma placa no estacionamento.

- Quando um veículo vai ser retirado, é cobrada uma tarifa determinada pelos seguintes regulamentos.

- As primeiras 2 horas do estacionamento terão um custo fixo determinado pelo tipo de veículo (carro: $20, motocicleta: $15,
micro-ônibus: $25, ônibus: $30).
  
    Veículo   | Taxa
  --------- | ------
  Carro         | 20
  Motocicleta   | 15
  Micro-Ônibus  | 25
  Ônibus        | 30
  
- Após as primeiras 2 horas, serão cobrados $5 por cada 15 minutos ou fração, independentemente do tipo de veículo.

- Os veículos podem (opcionalmente) ter um cartão de desconto, o que reduz em 15% a tarifa total do estacionamento.

- Os valores das tarifas não têm que incluir centavos; em caso de tê-los devem ser descartados.

- A pedido da administração do AlkeParking, deve ser mantido um registro do número total de veículos retirados do estacionamento, juntamente com o total dos ganhos recebidos.

- A administração poderá solicitar a qualquer momento a relação das placas
dos veículos que estiverem no estacionamento.
  
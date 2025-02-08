

# Factory Method 
Objetivo : Aumentar a expressividade do código, substituindo chamadas para construtores com métodos que revelam melhor suas intenções.


## Prós
Você evita acoplamentos firmes entre o criador e os produtos concretos.

Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.

Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.


## Contras
O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.
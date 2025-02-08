

# Builder 
Objetivo : Simplificar a criação de objetos complexos, segregando representação e lógica de construção

### Product
A classe product define o tipo do objeto complexo que deve ser gerado pelo padrão do construtor.

### Builder
Esta classe abstrata que define todas as etapas que devem ser executadas para criar corretamente um produto. O método GetProduct é usado para devolver o produto final. A classe builder geralmente pode ser substituída por uma interface simples.

### ConcreteBuilder
Poderão haver várias classes de builder concretas herdadas do builder ou que implementam a interface builder (no caso de criar uma interface ao invés de classe abstrata). Essas classes contêm a funcionalidade para criar um produto complexo específico.

### Director
A classe director controla o algoritmo que gera o objeto do produto final. Um objeto director é instanciado e seu método Builder é chamado. O método inclui um parâmetro para capturar o objeto específico do ConcreteBuilder que deve ser usado para gerar o produto. O director chama os métodos do ConcreteBuilder na ordem correta para gerar o objeto do produto. Na conclusão do processo, o método GetProduct do objeto builder pode ser usado para retornar o produto final.


## Prós
Você pode construir objetos passo a passo, adiar etapas de construção ou executar etapas recursivamente.
Você pode reutilizar o mesmo código de construção ao criar várias representações de produtos.
Princípio de responsabilidade única . Você pode isolar o código de construção complexo da lógica de negócios do produto.


## Contras
A complexidade geral do código aumenta, pois o padrão requer a criação de várias novas classes.
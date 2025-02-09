

# Factory Method 
Objetivo: Garantir que uma classe tenha apenas uma instância e fornecer um ponto de acesso global a essa instância.

## Prós
Controle de instância única: O padrão Singleton garante que exista apenas uma instância de uma classe durante toda a execução do programa, o que pode ser útil para controlar o acesso a recursos compartilhados, como conexões de banco de dados, gerenciamento de configurações ou caches.

Facilidade de acesso: A instância única pode ser acessada globalmente, permitindo que qualquer parte do sistema a utilize sem a necessidade de passar a instância explicitamente como parâmetro.

O padrão do ponto único de acesso: O Singleton proporciona um único ponto de controle e acesso à instância, tornando-o útil para cenários em que você precisa coordenar a execução de um único objeto compartilhado.

## Contras
Dificuldade de testes unitários: O padrão Singleton pode dificultar os testes, especialmente se a classe Singleton for globalmente acessível e não for facilmente substituível por uma instância mockada ou falsa.

Viola o princípio de responsabilidade única: Ao gerenciar sua própria instância, o Singleton tende a acumular responsabilidades, o que pode prejudicar a clareza e a manutenção do código, principalmente se a instância tiver comportamento complexo.

Acoplamento forte: Como a classe Singleton fornece uma instância global, pode causar acoplamento mais forte entre componentes do sistema, dificultando modificações futuras sem impactar outros módulos que dependem diretamente dessa instância.

Problemas com concorrência: Em sistemas multi-threaded, a criação de uma instância Singleton pode exigir mecanismos como bloqueios, o que pode introduzir problemas de desempenho e complexidade adicional.
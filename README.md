SOLID

Exemplos dos princípios SOLID em código simples.

1. Single Responsibility — Responsabilidade Única:
   Uma classe deve ter apenas uma responsabilidade.
   Benefícios:

* Teste — Uma classe com uma responsabilidade será mais fácil de testar.
* Menor acoplamento — Menos funcionalidades em uma classe, menos dependências.
* Organização — Classes menores e bem organizadas são mais fáceis de entender.

2. Open/Closed — Aberto para Extensão, Fechado para Modificação:
   As classes devem ser abertas para extensão, mas fechadas para modificação.
   Benefício:

* Menor bugs — Não modificar o código existente evita o aparecimento de novos bugs.

3. Liskov Substitution — Substituição de Liskov:
   Se a classe B for um subtipo da classe A, deve ser possível de substituir A por B, sem interromper o comportamento do
   programa.
   Benefício:

* Hierarquia em conformidade — Garante que a modelagem da hierarquia está correta.

4. Interface Segregation — Segregação de Interface:
   Interfaces maiores devem ser divididas em menores.
   Benefício:

* Implementações especializadas — Classes de implementação só precisam se preocupar com os métodos que são do seu
  interesse.

5. Dependency Inversion — Inversão de Dependência:
   Depender de abstrações como interfaces ou classes abstratas, ao invés de implementações das classes concretas.
   Benefício:

* Desaclopamento — Possibilita que a implementação seja alterada sem a necessidade de ajustar diversos pontos do código.
   
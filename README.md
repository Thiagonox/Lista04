# Lista de Exercicios 04

Este projeto em Java implementa um sistema de gerenciamento de animais, utilizando conceitos de interfaces, classes abstratas e polimorfismo. Cada animal possui ações específicas, como comer, mover-se e dormir, que afetam seu estado interno.

## Estrutura do Projeto

O projeto está organizado em pacotes, conforme descrito abaixo:

- **interfaces**: Contém a interface `AnimalIF`, que define os métodos essenciais que todos os animais devem implementar.
- **abstracts**: Contém as classes abstratas `AnimalAB`, `AnimalMarinhoAB`, `AnimalVoadorAB`, `AnimalTerrestreAB`, que implementam a interface e fornecem uma base comum para todos os tipos de animais.
- **concrete**: Contém as classes concretas `Cachorro`, `Gato`, `Elefante`, `Leao`, `Peixe`, e `Pombo`, que representam diferentes tipos de animais e implementam as funcionalidades específicas de cada um.
- **main**: Contém a classe `Main`, que realiza testes criando instâncias dos animais e executando suas ações.

## Funcionalidades

### Interface `AnimalIF`

Define os seguintes métodos:
- `void comer(double quantidadeComida)`: Aumenta a quantidade de comida ingerida pelo animal.
- `void moverse(double distancia)`: Aumenta a distância percorrida pelo animal.
- `void dormir(int horas)`: Aumenta o número de horas dormidas pelo animal.

### Classe Abstrata `AnimalAB`

Implementa a interface `AnimalIF` e possui atributos comuns a todos os animais:
- `nome`, `tipoAnimal`, `idade`, `habitat`, `quantidadePatas`, `altura`, `peso`: Atributos que caracterizam o animal.
- `quantidadeComidaIngerida`, `distanciaPercorrida`, `horasDormidas`: Atributos que representam o estado interno do animal, afetado pelas ações realizadas.

### Classes Abstratas Especializadas

- **`AnimalMarinhoAB`**: Especializa `AnimalAB` para animais marinhos e adiciona o método abstrato `nadar(double distancia)`.
- **`AnimalVoadorAB`**: Especializa `AnimalAB` para animais voadores, adicionando atributos para as asas e o método abstrato `voar(double distancia)`.
- **`AnimalTerrestreAB`**: Especializa `AnimalAB` para animais terrestres.

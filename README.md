# 📊 Java Array Sum Example

Este é um exemplo simples em Java que demonstra como trabalhar com arrays de objetos.
O programa solicita dois vetores de inteiros, realiza a soma elemento a elemento e imprime o vetor resultante.

## 🚀 Funcionalidades

* Leitura de dois arrays de inteiros.
* Soma dos valores correspondentes entre os arrays.
* Impressão do array resultante com os valores somados.

## 📁 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java
└── util/
    └── SumElement.java
```

## 📦 Classes

### `Program.java`

* Responsável por:

  * Ler os tamanhos e valores dos arrays.
  * Realizar a soma dos elementos.
  * Exibir o resultado ao usuário.

### `SumElement.java`

* Classe auxiliar usada para encapsular os valores inteiros.
* Permite melhor organização e prática de programação orientada a objetos.

## 🧪 Exemplo de Uso

```
How many values will each array have? 3
Enter the values of array A: 
1
2
3
Enter the values of array B: 
4
5
6
RESULTING arraySum:
5
7
9
```

## 💡 Conceitos Envolvidos

* Arrays de objetos
* Encapsulamento com classes auxiliares
* Entrada de dados com `Scanner`
* Boas práticas de estruturação em Java

## 📌 Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/java-array-sum-example.git
   ```
2. Compile e execute o programa com sua IDE favorita ou via terminal:

   ```bash
   javac application/Program.java util/SumElement.java
   java application.Program
   ```
---

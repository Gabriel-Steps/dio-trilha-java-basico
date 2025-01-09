# Conta Terminal

Este projeto é um programa simples em Java que simula a criação de uma conta bancária através do terminal.

## Descrição
O programa solicita ao usuário informações como número da agência, nome da agência, nome do cliente e saldo inicial. Após receber esses dados, exibe uma mensagem personalizada confirmando a criação da conta e informando que o saldo já está disponível para saque.

## Estrutura do Código

### Classes e Métodos
- **Classe `ContaTerminal`**: Contém o método principal `main` que executa a lógica do programa.

### Variáveis
- `numero`: Número da conta bancária.
- `agencia`: Nome ou número da agência bancária.
- `nomeCliente`: Nome do cliente.
- `saldo`: Saldo inicial da conta.

## Exemplo de Uso

### Código de Exemplo
```java
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.err.println("Por favor, digite o nome da Agência !");
        agencia = scanner.next();

        System.err.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.next();

        System.err.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextDouble();

        System.err.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque !");
    }
}
```

### Exemplo de Entrada e Saída
#### Entrada
```
Por favor, digite o número da Agência !
1234
Por favor, digite o nome da Agência !
Central
Por favor, digite o seu nome !
João
Por favor, digite o seu saldo !
2500.50
```
#### Saída
```
Olá João, obrigado por criar uma conta em nosso banco, sua agência é Central, conta 1234 e seu saldo 2500.5 já está disponível para saque !
```

## Tecnologias Utilizadas
- **Linguagem**: Java
- **Ferramentas**: Scanner para entrada de dados no terminal.

## Como Executar o Projeto
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Copie o código para um arquivo chamado `ContaTerminal.java`.
3. Compile o programa usando o comando:
   ```bash
   javac ContaTerminal.java
   ```
4. Execute o programa com o comando:
   ```bash
   java ContaTerminal
   ```
5. Siga as instruções no terminal para inserir os dados.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

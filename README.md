# Jogo do Adivinha

## Índice
1. [Descrição](#descrição)
2. [Explicação](#explicação-do-funcionamento-do-código) 
3. [Execução](#execucao)
4. [GitFlow](#gitflow)
5. [Commits](#commits)


## Descrição

É um programa que sorteia um número aleatório de acordo com o nível de dificuldade que o usuário escolheu e este deve adivinhar o número sorteado através de um palpite dado. Caso o palpite esteja correto, o usuário acumula pontos.


## Explicação do funcionamento do código

- Foi implementado de acordo com o paradigma procedural.
- O programa foi escrito para o que o usuário jogue quantas partidas quiser dentro de uma única rodada, passando essa informação ao sistema; somente após isso que a rodada se dá início. 
- O usuário insere seu palpite, o sistema exibe o número sorteado por ele e começa a comparação entre os dois números: 
  - caso os números sejam iguais, o usuário ganha 10 pontos;  
  - caso os números sejam diferentes por apenas 1 de distância, o usuário ganha 5 pontos; 
  - e caso os números sejam diferentes, o usuário não ganha nenhum ponto.
- Após esse processo, é exibido a pontuação acumulada do usuário ao longo das partidas daquela rodada.
- São exibidas também listas contendo os números acertados pelo usuário, os números acertados com 1 de distância e os números errados.

> IMPORTANTE:
> 
> Os próximos passos de implementação de código são:
> 1. Refatorar o código de acordo com o paradigma procedural.
> 2. O programa perguntar ao usuário se ele deseja encerrar a rodada ou jogar uma próxima (entrega média);
> 3. Oferecer níveis de dificuldade para a escolha do usuário (entrega máxima).


## Execução
1. Certifique-se de ter o Java e o IntelliJ instalados em sua máquina, e o GitHub se desejar clonar o repositório.
2. Clone o repositório pelo GitHub utilizando o comando git clone https://github.com/nubiabarmoreira/Jogo-do-Adivinha/tree/main
3. Importe o projeto no IntelliJ.
4. Para executar o projeto basta rodar a classe `Main`.
   Também pode ser executado utilizando o atalho Shift + F10
5. Após, siga as instruções que aparecerá no terminal.


## GitFlow

- A branch principal é a branch `main`
- Há uma branch secundária para desenvolvimento, a branch `develop`
- Para cada nova branch criada, há um padrão de `feature/nivel-da-entrega`
- Após todos os códigos estarem na `develop` foi feito o merge para a branch `main`


## Commits

-  Foi utilizado coventional commits para manter um padrão de projeto, seguindo essa documentação:
   https://www.conventionalcommits.org/pt-br/v1.0.0/

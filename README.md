Este código foi feito na IDEA IntelliJ, linguagem Java, HTML, Javascript e CSS [^1].

Utilizei a assistência da IA ChatGPT para compreender melhor os conceitos do Sistema Proporcional Eleitoral e desenvolver exemplos práticos em código Java,
além de criar uma página interativa de simulação de votação com HTML, CSS e JavaScript.

# Segui as explicações do Projeto! 
### 1. Cálculo do Quociente Eleitoral (QE):
   O Quociente Eleitoral (QE) é o número mínimo de votos necessários para um partido ou coligação conquistar uma vaga.
   
## OBSERVAÇÃO: Estas fórmulas parecem complexas, mas para compreendê-las é preciso estudar bastante para um melhor entendimento..

   - Fórmula:  
   \[
   QE = \frac{{\text{{Total de Votos Válidos}}}}{{\text{{Número de Cargos}}}}
   \]
   No exemplo:
   - Total de Votos Válidos (T.V. Válidos): 20.086 votos
   - Número de Cargos: 13

   Assim:
   \[
   QE = \frac{{20.086}}{{13}} \approx 1.545
   \]

### 2. Cálculo da Votação Nominal Mínima (VNM):
   A Votação Nominal Mínima (VNM) corresponde a 10% do Quociente Eleitoral (QE), ou seja, um candidato precisa ter pelo menos 10% do QE para ser eleito.

   - Fórmula:  
   \[
   VNM = QE \times 0,10
   \]
   No exemplo:
   \[
   VNM = 1.545 \times 0,10 \approx 155
   \]

### 3. Distribuição das Vagas:
   - Primeiro, verifica-se quantas vagas cada partido ou coligação conquistou, dividindo o número de votos do partido pelo QE. O resultado inteiro desta divisão corresponde ao número de vagas.
   - Caso ainda restem vagas, elas são distribuídas utilizando o método das sobras, com base nas maiores médias.

# Class SistemaProporcional - com interface simples

### Explicação do Código:
- Interface Gráfica (GUI): O código usa o "Swing" para criar a interface gráfica. Há campos para o usuário inserir o total de votos válidos e o número de cargos.
- Cálculos: Ao clicar no botão "Calcular", o programa divide o total de votos válidos pelo número de cargos para calcular o "Quociente Eleitoral (QE)". Em seguida, calcula 10% do QE para determinar a "Votação Nominal Mínima (VNM)".


### Explicação do Código:

1. Campos de Entrada para os Votos dos Candidatos: Foram adicionados 5 campos de texto para inserir os votos de cada um dos candidatos fictícios.
2. Cálculo do QE e VNM: O cálculo do "Quociente Eleitoral (QE)" e da "Votação Nominal Mínima (VNM)" continua o mesmo.
3. Distribuição de Vagas: Para cada candidato, o número de vagas é calculado dividindo o número de votos pelo QE. O resultado inteiro desta divisão determina quantas vagas o candidato conquistou. Esse resultado é exibido para cada
   candidato na interface gráfica.

### Exemplo de Simulação:
Vamos supor que os votos sejam inseridos da seguinte forma:
- Candidato 1: 2000 votos
- Candidato 2: 1500 votos
- Candidato 3: 800 votos
- Candidato 4: 500 votos
- Candidato 5: 300 votos
[^1]: Este projeto tem como objetivo informativo e para aprimoramento dos meus estudos, Utilizando a IA generativa para melhor entendimento do assunto e corrigir bugs.
 

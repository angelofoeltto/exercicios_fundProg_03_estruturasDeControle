# exercicios_fundProg_03_estruturasDeControle

1. Faça um Programa que peça dois números e imprima o maior deles.

2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.

3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
escrever: F - Feminino, M - Masculino.

4. Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
mesmo é ou não bissexto.

5. Faça um Programa que verifique se uma letra digitada é vogal.

6. Faça um Programa que peça um número inteiro e se este número for par, transforme-o
em impar e vice-versa.

7. Faça um Programa que leia três números e mostre-os em ordem decrescente.

8. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
calcular a média alcançada pelo aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    - A mensagem "Reprovado", se a média for menor do que sete;

9. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
o peso ideal, utilizando as seguintes fórmulas:
    - Para homens: (72.7*h) - 58
    - Para mulheres: (62.1*h) - 44.7
    (h = altura)
    
    Ao final o algoritmo deve mostrar:
    - Altura, peso e sexo;
    - Peso Ideal;
    - Mensagem se está acima, abaixo ou no peso ideal;

10. Faça um Programa que leia três números e mostre o maior e o menor deles.

11. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
Tarde!" ou "Boa Noite!" , conforme o caso.

12. As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calculará os
reajustes.

    Faça um programa que recebe o salário de um colaborador e calcule o reajuste
segundo o seguinte critério, baseado no salário atual:
    - Salários até R$ 280,00 (incluindo) : aumento de 20%
    - Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    - Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    - Salários de R$ 1500,00 em diante : aumento de 5% Após - aument- serrealizado, informe na tela:
    - O salário antes d- reajuste;
    - O percentual de aumento aplicado;
    - O valor do aumento;
    - O novo salário, após o aumento.

13. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
hora e a quantidade de horas trabalhadas no mês.

    Desconto do IR:
    
    - Salário Bruto até 900 (inclusive) - isento; 
    - Salário Bruto até 1500 (inclusive) - desconto de 5%;
    - Salário Bruto até 2500 (inclusive) - desconto de 10%;
    - Salário Bruto acima de 2500 - desconto de 20% 
    
    Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor 
    da hora é 5 e a quantidade de hora é 220.
    
    - Salário Bruto: (5 * 220) : R$ 1100,00
    - (-) IR (5%) : R$ 55,00
    - (-) INSS ( 10%) : R$ 110,00
    - FGTS (11%) : R$ 121,00
    - Total de descontos : R$ 165,00
    - Salário Liquido : R$ 935,00

14. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
um código de origem, emita o preço junto de sua procedência. Caso o código não seja
nenhum dos especificados, o produto deve ser classificado como importado. Código de
origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.

16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado

17. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
abaixo:

    Média de Aproveitamento Conceito
    - Entre 9.0 e 10.0 -- A
    - Entre 7.5 e 9.0 -- B
    - Entre 6.0 e 7.5 -- C
    - Entre 4.0 e 6.0 -- D
    - Entre 4.0 e zero -- E

    O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
    a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
    conceito for D ou E.

18. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
é: equilátero, isósceles ou escaleno.

	Dicas:
	- Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
	- Triângulo Equilátero: três lados iguais;
	- Triângulo Isósceles: quaisquer dois lados iguais;
	- Triângulo Escaleno: três lados diferentes;

19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 \+  bx \+ c. 
O programa deverá pe seguintes situações:
	
	- Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
programa não deve fazer pedir os demais valores, sendo encerrado;
	- Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário 
encerre o programa;
	- Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
usuário;
	- Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

20. Faça um Programa que peça um número correspondente a um determinado ano e em
seguida informe se este ano é ou não bissexto.

21. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
é uma data válida.

22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
de centenas, dezenas e unidades do mesmo.
	
	Exemplo:
	
	- 326 = 3 centenas, 2 dezenas e 6 unidades
	- 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16

23. Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:

	- Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem";
	- Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
	- Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa".

24. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
calcular a média alcançada por aluno e presentar:
	
	- A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
	- A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
	- A mensagem "Aprovado com Distinção", se a média for igual a 10.

25. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
máquina.

	- Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
nota de 50, uma nota de 5 e uma nota de 1;
	- Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

25. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
utilize o operador módulo (resto da divisão).

26. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
Dica: utilize uma função de arredondamento.

27. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
se o número é:
	- par ou ímpar;
	- positivo ou negativo;
	- inteiro ou decimal.

28. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
são:
	- "Telefonou para a vítima?"
	- "Esteve no local do crime?"
	- "Mora perto da vítima?"
	- "Devia para a vítima?"
	- "Já trabalhou com a vítima?"

	O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se 
a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

29. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
	Álcool:
	- até 20 litros, desconto de 3% por litro
	- acima de 20 litros, desconto de 5% por litro
	
	Gasolina:
	- até 20 litros, desconto de 4% por litro
	- acima de 20 litros, desconto de 6% por litro
	
	Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado
da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

30. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

	| 		| Até 5 Kg 		| Acima de 5 Kg		|
	| ---		|	---		|	---		|
	| Morango	| R$ 2,50 por Kg	| R$ 2,20 por Kg	|
	| Maçã		| R$ 1,80 por Kg	| R$ 1,50 por Kg	|

	Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total.

	Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de 
maças adquiridas e escreva o valor a ser pago pelo cliente.

31. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

	|		| Até 5 Kg		| Acima de 5 Kg		|
	|	---	|	---		|	---		|
	| File Duplo	| R$ 4,90 por Kg	| R$ 5,80 por Kg	|
	| Alcatra	| R$ 5,90 por Kg	| R$ 6,80 por Kg	|
	| Picanha	| R$ 6,90 por Kg	| R$ 7,80 por Kg	|

32. Tendo em uma prova com 10 questões o seguinte gabarito (a,a,b,b,c,c,d,d,e,e) crie uma
página que peça os resultados das questões assinaladas pelo candidato e ao final mostre as
respostas dadas e o resultado conforme o exemplo abaixo: 

	Onde: V para certo e X para errado
	- Q1: a : (a) : V
	- Q2: b : (a) : X ...

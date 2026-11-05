import java.time.LocalDate
import kotlin.math.*
fun main() {
    println("--- Executando Algoritmos em Kotlin ---")// Exemplo de execução:
// algoritmo11()
// algoritmo30(15, 25)
}// ==========================================
// ALGORITMOS DE ENTRADA, SAÍDA E CÁLCULOS DIRETO (11 A 30)
// ==========================================// 11. Imprime uma mensagem simples
fun algoritmo11() {
    println("Aprendendo Kotlin!")
}// 12. Imprime o nome inserido
fun algoritmo12(nome: String = "Usuário") {
    println("Nome: $nome")
}// 13. Imprime o produto entre 28 e 43
fun algoritmo13() {
    val produto = 28 * 43
    println("O produto entre 28 e 43 é: $produto")
}// 14. Imprime a média aritmética entre 8, 9 e 7
fun algoritmo14() {
    val media = (8 + 9 + 7) / 3.0
    println("A média aritmética é: $media")
}// 15. Imprime um número inteiro lido
fun algoritmo15(numero: Int) {
    println("O número informado foi: $numero")
}// 16. Imprime dois números inteiros lidos
fun algoritmo16(a: Int, b: Int) {
    println("Primeiro número: $a, Segundo número: $b")
}// 17. Antecessor e Sucessor de um número inteiro
fun algoritmo17(numero: Int) {
    println("Antecessor: ${numero - 1}, Número: $numero, Sucessor: ${numero + 1}")
}// 18. Nome, endereço e telefone
fun algoritmo18(nome: String, endereco: String, telefone: String) {
    println("Nome: $nome\nEndereço: $endereco\nTelefone: $telefone")
}// 19. Soma de dois números inteiros
fun algoritmo19(a: Int, b: Int) {
    println("A soma de $a + $b é: ${a + b}")
}// 20. Produto de dois números inteiros
fun algoritmo20(a: Int, b: Int) {
    println("O produto de $a * $b é: ${a * b}")
}// 21. Terça parte de um número real
fun algoritmo21(numero: Double) {
    println("A terça parte de $numero é: ${numero / 3}")
}// 22. Média ponderada de dois números (pesos 3 e 7)
fun algoritmo22(n1: Double, n2: Double) {
    val mediaPonderada = (n1 * 3 + n2 * 7) / 10
    println("A média ponderada é: $mediaPonderada")
}// 23. Quociente e resto da divisão inteira
fun algoritmo23(dividendo: Int, divisor: Int) {
    if (divisor == 0) {
        println("Divisão por zero não é permitida.")
        return
    }
    println("Quociente: ${dividendo / divisor}, Resto: ${dividendo % divisor}")
}// 24. Média ponderada de 4 números com pesos 1, 2, 3 e 4
fun algoritmo24(n1: Double, n2: Double, n3: Double, n4: Double) {
    val mp = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4) / 10
    println("Média Ponderada: $mp")
}// 25. Reajuste de saldo em 1%
fun algoritmo25(saldo: Double) {
    val novoSaldo = saldo * 1.01
    println("Saldo com reajuste de 1%: $novoSaldo")
}// 26. Perímetro, área e diagonal de um retângulo
fun algoritmo26(base: Double, altura: Double) {
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))
    println("Perímetro: $perimetro, Área: $area, Diagonal: $diagonal")
}// 27. Raio de um círculo: perímetro e área
fun algoritmo27(raio: Double) {
    val perimetro = 2 * Math.PI * raio
    val area = Math.PI * raio.pow(2)
    println("Perímetro do Círculo: $perimetro, Área: $area")
}// 28. Área de um triângulo
fun algoritmo28(base: Double, altura: Double) {
    val area = (base * altura) / 2
    println("Área do Triângulo: $area")
}// 29. Área de um losango
fun algoritmo29(diagonalMaior: Double, diagonalMenor: Double) {
    val area = (diagonalMaior * diagonalMenor) / 2
    println("Área do Losango: $area")
}// 30. Desconto de 9% num produto
fun algoritmo30(preco: Double) {
    val precoComDesconto = preco * 0.91
    println("Preço com 9% de desconto: R$ $precoComDesconto")
}// ==========================================
// ALGORITMOS DE CONVERSÃO E FÓRMULAS (31 A 40)
// ==========================================// 31. Salário líquido de um professor (valor hora, aulas, desconto INSS)
fun algoritmo31(valorHora: Double, numAulas: Int, percentualINSS: Double) {
    val salarioBruto = valorHora * numAulas
    val salarioLiquido = salarioBruto * (1 - percentualINSS / 100)
    println("Salário Líquido: R$ $salarioLiquido")
}// 32. Conversão de Fahrenheit para Celsius
fun algoritmo32(f: Double) {
    val c = (f - 32) * 5 / 9
    println("$f °F equivale a $c °C")
}// 33. Conversão de Celsius para Fahrenheit
fun algoritmo33(c: Double) {
    val f = (c * 9 / 5) + 32
    println("$c °C equivale a $f °F")
}// 34. Volume de uma lata de óleo
fun algoritmo34(raio: Double, altura: Double) {
    val volume = Math.PI * raio.pow(2) * altura
    println("Volume da lata: $volume")
}// 35. Prestação em atraso
fun algoritmo35(valor: Double, taxa: Double, tempoDias: Int) {
    val prestacao = valor + (valor * (taxa / 100) * tempoDias)
    println("Valor da prestação em atraso: R$ $prestacao")
}// 36. Troca de valores de duas variáveis
fun algoritmo36(a: Int, b: Int) {
    var varA = a
    var varB = b
    val temp = varA
    varA = varB
    varB = temp
    println("Valores trocados: A = $varA, B = $varB")
}// 37. Quadrado da soma de 3 valores
fun algoritmo37(a: Double, b: Double, c: Double) {
    val soma = a + b + c
    println("Quadrado da soma: ${soma.pow(2)}")
}// 38. Soma dos quadrados de 3 valores
fun algoritmo38(a: Double, b: Double, c: Double) {
    val somaQuadrados = a.pow(2) + b.pow(2) + c.pow(2)
    println("Soma dos quadrados: $somaQuadrados")
}// 39. Velocidade média em km/h de um veículo
fun algoritmo39(distanciaKm: Double, tempoHoras: Double) {
    if (tempoHoras <= 0) {
        println("Tempo deve ser maior que zero.")
        return
    }
    println("Velocidade média: ${distanciaKm / tempoHoras} km/h")
}// 40. Valor de troco
fun algoritmo40(valorPago: Double, precoProduto: Double) {
    val troco = valorPago - precoProduto
    if (troco < 0) {
        println("Valor pago é insuficiente!")
    } else {
        println("Troco a ser devolvido: R$ $troco")
    }
}// ==========================================
// ALGORITMOS DE ESTRUTURA CONDICIONAL (41 A 80)
// ==========================================// 41. Número maior que 20?
fun algoritmo41(n: Int) {
    if (n > 20) println("O número $n é maior que 20.")
}// 42. Soma > 10?
fun algoritmo42(a: Int, b: Int) {
    val soma = a + b
    if (soma > 10) println("Soma: $soma")
}// 43. Soma maior que 20 soma 8, menor ou igual a 20 subtrai 5
fun algoritmo43(a: Int, b: Int) {
    val soma = a + b
    val resultado = if (soma > 20) soma + 8 else soma - 5
    println("Resultado: $resultado")
}// 44. Raiz quadrada se positivo, quadrado se negativo
fun algoritmo44(n: Double) {
    if (n >= 0) {
        println("Raiz quadrada: ${sqrt(n)}")
    } else {
        println("Quadrado: ${n.pow(2)}")
    }
}// 45. Par ou Ímpar
fun algoritmo45(n: Int) {
    if (n % 2 == 0) println("$n é PAR") else println("$n é ÍMPAR")
}// 46. Positivo, Negativo ou Nulo
fun algoritmo46(n: Int) {
    when {
        n > 0 -> println("$n é POSITIVO")
        n < 0 -> println("$n é NEGATIVO")
        else -> println("O número é NULO (Zero)")
    }
}// 47. Múltiplo de 3
fun algoritmo47(n: Int) {
    if (n % 3 == 0) println("$n é múltiplo de 3") else println("$n não é múltiplo de 3")
}// 48. Divisível por 5
fun algoritmo48(n: Int) {
    if (n % 5 == 0) println("$n é divisível por 5") else println("$n não é divisível por 5")
}// 49. Divisível por 3 e por 7
fun algoritmo49(n: Int) {
    if (n % 3 == 0 && n % 7 == 0) {
        println("$n é divisível por 3 e por 7")
    } else {
        println("$n não é divisível por 3 e por 7 ao mesmo tempo")
    }
}// 50. Divisível por 10, por 5, por 2 ou por nenhum
fun algoritmo50(n: Int) {
    var divisivel = false
    if (n % 10 == 0) { println("$n é divisível por 10"); divisivel = true }
    if (n % 5 == 0) { println("$n é divisível por 5"); divisivel = true }
    if (n % 2 == 0) { println("$n é divisível por 2"); divisivel = true }
    if (!divisivel) println("$n não é divisível por 10, 5 ou 2")
}// 51. Compara 2 números e mostra o maior
fun algoritmo51(a: Int, b: Int) {
    if (a > b) println("Maior: $a") else if (b > a) println("Maior: $b") else println("Números iguais")
}// 52. Ordem crescente de 2 números
fun algoritmo52(a: Int, b: Int) {
    if (a < b) println("$a,$b") else println("$b,$a")
}// 53. Compara 3 números e mostra o maior
fun algoritmo53(a: Int, b: Int, c: Int) {
    val maior = maxOf(a, maxOf(b, c))
    println("O maior número é: $maior")
}// 54. Ordem crescente de 3 números
fun algoritmo54(a: Int, b: Int, c: Int) {
    val lista = listOf(a, b, c).sorted()
    println("Ordem crescente: ${lista.joinToString(", ")}")
}// 55. Ordem decrescente de 3 números
fun algoritmo55(a: Int, b: Int, c: Int) {
    val lista = listOf(a, b, c).sortedDescending()
    println("Ordem decrescente: ${lista.joinToString(", ")}")
}// 56. Maior e menor entre 3 números
fun algoritmo56(a: Int, b: Int, c:Int) {
    val lista = listOf(a, b, c)
    println("Maior: ${lista.maxOrNull()}, Menor: ${lista.minOrNull()}")
}// 57. Classificação por idade
fun algoritmo57(idade: Int) {
    when (idade) {
        in 0..11 -> println("Criança")
        in 12..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        else -> if (idade >= 60) println("Idoso") else println("Idade inválida")
    }
}// 58. Verificação de triângulo (Propriedade da existência)
fun algoritmo58(a: Double, b: Double, c: Double) {
    if (a < b + c && b < a + c && c < a + b) {
        println("Os lados formam um triângulo válido.")
    } else {
        println("Os lados NÃO formam um triângulo.")
    }
}// 59. Tipo de triângulo (Equilátero, Isósceles, Escaleno)
fun algoritmo59(a: Double, b: Double, c: Double) {
    if (a < b + c && b < a + c && c < a + b) {
        when {
            a == b && b == c -> println("Triângulo Equilátero")
            a == b || b == c || a == c -> println("Triângulo Isósceles")
            else -> println("Triângulo Escaleno")
        }
    } else {
        println("Não é um triângulo válido.")
    }
}// 60. Triângulo Retângulo
fun algoritmo60(a: Double, b: Double, c: Double) {
    val lados = listOf(a, b, c).sorted()
    if (lados[2].pow(2) == lados[0].pow(2) + lados[1].pow(2)) {
        println("É um triângulo retângulo.")
    } else {
        println("Não é um triângulo retângulo.")
    }
}// 61. Empréstimo bancário (prestação não pode ultrapassar 30% do salário)
fun algoritmo61(salarioBruto: Double, prestacao: Double) {
    val limite = salarioBruto * 0.30
    if (prestacao <= limite) {
        println("Empréstimo concedido.")
    } else {
        println("Empréstimo negado (prestação excede 30% do salário).")
    }
}// 62. Lucro da venda de um produto
fun algoritmo62(valorCompra: Double) {
    val valorVenda = if (valorCompra < 20.0) valorCompra * 1.45 else valorCompra * 1.30
    println("Valor de venda: R$ $valorVenda")
}// 63. Eleitor obrigatoriedade
fun algoritmo63(idade: Int) {
    when {
        idade < 16 -> println("Não eleitor")
        idade in 18..69 -> println("Eleitor obrigatório")
        else -> println("Eleitor facultativo")
    }
}// 64. Aceita mulher menor que 25 anos
fun algoritmo64(nome: String, sexo: Char, idade: Int) {
    if ((sexo == 'F' || sexo == 'f') && idade < 25) {
        println("$nome: ACEITA")
    } else {
        println("$nome: NÃO ACEITA")
    }
}// 65. Calculadora simples de 2 números
fun algoritmo65(a: Double, b: Double, operacao: Char) {
    val res = when (operacao) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> if (b != 0.0) a / b else "Erro: Divisao por zero"
        else -> "Operação inválida"
    }
    println("Resultado: $res")
}// 66. IMC (Índice de Massa Corporal)
fun algoritmo66(peso: Double, altura: Double) {
    val imc = peso / altura.pow(2)
    val condicao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 25.0 -> "Peso normal"
        imc < 30.0 -> "Sobrepeso"
        imc < 40.0 -> "Obesidade"
        else -> "Obesidade grave"
    }
    println("IMC: %.2f - Condição: $condicao".format(imc))
}// 67. Peso Ideal
fun algoritmo67(altura: Double, sexo: Char) {
    val pesoIdeal = if (sexo.uppercaseChar() == 'M') {
        (72.7 * altura) - 58
    } else {
        (62.1 * altura) - 44.7
    }
    println("Peso ideal: %.2f kg".format(pesoIdeal))
}// 68. Categoria de Nadador por idade
fun algoritmo68(idade: Int) {
    val categoria = when (idade) {
        in 5..7 -> "Infantil A"
        in 8..10 -> "Infantil B"
        in 11..13 -> "Juvenil A"
        in 14..17 -> "Juvenil B"
        else -> if (idade >= 18) "Sênior" else "Sem categoria"
    }
    println("Categoria: $categoria")
}// 69. Desconto de plano de saúde por idade
fun algoritmo69(idade: Int) {
    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }
    println("Valor do plano: R$ $valor")
}// 70. Verificação de bissexto
fun algoritmo70(ano: Int) {
    val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
    if (bissexto) println("O ano $ano é BISSEXTO") else println("O ano $ano NÃO é bissexto")
}// 71. Validação de data (Dia, Mês, Ano)
fun algoritmo71(dia: Int, mes: Int, ano: Int) {
    try {
        LocalDate.of(ano, mes, dia)
        println("Data $dia/$mes/$ano é VÁLIDA.")
    } catch (e: Exception) {
        println("Data $dia/$mes/$ano é INVÁLIDA.")
    }
}// 72. Signo do Zodíaco
fun algoritmo72(dia: Int, mes: Int) {
    val signo = when (mes) {
        1 -> if (dia <= 19) "Capricórnio" else "Aquário"
        2 -> if (dia <= 18) "Aquário" else "Peixes"
        3 -> if (dia <= 20) "Peixes" else "Áries"
        4 -> if (dia <= 19) "Áries" else "Touro"
        5 -> if (dia <= 20) "Touro" else "Gêmeos"
        6 -> if (dia <= 20) "Gêmeos" else "Câncer"
        7 -> if (dia <= 22) "Câncer" else "Leão"
        8 -> if (dia <= 22) "Leão" else "Virgem"
        9 -> if (dia <= 22) "Virgem" else "Libra"
        10 -> if (dia <= 22) "Libra" else "Escorpião"
        11 -> if (dia <= 21) "Escorpião" else "Sagitário"
        12 -> if (dia <= 21) "Sagitário" else "Capricórnio"
        else -> "Mês inválido"
    }
    println("Signo: $signo")
}// 73. Reajuste de salário por cargo
fun algoritmo73(cargo: Int, salario: Double) {
    val percentual = when (cargo) {
        101 -> 0.10 // Gerente
        102 -> 0.20 // Engenheiro
        103 -> 0.30 // Técnico
        else -> 0.40 // Outros
    }
    val aumento = salario * percentual
    println("Salário Antigo: R$$salario | Novo Salário: R$${salario + aumento} | Diferença: R$$aumento")
}// 74. Crédito especial baseado em saldo médio
fun algoritmo74(saldoMedio: Double) {
    val percentual = when {
        saldoMedio <= 200 -> 0.0
        saldoMedio <= 400 -> 0.20
        saldoMedio <= 600 -> 0.30
        else -> 0.40
    }
    println("Saldo Médio: R$$saldoMedio | Crédito Concedido: R$${saldoMedio * percentual}")
}// 75. Preço total do cardápio de uma lanchonete
fun algoritmo75(codigo: Int, quantidade: Int) {
    val precoUnitario = when (codigo) {
        100 -> 1.20 // Cachorro Quente
        101 -> 1.30 // Bauru Simples
        102 -> 1.50 // Bauru com ovo
        103 -> 1.20 // Hambúrguer
        104 -> 1.30 // Cheeseburguer
        105 -> 1.00 // Refrigerante
        else -> 0.0
    }
    println("Total a pagar: R$ ${precoUnitario * quantidade}")
}// 76. Média de aprovação (Nota >= 7 Aprovado, < 3 Reprovado, senão Prova Final)
fun algoritmo76(n1: Double, n2: Double, n3: Double) {
    val media = (n1 + n2 + n3) / 3
    when {
        media >= 7.0 -> println("Aprovado com média %.2f".format(media))
        media < 3.0 -> println("Reprovado com média %.2f".format(media))
        else -> println("Prova Final com média %.2f".format(media))
    }
}// 77. Raízes de equação de 2º Grau (ax² + bx + c = 0)
fun algoritmo77(a: Double, b: Double, c: Double) {
    if (a == 0.0) {
        println("Não é uma equação do segundo grau.")
        return
    }
    val delta = b.pow(2) - (4 * a * c)
    if (delta < 0) {
        println("Não existem raízes reais (Delta < 0).")
    } else {
        val x1 = (-b + sqrt(delta)) / (2 * a)
        val x2 = (-b - sqrt(delta)) / (2 * a)
        println("x1 = $x1, x2 =$x2")
    }
}// 78. Número de dias no mês
fun algoritmo78(mes: Int, ano: Int) {
    val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
    val dias = when (mes) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (bissexto) 29 else 28
        else -> 0
    }
    println("O mês $mes do ano$ano possui $dias dias.")
}// 79. Conversão de moedas (1- Dólar, 2- Euro)
fun algoritmo79(valorReais: Double, opcao: Int, cotacao: Double) {
    val convertido = valorReais / cotacao
    val moeda = if (opcao == 1) "Dólares" else "Euros"
    println("R$ $valorReais é igual a %.2f $moeda".format(convertido))
}// 80. Validação de Senha Simples
fun algoritmo80(senhaEntrada: String) {
    val senhaCorreta = "1234Kotlin"
    if (senhaEntrada == senhaCorreta) {
        println("Acesso Permitido!")
    } else {
        println("Acesso Negado! Senha incorreta.")
    }
}// ==========================================
// ALGORITMOS DE ESTRUTURAS DE REPETIÇÃO (81 A 120)
// ==========================================// 81. Imprimir de 1 a 100
fun algoritmo81() {
    for (i in 1..100) {
        print("$i ")
    }
    println()
}// 82. Imprimir múltiplos de 5 entre 1 e 500
fun algoritmo82() {
    for (i in 5..500 step 5) {
        print("$i ")
    }
    println()
}// 83. Tabuada de um número
fun algoritmo83(numero: Int) {
    println("--- Tabuada do $numero ---")
    for (i in 1..10) {
        println("$numero x $i =${numero * i}")
    }
}// 84. Imprimir os 100 primeiros números pares
fun algoritmo84() {
    var count = 0
    var num = 2
    while (count < 100) {
        print("$num ")
        num += 2
        count++
    }
    println()
}// 85. Soma dos números de 1 até 100
fun algoritmo85() {
    val soma = (1..100).sum()
    println("A soma de 1 até 100 é: $soma")
}// 86. Média de N números positivos passados numa lista
fun algoritmo86(numeros: List) {
    val positivos = numeros.filter {
        val it = null
        it > 0
    }
    if (positivos.isNotEmpty()) {
        println("Média dos positivos: ${positivos.average()}")
    } else {
        println("Nenhum número positivo foi fornecido.")
    }
}// 87. Fatorial de um número
fun algoritmo87(n: Int): Long {
    var fat: Long = 1
    for (i in 1..n) {
        fat *= i
    }
    println("Fatorial de $n é: $fat")
    return fat
}// 88. Sequência de Fibonacci até o N-ésimo termo
fun algoritmo88(n: Int) {
    var t1 = 0
    var t2 = 1
    print("Fibonacci ($n termos): ")
    for (i in 1..n) {
        print("$t1 ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    println()
}// 89. Impressão de números impares entre A e B
fun algoritmo89(a: Int, b: Int) {
    val inicio = minOf(a, b)
    val fim = maxOf(a, b)
    print("Ímpares entre $inicio e$fim: ")
    for (i in inicio..fim) {
        if (i % 2 != 0) print("$i ")
    }
    println()
}// 90. Quantidade de números primos num intervalo de 1 a N
fun algoritmo90(n: Int) {
    fun ehPrimo(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    };var count = 0
    for (i in 1..n) {
        if (ehPrimo(i)) count++
    }
    println("Quantidade de números primos entre 1 e $n:$count")
}// 91. Produto dos números ímpares entre 1 e 15
fun algoritmo91() {
    var produto = 1L
    for (i in 1..15 step 2) {
        produto *= i
    }
    println("Produto dos ímpares de 1 a 15: $produto")
}// 92. Quadrado dos números de 15 a 200
fun algoritmo92() {
    for (i in 15..200) {
        println("$i² = ${i * i}")
    }
}// 93. Soma de todos os números pares de 1 a 500
fun algoritmo93() {
    var soma = 0
    for (i in 2..500 step 2) {
        soma += i
    }
    println("Soma dos pares de 1 a 500: $soma")
}// 94. Conta números negativos em uma lista
fun algoritmo94(numeros: List) {
    val qtdNegativos = numeros.count { it < 0 }
    println("Quantidade de negativos: $qtdNegativos")
}// 95. Leitura de números até que zero seja digitado (Retorna soma)
fun algoritmo95(numeros: List) {
    var soma = 0
    for (num in numeros) {
        if (num == 0) break
        soma += num
    }
    println("Soma até encontrar o zero: $soma")
}// 96. Maior e menor elemento de uma lista
fun algoritmo96(numeros: List) {
    if (numeros.isNotEmpty()) {
        println("Maior: ${numeros.maxOrNull()}, Menor:${numeros.minOrNull()}")
    }
}// 97. Média das idades de um grupo
fun algoritmo97(idades: List) {
    if (idades.isNotEmpty()) {
        println("Média de idade: ${idades.average()}")
    }
}// 98. Contagem regressiva de 10 a 0
fun algoritmo98() {
    for (i in 10 downTo 0) {
        print("$i ")
    }
    println("FIM!")
}// 99. Potência sem usar a função Math.pow (base^expoente)
fun algoritmo99(base: Int, expoente: Int) {
    var resultado = 1L
    for (i in 1..expoente) {
        resultado *= base
    }
    println("$base elevado a $expoente é: $resultado")
}// 100. Imprimir matriz 3x3 simples
fun algoritmo100() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    for (linha in matriz) {
        println(linha.joinToString("\t"))
    }
}// 101. Soma dos elementos de um vetor de 10 posições
fun algoritmo101(vetor: IntArray) {
    println("Soma do vetor: ${vetor.sum()}")
}// 102. Trocar elementos negativos de um vetor por 0
fun algoritmo102(vetor: IntArray) {
    for (i in vetor.indices) {
        if (vetor[i] < 0) vetor[i] = 0
    }
    println("Vetor modificado: ${vetor.joinToString(", ")}")
}// 103. Pesquisa elementar em vetor (busca de valor)
fun algoritmo103(vetor: IntArray, valorBusca: Int) {
    val index = vetor.indexOf(valorBusca)
    if (index != -1) {
        println("Valor $valorBusca encontrado no índice $index")
    } else {
        println("Valor não encontrado.")
    }
}// 104. Inverter elementos de um vetor
fun algoritmo104(vetor: IntArray) {
    val invertido = vetor.reversedArray()
    println("Vetor invertido: ${invertido.joinToString(", ")}")
}// 105. Intercalação de dois vetores
fun algoritmo105(v1: IntArray, v2: IntArray) {
    val resultado = mutableListOf()
    val minLen = minOf(v1.size, v2.size)
    for (i in 0 until minLen) {
        resultado.add(v1[i])
        resultado.add(v2[i])
    }
    println("Vetores Intercalados: $resultado")
}// 106. Quantidade de vogais em uma frase
fun algoritmo106(texto: String) {
    val vogais = "aeiouAEIOU"
    val totalVogais = texto.count { it in vogais }
    println("Total de vogais na frase: $totalVogais")
}// 107. Palíndromo (Verifica se palavra se lê igual ao contrário)
fun algoritmo107(palavra: String) {
    val limpa = palavra.lowercase().replace(" ", "")
    if (limpa == limpa.reversed()) {
        println("'$palavra' é um PALÍNDROMO.")
    } else {
        println("'$palavra' NÃO é um palíndromo.")
    }
}// 108. Anagrama simples (Verifica tamanho e se possuem mesmas letras)
fun algoritmo108(p1: String, p2: String) {
    val a1 = p1.lowercase().toCharArray().sorted()
    val a2 = p2.lowercase().toCharArray().sorted()
    if (a1 == a2) {
        println("As palavras '$p1' e '$p2' são anagramas.")
    } else {
        println("NÃO são anagramas.")
    }
}// 109. Preencher e mostrar diagonal principal de uma matriz 3x3
fun algoritmo109() {
    val matriz = arrayOf(
        intArrayOf(10, 2, 3),
        intArrayOf(4, 20, 6),
        intArrayOf(7, 8, 30)
    )
    print("Diagonal Principal: ")
    for (i in 0..2) {
        print("${matriz[i][i]} ")
    }
    println()
}// 110. Soma de duas matrizes 2x2
fun algoritmo110() {
    val m1 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val m2 = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val res = Array(2) { IntArray(2) };for (i in 0..1) {
        for (j in 0..1) {
            res[i][j] = m1[i][j] + m2[i][j]
        }
    }
    println("Matriz Resultante da Soma:")
    for (linha in res) println(linha.joinToString("\t"))
}// 111. Transposta de uma matriz 2x3
fun algoritmo111() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    val transposta = Array(3) { IntArray(2) };for (i in 0..1) {
        for (j in 0..2) {
            transposta[j][i] = original[i][j]
        }
    }
    println("Matriz Transposta 3x2:")
    for (linha in transposta) println(linha.joinToString("\t"))
}// 112. Calculadora de Média e Situação de 5 alunos (Vetor e Matriz)
fun algoritmo112(notas: Array, average: MatchGroup?.() -> Unit) {
    for (i in notas.indices) {
        val media = notas[i].average()
        val situacao = if (media >= 7.0) "Aprovado" else "Reprovado"
        println("Aluno ${i + 1}: Média = %.2f - Situação: $situacao".format(media))
    }
}// 113. Ordenação de vetor pelo método Bubble Sort
fun algoritmo113(vetor: IntArray) {
    val n = vetor.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (vetor[j] > vetor[j + 1]) {
                val temp = vetor[j]
                vetor[j] = vetor[j + 1]
                vetor[j + 1] = temp
            }
        }
    }
    println("Vetor Ordenado (Bubble Sort): ${vetor.joinToString(", ")}")
}// 114. MDC (Maior Divisor Comum) entre dois números (Algoritmo de Euclides)
fun algoritmo114(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    println("MDC entre $a e $b é: $x")
    return x
}// 115. MMC (Mínimo Múltiplo Comum) entre dois números
fun algoritmo115(a: Int, b: Int) {
    fun mdc(x: Int, y: Int): Int = if (y == 0) x else mdc(y, x % y)
    val mmc = (a * b) / mdc(a, b)
    println("MMC entre $a e $b é: $mmc")
}// 116. Conversão de Decimal para Binário
fun algoritmo116(decimal: Int) {
    val binario = Integer.toBinaryString(decimal)
    println("O número $decimal em binário é: $binario")
}// 117. Conversão de Binário para Decimal
fun algoritmo117(binarioStr: String) {
    try {
        val decimal = Integer.parseInt(binarioStr, 2)
        println("O binário $binarioStr em decimal é: $decimal")
    } catch (e: NumberFormatException) {
        println("Formato binário inválido.")
    }
}// 118. Troca dos valores da diagonal secundária de uma matriz 3x3 por 0
fun algoritmo118() {
    val m = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    for (i in 0..2) {
        m[i][2 - i] = 0
    }
    println("Matriz com a diagonal secundária zerada:")
    for (linha in m) println(linha.joinToString("\t"))
}// 119. Validador de CPF (Somente cálculo dos dígitos verificadores)
fun algoritmo119(cpf: String) {
    val limpo = cpf.filter { it.isDigit() }
    if (limpo.length != 11 || limpo.all { it == limpo[0] }) {
        println("CPF Inválido")
        return
    };val d1 = (0..8).sumOf { (limpo[it] - '0') * (10 - it) } % 11
    val digito1 = if (d1 < 2) 0 else 11 - d1

    val d2 = (0..8).sumOf { (limpo[it] - '0') * (11 - it) } + (digito1 * 2)
    val digito2 = (d2 * 10 % 11).let { if (it == 10) 0 else it }

    if (digito1 == (limpo[9] - '0') && digito2 == (limpo[10] - '0')) {
        println("CPF Válido!")
    } else {
        println("CPF Inválido!")
    }
}// 120. Gerador de Números para Loteria (Mega-Sena: 6 números de 1 a 60 sem repetição)
fun algoritmo120() {
    val megaSena = (1..60).shuffled().take(6).sorted()
    println("Números sorteados para a Mega-Sena: ${megaSena.joinToString(" - ")}")
}
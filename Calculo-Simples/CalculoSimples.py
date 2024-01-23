cod1, qtd1, valor1 = map(float, input().split())
cod2, qtd2, valor2 = map(float, input().split())
print(f"VALOR A PAGAR: R$ {qtd1 * valor1 + qtd2 * valor2:.2f}")
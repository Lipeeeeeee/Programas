n = int(input())
for i in range(n):
    operacao = input().split()
    N1 = int(operacao[0])
    D1 = int(operacao[2])
    N2 = int(operacao[4])
    D2 = int(operacao[6])
    if operacao[3] == '+':
        N1 = N1 * D2 + N2 * D1
        D1 *= D2
    elif operacao[3] == '-':
        N1 = N1 * D2 - N2 * D1
        D1 *= D2
    elif operacao[3] == '*':
        N1 *= N2
        D1 *= D2
    else:
        N1 *= D2
        D1 *= N2
    print(f"{N1}/{D1} = ", end="")
    menor = N1 if N1 <= D1 else D1
    for j in range(2, abs(menor) + 1):
        while N1 % j == 0 and D1 % j == 0:
            N1 //= j
            D1 //= j
        menor = N1 if N1 <= D1 else D1
    print(f"{N1}/{D1}")
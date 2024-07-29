from bisect import bisect_left

n, q = map(int, input().split())
casos = 1
while n != 0 and q != 0:
    pecas = []
    for i in range(n):
        pecas.append(int(input()))
    pecas.sort()
    consultas = []
    for i in range(q):
        consultas.append(int(input()))
    print(f"CASE# {casos}:")
    casos += 1
    for i in range(len(consultas)):
        index = bisect_left(pecas, consultas[i])
        if index != len(pecas):
            print(f"{consultas[i]} found at {index}")
        else:
            print(f"{consultas[i]} not found")
    n, q = map(int, input().split())
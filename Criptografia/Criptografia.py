n = int(input())
for i in range(n):
    texto = str(input())
    for j in range(len(texto)):
        if texto[j].isalpha():
            texto = texto[:j] + chr(ord(texto[j]) + 3) + texto[j + 1:]
    texto = texto[::-1]
    for j in range(len(texto) // 2, len(texto)):
        texto = texto[:j] + chr(ord(texto[j]) - 1) + texto[j + 1:]
    print(texto)
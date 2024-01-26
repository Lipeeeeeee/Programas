n = int(input())
print(str(n // 365) + " ano(s)\n" + str(n % 365 // 30) + " mes(es)\n" + str(n % 365 % 30) + " dia(s)")
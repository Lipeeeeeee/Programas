a, b, c = map(int, input().split())
MaiorAB = (a + b + abs(a - b)) // 2
print(f"{(MaiorAB + c + abs(MaiorAB - c)) // 2} eh o maior")
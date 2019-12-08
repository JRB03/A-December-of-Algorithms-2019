def fib_primes(n):
    primes = []
    a = 2
    b = 1
    while len(primes) < n:
        prime = True
        for x in range(2,a):
            if a % x == 0:
                prime = False
        if prime:
            primes.append(a)
        c = a
        a = a + b
        b = c
    return primes

inp = input("Enter the value for (n): ")
print('Generated Fibonacci Prime Number Generation upto (' + str(inp) + '): ')
for p in fib_primes(inp):
    print(p),
print("\b\b")

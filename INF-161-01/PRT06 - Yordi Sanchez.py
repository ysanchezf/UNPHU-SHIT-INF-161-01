#Yordi Sanchez, 21-0834

"""
Desarrolle un programa que permita ingresar números enteros positivos mayores o iguales a 10, y los vaya guardando en una 
lista hasta que el usuario ingrese el 0. Cuando esto ocurra, el programa terminará de pedir números y debe recorrer la 
lista mostrando los números capturados y diciendo cuántos dígitos pares y cuántos impares tiene cada uno. Una vez hecho 
esto, informar la cantidad total de dígitos pares e impares.

Observaciones (LEER):

Si el número contiene 0 (ejemplo 10, 20, etc.), igual debe guardarse en la lista.
Si el número es menor a 10, se debe omitir y continuar su ejecución.
"""

# Def - Definimos una funcion que deseemos realizar y le colocamos "npares_impares" a dicha funcion 
def npares_impares(numero):
    pares = 0
    impares = 0
    for digito in str(numero):
        if int(digito) % 2 == 0:
            pares += 1
        else:
            impares += 1
    return pares, impares 
# Utilozamos return para que la funcion se pueda comunicar. 
#Creamos una lista para los numeros
numeros = []

# Decimos aqui, mientras sea verdad que se digite un valor a cero o con un digito cero el programa se va detener y si es menor a diez no se contara
while True:
    entrada = input("Ingrese un numero: ")
    numero = int(entrada)
    if numero == 0:
        break
    if numero < 10:
        continue
    numeros.append(numero)
    if '0' in entrada:
        break

total_pares = 0
total_impares = 0

# Imprimimos los valores. 
print("Números capturados:")
for numero in numeros:
    pares, impares = npares_impares(numero)
    total_pares += pares
    total_impares += impares
    print(f"{numero}. cantidad de numeros pares: {pares}. Cantidad de numeros impares: {impares}.")

print(f"\n Total de numeros pares: {total_pares}, Total de numeros impares: {total_impares}")


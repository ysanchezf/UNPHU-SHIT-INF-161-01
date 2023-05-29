while True:
    # Capturo el input de los usuarios como numeros en los que iniciara y terminara la tabla
    n1 = int(input("\nIngrese el numero por el que comenzaran a mostrarse las tablas: "))
    n2 = int(input("Ingrese el numero por el que terminaran de mostrarse las tablas: \n"))

    # Validacion para asegurarse de que el numero donde comenzara la tabla no sea mayor que el numero donde terminara, en caso de que sea asi el bucle se ejecutara de nuevo, si ejecutar las lineas de abajo
    if(n1 > n2):
        print("EL numero por el que comenzara a mostrarse la tabla no puede ser mayor al numero por el que terminara")
        continue
    
    # Este bucle se ejecutara mientras el ingresado como inicio de la tabla (numero que ire incrementando) sea menor o igual al de finalizacion 
    while n1 <= n2:
        n = 1
        print(f'******* TABLA DEL {n1} *******')
        # multiplicamos n1 por los numeros del 1 al 12
        while n <= 12:
            print(f'{n1} * {n} = {n1*n}')
            n = n + 1
        # luego incremento el valor de n1 en 1 
        n1 = n1 + 1
    break
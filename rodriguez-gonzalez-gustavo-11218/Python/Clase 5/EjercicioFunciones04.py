# CLASE 5
# Ejercicio 4: Calculadora de Impuestos
# Crear una funcion para clacular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuestos + pago_sin_impuestso * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# pago con impuesto: xxxxx

#Creamo la funcion que calcula el total del pago incluyendo el impuesto
def calcular_total_pago(pago_sin_impuestos, impuesto):
    pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
    return pago_total

# Ejecutamos la función
pago_sin_impuesto = float(input("Digite el pago sin impuesto: "))
impuesto = float(input("Digite el monto del impuesto a aplicar: "))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"El pago con el impuesto es: {pago_con_impuesto}")
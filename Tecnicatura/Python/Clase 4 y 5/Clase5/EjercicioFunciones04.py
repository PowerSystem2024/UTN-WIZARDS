# Ejercicio 4: Calculadora de Impuestos
# Crear una funcion para calcular el total de un pago incluyendo
# un impuesto aplicado (IVA)
# Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx

# Definimos la función calcular_total_pago que toma el pago sin impuesto y el porcentaje de impuesto
def calcular_total_pago(pago_sin_impuesto, porcentaje_impuesto):
    # Calculamos el monto del impuesto
    monto_impuesto = pago_sin_impuesto * (porcentaje_impuesto / 100)
    # Calculamos el pago total sumando el pago sin impuesto y el monto del impuesto
    pago_total = pago_sin_impuesto + monto_impuesto
    # Devolvemos el pago total
    return pago_total

# Solicitamos al usuario que ingrese el pago sin impuesto
pago_sin_impuesto = float(input("Proporcione el pago sin impuesto: "))
# Solicitamos al usuario que ingrese el porcentaje de impuesto
porcentaje_impuesto = float(input("Proporcione el monto del impuesto (%): "))

# Calculamos el pago total llamando a la función
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, porcentaje_impuesto)

# Imprimimos el resultado
print(f"Pago con impuesto: {pago_con_impuesto:.2f}")
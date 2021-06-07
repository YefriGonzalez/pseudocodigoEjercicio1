Algoritmo Ejercicio1
	pares=0
	impares=0
	Escribir "Ingrese un numero"
	Leer N
	Para i=1 Hasta N Con Paso 1 Hacer
		num=Aleatorio(0,100)
		si (num%2=0) Entonces
			pares=pares+1
		SiNo
			impares=impares+1
		FinSi
	FinPara
	Escribir "La cantidad de numeros pares son: " pares
	Escribir "La cantidad de numeros impares son: " impares
	
FinAlgoritmo

Algoritmo Ejercicio13
	Escribir "Menu"
	Escribir "1.- Sumar  2.- Dividir  3.-Salir"
	Leer Opciones
	Mientras Opciones <> 3 Hacer
		Si Opciones = 1 Entonces
			Escribir "Ingrese un Numero"
			Leer N1
			Escribir "Ingrese un Numero"
			Leer N2
			Suma= N1 + N2
			Escribir "La suma es " Suma
		SiNo
			Escribir "Ingrese El Numerador"
			leer N1
			Escribir "Ingrese El Denominador"
			leer N2
			Si N2 <> 0 Entonces
				Dividir= N1/N2
				Escribir "La Division es " dividir
			SiNo
				Escribir "No se puede Dividir por el Denominador = " n2
			Fin Si
		Fin Si
		Escribir "Menu"
		Escribir "1.- Sumar  2.- Dividir  3.-Salir"
		Leer Opciones 
	Fin Mientras
FinAlgoritmo

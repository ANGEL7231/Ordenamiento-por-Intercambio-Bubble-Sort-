Algoritmo OrdenamientoBurbuja
    Definir n, i, j, aux Como Entero
    Definir totalComparaciones, totalIntercambios, totalPasadas Como Entero
    Definir huboIntercambio Como Logico
    
    n <- 5
    Dimension arreglo[5]
    
    // Asignación de valores usando índices del 1 al 5
    arreglo[1] <- 34
    arreglo[2] <- 12
    arreglo[3] <- 25
    arreglo[4] <- 8
    arreglo[5] <- 19
    
    Escribir "Arreglo Inicial: [34, 12, 25, 8, 19]"
    Escribir "----------------------------------------"
    
    totalComparaciones <- 0
    totalIntercambios <- 0
    totalPasadas <- 0
    i <- 1
    huboIntercambio <- Verdadero
    
    // Ciclo principal de pasadas
    Mientras (i <= n - 1) Y (huboIntercambio == Verdadero) Hacer
        huboIntercambio <- Falso
        totalPasadas <- totalPasadas + 1
        
        // Ciclo interno de comparaciones adyacentes (del 1 hasta n - i)
        Para j <- 1 Hasta (n - i) Con Paso 1 Hacer
            totalComparaciones <- totalComparaciones + 1
            
            Si arreglo[j] > arreglo[j + 1] Entonces
                // Intercambio utilizando variable auxiliar
                aux <- arreglo[j]
                arreglo[j] <- arreglo[j + 1]
                arreglo[j + 1] <- aux
                
                totalIntercambios <- totalIntercambios + 1
                huboIntercambio <- Verdadero
            FinSi
        FinPara
        
        // Imprimir estado de la fila al finalizar cada pasada
        Escribir "Pasada ", totalPasadas, ": [", arreglo[1], ", ", arreglo[2], ", ", arreglo[3], ", ", arreglo[4], ", ", arreglo[5], "]"
        
        i <- i + 1
    FinMientras
    
    Escribir "----------------------------------------"
    Escribir "Resumen de Ejecución:"
    Escribir "Total Pasadas: ", totalPasadas
    Escribir "Total Comparaciones: ", totalComparaciones
    Escribir "Total Intercambios: ", totalIntercambios
    
FinAlgoritmo
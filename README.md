# Desafio 08 - Base Numérica

**Curso:** Java - Ada Tech patrocinado pela Nuclea  
**Professores:** Rocha e Bruno  
**GitHub:** [Teofilo Nicolau](https://github.com/teofilonicolau)

Este desafio faz parte do Curso de Java oferecido pela Ada Tech e patrocinado pela Nuclea. O código implementa um algoritmo para converter números entre diferentes bases numéricas.

## Caso 1

**Contexto:**
- Decimal: Representa números em nosso cotidiano.
- Binária: Base fundamental para o funcionamento interno de computadores.
- Octal: Compacta a representação números binários devido à relação direta com potências de 2.
- Hexadecimal: Mais compacta ainda e fácil de converter para binário.

**Problema:** Implementar um conversor entre as unidades citadas.

**Etapas:**
1. Decimal → Binário + Octal + Hexadecimal.
2. Binário → Decimal + Octal + Hexadecimal.
3. Octal → Decimal + Binário + Hexadecimal.
4. Hexadecimal → Decimal + Binário + Octal.

## Caso 2

**Contexto:**
- Quinária (5): Usada em casos específicos de compactação.
- Duodecimal (12): Possui intervalos 0-9, A (10), B (11).
- Vigesimal (20): Representada com os dígitos 0-9 e A-J.
- Sexagesimal (60): Usada para medições de tempo com dígitos de 0-9 e outros símbolos.

**Problema:** Implementar um conversor entre as unidades citadas.

**Etapas:**
1. Quinária → Duodecimal + Vigesimal + Sexagesimal.
2. Duodecimal → Quinária + Vigesimal + Sexagesimal.
3. Vigesimal → Quinária + Duodecimal + Sexagesimal.
4. Sexagesimal → Quinária + Duodecimal + Vigesimal.

**Bases Referências:**
- Decimal + Binária + Octal + Hexadecimal.
- Quinária + Duodecimal + Vigesimal + Sexagesimal.

**Requisitos:** Java 19 ou superior.

**Instruções para Compilar e Executar:**
```bash
git clone https://github.com/teofilonicolau/desafioBaseNumerica
cd desafioBaseNumerica
javac ConversorBasesCaso1.java ConversorBasesCaso2.java
java ConversorBasesCaso1
java ConversorBasesCaso2


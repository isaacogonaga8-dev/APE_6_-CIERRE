<div align="center">

# 📊 Arreglos en Java · APE 6 + Deber

**Del `arreglo[0]` al `Arrays.binarySearch()`: práctica completa de arreglos unidimensionales** 🚀

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Tema](https://img.shields.io/badge/Tema-Arreglos-blue)
![Grupo](https://img.shields.io/badge/Grupo-6-purple)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen)

</div>

---

## 📖 Descripción

Este repositorio reúne **todo el trabajo de arreglos en Java** en tres bloques:

| Bloque | Qué incluye | Nivel |
|--------|-------------|-------|
| 📝 **Deber** | Ejercicios de índices, recorridos y operaciones básicas | 🟢 Básico |
| 🧮 **APE 6 · Primera Parte** | Problemas de la vida real con ciclos, acumuladores y condiciones | 🟡 Intermedio |
| 🔍 **APE 6 · Segunda Parte (Grupo 6)** | Búsqueda, arreglos paralelos y la clase `java.util.Arrays` | 🟠 Integrador |

---

## 🗂️ Índice

- [📝 Deber: Arreglos en Java](#-deber-arreglos-en-java)
- [🧮 APE 6 · Primera Parte](#-ape-6--primera-parte)
- [🔍 APE 6 · Segunda Parte](#-ape-6--segunda-parte)

# 📝 Deber: Arreglos en Java

Práctica de clase para dominar lo esencial: **declarar, indexar, recorrer y operar**.

### 1️⃣ Declaración e índices

Dado `edades = {18, 21, 19, 25, 30}`:

- ✅ Imprimir el **primer elemento**.
- ✅ Cambiar el índice 2 por el valor **22**.
- ✅ Mostrar el **último elemento** usando `.length`.

```text
Primer elemento: 18
Arreglo modificado: [18, 21, 22, 25, 30]
Último elemento: 30
```

### 2️⃣ Recorrido inverso

Dado `String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};`, recorrerlo con un `for` **de atrás hacia adelante** e imprimir cada día.

```text
Viernes
Jueves
Miércoles
Martes
Lunes
```

### 3️⃣ Suma y promedio

Dado `int[] notas = {14, 16, 12, 19};`, calcular la **suma total** y el **promedio exacto con decimales** (¡cuidado con la división entera! 😉).

```text
Suma total: 61
Promedio: 15.25
```

---

# 🧮 APE 6 · Primera Parte

### 1️⃣ 💸 Control de gastos semanales y ajuste por inflación

Se registran los gastos de **7 días** en un `double[]` y luego:

- ✅ Se calcula el **gasto total** y el **promedio diario**.
- ✅ Se aplica un **aumento del 10 %** *solo* a los días cuyo gasto superó el promedio.
- ✅ Se muestra el arreglo actualizado en **orden inverso**.
- ✅ Se indica **cuántos días** sufrieron el incremento.

```text
Gastos: 10, 20, 30, 40, 50, 60, 70

Total: 280.00 | Promedio: 40.00
Arreglo actualizado (orden inverso):
77.00  66.00  55.00  40.00  30.00  20.00  10.00
Días con aumento: 3
```

### 2️⃣ 🏭 Filtro y suma condicionada de producción

Se ingresan las piezas fabricadas en **10 turnos** (`int[]`) y se calcula:

- ✅ La **suma de las piezas en índices pares** (0, 2, 4...).
- ✅ Cuántos turnos produjeron una cantidad **impar y mayor a 15**.
- ✅ El **promedio general** con **2 decimales**.

```text
Piezas por turno: 12 17 8 21 15 30 19 4 25 9

Suma en índices pares: 79
Turnos impares con más de 15 piezas: 4
Promedio general de producción: 16.00
```

### 3️⃣ 🎓 Análisis de asistencia y rendimiento

Se pide la cantidad `n` de estudiantes, se crea `int[] notas` de tamaño `n` y se llena **solo con notas válidas (0 a 20)**. Luego se obtiene:

- ✅ El **promedio general** (sin división entera).
- ✅ **Aprobados** (nota ≥ 14) y **reprobados**.
- ✅ La lista de estudiantes con nota **estrictamente por debajo del promedio**.

```text
Notas: 18, 12, 15, 9, 16

Promedio del curso: 14.00
Aprobados: 3 | Reprobados: 2
Por debajo del promedio:
- Estudiante 2
- Estudiante 4
```

---

# 🔍 APE 6 · Segunda Parte

> **Arreglos en Java (Día 2) · Grupo 6**

### 1️⃣ 🔎 Búsqueda y conteo

Dado `int[] numeros = {14, 7, 25, 3, 18, 7, 30};`, el programa pide un número por teclado y muestra **cuántas veces aparece** y su **primera posición**. Si no existe, imprime `No existe` (se usa `posicion = -1` como bandera).

```text
Ingresa un número: 7
Aparece 2 veces
Primera posición: 1

Ingresa un número: 99
No existe
```

### 2️⃣ 🏆 Máximo y mínimo con arreglos paralelos

Con `String[] nombres = {"Ana", "Luis", "Marta", "Pedro"}` y `int[] notas = {15, 8, 18, 11}` (relacionados por el **mismo índice**), se muestra:

- ✅ Nombre y nota **más alta** (`posMax`).
- ✅ Nombre y nota **más baja** (`posMin`).
- ✅ **Promedio** con 2 decimales.

```text
Nota más alta: Marta (18)
Nota más baja: Luis (8)
Promedio: 13.00
```

### 3️⃣ 🧰 Integrador con `java.util.Arrays`

Con `int[] datos = {14, 7, 25, 3, 18};`:

- ✅ Crear una **copia real** con `Arrays.copyOf`.
- ✅ **Ordenar solo la copia** con `Arrays.sort`.
- ✅ Mostrar **ambos arreglos** con `Arrays.toString`.
- ✅ Indicar el **segundo número mayor**.
- ✅ Obtener la posición del **14** en la copia con `Arrays.binarySearch`.






## 🧠 Lo que se practica

- Declaración, llenado e **indexación** de arreglos (`int[]`, `double[]`, `String[]`)
- Uso de **`.length`** y recorridos con `for` (normal e **inverso**)
- Lectura de datos con **`Scanner`**
- **Acumuladores**, **contadores** y **banderas** (`posicion = -1`)
- Condicionales simples y compuestas (`&&`, `%`, `>`, `>=`)
- **Casting** para evitar la división entera
- **Arreglos paralelos** y búsqueda de máximo/mínimo con `posMax` y `posMin`
- `java.util.Arrays`: `copyOf`, `sort`, `toString` y `binarySearch`
- Formato de salida con `printf` / `String.format("%.2f")`
- **Validación** de entradas con `while` / `do-while`

---


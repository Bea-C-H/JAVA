# Comando `wc` en Linux

El comando `wc` en Linux se utiliza para contar el número de líneas, palabras y caracteres en un archivo o entrada estándar. Su nombre proviene de **word count** (conteo de palabras).

## 📌 **Sintaxis**
```bash
wc [opciones] [archivo]
```

## 📌 **Opciones Comunes**

| Opción  | Descripción |
|---------|------------|
| `-l`    | Muestra el número de líneas |
| `-w`    | Muestra el número de palabras |
| `-c`    | Muestra el número de bytes |
| `-m`    | Muestra el número de caracteres |
| `-L`    | Muestra la longitud de la línea más larga |

## 📌 **Ejemplos**

### 1️⃣ Contar líneas, palabras y bytes de un archivo
```bash
wc archivo.txt
```
📌 **Salida esperada:**
```
  10  50  250 archivo.txt
```
👉 Muestra **10 líneas**, **50 palabras** y **250 bytes**.

---

### 2️⃣ Contar solo líneas
```bash
wc -l archivo.txt
```
📌 **Salida esperada:**
```
10 archivo.txt
```
👉 Muestra **10 líneas** en el archivo.

---

### 3️⃣ Contar solo palabras
```bash
wc -w archivo.txt
```
📌 **Salida esperada:**
```
50 archivo.txt
```
👉 Muestra **50 palabras** en el archivo.

---

### 4️⃣ Contar caracteres en lugar de bytes
```bash
wc -m archivo.txt
```
📌 **Salida esperada:**
```
240 archivo.txt
```
👉 Indica **240 caracteres**, útil para archivos con codificación multibyte como UTF-8.

---

### 5️⃣ Mostrar la longitud de la línea más larga
```bash
wc -L archivo.txt
```
📌 **Salida esperada:**
```
35 archivo.txt
```
👉 Indica que la línea más larga tiene **35 caracteres**.

---

### 6️⃣ Contar palabras en la entrada estándar
```bash
echo "Hola mundo, esto es un test" | wc -w
```
📌 **Salida esperada:**
```
6
```
👉 Cuenta **6 palabras** en la línea ingresada.

---

🔹 **Consejo:** Puedes combinar `wc` con otros comandos como `ls`, `cat` o `grep` para análisis de archivos más avanzados.


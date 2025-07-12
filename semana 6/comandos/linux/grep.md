
# Uso del Comando `grep` en Linux

El comando `grep` en Linux se usa para buscar texto dentro de archivos. Su nombre significa **"Global Regular Expression Print"** y permite encontrar palabras o patrones específicos dentro de un archivo o la salida de otro comando.

## 📌 **Ejemplos Básicos de `grep`**

### 1️⃣ **Buscar una palabra en un archivo**

```bash
grep "palabra" archivo.txt
```

🔍 Muestra las líneas que contienen `"palabra"` dentro de `archivo.txt`.

---

### 2️⃣ **Buscar sin importar mayúsculas o minúsculas (`-i`)**

```bash
grep -i "palabra" archivo.txt
```

🔍 Encuentra "Palabra", "PALABRA", "palabra", etc.

---

### 3️⃣ **Buscar una palabra en varios archivos**

```bash
grep "error" *.log
```

🔍 Busca `"error"` en todos los archivos con extensión `.log`.

---

### 4️⃣ **Mostrar el número de línea donde aparece la coincidencia (`-n`)**

```bash
grep -n "fallo" archivo.txt
```

🔍 Muestra la línea donde aparece `"fallo"`.

---

### 5️⃣ **Buscar líneas que NO contienen un patrón (`-v`)**

```bash
grep -v "debug" archivo.log
```

🔍 Muestra todas las líneas que **NO** contienen `"debug"`.

---

### 6️⃣ **Buscar en la salida de otro comando**

```bash
ps aux | grep firefox
```

🔍 Filtra los procesos en ejecución para encontrar los relacionados con `"firefox"`.

---

### 7️⃣ **Resaltar la coincidencia en color (`--color`)**

```bash
grep --color "usuario" archivo.txt
```

🔍 Muestra las coincidencias resaltadas.

---

### 8️⃣ **Buscar con una expresión regular (`-E`)**

```bash
grep -E "error|fail|critical" archivo.log
```

🔍 Busca `"error"`, `"fail"` o `"critical"` en el archivo.

---

## 🎯 **Ejemplo Práctico con tu Actividad**

Si quisieras encontrar pistas en los archivos dentro de `GuaridaDeEnel`, podrías hacer algo como:

```bash
grep "tesoro" *
```

🔍 Esto buscaría la palabra `"tesoro"` en todos los archivos dentro de la carpeta.

Si quieres buscar dentro de archivos ocultos también:

```bash
grep "tesoro" .* *
```

---

### 🔥 **Consejo Extra: Buscar Recursivamente (`-r`)**

Si necesitas buscar en subdirectorios:

```bash
grep -r "pista" .
```

🔍 Busca `"pista"` en todos los archivos y subcarpetas.

---


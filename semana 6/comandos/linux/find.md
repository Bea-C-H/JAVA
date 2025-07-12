# Comando `find` en Linux

El comando `find` en Linux se usa para buscar archivos y directorios dentro de un sistema de archivos basado en diversos criterios como nombre, tipo, tamaño y fecha de modificación.

## 📌 **Sintaxis**
```bash
find [ruta] [opciones] [expresión]
```

## 📌 **Opciones Comunes**

| Opción  | Descripción |
|---------|------------|
| `-name` | Busca por nombre de archivo (sensible a mayúsculas) |
| `-iname` | Busca por nombre de archivo (insensible a mayúsculas) |
| `-type` | Filtra por tipo (`f` para archivos, `d` para directorios) |
| `-size` | Busca por tamaño de archivo (`+10M` mayor a 10MB, `-10M` menor a 10MB) |
| `-mtime` | Filtra por fecha de modificación (`-7` archivos modificados en los últimos 7 días) |
| `-exec` | Ejecuta un comando sobre los archivos encontrados |

## 📌 **Ejemplos**

### 1️⃣ Buscar un archivo por nombre
```bash
find /home -name "archivo.txt"
```
📌 **Salida esperada:**
```
/home/user/documentos/archivo.txt
```
👉 Busca `archivo.txt` en el directorio `/home` y subdirectorios.

---

### 2️⃣ Buscar archivos sin distinguir mayúsculas
```bash
find /home -iname "archivo.txt"
```
👉 Encuentra `archivo.txt`, `Archivo.txt`, `ARCHIVO.TXT`, etc.

---

### 3️⃣ Buscar todos los archivos en un directorio
```bash
find /home/user -type f
```
👉 Lista solo archivos dentro de `/home/user`.

---

### 4️⃣ Buscar todos los directorios en un directorio
```bash
find /home/user -type d
```
👉 Lista solo directorios dentro de `/home/user`.

---

### 5️⃣ Buscar archivos mayores a 10MB
```bash
find /var/log -size +10M
```
👉 Encuentra archivos de más de **10 megabytes** dentro de `/var/log`.

---

### 6️⃣ Buscar archivos modificados en los últimos 7 días
```bash
find /home -mtime -7
```
👉 Encuentra archivos modificados en los últimos **7 días**.

---

### 7️⃣ Buscar y eliminar archivos de más de 30 días
```bash
find /tmp -mtime +30 -exec rm {} \;
```
👉 Busca archivos en `/tmp` con más de **30 días** y los elimina.

---

### 8️⃣ Buscar archivos y ejecutar un comando sobre ellos
```bash
find /var/log -name "*.log" -exec gzip {} \;
```
👉 Comprime todos los archivos `.log` dentro de `/var/log`.

---

🔹 **Consejo:** `find` es útil para automatizar tareas y gestionar archivos eficientemente.
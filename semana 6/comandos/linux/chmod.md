# Comando `chmod` en Linux

El comando `chmod` en Linux se utiliza para cambiar los permisos de archivos y directorios. Permite definir quién puede leer (`r`), escribir (`w`) y ejecutar (`x`) un archivo o directorio.

## 📌 **Sintaxis**
```bash
chmod [opciones] modo archivo
```

## 📌 **Modos de Permiso**
Los permisos se pueden definir de dos maneras:

1. **Modo simbólico**: Usa letras (`u`, `g`, `o`, `a`) para definir permisos.
2. **Modo numérico**: Usa valores octales (`0-7`) para definir permisos.

## 📌 **Modo Simbólico**

| Símbolo | Descripción |
|---------|------------|
| `u`    | Usuario propietario (user) |
| `g`    | Grupo (group) |
| `o`    | Otros (others) |
| `a`    | Todos (all) |
| `+`    | Agregar permiso |
| `-`    | Quitar permiso |
| `=`    | Asignar permiso específico |

### 1️⃣ Dar permisos de ejecución al usuario propietario
```bash
chmod u+x archivo.sh
```
👉 El usuario propietario ahora puede ejecutar `archivo.sh`.

### 2️⃣ Quitar permiso de escritura a otros
```bash
chmod o-w archivo.txt
```
👉 Los demás usuarios no podrán escribir en `archivo.txt`.

### 3️⃣ Dar permisos de lectura y escritura a grupo
```bash
chmod g+rw documento.doc
```
👉 El grupo ahora puede leer y escribir en `documento.doc`.

### 4️⃣ Quitar todos los permisos a otros
```bash
chmod o-rwx archivo.conf
```
👉 Los demás usuarios no pueden leer, escribir ni ejecutar `archivo.conf`.

### 5️⃣ Asignar permisos específicos a todos
```bash
chmod a=r archivo.txt
```
👉 Todos los usuarios solo pueden leer `archivo.txt`.

## 📌 **Modo Numérico (Octal)**

| Valor | Permisos |
|--------|----------------|
| `0` | Sin permisos (`---`) |
| `1` | Solo ejecución (`--x`) |
| `2` | Solo escritura (`-w-`) |
| `3` | Escritura y ejecución (`-wx`) |
| `4` | Solo lectura (`r--`) |
| `5` | Lectura y ejecución (`r-x`) |
| `6` | Lectura y escritura (`rw-`) |
| `7` | Todos los permisos (`rwx`) |

### 6️⃣ Dar permisos completos al usuario, lectura y ejecución al grupo y nada a otros
```bash
chmod 750 script.sh
```
👉 Usuario (`rwx`), Grupo (`r-x`), Otros (`---`).

### 7️⃣ Permitir solo lectura a todos los usuarios
```bash
chmod 444 archivo.txt
```
👉 Solo lectura (`r-- r-- r--`).

### 8️⃣ Permitir lectura y escritura al usuario y grupo, pero solo lectura a otros
```bash
chmod 664 documento.doc
```
👉 Usuario (`rw-`), Grupo (`rw-`), Otros (`r--`).

### 9️⃣ Dar permisos totales a todos
```bash
chmod 777 publico.sh
```
👉 Usuario (`rwx`), Grupo (`rwx`), Otros (`rwx`).

### 🔟 Remover todos los permisos de un archivo
```bash
chmod 000 privado.txt
```
👉 Ningún usuario puede acceder a `privado.txt`.

## 📌 **Ejemplos Avanzados**

### 1️⃣1️⃣ Aplicar permisos de ejecución a todos los scripts de un directorio
```bash
chmod +x *.sh
```
👉 Todos los archivos `.sh` en el directorio serán ejecutables.

### 1️⃣2️⃣ Cambiar permisos recursivamente en un directorio
```bash
chmod -R 755 /var/www/
```
👉 Asigna `755` a todos los archivos y subdirectorios en `/var/www/`.

### 1️⃣3️⃣ Aplicar permisos solo a directorios
```bash
find /mi_directorio -type d -exec chmod 755 {} \;
```
👉 Cambia permisos a `755` solo en directorios dentro de `/mi_directorio/`.

### 1️⃣4️⃣ Aplicar permisos solo a archivos
```bash
find /mi_directorio -type f -exec chmod 644 {} \;
```
👉 Cambia permisos a `644` solo en archivos dentro de `/mi_directorio/`.

### 1️⃣5️⃣ Dar permisos de ejecución solo a archivos de un tipo específico
```bash
find /scripts -name "*.sh" -exec chmod +x {} \;
```
👉 Hace ejecutables todos los scripts `.sh` en `/scripts/`.

---

🔹 **Consejo:** El uso de `chmod` junto con `chown` (para cambiar el propietario) y `chgrp` (para cambiar el grupo) es clave para una correcta administración de permisos en Linux.

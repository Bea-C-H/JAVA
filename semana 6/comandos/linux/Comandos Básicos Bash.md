# Comandos Básicos de Bash en Linux

Estos son los comandos más comunes en Bash para la navegación y manipulación de archivos y directorios en Linux.

## 📌 **1. Comandos de Navegación**

### 🔹 Moverse entre directorios (`cd`)
| Comando | Descripción |
|---------|------------|
| `cd /ruta/del/directorio` | Cambia al directorio especificado |
| `cd ..` | Sube un nivel en el sistema de archivos |
| `cd ~` | Cambia al directorio home del usuario |
| `cd -` | Vuelve al último directorio visitado |

#### **Ejemplo:**
```bash
cd /home/user/documentos
```
👉 Cambia al directorio `documentos` dentro de `/home/user`.

---

## 📌 **2. Comandos de Manipulación de Archivos y Directorios**

### 🔹 Crear directorios (`mkdir`)
| Comando | Descripción |
|---------|------------|
| `mkdir nombre_directorio` | Crea un nuevo directorio |
| `mkdir -p ruta/directorio` | Crea directorios anidados |

#### **Ejemplo:**
```bash
mkdir mi_directorio
```
👉 Crea un directorio llamado `mi_directorio`.

---

### 🔹 Listar contenido de directorios (`ls`)
| Comando | Descripción |
|---------|------------|
| `ls` | Lista los archivos y directorios |
| `ls -l` | Lista con detalles como permisos y tamaño |
| `ls -a` | Muestra archivos ocultos |
| `ls -lh` | Muestra el tamaño en formato legible |
| `ls -lt` | Ordena por fecha de modificación |

#### **Ejemplo:**
```bash
ls -lah
```
👉 Lista archivos con detalles, incluyendo ocultos y tamaño legible.

---

### 🔹 Copiar archivos y directorios (`cp`)
| Comando | Descripción |
|---------|------------|
| `cp archivo destino` | Copia un archivo |
| `cp -r carpeta destino` | Copia un directorio de forma recursiva |

#### **Ejemplo:**
```bash
cp documento.txt /home/user/backup/
```
👉 Copia `documento.txt` a la carpeta `backup`.

---

### 🔹 Mover y renombrar archivos (`mv`)
| Comando | Descripción |
|---------|------------|
| `mv archivo destino` | Mueve o renombra un archivo |
| `mv carpeta destino` | Mueve o renombra un directorio |

#### **Ejemplo:**
```bash
mv archivo.txt nuevo_nombre.txt
```
👉 Renombra `archivo.txt` a `nuevo_nombre.txt`.

---

### 🔹 Eliminar archivos y directorios (`rm` y `rmdir`)
| Comando | Descripción |
|---------|------------|
| `rm archivo` | Elimina un archivo |
| `rm -r directorio` | Elimina un directorio y su contenido |
| `rm -f archivo` | Fuerza la eliminación sin confirmación |
| `rmdir directorio` | Elimina un directorio vacío |

#### **Ejemplo:**
```bash
rm -rf mi_carpeta
```
👉 Elimina `mi_carpeta` y su contenido sin confirmación.

---

## 📌 **3. Comandos de Información del Sistema**

### 🔹 Mostrar la ruta actual (`pwd`)
```bash
pwd
```
👉 Muestra el directorio actual.

---

### 🔹 Mostrar procesos en ejecución (`ps` y `top`)
| Comando | Descripción |
|---------|------------|
| `ps aux` | Muestra los procesos en ejecución |
| `top` | Muestra procesos en tiempo real |
| `htop` | Interfaz gráfica mejorada para monitoreo (requiere instalación) |

#### **Ejemplo:**
```bash
top
```
👉 Muestra procesos en tiempo real con uso de CPU y memoria.

---

### 🔹 Mostrar espacio en disco (`df` y `du`)
| Comando | Descripción |
|---------|------------|
| `df -h` | Muestra el uso del disco en formato legible |
| `du -sh directorio` | Muestra el tamaño total de un directorio |

#### **Ejemplo:**
```bash
df -h
```
👉 Muestra el espacio libre y usado de los discos.

---

### 🔹 Mostrar memoria RAM disponible (`free`)
```bash
free -h
```
👉 Muestra el uso de memoria RAM en formato legible.

---

## 📌 **4. Comandos de Permisos y Propiedad**

### 🔹 Cambiar permisos (`chmod`)
```bash
chmod 755 archivo.sh
```
👉 Otorga permisos de ejecución al usuario y lectura a los demás.

### 🔹 Cambiar propietario (`chown`)
```bash
chown usuario:grupo archivo.txt
```
👉 Cambia el propietario y grupo de `archivo.txt`.

---

## 📌 **5. Otros Comandos Útiles**

### 🔹 Buscar archivos (`find` y `locate`)
| Comando | Descripción |
|---------|------------|
| `find /ruta -name archivo.txt` | Busca un archivo por nombre |
| `locate archivo.txt` | Busca un archivo en la base de datos del sistema (requiere `updatedb`) |

#### **Ejemplo:**
```bash
find /home -type f -name "*.txt"
```
👉 Busca archivos `.txt` en `/home`.

---

### 🔹 Ver historial de comandos (`history`)
```bash
history
```
👉 Muestra los últimos comandos ejecutados.

### 🔹 Limpiar pantalla (`clear`)
```bash
clear
```
👉 Borra el contenido de la terminal.

---

🚀 **Estos son los comandos esenciales para moverse y administrar archivos en Linux. **

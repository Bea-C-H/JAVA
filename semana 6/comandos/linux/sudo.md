# Comando `sudo` en Linux

El comando `sudo` en Linux permite ejecutar comandos con privilegios de superusuario (root). Es útil para administrar el sistema, instalar software y modificar archivos protegidos.

## 📌 **Sintaxis**
```bash
sudo [opciones] [comando]
```

## 📌 **Opciones Comunes**

| Opción | Descripción |
|--------|------------|
| `-l`   | Muestra los comandos que el usuario puede ejecutar con `sudo` |
| `-v`   | Renueva la autenticación de `sudo` sin ejecutar un comando |
| `-k`   | Invalida la sesión de autenticación actual de `sudo` |
| `-u usuario` | Ejecuta el comando como otro usuario |
| `-s`   | Inicia un shell con privilegios de `sudo` |
| `-i`   | Inicia una sesión de root con el entorno de root |

## 📌 **Ejemplos Básicos**

### 1️⃣ Ejecutar un comando con privilegios de superusuario
```bash
sudo apt update
```
👉 Ejecuta la actualización de paquetes en Debian/Ubuntu.

### 2️⃣ Ejecutar un comando como otro usuario
```bash
sudo -u usuario whoami
```
👉 Ejecuta `whoami` como el usuario especificado.

### 3️⃣ Cambiar a root y abrir un shell interactivo
```bash
sudo -s
```
👉 Inicia un shell con privilegios de superusuario.

### 4️⃣ Cambiar a root con su entorno de usuario
```bash
sudo -i
```
👉 Abre una sesión completa de root con su entorno.

### 5️⃣ Ver qué comandos puede ejecutar un usuario con sudo
```bash
sudo -l
```
👉 Lista los comandos que el usuario actual puede ejecutar con `sudo`.

### 6️⃣ Forzar la expiración de la sesión de sudo
```bash
sudo -k
```
👉 Hace que se requiera autenticación la próxima vez que se use `sudo`.

## 📌 **Ejemplos Avanzados**

### 7️⃣ Ejecutar un script con permisos de superusuario
```bash
sudo ./script.sh
```
👉 Ejecuta un script con privilegios de `sudo`.

### 8️⃣ Editar un archivo protegido
```bash
sudo nano /etc/hosts
```
👉 Abre el archivo `/etc/hosts` con `nano` usando permisos de `sudo`.

### 9️⃣ Cambiar el propietario de un archivo
```bash
sudo chown usuario:grupo archivo.txt
```
👉 Cambia el propietario de `archivo.txt`.

### 🔟 Eliminar un archivo protegido
```bash
sudo rm /archivo_protegido
```
👉 Borra un archivo que requiere permisos de `sudo`.

### 1️⃣1️⃣ Reiniciar el sistema
```bash
sudo reboot
```
👉 Reinicia el sistema inmediatamente.

### 1️⃣2️⃣ Apagar el sistema
```bash
sudo shutdown -h now
```
👉 Apaga el sistema inmediatamente.

### 1️⃣3️⃣ Reiniciar el sistema en 10 minutos
```bash
sudo shutdown -r +10
```
👉 Programa un reinicio en 10 minutos.

### 1️⃣4️⃣ Dar permisos de `sudo` a un usuario
```bash
sudo usermod -aG sudo usuario
```
👉 Agrega `usuario` al grupo `sudo` para que tenga permisos.

### 1️⃣5️⃣ Verificar si el usuario tiene permisos de `sudo`
```bash
sudo -v
```
👉 Si el usuario tiene acceso, `sudo` se autenticará sin ejecutar ningún comando.

---

🔹 **Consejo:** `sudo` es una herramienta poderosa, úsala con precaución para evitar cambios irreversibles en el sistema.

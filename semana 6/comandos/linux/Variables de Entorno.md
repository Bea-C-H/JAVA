# Variables de Entorno en Linux

Las **variables de entorno** son valores almacenados en el sistema que afectan el comportamiento de los procesos y comandos. Se utilizan para definir rutas, configuraciones y preferencias del usuario o del sistema.

## 📌 **Cómo Ver las Variables de Entorno**

### 🔹 Mostrar todas las variables de entorno
```bash
env
```
👉 Muestra todas las variables de entorno del sistema.

### 🔹 Mostrar una variable específica
```bash
echo $VARIABLE
```
#### **Ejemplo:**
```bash
echo $HOME
```
👉 Muestra el directorio home del usuario actual.

### 🔹 Listar variables de entorno con `printenv`
```bash
printenv
```
👉 Similar a `env`, muestra todas las variables de entorno.

---

## 📌 **Principales Variables de Entorno**

| Variable | Descripción |
|----------|------------|
| `$HOME`  | Ruta del directorio personal del usuario |
| `$USER`  | Nombre del usuario actual |
| `$PATH`  | Rutas donde el sistema busca los ejecutables |
| `$PWD`   | Directorio de trabajo actual |
| `$SHELL` | Ruta del shell predeterminado |
| `$LANG`  | Idioma y codificación predeterminados |
| `$EDITOR` | Editor de texto predeterminado |
| `$LOGNAME` | Nombre de usuario de la sesión actual |

---

## 📌 **Variable `$PATH`**
La variable `$PATH` define los directorios donde el sistema busca los ejecutables al ejecutar comandos.

### 🔹 Ver el contenido de `$PATH`
```bash
echo $PATH
```
👉 Muestra la lista de directorios donde se buscan los comandos.

### 🔹 Agregar un directorio a `$PATH`
```bash
export PATH=$PATH:/ruta/nueva
```
👉 Agrega `/ruta/nueva` al `$PATH` de la sesión actual.

### 🔹 Agregar una ruta de forma permanente
```bash
echo 'export PATH=$PATH:/ruta/nueva' >> ~/.bashrc
source ~/.bashrc
```
👉 Agrega la nueva ruta al `$PATH` de manera permanente en el archivo `~/.bashrc`.

---

## 📌 **Cómo Definir y Usar Variables de Entorno**

### 🔹 Crear una variable de entorno temporal
```bash
export MI_VARIABLE="Hola Mundo"
echo $MI_VARIABLE
```
👉 Define `MI_VARIABLE` y muestra su valor.

### 🔹 Crear una variable permanente
```bash
echo 'export MI_VARIABLE="Hola Mundo"' >> ~/.bashrc
source ~/.bashrc
```
👉 Agrega la variable al archivo `~/.bashrc` para que sea persistente.

### 🔹 Eliminar una variable de entorno
```bash
unset MI_VARIABLE
```
👉 Borra `MI_VARIABLE` de la sesión actual.

---

🚀 **Las variables de entorno son esenciales para la configuración del sistema y scripts en Linux.**

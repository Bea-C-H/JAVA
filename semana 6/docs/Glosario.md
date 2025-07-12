# GLOSARIO TÉCNICO DE JAVA 

### CONCEPTOS FUNDAMENTALES Y ESTRUCTURA BÁSICA
| Término          | Descripción Técnica                                                              | Explicación Simple                                                                   |
| ---------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| **Clase**        | Plano o plantilla que define atributos y comportamientos (métodos) de un objeto. | Es como una receta que describe cómo deben ser y qué pueden hacer ciertos objetos.   |
| **Objeto**       | Instancia concreta de una clase, con datos propios y comportamientos definidos.  | Es algo real creado a partir de una receta (clase), como un pastel hecho con receta. |
| **Instancia**    | Objeto concreto creado a partir de una clase.                                    | Es cuando usas una receta (clase) para crear un objeto real.                         |
| **main**         | Método principal desde donde se inicia la ejecución de un programa Java.         | Es el punto de partida, como el botón de “iniciar” del programa.                     |
| **Constructor**  | Método especial que se llama automáticamente al crear un objeto.                 | Es lo que se ejecuta al nacer un objeto; le da forma y valores iniciales.            |
| **Método**       | Conjunto de instrucciones dentro de una clase que realiza una acción específica. | Es como una función o acción que puede hacer un objeto, como “encender” un auto.     |
| **Atributo**     | Variable dentro de una clase que representa características del objeto.          | Es una propiedad, como el “color” de un auto o el “nombre” de una persona.           |
| **Variable**     | Espacio en memoria que guarda un valor con un nombre identificador.              | Es como una cajita con nombre donde guardas un dato, como un número o una palabra.   |
| **Tipo de dato** | Define qué tipo de valor puede guardar una variable (int, boolean, etc.).        | Dice si la cajita guarda números, palabras, sí/no, etc.                              |
| **this**         | Referencia al objeto actual dentro de su propia clase.                           | Es como decir “yo mismo” dentro de una clase.                                        |
| **super**        | Permite acceder a métodos y atributos de la clase padre (superclase).            | Es como decir “usa lo de mi padre” si el objeto hereda de otro.                      |


---

### CONTROL DE FLUJO Y ESTRUCTURAS DE DECISIÓN
| Término    | Descripción Técnica                                                  | Explicación Simple                                                          |
| ---------- | -------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| **if**     | Estructura de control que ejecuta código si se cumple una condición. | Es como decir: “si pasa esto, haz esto”.                                    |
| **else**   | Parte del `if` que se ejecuta si la condición no se cumple.          | Si no pasa lo de antes, entonces haz esto otro.                             |
| **for**    | Bucle que repite una acción un número específico de veces.           | Repite algo una cantidad fija de veces, como contar del 1 al 10.            |
| **while**  | Bucle que repite una acción mientras una condición sea verdadera.    | Repite mientras se cumpla algo, como seguir caminando mientras haya camino. |
| **bloque** | Conjunto de instrucciones encerradas entre llaves `{}`.              | Es una cajita de código que se ejecuta junta.                               |
| **scope**  | Define dónde una variable es visible y accesible en el código.       | Es el área donde una variable existe y puede usarse.                        |



---
###  MODIFICADORES Y ACCESO MODIFICADORES Y ACCESO

| Término                   | Descripción Técnica                                                                  | Explicación Simple                                                       |
| ------------------------- | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| **public**                | Modificador de acceso que permite que otros vean o usen algo.                        | Significa que algo está disponible para todos.                           |
| **private**               | Modificador de acceso que restringe el uso a la misma clase.                         | Solo se puede usar dentro de su propia clase.                            |
| **modificador de acceso** | Palabras clave que controlan el nivel de visibilidad de clases, atributos y métodos. | Determinan si algo es “público” (todos), “privado” (sólo la clase), etc. |
| **static**                | Indica que un miembro pertenece a la clase, no a sus instancias.                     | Es algo común para todos los objetos creados.                            |
| **final**                 | Define que un valor no puede cambiar o que una clase no puede extenderse.            | Es como decir “esto no se puede modificar o sobrescribir”.               |

---

### PROGRAMACIÓN ORIENTADA A OBJETOS (POO)
| Término             | Descripción Técnica                                                 | Explicación Simple                                                       |
| ------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| **interface**       | Tipo especial de clase que solo declara métodos sin implementarlos. | Es como un contrato que obliga a implementar ciertas acciones.           |
| **abstract**        | Clase o método incompleto que debe completarse en una subclase.     | Es como una idea que necesita ser terminada por otra clase.              |
| **extends**         | Indica que una clase hereda de otra.                                | Es como decir “soy hijo de esta clase” y heredo sus comportamientos.     |
| **implements**      | Indica que una clase está siguiendo un contrato (una interfaz).     | Es como prometer que se cumplirán ciertas funciones.                     |
| **encapsulamiento** | Principio que oculta la lógica interna y expone solo lo necesario.  | Es como proteger los datos para que no se usen de forma incorrecta.      |
| **herencia**        | Permite que una clase tome atributos y métodos de otra.             | Es como heredar rasgos de tus padres.                                    |
| **polimorfismo**    | Permite que el mismo método funcione de distintas formas.           | Es como una herramienta que se adapta según el objeto con el que se use. |
| **instanceof**      | Verifica si un objeto pertenece a una clase específica.             | Pregunta: “¿esto es un perro?” y responde sí o no.                       |
| **override**        | Reescribe un método heredado para cambiar su comportamiento.        | Es como modificar una receta heredada por una propia versión.            |
---
### TIPOS DE DATOS PRIMITIVOS Y OBJETOS ENVOLTORIO

| Término     | Descripción Técnica                                                | Explicación Simple                                              |
| ----------- | ------------------------------------------------------------------ | --------------------------------------------------------------- |
| **int**     | Tipo de dato para enteros (sin decimales).                         | Guarda números como 5 o 100.                                    |
| **double**  | Tipo de dato para números decimales.                               | Guarda números con coma, como 3.14.                             |
| **boolean** | Tipo de dato para verdadero/falso.                                 | Guarda respuestas de sí o no.                                   |
| **String**  | Objeto que representa una secuencia de caracteres.                 | Guarda textos como nombres o frases.                            |
| **null**    | Valor especial que indica que una variable no tiene ningún objeto. | Es como una caja vacía, sin nada adentro.                       |
| **Scanner** | Clase para leer entrada de datos del teclado u otras fuentes.      | Permite que el usuario escriba algo que el programa pueda usar. |


---

### COLECCIONES Y ESTRUCTURAS DE DATOS

| Término         | Descripción Técnica                                                                     | Explicación Simple                                                            |
| --------------- | --------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **List**        | Interfaz que representa una colección ordenada que puede contener elementos duplicados. | Es como una lista donde cada cosa tiene un orden y puede repetirse.           |
| **ArrayList**   | Implementación de List basada en un arreglo dinámico.                                   | Es una lista que puede crecer automáticamente mientras agregas cosas.         |
| **LinkedList**  | Lista donde cada elemento apunta al siguiente.                                          | Es como una cadena donde cada eslabón sabe quién es el siguiente.             |
| **Set**         | Colección que no permite elementos duplicados.                                          | Es como una bolsa donde no puedes meter el mismo objeto dos veces.            |
| **HashSet**     | Implementación de Set basada en una tabla hash.                                         | Es un Set rápido, pero sin orden fijo de los elementos.                       |
| **Map**         | Estructura que almacena pares clave-valor.                                              | Es como una agenda donde cada nombre (clave) tiene un teléfono (valor).       |
| **HashMap**     | Implementación de Map que no mantiene el orden de los elementos.                        | Es un mapa rápido para buscar cosas por nombre, sin preocuparse por el orden. |
| **TreeMap**     | Implementación de Map que ordena los elementos por clave.                               | Igual que HashMap, pero mantiene las claves ordenadas.                        |
| **Iterator**    | Objeto que permite recorrer una colección secuencialmente.                              | Es como un puntero que te permite revisar los elementos uno a uno.            |
| **Collections** | Clase utilitaria con métodos estáticos para operar sobre colecciones.                   | Es una caja de herramientas para listas, mapas, etc.                          |

---

###  FUNCIONALIDAD MODERNA Y JAVA 8+

| Término       | Descripción Técnica                                                 | Explicación Simple                                                             |
| ------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
| **Lambda**    | Función anónima que se puede usar como una expresión compacta.      | Es como una mini-función sin nombre que puedes pasar a otra función.           |
| **Stream**    | Flujo de datos que permite procesar colecciones de forma funcional. | Es una forma elegante y rápida de trabajar con listas (como filtrar, ordenar). |
| **filter()**  | Operación de Stream que filtra elementos según una condición.       | Elige solo los elementos que cumplen una regla.                                |
| **map()**     | Operación de Stream que transforma cada elemento.                   | Cambia cada cosa de la lista a otra cosa.                                      |
| **forEach()** | Aplica una acción a cada elemento de una colección.                 | Hace algo con cada cosa de la lista.                                           |
| **Optional**  | Contenedor para valores que pueden estar o no presentes.            | Es como una cajita que puede estar vacía o tener un valor.                     |
| **Predicate** | Interfaz funcional que recibe un valor y devuelve true/false.       | Es una regla que dice si algo cumple una condición.                            |
| **Consumer**  | Interfaz funcional que recibe un valor y no devuelve nada.          | Hace algo con un valor, pero no regresa nada.                                  |
| **Function**  | Interfaz funcional que toma un valor y devuelve otro.               | Transforma un valor en otro.                                                   |


---

### HILOS, CONCURRENCIA Y PROCESAMIENTO

| Término             | Descripción Técnica                                                   | Explicación Simple                                                    |
| ------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **Thread**          | Hilo de ejecución independiente dentro de un programa.                | Es como una línea de tareas que corre en paralelo con otras.          |
| **Runnable**        | Interfaz que define una tarea que puede ejecutarse en un hilo.        | Es el trabajo que se le asigna a un hilo.                             |
| **synchronized**    | Palabra clave que evita conflictos al acceder a recursos compartidos. | Asegura que solo una persona a la vez pueda usar una cosa compartida. |
| **sleep()**         | Método que pausa un hilo por un tiempo determinado.                   | Es como decirle a un hilo “tómate una siesta”.                        |
| **ExecutorService** | API que maneja la ejecución de múltiples hilos de forma controlada.   | Es un organizador que reparte tareas entre varios hilos.              |

---

### EXCEPCIONES Y CONTROL DE ERRORES

| Término              | Descripción Técnica                                      | Explicación Simple                                                |
| -------------------- | -------------------------------------------------------- | ----------------------------------------------------------------- |
| **try**              | Bloque donde se ejecuta código que podría fallar.        | Intenta hacer algo que podría causar error.                       |
| **catch**            | Bloque que se ejecuta si ocurre un error.                | Aquí se dice qué hacer si algo sale mal.                          |
| **finally**          | Bloque que se ejecuta siempre, ocurra o no un error.     | Es lo que pasa sí o sí al final.                                  |
| **throw**            | Lanza una excepción de forma manual.                     | Grita “¡error!” para que lo atrape alguien más.                   |
| **throws**           | Declara que un método puede lanzar una excepción.        | Es un aviso: “este método puede fallar, ten cuidado”.             |
| **Exception**        | Clase base para todos los errores que se pueden manejar. | Es la forma técnica de representar errores.                       |
| **RuntimeException** | Errores que ocurren mientras el programa está corriendo. | Son errores que no te obligan a atraparlos, pero pueden aparecer. |

---
### JAVA MODERNO (JDK 14–21)

| Término                | Descripción Técnica                                                      | Explicación Simple                                            |
| ---------------------- | ------------------------------------------------------------------------ | ------------------------------------------------------------- |
| **record**             | Tipo especial de clase para almacenar datos inmutables.                  | Es como una clase corta y automática para guardar datos.      |
| **sealed**             | Clase que restringe qué otras clases pueden extenderla.                  | Controla quién puede heredarla.                               |
| **var**                | Permite declarar una variable sin especificar el tipo (Java lo infiere). | Java adivina el tipo de dato según lo que le pongas.          |
| **switch (con yield)** | Estructura mejorada para múltiples decisiones, que devuelve valores.     | El nuevo “switch” que puede devolver cosas directamente.      |
| **Pattern Matching**   | Permite extraer y verificar tipos más fácilmente.                        | Hace que verificar el tipo de datos sea más simple y directo. |
---

### Organización y modularidad del código

| Término       | Descripción Técnica                                                      | Explicación Simple                                          |
| ------------- | ------------------------------------------------------------------------ | ----------------------------------------------------------- |
| **package**   | Grupo de clases agrupadas lógicamente bajo un nombre de espacio común.   | Es como una carpeta para organizar clases relacionadas.     |
| **import**    | Instrucción para usar clases de otro paquete.                            | Es como traer una herramienta de otra caja para usarla acá. |
| **classpath** | Ruta que define dónde buscar las clases necesarias al compilar/ejecutar. | Le dice a Java dónde encontrar los archivos del proyecto.   |
---

###  Compilación y ejecución

| Término      | Descripción Técnica                                                                | Explicación Simple                                                         |
| ------------ | ---------------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| **JVM**      | Java Virtual Machine: ejecuta el bytecode generado por el compilador Java.         | Es el motor que corre tu programa Java, como si fuera una consola virtual. |
| **JRE**      | Java Runtime Environment: incluye la JVM y librerías para ejecutar programas Java. | Es lo necesario para correr un programa Java.                              |
| **JDK**      | Java Development Kit: incluye JRE + herramientas para desarrollar en Java.         | Es el kit completo para crear programas Java.                              |
| **Bytecode** | Código intermedio generado por el compilador Java.                                 | Es como el idioma que la JVM entiende.                                     |
| **compilar** | Proceso de convertir el código fuente a bytecode.                                  | Es traducir tu código para que Java lo pueda ejecutar.                     |
---
### Buenas prácticas y arquitectura

| Término  | Descripción Técnica                                                                | Explicación Simple                                            |
| -------- | ---------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| **POJO** | Plain Old Java Object: clase simple sin lógica extra, solo atributos y métodos.    | Es una clase simple y “limpia”, usada para representar datos. |
| **DAO**  | Data Access Object: patrón que separa la lógica de acceso a base de datos.         | Es una clase que se encarga solo de leer/escribir datos.      |
| **MVC**  | Modelo-Vista-Controlador: patrón para separar la lógica de negocio y presentación. | Divide el código en partes: datos, interfaz y acciones.       |
---

### Seguridad y acceso

| Término          | Descripción Técnica                                            | Explicación Simple                                                 |
| ---------------- | -------------------------------------------------------------- | ------------------------------------------------------------------ |
| **Serializable** | Interfaz que permite convertir un objeto en un flujo de bytes. | Es como guardar un objeto para enviarlo o almacenarlo.             |
| **transient**    | Modificador que evita que un atributo se serialice.            | Es como decir: “este campo no lo guardes cuando envíes el objeto”. |

### Java moderno (Java 14-21)

| Término               | Descripción Técnica                                            | Explicación Simple                                   |
| --------------------- | -------------------------------------------------------------- | ---------------------------------------------------- |
| **switch expression** | Versión moderna del switch que devuelve valores (con `yield`). | Puedes guardar directamente el resultado del switch. |
| **text block**        | Sintaxis con `"""` para escribir textos multilínea.            | Sirve para escribir párrafos o HTML de forma limpia. |
| **pattern matching**  | Permite verificar tipos y extraer valores más fácilmente.      | Hace el código de validación más claro y directo.    |


### SPRING BOOT Y DESARROLLO WEB

| Término                                          | Descripción Técnica                                                                                        | Explicación Simple                                                        |
|--------------------------------------------------| ---------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| **Spring Boot**                                  | Framework basado en Spring que permite crear aplicaciones Java de forma rápida y con mínima configuración. | Es una herramienta que simplifica crear aplicaciones web con Java.        |
| **Spring**                                       | Framework para crear aplicaciones Java modulares, escalables y basadas en componentes.                     | Es como un conjunto de piezas para construir una app profesional en Java. |
| **@SpringBootApplication**                       | Anotación principal que combina varias configuraciones base para iniciar la app.                           | Es el botón “Start” de tu app Spring Boot.                                |
| **application.properties** o **application.yml** | Archivo de configuración para definir puertos, base de datos, variables, etc.                              | Es el archivo donde le dices a la app cómo debe funcionar.                |
| **Anotación** (`@Annotation`)                    | Estructura especial de Java que añade metadatos al código y puede ser usada por herramientas o frameworks para cambiar su comportamiento. | Es como una etiqueta que le dice a Java o Spring qué hacer con esa clase o método. |

---
### ANOTACIONES DE CONTROLADOR Y PETICIONES HTTP
| Término             | Descripción Técnica                                                            | Explicación Simple                                                            |
| ------------------- | ------------------------------------------------------------------------------ | ----------------------------------------------------------------------------- |
| **@RestController** | Marca una clase como controlador REST que responde con datos (no vistas HTML). | Es donde defines las respuestas a peticiones web, como una API.               |
| **@GetMapping**     | Asocia un método con una petición HTTP GET.                                    | Sirve para mostrar o consultar datos (ej: listar usuarios).                   |
| **@PostMapping**    | Asocia un método con una petición HTTP POST.                                   | Sirve para crear nuevos datos (ej: registrar un usuario).                     |
| **@PutMapping**     | Asocia un método con una petición HTTP PUT.                                    | Sirve para reemplazar completamente un dato existente.                        |
| **@PatchMapping**   | Asocia un método con una petición HTTP PATCH.                                  | Sirve para actualizar parcialmente un dato.                                   |
| **@DeleteMapping**  | Asocia un método con una petición HTTP DELETE.                                 | Sirve para eliminar un dato (ej: borrar una cuenta).                          |
| **@RequestMapping** | Anotación general para mapear cualquier tipo de método HTTP.                   | Es más flexible, pero requiere indicar el tipo de petición (GET, POST, etc.). |

### ANOTACIONES DE PARÁMETROS DE PETICIÓN
| Término           | Descripción Técnica                                                 | Explicación Simple                                           |
| ----------------- | ------------------------------------------------------------------- | ------------------------------------------------------------ |
| **@RequestBody**  | Convierte el cuerpo de una petición HTTP en un objeto Java.         | Sirve para recibir datos completos, como formularios o JSON. |
| **@PathVariable** | Extrae valores directamente desde la URL.                           | Extrae partes de la ruta como un ID (`/usuarios/5`).         |
| **@RequestParam** | Extrae parámetros que vienen como parte de la URL (`?nombre=Juan`). | Sirve para leer datos pequeños enviados en la URL.           |

### ESTRUCTURA DE CAPAS Y DEPENDENCIAS

| Término                       | Descripción Técnica                                                   | Explicación Simple                                                        |
| ----------------------------- | --------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| **@Service**                  | Marca una clase como parte de la lógica de negocio.                   | Es donde se programan las acciones principales de tu aplicación.          |
| **@Repository**               | Marca una clase como responsable del acceso a datos.                  | Es quien se encarga de leer y guardar datos en la base de datos.          |
| **@Component**                | Marca una clase genérica para que Spring la gestione automáticamente. | Spring la detecta y la usa como una pieza de la app.                      |
| **@Autowired**                | Inyecta automáticamente una dependencia.                              | Spring se encarga de darte lo que necesitas sin que lo crees manualmente. |
| **Inyección de dependencias** | Patrón que permite delegar la creación de objetos a Spring.           | En vez de crear los objetos a mano, Spring te los entrega listos.         |
| **ApplicationContext**        | Contenedor de Spring que maneja todos los componentes (beans).        | Es como el cerebro que coordina todo en tu app.                           |
| **Bean**                      | Objeto administrado por Spring dentro del ApplicationContext.         | Es una pieza del sistema que Spring controla automáticamente.             |
---
### SPRING DATA JPA Y BASE DE DATOS

| Término             | Descripción Técnica                                                                | Explicación Simple                                                 |
| ------------------- | ---------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| **Spring Data JPA** | Módulo que facilita trabajar con bases de datos mediante interfaces y anotaciones. | Es la forma rápida de guardar, buscar y actualizar datos con Java. |
| **Entity**          | Clase Java que representa una tabla en la base de datos.                           | Es una clase que se guarda como si fuera una fila en una tabla.    |
| **@Entity**         | Marca una clase como entidad para persistencia en base de datos.                   | Le dice a Spring que esa clase se debe guardar como datos.         |
| **@Id**             | Indica qué atributo será la clave primaria.                                        | Marca el identificador único de cada fila.                         |
| **@GeneratedValue** | Genera automáticamente el valor del ID (normalmente incremental).                  | Spring se encarga de asignar un ID único automáticamente.          |
---
###  COMUNICACIÓN CLIENTE-SERVIDOR Y API REST

| Término               | Descripción Técnica                                             | Explicación Simple                                                                        |
| --------------------- | --------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| **API REST**          | Conjunto de reglas para crear servicios web usando HTTP y URLs. | Es una forma estándar de conectar apps, como frontend y backend.                          |
| **Request**           | La petición que hace el cliente al servidor.                    | Es el mensaje que se envía, como “quiero ver mi perfil”.                                  |
| **Response**          | La respuesta que da el servidor al cliente.                     | Es lo que el servidor te devuelve, como los datos de tu perfil.                           |
| **Status Code**       | Código que indica el resultado de una petición HTTP.            | Es una señal del servidor: 200 (OK), 404 (no encontrado), 500 (error del servidor).       |
| **Body (cuerpo)**     | Parte de la petición o respuesta que contiene los datos reales. | Es como el contenido del paquete, no solo la etiqueta.                                    |
| **Header (cabecera)** | Información adicional enviada con la petición o respuesta.      | Es como la metadata: tipo de contenido, credenciales, idioma, etc.                        |
| **JSON**              | Formato estándar para enviar datos en APIs REST.                | Es una forma de escribir datos como texto que entiende tanto el cliente como el servidor. |

### PETICIONES HTTP Y MÉTODOS REST

| Método HTTP | Descripción Técnica                                                               | Explicación Simple                                               |
| ----------- | --------------------------------------------------------------------------------- | ---------------------------------------------------------------- |
| **GET**     | Solicita datos desde el servidor. No modifica nada. Es seguro y se puede cachear. | Es como decir: “muéstrame la información”.                       |
| **POST**    | Envía datos al servidor para crear un nuevo recurso.                              | Es como llenar un formulario y enviarlo.                         |
| **PUT**     | Envía datos al servidor para reemplazar completamente un recurso existente.       | Es como sobrescribir un archivo con una nueva versión.           |
| **PATCH**   | Envía datos para modificar parcialmente un recurso existente.                     | Es como corregir una parte de un documento sin reescribir todo.  |
| **DELETE**  | Pide al servidor eliminar un recurso.                                             | Es como decir: “borra esto del sistema”.                         |
| **HEAD**    | Igual que GET pero sin el contenido de la respuesta, solo cabeceras.              | Sirve para verificar si un recurso existe, sin bajarlo completo. |
| **OPTIONS** | Pide qué métodos están disponibles para una URL específica.                       | Es como preguntar: “¿qué puedo hacer con este recurso?”          |

---

### SPRING SECURITY Y AUTENTICACIÓN
| Término                  | Descripción Técnica                                                                     | Explicación Simple                                                                   |
| ------------------------ | --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| **Spring Security**      | Módulo de Spring que gestiona autenticación, autorización y protección de aplicaciones. | Es el guardia que decide quién entra y qué puede hacer en tu app.                    |
| **JWT (JSON Web Token)** | Estándar para autenticar usuarios mediante un token cifrado.                            | Es como una credencial digital que demuestra que estás autenticado.                  |
| **Authentication**       | Proceso de verificar la identidad del usuario.                                          | Es confirmar quién eres (por ejemplo, con usuario y contraseña).                     |
| **Authorization**        | Proceso de verificar qué acciones puede realizar el usuario autenticado.                | Es verificar qué puedes hacer según tu rol o permisos.                               |
| **@PreAuthorize**        | Anotación que permite definir permisos antes de ejecutar un método.                     | Se usa para decir: “solo los ADMIN pueden acceder a este método”.                    |
| **SecurityConfig**       | Clase de configuración personalizada de seguridad.                                      | Es donde defines cómo proteger tus rutas, qué roles hay, cómo se manejan los tokens. |
| **Role (Rol)**           | Conjunto de permisos asociados a un usuario.                                            | Es como decir: “soy ADMIN, así que puedo hacer más cosas que un usuario normal”.     |
| **CORS**                 | Permite controlar qué dominios pueden acceder a tu API desde el navegador.              | Evita errores cuando el frontend y el backend están en sitios distintos.             |
---

###  TESTING EN SPRING BOOT

| Término              | Descripción Técnica                                                                 | Explicación Simple                                                                  |
| -------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| **Testing**          | Proceso de verificar que el software funciona correctamente.                        | Es como hacerle pruebas a tu app para asegurarte de que no se rompe.                |
| **Unit Test**        | Prueba que verifica el comportamiento de una clase o método aislado.                | Se prueba una cosa a la vez, como si testearas un tornillo antes de armar todo.     |
| **Integration Test** | Prueba que verifica cómo trabajan varias partes del sistema juntas.                 | Se prueba que las piezas conectadas (como servicio y base de datos) funcionen bien. |
| **@SpringBootTest**  | Anotación que carga todo el contexto de Spring para pruebas completas.              | Sirve para probar toda la app como si estuviera corriendo normalmente.              |
| **@WebMvcTest**      | Anotación que carga solo los controladores web para testear rutas y respuestas.     | Ideal para testear tus APIs sin cargar la base de datos.                            |
| **MockMvc**          | Herramienta para simular peticiones HTTP en pruebas sin necesidad de servidor real. | Te permite probar tus endpoints como si fueras Postman, pero dentro del test.       |
| **Mockito**          | Biblioteca que permite simular objetos y comportamientos en tests.                  | Puedes “fingir” respuestas para probar sin depender de otros módulos reales.        |
| **assertEquals()**   | Verifica que dos valores sean iguales en un test.                                   | Es como decir: “espero que el resultado sea X” y validar que así fue.               |

# 🧠 **Lógica del Proyecto**  

## 📌 1. Descripción  
**Nombre del Proyecto:** GESTION DE TAREAS PENDIENTES
**Fecha:** 02-03-2025
**Autor:** UZIEL ALEJANDRO

Clases principales:
1. Clase Tarea:
La clase Tarea representa una tarea dentro del sistema. Cada tarea tiene una descripción y un estado que indica si está completada o no.

Atributos:

descripcion: Una cadena de texto que describe la tarea.
completada: Un valor booleano que indica si la tarea ha sido completada o no.
Métodos:

Constructor (Tarea(String descripcion)): Inicializa la descripción de la tarea y establece su estado completada a false por defecto.
Métodos getter y setter:
getDescripcion(): Devuelve la descripción de la tarea.
isCompletada(): Devuelve el estado de la tarea (si está completada).
marcarComoCompletada(): Marca la tarea como completada.
toString(): Sobrescribe el método toString() para representar la tarea de manera legible, mostrando un check (✔) si la tarea está completada y un cuadro vacío ( ) si no lo está.
2. Clase Gestion_Tareas_Pendientes:
Esta es la clase principal donde el usuario interactúa con el sistema a través de un menú en la consola.

Atributos:

listaTareas: Una lista de objetos Tarea, que almacena todas las tareas que el usuario ha ingresado.
scanner: Un objeto Scanner para leer la entrada del usuario desde la consola.
opcion: Un entero que almacena la opción seleccionada por el usuario en el menú.
Lógica del programa: El flujo principal del programa se ejecuta dentro de un bucle do-while, el cual continúa mostrando el menú y procesando las opciones hasta que el usuario elige salir (opción 5).

Menú de opciones:

Opción 1: Agregar tarea:
El usuario ingresa una descripción de la tarea, que luego es añadida a la lista de tareas como un nuevo objeto Tarea.
Opción 2: Marcar tarea como completada:
Muestra la lista de tareas, permite al usuario seleccionar una tarea por su índice e indica que esa tarea se ha completado.
Opción 3: Ver todas las tareas:
Muestra todas las tareas en la lista, independientemente de si están completadas o no.
Opción 4: Ver solo tareas incompletas:
Filtra y muestra solo las tareas que aún no han sido completadas.
Opción 5: Salir:
Termina el programa.
Flujo de ejecución del programa:
El programa inicia mostrando un menú con las opciones disponibles.
El usuario selecciona una opción introduciendo el número correspondiente.
Según la opción elegida:
Opción 1: El programa solicita una descripción y agrega una nueva tarea a la lista.
Opción 2: El programa muestra las tareas y permite al usuario seleccionar una para marcar como completada.
Opción 3: El programa imprime todas las tareas.
Opción 4: El programa imprime solo las tareas incompletas utilizando un filtro en los streams.
El programa repite el proceso hasta que el usuario selecciona la opción 5, que termina la ejecución.
Uso de Streams:
El programa usa la API de Streams de Java 8 para filtrar las tareas incompletas. En la opción 4, se utiliza stream() junto con el método filter() para obtener solo las tareas que no están marcadas como completadas. Luego, forEach() se usa para imprimir cada tarea.

java
Copiar
listaTareas.stream()
    .filter(t -> !t.isCompletada())
    .forEach(System.out::println);
Manejo de Errores:
El programa permite al usuario ingresar un número de tarea en el caso de marcarla como completada. Si el número de índice es inválido (fuera de los límites de la lista), se muestra un mensaje de error.
Mejoras posibles:
Validación de entradas: Aunque el programa maneja el caso de un índice inválido en el caso de marcar la tarea como completada, podría beneficiarse de una validación más general para otras entradas del usuario, como asegurar que las opciones seleccionadas en el menú sean válidas.
Eliminar tareas: Se podría añadir una opción para eliminar tareas de la lista.
Guardar y cargar tareas: La aplicación podría persistir las tareas en un archivo para que los usuarios no pierdan las tareas cuando cierran el programa.
Conclusión:
Este código proporciona una funcionalidad básica pero eficaz para gestionar tareas pendientes. Es un excelente punto de partida para aprender sobre la manipulación de listas, el uso de objetos, y cómo interactuar con los usuarios a través de la consola en Java.



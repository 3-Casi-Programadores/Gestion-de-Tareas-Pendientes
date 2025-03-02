# 🧠 **Lógica del Proyecto**  

## 📌 1. Descripción  
**Nombre del Proyecto:** GESTION DE TAREAS PENDIENTES
**Fecha:** 02-03-2025
**Autor:** UZIEL ALEJANDRO

📢 **Resumen:**  
# Lógica para la Gestión de Tareas Pendientes

## 1. Definición de la Clase `Tarea`
- Debe representar una tarea con:
  - **Descripción**: Un texto que indica la tarea.
  - **Estado**: Un indicador que muestra si la tarea está completada o no.
- Debe incluir métodos para:
  - **Marcar la tarea como completada**.
  - **Mostrar la tarea en formato `[ ] Descripción` si está pendiente y `[✓] Descripción` si está completada**.

---

## 2. Creación de la Clase `GestorTareas`
- Debe gestionar una lista de tareas usando **ArrayList**.
- Debe permitir:
  - **Agregar nuevas tareas**.
  - **Marcar una tarea como completada** a partir de su posición en la lista.
  - **Mostrar todas las tareas** con su estado actual.
  - **Filtrar y mostrar solo las tareas pendientes** utilizando **Streams y Lambda**.

---

## 3. Interacción con el Usuario (`Main`)
- Se debe utilizar **Scanner** para recibir comandos del usuario.
- El programa debe mostrar un **menú** con opciones para:
  1. **Agregar una tarea**.
  2. **Marcar una tarea como completada**.
  3. **Mostrar todas las tareas**.
  4. **Mostrar solo las tareas pendientes**.
  5. **Salir del programa**.
- Cada opción debe ejecutar la acción correspondiente en `GestorTareas`.

---

## 4. Consideraciones Adicionales
- Validar que los índices ingresados por el usuario sean correctos al marcar tareas como completadas.
- Mostrar mensajes adecuados cuando la lista esté vacía o todas las tareas estén completadas.
- Utilizar **bucles y condicionales** para gestionar el flujo del programa.
- Aplicar buenas prácticas de programación y modularidad en el código.

---

## **Objetivo del Ejercicio**
✅ Usar **ArrayList** para manejar la lista de tareas.  
✅ Aplicar **Streams y Lambda** para filtrar tareas pendientes.  
✅ Implementar **Scanner** para la interacción con el usuario.  
✅ Diseñar un programa que sea **modular, claro y eficiente**.  




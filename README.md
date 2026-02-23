# SmartTask - Gestor de Tareas en Consola

**SmartTask** es una aplicación de consola desarrollada en **Java** que permite gestionar tareas diarias de forma eficiente. El proyecto aplica conceptos fundamentales de la Programación Orientada a Objetos (POO), incluyendo herencia, interfaces, clases abstractas y polimorfismo.

## 🚀 Características

* **Gestión de Tareas**: Agregar, listar, completar y eliminar tareas.
* **Tipos de Tareas**: Soporte para tareas **Urgentes** y **Normales**.
* **Generación de IDs**: Asignación automática de identificadores únicos aleatorios.
* **Validación de Entradas**: Manejo de excepciones para evitar cierres inesperados ante datos inválidos.
* **Pruebas Unitarias**: Suite de pruebas implementada con **JUnit** para asegurar la integridad del código.

## 🏗️ Arquitectura y Diseño

La aplicación sigue una estructura organizada para facilitar su mantenimiento:

* **`Accionable` (Interface)**: Define el contrato de comportamiento para cualquier gestor de tareas.
* **`Tarea` (Clase Abstracta)**: Base para los diferentes tipos de tareas, encapsulando atributos comunes como ID, nombre y estado.
* **`TareaUrgente` / `TareaNormal**`: Especializaciones que heredan de `Tarea`.
* **`GestorTareas`**: Clase principal que implementa la lógica de negocio utilizando colecciones (`ArrayList`).
* **`App`**: Punto de entrada de la aplicación con un menú interactivo.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje**: Java 17+
* **Testing**: JUnit 4
* **Herramientas**: Java Collections Framework, Manejo de Excepciones.

## 🚦 Instalación y Uso

1. **Clonar el repositorio:**
```bash
git clone https://github.com/victoriamunozrobles-bot/smartTask_project.git

```


2. **Compilar el proyecto:**
```bash
javac *.java

```


1. **Ejecutar la aplicación:**
```bash
java App


## 🧪 Pruebas Unitarias

Para ejecutar las pruebas y verificar que todo funcione correctamente, asegúrate de tener JUnit en tu classpath y ejecuta:

```bash
.\compileAndTest.bat

Este archivo contiene los comandos necesarios para ejecutar las pruebas unitarias, y se ejecutarán automáticamente si lo llamamos.


### 💡 Notas del Desarrollador

Este proyecto fue creado con fines educativos para practicar:

* El uso de `List` y `ArrayList`.
* La implementación de interfaces y herencia.
* Escritura de pruebas unitarias para garantizar que el borrado y completado de tareas funcione según lo esperado.


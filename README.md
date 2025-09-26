# TaskMate App
---

**Proyecto desarrollado por:**
* **J.A. Vega Reyes** (autor de este repositorio)

Este proyecto fue desarrollado para la **Unidad de Aprendizaje "Desarrollo de Aplicaciones Móviles"**, en la **Escuela Superior de Cómputo** del **Instituto Politécnico Nacional** en la Unidad Zacatenco, Ciudad de México.

---
## 💡 Importante
### Requisitos de Visualización y Ejecución
>[!IMPORTANT]
El proyecto **TaskMate App** se ha implementado, probado y ejecutado con:
* **Android Studio** (versión **Iguana | 2023.2.1**)
* **SDK de Android 13 (API 33)**

Es importante considerar estas herramientas para su perfecta visualización.

### Repositorio Oficial
Si quieres visualizar directamente cómo funciona el proyecto, aquí te dejo un link al repositorio oficial:

( https://github.com/AngelChetosmen/TaskMate-App-AndroidStudio.git)  

>[!CAUTION]
---Es posible que la app no se ejecute correctamente en versiones de Android inferiores al API 29. Si por alguna razón no puedes visualizar o ejecutar la aplicación, contáctame para poder ayudarte a resolverlo lo más pronto posible.

## 📝 Descripción
>[! INFO]
El proyecto **TaskMate App** es una aplicación móvil desarrollada en **Java** y **XML** dentro de **Android Studio**.


La aplicación permite gestionar una **lista de tareas personales**, incluyendo funcionalidades para agregar, editar, marcar como importantes y eliminar tareas. También integra menús de navegación y componentes visuales modernos para mejorar la experiencia del usuario.

---
## 📂 Estructura del Proyecto
El proyecto está organizado en los siguientes módulos y directorios principales:

### Código Fuente (`app/src/main/java/com/example/taskmate/`):
* **`MainActivity.java`**: Actividad principal con la vista de lista de tareas.
* **`Task.java`**: Clase modelo que representa una tarea.
* **`TaskAdapter.java`**: Adaptador para gestionar la visualización de las tareas en listas.
* **`TaskDatabase.java`**: Implementación de base de datos local (Room/SQLite).
* **`AddTaskActivity.java`**: Actividad para añadir nuevas tareas.
* **`EditTaskActivity.java`**: Actividad para editar tareas existentes.

### Recursos de Interfaz (`app/src/main/res/`):
* `layout/`: Archivos XML que definen la interfaz de usuario.
* `menu/`: Archivos de menús (menú inferior, menú de tres puntos).
* `drawable/`: Iconos y recursos gráficos.
* `values/`: Strings, estilos y colores personalizados.

### Configuración:
* `AndroidManifest.xml`: Archivo de configuración de la aplicación.
* `build.gradle`: Configuración de dependencias y compilación.

---
## ✨ Funcionalidades Principales
### Gestión de Tareas:
* **Agregar tarea**: Crear nuevas tareas con título, descripción y fecha.
* **Editar tarea**: Modificar datos de tareas existentes.
* **Eliminar tarea**: Borrar tareas de la lista.
* **Marcar como importante**: Resaltar las tareas prioritarias.
* **Visualización de lista**: Mostrar todas las tareas almacenadas.

### Interfaz de Usuario:
* **Menú superior**: Acceso rápido a opciones adicionales (tres puntos).
* **Menú inferior**: Navegación entre Inicio, Datos, Compras y Salir.
* **Diseño responsivo**: Interfaz intuitiva y adaptada para móviles.
* **Selector de fecha (DatePicker)**: Permite elegir la fecha de vencimiento de cada tarea.
* **Selector de horóscopo (Spinner)**: Ejemplo de uso de menús desplegables en formularios.

---
## 🛠 Requisitos
* **Android Studio**: Iguana | 2023.2.1 o superior.
* **JDK 11** o superior: Requerido para compilar el proyecto.
* **Dispositivo o Emulador Android**: API 29 o superior (recomendado **API 33**).
* **Gradle**: Incluido en la instalación de Android Studio.

---
## ⚙️ Instalación y Ejecución
1.  **Clonar el Repositorio**:
    ```bash
    git clone [https://github.com/AngelChetosmen/TaskMate-App-AndroidStudio.git](https://github.com/AngelChetosmen/TaskMate-App-AndroidStudio.git)
    ```
2.  **Abrir en Android Studio**:
    * Selecciona `File > Open` y abre la carpeta del proyecto clonado.
3.  **Sincronizar Dependencias**:
    * Android Studio descargará automáticamente las dependencias necesarias con Gradle.
4.  **Ejecutar la Aplicación**:
    * Conecta un dispositivo físico o inicia un emulador.
    * Haz clic en `Run > Run 'app'`.

---
## 🤝 Contribuciones
Las contribuciones son bienvenidas. Para cambios grandes, por favor abre un **issue** primero para discutir lo que te gustaría mejorar.

---
## 📄 Licencia y Aviso Legal
Este proyecto está licenciado bajo los términos de la **licencia EUVA**. Consulta el repositorio oficial del autor original J.A. Vega Reyes `LICENSE` para más detalles.

>[!WARNING]
**Aclaración sobre el Origen:**
* Este proyecto fue desarrollado por el autor mencionado (J.A. Vega Reyes).
* El objetivo de este repositorio es contar con un espacio para la **consulta pública** del proyecto. Personalmente, yo, J.A. Vega Reyes, no tengo inconveniente con el análisis, visualización e incluso mejoras en la aplicación.
* No existe la garantía de que el **Instituto Politécnico Nacional** y la **Escuela Superior de Cómputo** puedan dar su consentimiento respecto a una mejora o modificación.
* Por lo tanto, se recomienda **citar el origen del proyecto** para evitar posibles plagios o problemas futuros.

---
¡Gracias por leer este README como parte de la documentacion de este pruyecto. Disfruta de analizar este proyecto!
Saludos.     :D

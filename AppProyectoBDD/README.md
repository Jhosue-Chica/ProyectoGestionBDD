# Base de Datos para la Gestión de Gobiernos Autónomos Descentralizados Provinciales (GADP) - Sistema en Java

## Descripción

Este proyecto consiste en una base de datos implementada en SQL para la gestión de Gobiernos Autónomos Descentralizados Provinciales (GADP). La aplicación correspondiente está desarrollada en Java y utiliza esta base de datos para almacenar y gestionar la información relacionada con los GADP.

## Estructura de la Base de Datos

La base de datos está diseñada para contener información relevante sobre los GADP, incluyendo detalles sobre su administración, proyectos, empleados y otras entidades asociadas. A continuación, se detalla la estructura básica de las tablas principales:

## Instrucciones de Implementación

1. **Crear la Base de Datos:**
   - Ejecutar el script SQL proporcionado (`create_database.sql`) para crear la base de datos y las tablas necesarias.

2. **Configurar la Conexión a la Base de Datos en Java:**
   - Modificar el archivo de configuración del sistema Java (`config.properties`) para incluir la información de conexión a la base de datos (URL, usuario, contraseña).

3. **Integración con la Aplicación Java:**
   - Incorporar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la aplicación Java utilizando las consultas SQL correspondientes.

## Requisitos del Sistema

- Java JDK (versión X o superior).
- Sistema de gestión de base de datos compatible (MySQL, PostgreSQL, etc.).
- Conexión a Internet para la descarga de dependencias (si se utilizan bibliotecas externas).

## Ejemplo de Configuración (`config.properties`)

```properties
# Configuración de la Base de Datos
db.url=jdbc:mysql://localhost:3306/nombre_base_datos
db.usuario=usuario_bd
db.contraseña=contraseña_bd
```

## Contribuciones

Siéntase libre de contribuir al desarrollo de este proyecto. Puede informar problemas, sugerir mejoras y enviar solicitudes de extracción.

---

**¡Gracias por contribuir al desarrollo de la gestión de Gobiernos Autónomos Descentralizados Provinciales!**

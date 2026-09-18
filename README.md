Contextualización:

Una biblioteca necesita desarrollar un sistema web que permita administrar los libros disponibles en su colección. 
El sistema será desarrollado utilizando Spring Boot y Thymeleaf, de manera que las páginas HTML sean generadas desde el servidor y puedan mostrar dinámicamente la información almacenada en la base de datos.
Toda la información del sistema deberá almacenarse en una base de datos relacional, utilizando Spring Data JPA para realizar las operaciones de persistencia.

Planteamiento:
Cada libro deberá estar registrado dentro del sistema junto con sus principales datos, como por ejemplo:

- Título
- Autor
- Género
- Año de publicación
- Precio
- Cantidad disponible
- Descripción

El sistema deberá permitir realizar las operaciones necesarias para gestionar los libros.

1. Registrar un nuevo libro.
2. Visualizar todos los libros registrados.
3. Consultar los datos de un libro.
4. Modificar los datos de un libro existente.
5. Eliminar un libro.

El sistema deberá contar con una interfaz web desarrollada con Thymeleaf, donde se puedan visualizar los libros mediante una tabla HTML.
Para el registro y modificación de libros se deberá utilizar un formulario HTML.
El formulario deberá utilizar th:object, th:field, th:action y las expresiones necesarias de Thymeleaf para trabajar con la entidad.
Por el momento, los libros no estarán relacionados con otras tablas o entidades.

Objetivo:
Desarrollar un CRUD completo utilizando:
1. Thymeleaf
2. Spring Data JPA
3. H2
4. Arquitectura por capas

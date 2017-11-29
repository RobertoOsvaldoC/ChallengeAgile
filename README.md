# ChallengeAgile

Tecnologías utilizadas:

- Base de datos: PostgreSQL

- ORM: JPA

- Framework de estilos: Boostrap

- Servidor de aplicaciones JavaScript: NodeJs



Montar el proyecto:

- Utilizar cualquier IDE para el Proyecto Spring Maven MVC (carpeta ch01), en mi caso utilice Intellij IDEA.

- Los datos de configuración de la BD (datasource), se encuentran en el archivo application.yml y esto es gracias a la dependencia del JPA. La creación automática de las tablas se realiza gracias a flywaydb, herramienta de migración de BD. Para utilizarla solo es necesario agregar la dependencia a MAVEN, y en las carpetas resources/db.migration se encuentran los script para la creación de las tablas.

- Ya con el back-end listo, correr el proyecto con Servidor Tomcat 8 embebido.

- En la carpeta frontend, montar el servidor con Grunt para visualizar la vista del proyecto.





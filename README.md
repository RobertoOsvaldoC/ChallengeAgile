# ChallengeAgile

Tecnologías utilizadas:

- Base de datos: PostgreSQL

- ORM: JPA

- Framework de estilos: Bootstrap

- Servidor de aplicaciones JavaScript: NodeJs


Montar el proyecto:

- Utilizar cualquier IDE para el Proyecto Spring Maven MVC (carpeta ch01), en mi caso utilice Intellij IDEA.

- Los datos de configuración de la BD (datasource), se encuentran en el archivo application.yml y esto es gracias a la dependencia del JPA. La creación automática de las tablas se realiza gracias a flywaydb, herramienta de migración de BD. Para utilizarla solo es necesario agregar la dependencia a MAVEN, y en las carpetas resources/db.migration se encuentran los scripts para la creación de las tablas.

- Ya con el back-end listo, correr el proyecto con Servidor Tomcat 8 embebido.

- En la carpeta frontend, montar el servidor con Grunt para visualizar la vista del proyecto.


Documentación de métodos Api REST:

Métodos para guardar una prioridad nueva y mostrar las prioridades creadas, en caso de que estén correctas retorna un status HTML :200, indicando que estan bien. En caso contrario envía un error. (No realice Eliminar, por un tema de tiempo)

		Guardar:function(descripcionParam){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/prioridad/guardar',
				params: {
					descripcion : descripcionParam
				},
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			});
		},

		Mostrar:function(){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/prioridad/traerTodo',
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			}).then(function successCallback(response){
				return response;
			});
		},

Funcionalidades para mostrar, guardar y eliminar tareas, en caso de que estén correctas retorna un status HTML :200, indicando que están bien. En caso contrario envía un error.

		Mostrar:function(){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/tarea/traerTodo',
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			}).then(function successCallback(response){
				console.log('retorna la promesa tarea service');
				return response;
			});
		},

		Guardar:function(descripcionParam, nombreParam,idprioridadParam){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/tarea/guardar',
				params: {
					nombretarea : nombreParam,
					descripcion : descripcionParam,
					idprioridad : idprioridadParam
				},
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			});
		},
		Eliminar:function(idTareaParam){
			return $http({
    			method: 'GET',
			    url: 'http://localhost:80/ch01/tarea/eliminar/',
			    params: {
			        idtarea: idTareaParam
			    },
			    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
				}).then(function(response) {
				}, function(rejection) {
				  
			});
		}

Método para actualizar los datos de una prioridad.

		Guardar:function(descripcionParam,idprioridadParam){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/prioridad/update',
				params: {
					descripcion : descripcionParam,
					idprioridad : idprioridadParam
				},
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			});
		}

Método para actualizar los datos de una tarea.

		Guardar:function(idtareaParam, nombreParam,descripcionParam,idprioridadParam){
			return $http({
				method: 'GET',
				url: 'http://localhost:80/ch01/tarea/update',
				params: {
					idtarea: idtareaParam,
					nombretarea: nombreParam,
					descripcion : descripcionParam,
					idprioridad : idprioridadParam
				},
				headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			});
		}
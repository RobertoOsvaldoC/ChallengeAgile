'use strict';

angular.module('frontendApp')
.service('TareaService', function($http){
	return{
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
	};
});
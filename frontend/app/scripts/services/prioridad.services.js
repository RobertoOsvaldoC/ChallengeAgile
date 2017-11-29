'use strict';

angular.module('frontendApp')
.service('PrioridadService', function($http){
	return{
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
	}
});
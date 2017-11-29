'use strict';

angular.module('frontendApp')
.service('UpdatePrioridadService', function($http){
	return{

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
	};
});
'use strict';

angular.module('frontendApp')
.service('UpdateTareaService', function($http){
	return{

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
	};
});
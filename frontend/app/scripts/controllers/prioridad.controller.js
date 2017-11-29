'use strict';

/**
 * @ngdoc function
 * @name frontendApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the frontendApp
 */
angular.module('frontendApp')
  .controller('PrioridadCtrl', function ($scope, PrioridadService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.descripcion;

    $scope.guardar=function(){
    	PrioridadService.Guardar($scope.descripcion);
    };

    $scope.listaPrioridades = [];
    $scope.mostrar = function(){
    	PrioridadService.Mostrar().then(
    		function(data){
    			$scope.listaTareas = data.data;
    		});
    };
  });

'use strict';

angular.module('frontendApp')
  .controller('UpdatePrioridadCtrl', function ($scope, UpdatePrioridadService, $routeParams,$http) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.descripcion=" ";
    $scope.idprioridad = $routeParams.idprioridad;

    $scope.guardar=function(){
    	UpdatePrioridadService.Guardar($scope.descripcion, $scope.idprioridad);
    };
 });
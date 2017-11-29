'use strict';

angular.module('frontendApp')
  .controller('UpdateTareaCtrl', function ($scope, UpdateTareaService, $routeParams,$http) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.nombre= " ";
    $scope.descripcion=" ";
    $scope.idprioridad;
    $scope.idtarea = $routeParams.idtarea;

    $scope.guardar=function(){
    	UpdateTareaService.Guardar($scope.idtarea,$scope.nombre, $scope.descripcion, $scope.idprioridad);
    };
 });
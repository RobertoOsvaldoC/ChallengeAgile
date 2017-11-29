'use strict';

/**
 * @ngdoc function
 * @name frontendApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontendApp
 */
angular.module('frontendApp')
  .controller('MainCtrl', function ($scope, TareaService, PrioridadService, $route, $location) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.listaTareas = [];
    $scope.listaPrioridades = [];
    $scope.mostrar = function(){
      TareaService.Mostrar().then(
        function(data){
          $scope.listaTareas = data.data;
        });
      console.log($scope.listaTareas);
      PrioridadService.Mostrar().then(
        function(data){
          $scope.listaPrioridades = data.data;
        });
    };

  

    $scope.eliminar=function(idtarea){
      TareaService.Eliminar(idtarea);
      $route.reload();
    };

    $scope.recibir=function(test){
      $location.url('/updateTarea'+test.idtarea);
    };
  });

angular.module('frontendApp')
  .controller('TareaCtrl', function ($scope, TareaService, PrioridadService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.nombre= " ";
    $scope.descripcion=" ";
    $scope.idprioridad= 0;

    $scope.guardar=function(){
    	TareaService.Guardar($scope.nombre, $scope.descripcion, $scope.idprioridad);
    };
});
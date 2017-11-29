'use strict';

/**
 * @ngdoc overview
 * @name frontendApp
 * @description
 * # frontendApp
 *
 * Main module of the application.
 */
angular
  .module('frontendApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/tarea', {
        templateUrl: 'views/tarea.html',
        controller: 'TareaCtrl',
        controllerAs: 'tarea'
      })
      .when('/prioridad', {
        templateUrl: 'views/prioridad.html',
        controller: 'PrioridadCtrl',
        controllerAs: 'prioridad'
      })
      .when('/updateTarea/:idtarea', {
        templateUrl: '/views/updateTarea.html',
        controller: 'UpdateTareaCtrl',
        controllerAs: 'updateTarea'
      })
      .when('/updatePrioridad/:idprioridad', {
        templateUrl: '/views/updatePrioridad.html',
        controller: 'UpdatePrioridadCtrl',
        controllerAs: 'updatePrioridad'
      })
      .otherwise({
        redirectTo: '/'
      });
  });

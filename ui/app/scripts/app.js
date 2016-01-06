'use strict';

(function(angular, _, app) {
  app = angular.module('wormClientApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    // Controllers
    'wormClientApp.controllers.mainController',
    // Services
    'wormClientApp.services.WormService'
  ]);


  app.config(function($routeProvider) {
    /*
    $routeProvider.when('/', {
      templateUrl: 'views/main.html',
      controller: 'MainCtrl',
      controllerAs: 'MainCtrl'
    }).otherwise({
      redirectTo: '/'
    });
    */
  });
}).call(this, angular, _);

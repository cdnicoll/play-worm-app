'use strict';

;
(function(angular, _, app) {
  app = angular.module('wormClientApp.controllers.mainController', []);

  app.controller('MainCtrl', [
    '$scope',
    'WormService',
    function($scope, WormService) {
      $scope.foo = WormService.getHeroById(5);
      console.log($scope.foo);
    }
  ]);

}).call(this, angular, _);




/*
angular.module('wormClientApp')
  .controller('MainCtrl', ['WormService', function(WormService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  }]);
*/
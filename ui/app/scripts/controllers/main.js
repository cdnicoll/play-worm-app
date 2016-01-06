'use strict';

;
(function(angular, _, app) {
  app = angular.module('wormClientApp.controllers.mainController', []);

  app.controller('MainCtrl', [
    '$scope',
    'WormService',
    function($scope, WormService) {
      WormService.getHeroById(5).then(function(hero) {
        console.log(hero);
      });

    }
  ]);

}).call(this, angular, _);

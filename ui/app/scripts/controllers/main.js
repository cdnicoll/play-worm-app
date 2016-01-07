'use strict';
(function(angular, _, app) {
  app = angular.module('wormClientApp.controllers.mainController', []);

  app.controller('MainCtrl', [
    '$scope',
    'WormService',
    function($scope, WormService) {

      $scope.heroes = [];
      $scope.selectedHero = null;
      $scope.showingContent = false;

      WormService.getAllHeroes().then(function(heroes) {
        $scope.heroes = heroes;
      });

      $scope.selectHero = function(hero) {
        $scope.selectedHero = hero;
      }

/*
      $scope.showContent = function(hero) { 
        if(_.isEqual(hero, $scope.selectedHero) && !$scope.showingContent) {
          $scope.showingContent = true;
          return true;
        }
        else {
          $scope.showingContent = false;
          return false;
        }
      }
      */

      /*
      WormService.getHeroById(5).then(function(hero) {
        console.log(hero);
      });
      */

    }
  ]);

}).call(this, angular, _);

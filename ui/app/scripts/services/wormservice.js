'use strict';;
(function(angular, _, app) {
  app = angular.module('wormClientApp.services.WormService', []);


  /**
   * Declare Worm API Resource
   */
  app.factory('WormApiResource', ['$resource',
    function($resource) {
      var WormApiResource = {};

      // @TODO: make configurable
      var baseURI = CharacterOrganizer.baseUrl+'/client';

      WormApiResource.getAllHeroes = function() {
        return $resource(baseURI+'/characters', {}, {
          query: {
            method: 'GET', isArray:true
          }
        })
      };

      WormApiResource.getHeroById = function() {
        return $resource(baseURI+'/character/:heroId', {}, {
          get: {
            method: 'GET'
          }
        })
      };

      return WormApiResource
    } // close factory
  ]);

  /**
   * Declare Worm API Service
   */
  app.service('WormService', ['WormApiResource', function(WormApiResource) {
      var WormApi = this;

      WormApi.getAllHeroes = function() {
        return WormApiResource.getAllHeroes().query().$promise;
      }

      WormApi.getHeroById = function(id) {
        return WormApiResource.getHeroById().get({
          heroId: id
        }).$promise;
      }

    }]) // close service



}).call(this, angular, _);

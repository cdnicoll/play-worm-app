'use strict';

describe('Service: wormService', function () {

  // load the service's module
  beforeEach(module('clientApp'));

  // instantiate service
  var wormService;
  beforeEach(inject(function (_wormService_) {
    wormService = _wormService_;
  }));

  it('should do something', function () {
    expect(!!wormService).toBe(true);
  });

});

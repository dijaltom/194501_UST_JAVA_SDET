const HtmlReporter = require('protractor-beautiful-reporter');

exports.config = {
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['Specs/spec1.js'],



  onPrepare: function () {
    jasmine.getEnv().addReporter(new HtmlReporter({
      baseDirectory: 'target/screenshots',
      takeScreenShotsOnlyForFailedSpecs: true
    }).getJasmine2Reporter());
  }
}
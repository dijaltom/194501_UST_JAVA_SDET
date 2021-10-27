
exports.config = {
  
capabilities : {
  'browserName': 'chrome'
  
  },
  
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['Specs/spec1.js',],
  onPrepare: function () {
    var HtmlScreenshotReporter = require('./node_modules/protractor-jasmine2-screenshot-reporter');
    jasmine.getEnv().addReporter(new  HtmlScreenshotReporter({
      baseDirectory: './target/screenshots',
      takeScreenShotsOnlyForFailedSpecs: true
    }));
  }
};

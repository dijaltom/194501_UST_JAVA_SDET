exports.config = {
    framework: 'jasmine',
    specs: ['../Protractor/Specs/testSpec1.js'],
    directConnect: true,
    onPrepare: function () {
        var HtmlScreenshotReporter = require('./node_modules/protractor-jasmine2-screenshot-reporter');
        jasmine.getEnv().addReporter(new  HtmlScreenshotReporter({
          baseDirectory: './target/screenshots',
          takeScreenShotsOnlyForFailedSpecs: true
        }));
}
}
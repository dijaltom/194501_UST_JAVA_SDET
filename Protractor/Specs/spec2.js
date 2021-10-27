describe('demo calculator tests', function(){

    it('addition test', function(){
    
    browser.get('http://juliemr.github.io/protractor-demo/');
    element(by.model('first')).sendKeys('2');
    
    element(by.model('second')).sendKeys('4');
    
    element(by.css('[ng-click="doAddition()"]')).click();
    
    let res = element(by.cssContainingText('.ng-binding', '6'));
    
    expect(res.getText()).toEqual('6');
    
    
    
    browser.sleep(2000)
    
    });
    
    });
    
    
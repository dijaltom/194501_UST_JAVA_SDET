describe("Calculator",function() { 
   
    //test case: 1  
    it("Should retain the current value of all time", function () {
       expect(Calculator.currentVal).toBeDefined();
       expect(Calculator.currentVal).toEqual(0);  
    }); 
    
    //test case: 2  
    it("should add numbers",function() {
       expect(Calculator.add(5)).toEqual(5); 
       expect(Calculator.add(5)).toEqual(10);  
    });         
     
    //test case :3   
    it("Should add any number of numbers",function () {
       expect(Calculator.addAny(1,2,3)).toEqual(6); 
    }); 
 });
 
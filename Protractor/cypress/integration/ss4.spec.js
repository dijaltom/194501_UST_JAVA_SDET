describe('Alert Test', function () {
    // test case
    it('Scenario 1', function (){
       // launch url
       cy.visit("https://register.rediff.com/register/register.php");
       // click submit
       cy.get('input[type="submit"]').click();
       // fire event with method on
       cy.on('window:alert',(t)=>{
          //assertions
          expect(t).to.contains('Your full name');
       })
    });
 });
 
// describe('Alert Test', function () {
//     // test case
//     it('Scenario 1', function (){
//        // launch url
//        cy.visit("https://register.rediff.com/register/register.php");
//        // click submit
//        cy.get('input[type="submit"]').click();
//        // fire event with method on
//        cy.on('window:alert',(t)=>{
//           //assertions
//           expect(t).to.contains('Your full name');
//        })
//     });
//  });
 

const triple = async () => {

   //close the pop-up window
   if (cy.get('.reveal-modal-bg').invoke('attr', 'style').should('contain', 'display: block;')) {
       cy.get("#authentication_popup > div.vert-wrapper > div > div.popup-text.text-center.vert.large-6.columns > a.close-reveal-modal.hide-mobile").click();
   }
}


describe('urbanladder_testing-1', () => {

   beforeEach(() => {

       cy.visit('https://www.urbanladder.com/')
   })

   //////////////////////  tests  /////////////////////////////
   it('homepage_dropdown_menu-test1', () => {

       cy.get('.topnav_itemname').contains('Storage').click()
   })
   it('homepage_dropdown_menu-test2', () => {
       let a = [
           'Living Storage',
           'Bedroom Storage',
           'Dining Storage',
           'Shop by Range'
       ]
       for (var i = 0; i < 4; i++) {
           cy.get('.taxontype').should('contain', a[i])
           cy.title().should('eq',"Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
       }

   })
   it('homepage_dropdown_menu-test3', () => {
       let a = [
           'Living Storage',
           'Bedroom Storage',
           'Dining Storage',
           'Shop by Range'
       ]
       for (var i = 0; i < 4; i++) {

           cy.get('.taxontype').contains(a[i]).click({ force: true })
           cy.stub()
       }
         triple();
   })
}),
describe('urbanladder_testing-2', () => {

   beforeEach(() => {

       cy.visit('https://www.urbanladder.com/')
   })
   //////////////////////  tests  /////////////////////////////
   it('homepage_dropdown_menu-test111', () => {

       //click on the shoe_racks
       cy.get('.topnav_itemname').contains('Storage').click()
       cy.get('#topnav_wrapper > ul > li.topnav_item.storageunit > div > div > ul > li:nth-child(1) > ul > li.subnav_item.\\34 29 > a').click();
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.gname").click({ force: true })
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.range-filter > div > div.filter-data.range-slider-container > div.range-slider.noUi-target.noUi-ltr.noUi-horizontal.noUi-background").click({ force: true })

       //change prizes
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.row.range-limits > div:nth-child(1) > label").click({ force: true })
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.row.range-limits > div:nth-child(2) > label").click({ force: true })
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.row.range-limits > div:nth-child(3) > label").click({ force: true })
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.row.range-limits > div:nth-child(4) > label").click({ force: true })
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.dropdown-content > div > div > ul > li.range-filter > div > div.filter-header > span.clear.range-filter-clear").click({ force: true })
       cy.wait(1000)
       //change storage type
       let b = [
           "Closed",
           "Open And Closed",
           "Open Storage"
       ]
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(2) > div.gname").click({ force: true })
       for (var i = 0; i < 3; i++) {
           cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(2) > div.dropdown-content > div > div").contains(b[i]).click({ force: true })


       };
       cy.stub();
      

      //material and finish
   })
   it("homepage_dropdown_menu-test112", () => {
       cy.get('.topnav_itemname').contains('Storage').click()
       cy.get('#topnav_wrapper > ul > li.topnav_item.storageunit > div > div > ul > li:nth-child(1) > ul > li.subnav_item.\\34 29 > a').click();
       cy.get(".gname").click({ multiple: true, force: true })
       
       let c = [
           'matte laminate',
           "Medium",
           "Dark",
           "Light",
           "PU Paper",
           "mango mahogany",
           "melamine",
           "wood",
           'matte'
       ]
       for (var i = 0; i < 9; i++) {
           if(i==1)
           {
               cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(3) > div.dropdown-content > div > div > div > ul > li:nth-child(1) > label").contains('matte laminate').click({ force: true })
           }
           if(i==8)
           {
               cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(3) > div.dropdown-content > div > div > div > ul > li:nth-child(1) > label").click({ force: true })
           }
           cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(3) > div.dropdown-content > div > div").contains(c[i]).click({ force: true })
       }
       triple();
   })
})
describe('urbanladder_testing-3', () => {

   beforeEach(() => {

       cy.visit('https://www.urbanladder.com/bar-cabinet?src=g_topnav_storage_dining-storage_bar-cabinets#page-2')
   })
   //////////////////////  tests  /////////////////////////////
   it('homepage_dropdown_menu-t1', () => {
       cy.get('#filters_availability_In_Stock_Only').click()
   })
})

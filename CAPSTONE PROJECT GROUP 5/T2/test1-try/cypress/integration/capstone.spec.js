


const triple = async () => {

    //close the pop-up window
    if (cy.get('.reveal-modal-bg').invoke('attr', 'style').should('contain', 'display: block;')) {
        cy.get("#authentication_popup > div.vert-wrapper > div > div.popup-text.text-center.vert.large-6.columns > a.close-reveal-modal.hide-mobile").click();
    }
    else {
        undefined;
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

   })})
//    it('homepage_dropdown_menu-test3', () => {
//        let a = [
//            'Living Storage',
//            'Bedroom Storage',
//            'Dining Storage',
//            'Shop by Range'
//        ]
//        for (var i = 0; i < 4; i++) {

//            cy.get('.taxontype').contains(a[i]).click({ force: true })
//            cy.stub()
//        }
//          triple();
//    })
// }),

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
       cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(2) > div.gname").click({ force: true }).should('not.be.checked')
       for (var i = 0; i < 3; i++) {
           cy.get("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(2) > div.dropdown-content > div > div").contains(b[i]).click({ force: true })


       };


      //material and finish
   })
   it("homepage_dropdown_menu-test112", () => {
       cy.get('.topnav_itemname').contains('Storage').click()
       cy.get('#topnav_wrapper > ul > li.topnav_item.storageunit > div > div > ul > li:nth-child(1) > ul > li.subnav_item.\\34 29 > a').click();
       cy.get(".gname").click({ multiple: true, force: true })
        cy.waitFor(1000);
       // triple();
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
    ////////////////////  tests  /////////////////////////////
    it('homepage_dropdown_menu-t1', () => {
        cy.get('#filters_availability_In_Stock_Only').click({force:true})
     
        cy.get('.item').contains('Recommended').trigger('mouseover');
        cy.waitFor(2000)
        cy.get('.option').contains('Price: Low to High').dblclick({ multiple: true })
        cy.waitFor(3000)
        cy.get('.item').contains('Recommended').trigger('mouseout');


    })
    // it('bar_cabinets_test-1', () => {
    //     cy.get('#filters_availability_In_Stock_Only').click()
    //     triple();
    //     cy.waitFor(1000)

    //     cy.get('.item').contains('Recommended').trigger('mouseover');
    //     cy.waitFor(1000)
    //     cy.get('.option').contains('Price: Low to High').dblclick({ multiple: true })
    //     cy.waitFor(1000)
    //     cy.get('.item').contains('Recommended').trigger('mouseout');

    // })
    it('test__2', () => {
        cy.visit('https://www.urbanladder.com/products/trevon-wine-rack?sku=FVBRBU62ML10501&src=subcat')
        cy.get("#product_action_113395 > div.add-to-wishlist.text-center.wishproduct.dwishblock.authentication_popup.login-link").click({ force: true })
        cy.waitFor(1000)
        triple()
        cy.get('.discounted-price').contains('₹2,249.10')
        cy.waitFor(200)
        cy.waitFor(5000)
        cy.get('#add-to-cart-button').click({ force: true })
        cy.get('.image').should('have.attr', 'data-hook', 'cart_item_image')
        cy.get('select').select(5).should('have.value', '6')
        cy.get('.final-price').should('contain', '₹13,495')
        cy.get('.priceItem__noCharge').should('contain', 'Free')
        cy.get("#update-cart > div > div.action-links.clearfix > div.large-4.columns.btn_wrap").contains('Checkout').click({ force: true })
        cy.get('#order_email').type('abc');
        cy.get("#address-form-submit").click()
        cy.get('.error').should('contain', 'Please enter a valid email address.')
        cy.get('#order_email').type('abcd@gmail.com');
        cy.get('#order_ship_address_attributes_zipcode').type('1525')
        cy.get('.error').should('contain', 'Please enter a valid pincode')
        cy.get('#order_ship_address_attributes_zipcode').type('123456')
        cy.waitFor(200)
        cy.get('.error').should('contain', "Sorry! We don't ship to this pincode currently.")
        cy.waitFor(500)
        cy.get('#order_ship_address_attributes_zipcode').clear().type('560001')
        cy.waitFor(500)

        cy.get('#city_state').should('have.value','Bangalore/Karnataka')
        cy.get("#order_use_shipping").click()
        cy.get("#billing > ul").invoke('attr', 'style').should('contain', 'display: block;')
    })
})










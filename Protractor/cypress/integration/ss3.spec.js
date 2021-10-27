
describe('Locators example', function()
{

it('types of locators', function()

{


cy.visit("https://demo.nopcommerce.com/")

cy.get("#small-searchterms").type("Apple MacBook Pro 13-inch")

cy.get("[type='submit']").click()

cy.get("#addtocart_4_EnteredQuantity").clear().type(2)

cy.get("#add-to-cart-button-4").click()

cy.wait(5000)


cy.get(".product-unit-price").contains('$1,800.00')


}



)


}
)

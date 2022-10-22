#Author: angie natalia obando
@feature
Scenario: Add a product to card that is successful
  As user web
  I want enter to page of the shopping
  To add a product to cart and validate

  @tag1
    Given "Angie" enter to page of shopping to buy
    When she select a product and add to cart
    Then validate that adding a product was successful

Scenario: search dresses in the page
As user web
I want enter to page of the shopping
To search dresses and validate

@tag2
Given "Angie" enter to page of shopping to buy
When she searche dresses in the page
Then validate seeking was successful


Scenario: Add a product to card that is successful
As user web
I want enter to page of the shopping
To add a product to cart and validate

@tag3
Given "Angie" enter to page of shopping to buy
When she searche dresses in the page
Then validate the search is unsuccessful


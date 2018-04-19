# Store Lab
* **Purpose** - to understand [HashMap](https://www.youtube.com/watch?v=shs0KM3wKv8), [objects](https://docs.oracle.com/javase/tutorial/java/concepts/object.html) and [data encapsulation](https://en.wikipedia.org/wiki/Data_encapsulation).

* **Objective** - to create two type of maps

## Part 1 - Equals & HashCode
By default, every [Java object](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html) has an [equals](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals) and a [hashCode](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode) method. Java uses the object's address to calculate the [hashCode](https://en.wikipedia.org/wiki/Hash_function). By default, two objects are equal if they have the same address. We don't want this. Two objects are equal if they are the same class and have the same values.

  1. User
    1. Add an `equals` method to the `User` class. The equal method should return true only if the `id` and `name` of the user are the same. It return false otherwise.
    2. Add a `hashCode` method by calling `Objects.hash()` and gives it the `id` and `name` (e.g. `Objects.hash(id, name)`)
  2. Cart
    1. Add an `equals` and `hashCode` methods with IntelliJ shortcut
      1. Click `Command + N` and select `equals and hashCode`. Follow the wizard to generate the code.

## Part 2 - ListMap




This is typically implemented by converting the internal address of the object into an integer, but this implementation technique is not required by the JavaTM programming language


## Part 1 - ListMap
In the `test` folder, there is a `ProductTest` with most of the tested commented out.
  1. The first test `testConstruction_WithNoParams` checks to see if the `Product` class has an empty constructor. To test it, I created a new object with no parameter.
  2. The second test `testGetSetName` checks to see if you can set and get the name of the product. In order to make this pass, I added a `String` field called `name` (line 5). Then I added a getter method `getName` (line 18-20) and a setter method `setName(String name)` (line 23-25).
  3. The third test `testConstruction_WithName` checks if the `Product` class has a constructor that takes a String. Notice we can have more than one constructor. When I create a new Product with a string `new Product("T-shirt")`, I set that string to the field `name` so when I called `getName`, I get the string that I passed into the constructor.
  4. Continue to uncomment the test and write the code to make it pass
  5. For the product description, it should be in this format `title (Color: color, Size: size)`
    - ex: `Hat (Color: Yellow, Size: LG)`

## Part 2 - Cart
A cart has an array of Product.
  1. Open the `CartTest` and uncomment line 9-13. To make the test pass:
    - Create a new class named `Cart`
    - Create a new constructor that takes an array of Product
    - Run the test, it should pass
  2. Create a getter for Product to make `testGetProducts` test pass
  3. To make `testGetSetDiscount` test pass:
    - Create a new decimal field called `discount`
    - Create a getter and setter for the field
    - Run the test
  4. To get `getProductTotal` tests to pass, you need add all the product prices together and return the result.
  5. To get the total, you need to add the total of all the products minus the discount. For example, if a product costs $100, and the discount is 20% (0.20), then the total = 100 - (100 * 0.20) = 80

## Part 3 - CreditCard
The goal of this exercise is to know how to create and test a class.
  1. In the test folder, create a new test class called `CreditCardTest`
  2. Create a new class called `CreditCard`
  2. Create a test case to get and set the `cardHolderName` of the type `String`
      - Create getter and setter methods in the `CreditCard` class
      - Add a field called cardHolderName
  2. Do the same for the following fields:
    - `String number`
    - `int expiredMonth`
    - `int expiredYear`
  3. Create a getter and setter for each field
  4. Create a test for `getDescription`
    - `getDescription` should return `[cardHolderName] [last 4 digit of the number] [expiredMonth]/[expiredYear]`
      - ex: `Tia Mowry 4551 10/2019`
  5. Add a `CreditCard` field to the `Cart` class
    - Add a getter and setter for the `creditCard` field

## Part 4 - Product as an ArrayList - BONUS
The goal of this exercise is to change the `products` array in the `Cart` class to an ArrayList.
  1. In the `CartTest`, change the `products` array to an `ArrayList`

    ```java
      ArrayList<Product> products = new ArrayList();
      products.add(new Product("Shirt", 15.01));
    ```

  2. Add this test to the `CartTest` class
  ```java
    @Test
    public void testAddToCard(){
        // Given
        ArrayList<Product> products = new ArrayList();
        Cart cart = new Cart(products);

        // When
        Product shirt = new Product("Shirt", 1.99);
        cart.addProduct(shirt);

        // Then
        double expectedTotal = 1.99;
        double actualTotal = cart.getProductTotal();
        Assert.assertEquals(expectedTotal, actualTotal, DELTA);
    }
  ```
    - Add a `addProduct` method to the `Cart` class
    - Run the test. It should pass.

<h1>Klare Custom Guitars</h1>
<p></p>
<p>WGU D287 - PA</p>


Format: <br><br>
<strong>Prompt:</strong> <br> <br>
File Name: <br>
Line Number: <br>
Description of change:


<h3>Project Section C:</h3>

<strong>Prompt:</strong> Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

File Name: mainscreen.html <br>
Line Number: 17, 21, 23-26 <br>
Description of change: Added styling and customized text for custom guitar shop.

<h3>Project Section D:</h3>

<strong>Prompt:</strong> Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

File Name: About.html <br>
Line Number: All <br>
Description of change: Created About.html file that serves as an "About Us" page for KCG guitars.

File Name: AboutController <br>
Line Number: All <br>
Description of change: Created AboutController to route requests via the @GetMapping method form the "/about" endpoint to about.html

File Name: About.html <br>
Line Number: 19 - 21 <br>
Description of change: added navigation button to about.html page that redirects to @/mainscreen.

File Name: mainscreen.html <br>
Line Number: 23 - 25 <br>
Description of change: Added navigation button to mainscreen.html that navigates to @/about.

<h3> Project Section E:</h3>

<strong>Prompt:</strong> Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database

File Name: BootStrapData.java <br>
Line Number: 46 - 117 <br>
Description of change: adds objects for both in house parts and outsourced parts and stores them in repositories. If statement also check to add inventory if inventory is zero.

File Name: BootStrapData.java <br>
Line Number: 144 - 157 <br>
Description of change: adds five product objects to application.  If product list is empty, it adds sample inventory upon application startup.

File Name: InhousePart.java <br>
Line Number: 19 <br>
Description of change: Added constructor to class to simplify object creation.

<h3>Project Section F:</h3>

<strong>Prompt:</strong> Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•   The “Buy Now” button must be next to the buttons that update and delete products.

•   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•   Display a message that indicates the success or failure of a purchase.

File Name: mainscreen.html <br>
Line Number: 98 <br>
Description of change: Added "Buy Now" button to products list.  I copied the formatting from the other buttons for visual consistency.  I also mapped the button to invoke the BuyProductController (I made this in the next change.)

File Name: BuyProduct Controller <br>
Line Number: ALL (Created file) <br>
Description of change:  Created controller mapped to /buyProduct via @RequestMapping that checks the product to make sure it exists.  If it passes that logic, it checks to make sure that the inventory is greater than zero.  Upon passing that test, it decrements the inventory by one and returns a string with a message.

<h3>Project Section G:</h3>

<strong>Prompt:</strong> Modify the parts to track maximum and minimum inventory by doing the following:

•   Add additional fields to the part entity for maximum and minimum inventory.

•   Modify the sample inventory to include the maximum and minimum fields.

•   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

•   Rename the file the persistent storage is saved to.

•   Modify the code to enforce that the inventory is between or at the minimum and maximum value.

File Name: part.java <br>
Line Number: 33-37 <br>
Description of change:  Added minInventory and maxInventory fields and used @Min and @Max to validate methods and return error messages if exceeded.

File Name: part.java <br>
Line Number: 60-66 <br>
Description of change:  Added overloaded constructor that includes minInventory and maxInventory fields.

File Name: part.java <br>
Line Number: 101-111 <br>
Description of change:  Added getters and setters for minInventory and maxInventory.

File Name: BootStrapData.java <br>
Line Number: 50-51, 57-58, 64-65, 71-72, 78-79, 87-88, 96-97, 105-106, 114-115, 123-124 <br>
Description of change:  Added min and max Inventory fields to In-House and Outsourced parts.

File Name: InhousePartForm.html <br>
Line Number: 26-29 <br>
Description of change: Added input fields for minInventory and maxInventory.  I also cleaned up the indentations for the entire page because the form section had a bunch of different indentation styles.  I think it's easier to read now.

File Name: OutsourcedPartForm.html <br>
Line Number: 25-28 <br>
Description of change: Added input fields for minInventory and maxInventory.  I also cleaned up the indentations for the entire page because the form section had a bunch of different indentation styles.  I think it's easier to read now.

File Name: KlareCustomGuitarsDB <br>
Line Number: N/A <br>
Description of change:  Changed the persistent DB file to KlareCustomGuitarsDB

File Name: application.properties <br>
Line Number: 6 <br>
Description of change:  Changed DB file source name to KlareCustomGuitarsDB

File Name: Part.java <br>
Line Number: 122-127 <br>
Description of change:  Added boolean invIsValid method to determine if passed value is between minInventory and maxInventory.

File Name: AddInhousePartController.java <br>
Line Number: 43-45 <br>
Description of change:  Added if statement to invoke invIsValid method.  If false, uses theBindingResult.rejectValue to display an error message.

File Name: AddOutsourcedPartController.java <br>
Line Number: 44-46 <br>
Description of change:  Added if sate to invoke invIsValid method.  If false, uses bindingResult.rejectValue to display an error message.

<h3>Project Section: H</h3>

<strong>Prompt:</strong> Add validation for between or at the maximum and minimum fields. The validation must include the following:

•   Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

•   Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

•   Display error messages when adding and updating parts if the inventory is greater than the maximum.

File Name: Part.java <br>
Line Number: 129-141 <br>
Description of change:  Added two a method atLowerBound(int) to check to see if passed value is at the minInventory and another method atUppperBound to check to see if passed value is at maxInventory.

File Name: AddInhousePartController.java <br>
Line Number: 47-53 <br>
Description of change:  Added if statements to validate if inventory amounts are at max or min inventory.

File Name: ValidEnufParts.java <br>
Line Number: 26 <br>
Description of change:  Edited error message to reflect changes made to the EnufPartsValidator class.

File Name: EnufPartsValidator.java <br>
Line Number: 36 <br>
Description of change:  Added an or ( || ) to the if statement that validates inventory levels to also return false if inventory would drop below minInventory levels.

<h3>Project Section I:</h3>

<strong>Prompt:</strong> Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

File Name: PartTest.java <br>
Line Number: 103 - 126 <br>
Description of change:  Added two unit tests, one for each method atUpperBounds and atLowerBounds.  Test set values for inventory and min/max and expect "true" response.

<h3>Project Section: J</h3>

<strong>Prompt:</strong> Remove the class files for any unused validators in order to clean your code.

File Name:  DeletePartsValidator.java <br>
Line Number: N/A <br>
Description of change: Removed DeletePartsValidator class because it had zero usages in the completed application.

<h2 style="background: #FFC107; color: black;">Revisions:</h2>

<strong>Notes from evaluator:</strong>  The buy now button was apparent in the submission and aligned correctly. The submission was not fully developed, as the confirmation page did not have a way to return to the main page after buying an item.

File Name:  purchaseSuccessful.html <br>
Line Number: All <br>
Description of change:  I added a view for the BuyProductController can reference for successful purchases.

File name:  outOfStock.html <br>
Line Number: All <br>
Description of change:  I added a view for the BuyProductController to reference in the event that a product is out of stock or does not exist.

File Name:  BuyProductController.java <br>
Line Number: 35, 37, 40 <br>
Description of change:  I adjusted my previous code that had returned strings to return the html views that I created for each situation.  


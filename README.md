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


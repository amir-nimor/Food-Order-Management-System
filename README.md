Food Order Management System
Project Description:
In this project, you will develop a simple Food Order Management System using Java and
Spring MVC.
The system allows users to view the food menu, see an order form, and submit a new food
order.
You must complete the project in five phases. Each phase focuses on specific topics taught by
your instructor

=====================================

Phase 1 – Project Setup & Configuration


Tasks.
Configure your Maven project.
2. Run the Maven Life Cycle phases: validate , compile , test , package , verify , and
   install .
3. Convert the existing XML configuration to Java Configuration.
4. Create the main Spring configuration class.
5. Configure @Configuration , @EnableWebMvc , and @ComponentScan .
6. Create and configure an InternalResourceViewResolver using @Bean .

Phase 2 – Application Architecture
Tasks:
Create a Food model class with the following fields:
Long id
String name
String category
Integer price
2. Create a FoodRepository interface.
3. Create FoodRepositoryImpl and annotate it with @Repository .
4. Store food items in a static List .
5. Create a FoodService interface.
6. Create FoodServiceImpl and annotate it with @Service .
7. Inject the Repository into the Service using Constructor Injection.
8. Inject the Service into the Controller using Constructor Injection.
9. Use @Autowired where required.
10. Make sure the Controller communicates with the Service, not directly with the Repository.


=================================

1. Create WebAppInitializer and configure the DispatcherServlet.
2. Create FoodController .
3. Use @Controller and @RequestMapping .
4. Create a method to display the food menu.
5. Use Model to send data from the Controller to the JSP page.
6. Create the required JSP pages.
7. Display the food menu in the browser.


=================================

1. Create a page with a form for submitting a food order.
2. Use @RequestParam to receive form data.
3. Use RequestMethod.POST to handle the form submission.
4. Create a method to receive the customer's name, selected food, and quantity.
5. Use ResponseEntity to return an HTTP response.
6. Set the appropriate HTTP status code.
7. Add a custom HTTP header to the response.

# customer

The purpose of this project is to understand how the microservices work and how the package structure is setup.  

# CustomerApplication.java
<ul>
  <li>This class gets generated automatically by the spring initializer.</li>
  <li>During initialization, the package was specified as <b>guru.springframework.customer.customer</b></li>
</ul>

# CustomerDto.java
<ul>
  <li>This class is idenfieid as data transfer object and it is used to send the data from front end to backend.<br></li>
  <li>The best place/package to put data transfer objects are in guru.springframework.customer.customer<b>.web.model</b> </li>
</ul>

# CustomerController.java
<ul>
  <li>This class is the rest controller.</li>
  <li>The purpose of this class is to accept the rest requests from client (postman) and send the response to it.<br></li>
  <li><b>@RequestMapping("/api/v1/customer")</b> is the class level annotation that tells the microservice to accept this specific path segment and envoke this controller.</li>
  <li><b>@RestController</b> is the class level annotation that tells the springboot that this class is the rest controller and should be treated that way.</li>
  <li>@GetMapping("/{customerId}") is the method level annotation which tells the springboot to map the get requests to this method.
    <ul>
      <li><b>http://localhost:8080/api/v1/customer/a5f27a92-d09a-4601-a05b-a28a7a76fd73</b> will be mapped to this method.</li>
      <li>@PathVariable
        <ul>
          <li>public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId)</li>
          <li>@PathVariable is mapping the method level value ({customerId}) to the method variable of customerId</li>
          <li>No need to have @PathVariable if all the variables are the same but it is a good practice to have it.</li>
        </ul
      </li>
    </ul>
  </li>
</ul>






<ul>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
</ul>

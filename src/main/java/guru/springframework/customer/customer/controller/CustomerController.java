package guru.springframework.customer.customer.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.customer.customer.services.CustomerService;
import guru.springframework.customer.customer.web.module.CustomerDto;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")  UUID customerId) {
		return new ResponseEntity<CustomerDto>(this.customerService.getCustomerById(customerId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> handlePost(@RequestBody CustomerDto customerDto) {
		CustomerDto saveDto = customerService.saveCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "api/v1/customer/" + saveDto.getId());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
//	public ResponseEntity<CustomerDto> handlePost(@RequestBody CustomerDto customerDto) {
//		return new ResponseEntity<CustomerDto>(customerService.saveCustomer(customerDto), HttpStatus.OK);
//	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<HttpStatus> handleUpdate(@PathVariable("customerId")  UUID customerId, @RequestBody CustomerDto customerDto) {
		customerService.updateCustomer(customerId, customerDto);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCustomer(customerId);
	}
	
	
}

package guru.springframework.customer.customer.services;

import java.util.UUID;

import guru.springframework.customer.customer.web.module.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getCustomerById(UUID customerId);
}

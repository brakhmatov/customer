package guru.springframework.customer.customer.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.customer.customer.web.module.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.name("RAKHMATOV")
				.build();		
	}
}

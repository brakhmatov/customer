package guru.springframework.customer.customer.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.customer.customer.web.module.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.name("RAKHMATOV")
				.build();		
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		log.debug("saving customer dto:{}", customerDto);
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		log.debug("Deleting customer:{}", customerId);
		
	}
}

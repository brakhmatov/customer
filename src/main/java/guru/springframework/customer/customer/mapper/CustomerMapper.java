package guru.springframework.customer.customer.mapper;

import org.mapstruct.Mapper;

import guru.springframework.customer.customer.web.module.Customer;
import guru.springframework.customer.customer.web.module.CustomerDto;

@Mapper
public interface CustomerMapper {

	Customer toCustomer(CustomerDto customerDto);

	CustomerDto toCustomerDto(Customer customer);
}

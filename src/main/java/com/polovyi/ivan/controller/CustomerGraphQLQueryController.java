package com.polovyi.ivan.controller;

import com.polovyi.ivan.dto.CustomerResponse;
import com.polovyi.ivan.service.CustomerService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public record CustomerGraphQLQueryController(CustomerService customerService) implements GraphQLQueryResolver {

    public CustomerResponse customerById(@NotNull String customerId) {
        return customerService.getCustomersById(customerId);
    }
}

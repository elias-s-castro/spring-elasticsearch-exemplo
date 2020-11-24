package br.com.castro.springelasticsearch.repository;/*
 * @Autor Elias Castro em 24/11/2020
 */

import br.com.castro.springelasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.io.Serializable;
import java.util.List;

public interface CustomerRepository  extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByFirstname(String firstName);
}

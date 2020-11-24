package br.com.castro.springelasticsearch.model;/*
 * @Autor Elias Castro em 24/11/2020
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "castro", indexStoreType = "customer", shards = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private int age;
}

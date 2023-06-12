package com.programmingbinde.productservice.repository;

import com.programmingbinde.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

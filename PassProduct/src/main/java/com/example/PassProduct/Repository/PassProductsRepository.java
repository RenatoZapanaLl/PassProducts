package com.example.PassProduct.Repository;

import com.example.PassProduct.Model.PassProducts;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PassProductsRepository extends ReactiveMongoRepository<PassProducts,String> {
}

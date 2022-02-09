package com.example.PassProduct.Service;

import com.example.PassProduct.Model.PassProducts;
import com.example.PassProduct.Repository.PassProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicePassProductsImpl implements  ServicePassProducts {
    @Autowired
    PassProductsRepository repository;

    @Override
    public Flux<PassProducts> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<PassProducts> save(PassProducts passProducts) {
        return repository.save(passProducts);
    }
}

package com.example.PassProduct.Service;

import com.example.PassProduct.Model.PassProducts;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface ServicePassProducts  {
    Flux<PassProducts> findAll();
    Mono<PassProducts> save(PassProducts passProducts);
}

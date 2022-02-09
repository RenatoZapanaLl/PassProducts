package com.example.PassProduct.Controller;

import com.example.PassProduct.Model.PassProducts;
import com.example.PassProduct.Service.ServicePassProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerPassProducts {
    @Autowired
    ServicePassProducts service;
    //
    @GetMapping("/getPassProducts")
    public Flux<PassProducts> getActiveProducts()
    {
        return service.findAll();
    }
    //
    @PostMapping("/postPassProducts")
    Mono<PassProducts> postActiveProducts(@RequestBody PassProducts passProducts){
        return service.save(passProducts);
    }
}

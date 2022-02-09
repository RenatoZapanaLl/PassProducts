package com.example.PassProduct.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "PassProducts")
public class PassProducts {

    @Id
    private String  id;
    private String  type ;
    private int Maintenance;
    private int movements ;
}

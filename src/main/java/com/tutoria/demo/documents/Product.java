package com.tutoria.demo.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Product {
    private String _id;
    private String name;
    private Double price;
    private int quantity;
}

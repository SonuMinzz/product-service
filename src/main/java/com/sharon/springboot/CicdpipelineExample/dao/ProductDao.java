package com.sharon.springboot.CicdpipelineExample.dao;

import com.sharon.springboot.CicdpipelineExample.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class ProductDao {


    public List<Product> getProducts()
    {
        return Stream.of(
                new Product("pen","ranchi"),
                new Product("pencil","kolkata"),
                new Product("eraser","kerela")
        ).collect(Collectors.toList());
    }


}

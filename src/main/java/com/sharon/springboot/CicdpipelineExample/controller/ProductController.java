package com.sharon.springboot.CicdpipelineExample.controller;

import com.sharon.springboot.CicdpipelineExample.dao.ProductDao;
import com.sharon.springboot.CicdpipelineExample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/")
    public List<Product> getProducts()
    {
        return productDao.getProducts();
    }
}

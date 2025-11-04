package com.gymtok.gymtok.controller;

import com.gymtok.gymtok.model.Product;
import com.gymtok.gymtok.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
}

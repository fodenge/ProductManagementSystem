package com.mysqldatabase.service;

import com.mysqldatabase.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public Product createProduct(Product product);

    public List<Product> getAllProducts();

    public Product getById(int id);

    public Product updateProduct(Product product, int id);

    public void deleteProduct(int id);

    public boolean productExistsById(int id);
}

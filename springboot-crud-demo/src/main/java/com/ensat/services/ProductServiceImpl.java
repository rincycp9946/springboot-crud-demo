package com.ensat.services;

import com.ensat.entities.Product;
import com.ensat.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        Optional<Product> productOpt = productRepository.findById(id);
        if (productOpt.isPresent()) {
            return productOpt.get();
        } else {
            throw new IllegalArgumentException("Product with ID " + id + " not found");
        }
    }

    @Override
    public Product saveProduct(Product product) {
        try {
            return productRepository.save(product);
        } catch (Exception e) {
            throw new RuntimeException("Error saving product: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteProduct(Integer id) {
        if (!productRepository.existsById(id)) {
            throw new IllegalArgumentException("Cannot delete. Product with ID " + id + " does not exist.");
        }
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting product with ID " + id + ": " + e.getMessage(), e);
        }
    }
}

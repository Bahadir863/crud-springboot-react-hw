package com.example.productapp.service;

import com.example.productapp.model.Product;
import com.example.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Tüm ürünleri getir
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Ürün ID'si ile tek bir ürün getir
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Yeni ürün ekle
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Ürün güncelle
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // Ürün sil
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

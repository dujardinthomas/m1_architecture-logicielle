package org.example.ntiers.service;

import org.example.ntiers.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public List<ProductDTO> getAllProducts();
    public ProductDTO getProductById(Long id);
    public ProductDTO addProduct(ProductDTO product);
    public ProductDTO updateProduct(ProductDTO product);
    public void deleteProduct(Long id);
}

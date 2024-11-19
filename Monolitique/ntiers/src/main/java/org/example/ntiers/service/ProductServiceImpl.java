package org.example.ntiers.service;

import org.example.ntiers.dto.ProductDTO;
import org.example.ntiers.exception.ResourceNotFoundException;
import org.example.ntiers.model.Product;
import org.example.ntiers.repository.ProductRepository;
import org.example.ntiers.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(product -> DTOMapper.toProductDTO(product)).toList();
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return DTOMapper.toProductDTO(productRepository.findById(id).get());
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        Product product = DTOMapper.toProduct(productDTO);
        return DTOMapper.toProductDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Product product = DTOMapper.toProduct(productDTO);
        return DTOMapper.toProductDTO(productRepository.save(product));
    }

//    @Override
//    public void deleteProduct(Long id) {
////        productRepository.findById(id).orElseThrow( () => new RessourceNotFoundException())
//        productRepository.deleteById(id);
//    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found"));
        productRepository.deleteById(id);
    }
}


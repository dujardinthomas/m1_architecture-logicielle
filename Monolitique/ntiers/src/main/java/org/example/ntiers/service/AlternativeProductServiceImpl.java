//package org.example.ntiers.service;
//
//import org.example.ntiers.dto.ProductDTO;
//import org.example.ntiers.exception.ResourceNotFoundException;
//import org.example.ntiers.model.Product;
//import org.example.ntiers.repository.ProductRepository;
//import org.example.ntiers.utils.DTOMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class AlternativeProductServiceImpl implements ProductService{
//
//    @Autowired
//    private ProductRepository productRepository;
//
//
//    @Override
//    public List<ProductDTO> getAllProducts() {
//        System.out.println("Alternative ProductServiceImpl - Getting all products");
//        return productRepository.findAll().stream()
//                .map(DTOMapper::toProductDTO)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public ProductDTO getProductById(Long id) {
//        System.out.println("Alternative ProductServiceImpl - Getting product by ID: " + id);
//        return productRepository.findById(id)
//                .map(DTOMapper::toProductDTO)
//                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
//    }
//
//
//    @Override
//    public ProductDTO addProduct(ProductDTO productDTO) {
//        System.out.println("Alternative ProductServiceImpl - Saving product");
//        Product product = DTOMapper.toProduct(productDTO);
//        return DTOMapper.toProductDTO(productRepository.save(product));
//    }
//
//    @Override
//    public ProductDTO updateProduct(ProductDTO productDTO) {
//        System.out.println("Alternative ProductServiceImpl - Updating product with ID: " + productDTO.getId());
//        Product product = productRepository.findById(productDTO.getId())
//                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
//        product.setName(productDTO.getName());
//        product.setPrice(productDTO.getPrice());
//        return DTOMapper.toProductDTO(productRepository.save(product));
//    }
//
//    @Override
//    public void deleteProduct(Long id) {
//        System.out.println("Alternative ProductServiceImpl - Deleting product with ID: " + id);
//        Product product = productRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Product not found in alternative service"));
//        productRepository.delete(product);
//    }
//}

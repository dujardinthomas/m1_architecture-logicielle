package org.example.ntiers.controller;

import org.apache.coyote.Response;
import org.example.ntiers.dto.ProductDTO;
import org.example.ntiers.model.Product;
import org.example.ntiers.service.ProductService;
import org.example.ntiers.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<ProductDTO>> getAllProduct(){
        List<ProductDTO> productsDTO = productService.getAllProducts();
        return ResponseEntity.ok(productsDTO); //renvoie code 200
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.addProduct((productDTO)));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
//        productService.deleteProduct(DTOMapper.toProduct(productService.getProductById(id)));
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.updateProduct((productDTO)));
    }

}

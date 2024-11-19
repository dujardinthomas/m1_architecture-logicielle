package org.exemple.microproduct.repository;

import org.exemple.microproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

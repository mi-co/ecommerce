package es.vass.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.vass.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

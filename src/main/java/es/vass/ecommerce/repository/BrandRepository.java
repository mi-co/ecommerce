package es.vass.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.vass.ecommerce.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}

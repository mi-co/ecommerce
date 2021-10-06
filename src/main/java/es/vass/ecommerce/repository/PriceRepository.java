package es.vass.ecommerce.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.vass.ecommerce.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {

	@Query("Select p From Price p where p.idProduct.idProduct = :idProduct and p.idBrand.idBrand = :idBrand and  :date between p.startDate and p.endDate order by p.priority desc")
	List<Price> findByIdProductIdBrand(Long idProduct, Long idBrand, Date date);
	
}

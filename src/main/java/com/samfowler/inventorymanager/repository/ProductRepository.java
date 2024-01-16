package com.samfowler.inventorymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samfowler.inventorymanager.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}



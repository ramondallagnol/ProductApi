package com.seudallanha.ProductApi.repository;

import com.seudallanha.ProductApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends
        JpaRepository<Product, Long>,
        ListCrudRepository<Product, Long>,
        ListPagingAndSortingRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String name);
}

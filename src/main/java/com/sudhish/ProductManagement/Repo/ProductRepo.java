package com.sudhish.ProductManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhish.ProductManagement.domain.ProductDetails;

public interface ProductRepo extends JpaRepository<ProductDetails, Long> {

}

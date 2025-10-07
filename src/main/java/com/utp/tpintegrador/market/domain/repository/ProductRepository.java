package com.utp.tpintegrador.market.domain.repository;

import com.utp.tpintegrador.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory();
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct (int productId);
    Product save(Product product);
    void delete(int productId);
}

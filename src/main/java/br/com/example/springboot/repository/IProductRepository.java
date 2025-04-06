package br.com.example.springboot.repository;

import br.com.example.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
package br.com.example.springboot.service.interfaces;

import br.com.example.springboot.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<ProductDTO> getAllProducts();

    Optional<ProductDTO> getProductById(Long id);

    ProductDTO saveProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);
}
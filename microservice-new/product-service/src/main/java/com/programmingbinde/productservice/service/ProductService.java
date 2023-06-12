package com.programmingbinde.productservice.service;

import com.programmingbinde.productservice.dto.ProductRequest;
import com.programmingbinde.productservice.dto.ProductResponse;
import com.programmingbinde.productservice.model.Product;
import com.programmingbinde.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productrequest){
        Product product = Product.builder()
                .name(productrequest.getName())
                .description(productrequest.getDescription())
                .price(productrequest.getPrice())
                .build();

        productRepository.save(product);

        log.info("product {} is saved successfully", product.getId());

    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
       return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }
}

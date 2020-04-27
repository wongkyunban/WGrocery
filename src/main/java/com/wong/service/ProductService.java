package com.wong.service;

import com.wong.bean.Product;
import com.wong.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProductService {
    Logger  logger = LoggerFactory.getLogger(ProductService.class);
    public List<Product> findAll() {
        logger.info("数据正在加载...");
        return ProductRepository.getInstance().findAll();
    }

    public Product findById(final Integer id) {
        return ProductRepository.getInstance().findById(id);
    }
}

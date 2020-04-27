package com.wong.controller;

import com.wong.bean.Product;
import com.wong.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.context.LazyContextVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

@Controller
public class ProductListController {

    @RequestMapping(value = {"product/list"},method = RequestMethod.GET)
    public String showProducts(Model model, boolean show) {

        ProductService productService = new ProductService();
//        List<Product> products = productService.findAll();
//        model.addAttribute("products",products);
        // 懒加载
        model.addAttribute("products", new LazyContextVariable<List<Product>>() {
            @Override
            protected List<Product> loadValue() {
                return productService.findAll();
            }
        });
        model.addAttribute("show",show);
        return "product/list";
    }
}

package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/buyProduct")
    @ResponseBody
    public String buyProduct(@RequestParam("productId") Long productId) {
        Optional<Product> purchaseProd = productRepository.findById(productId);

        if (purchaseProd.isPresent()) {
            Product product = purchaseProd.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "Purchase Successful! Go Make Some Sweet Music!!";
            } else {
                return "Oh No! This product is out of stock.  Check again soon!";
            }
        } else {
            return "Whoops, it looks like this product may not exist!";
        }
    }
}

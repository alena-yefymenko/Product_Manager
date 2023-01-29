package com.example.manageproduct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/addProduct")
    public String showProductForm(Product product) {
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";

    }

    @GetMapping("/products")
    public String getAll(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/updateProduct/{id}")
    public String updateProductForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "/updateProduct";
    }

    @PostMapping("/updateProduct")
    public String updateProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/product/{id}")
    public String viewSingleProduct(@PathVariable("id") Long id, Model model) {
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "product";
    }
}

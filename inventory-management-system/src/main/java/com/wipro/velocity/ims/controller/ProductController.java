package com.wipro.velocity.ims.controller;

import java.util.List;

import com.wipro.velocity.ims.model.Product;
import com.wipro.velocity.ims.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@RequestMapping("/products")
    public String viewHomePage(Model model) {
        List<Product> listProducts = pservice.listAll();
        model.addAttribute("listProducts", listProducts);

        return "products";
    }
	
	@RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "new_product";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        pservice.save(product);

        return "redirect:products";
    }
	
	@RequestMapping("/edit")
    public ModelAndView showEditProductPage(@RequestParam("id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = pservice.get(id);
        mav.addObject("product", product);
        return mav;
    }
	
	@RequestMapping("/delete")
    public String deleteProduct(@RequestParam("id") int id) {
        pservice.delete(id);
        return "redirect:products";      
    }
}

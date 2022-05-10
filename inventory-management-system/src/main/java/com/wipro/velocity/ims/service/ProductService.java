package com.wipro.velocity.ims.service;

import java.util.List;

import com.wipro.velocity.ims.model.Product;
import com.wipro.velocity.ims.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository prepo;
	
	public List<Product> listAll() {
        return prepo.findAll(); // defined in JPA repo
    }

    public void save(Product product) { // save is user defined method in service class
        prepo.save(product); // save method defined in JPA repo
    }

    public Product get(long id) {
        return prepo.findById(id).get();  // defined in JPA repo
    }

    public void delete(long id) {
        prepo.deleteById(id);  // defined in JPA repo
    }
}

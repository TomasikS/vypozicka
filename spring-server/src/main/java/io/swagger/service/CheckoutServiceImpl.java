/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import io.swagger.model.Pet;
import io.swagger.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefan.tomasik
 */

@Service
public class CheckoutServiceImpl implements CheckoutService {
  
    @Autowired
    private CheckoutRepository service;

    @Override
    public Pet addBook(Pet book) {
       return service.save(book);
    }

    @Override
    public Pet updateBook(Pet book) {
     Pet pet=service.findOne(book.getId());
     return service.save(pet);
    }

    @Override
    public Pet getBookById(long id) {
         return service.findOne(id);
    }

    @Override
    public void deleteBook(long id) {
        service.delete(id);
    }
    
}

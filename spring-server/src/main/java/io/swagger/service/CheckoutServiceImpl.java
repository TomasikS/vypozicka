/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import io.swagger.model.Pet;
import io.swagger.repository.CheckoutRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
    public Pet addCheckout(Pet checkout) {
        return service.save(checkout);              //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Pet updateCheckout(Pet checkout) {
        checkout = service.findById(checkout.getId()).get();
        return service.save(checkout);
    }
    
    @Override
    public Pet getCheckoutById(long id) {
         Optional<Pet> pet = service.findById(id);
        return pet.get();
    }
    
    @Override
    public void deleteCheckout(long id) {
    service.deleteById(id);
    }
    
}

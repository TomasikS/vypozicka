/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import com.sovy.models.Book;
import io.swagger.model.Pet;
import io.swagger.repository.CheckoutRepository;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    PomDatabase database = new PomDatabase();

    @Override
    public Pet addCheckout(Pet checkout) {
        return service.save(checkout);
    }

    @Override
    public Pet updateCheckout(Pet checkout) {
        checkout = service.findById(checkout.getId()).get();
        return service.save(checkout);
    }

    @Override
    public Pet getCheckoutById(long id) {
        List idUser = null;
        List idBook = null;  
        Pet petObject = null;
        try {
            idUser = database.getUserById();
            idBook = database.getBookById();

            // int sizeUser=idUser.size();
            //int sizeBook=idBook.size();
        } catch (IOException ex) {
            Logger.getLogger(CheckoutServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CheckoutServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckoutServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        Pet pet = service.findById(id).get();
        int index1 = 0;
        for (int i = 0; i < idUser.size(); i++) {
            if (idUser.get(i).equals(pet.getIdUser())) {
                index1 = i;
            }
        }

        int index2 = 0;
        for (int i = 0; i < idBook.size(); i++) {
            if (idBook.get(i).equals(pet.getIdBook())) {
                index2 = i;
            }
        }

        if ((index1 >= 0) && (index2 >= 0)) {
            petObject = pet;
        }
    
        return petObject;
    }

    @Override
    public void deleteCheckout(long id) {
        service.deleteById(id);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import io.swagger.model.Pet;

/**
 *
 * @author stefan.tomasik
 */
public interface CheckoutService {
public Pet addBook(Pet book);

    Pet updateBook(Pet book);

    Pet getBookById(long id);

    void deleteBook(long id);

    
}

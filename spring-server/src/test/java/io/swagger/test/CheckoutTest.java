/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.test;

import io.swagger.model.Pet;
import io.swagger.repository.CheckoutRepository;
import io.swagger.service.CheckoutServiceImpl;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 *
 * @author stefan.tomasik
 */
@ExtendWith(MockitoExtension.class)
public class CheckoutTest {
   
    @Mock
    CheckoutRepository repository;

    @InjectMocks
    CheckoutServiceImpl service = new CheckoutServiceImpl();

     private Pet checkout;
    
    @BeforeEach
    public void init() {
      checkout=new Pet();
    }
    
    
     @Test
    public void CreateCheckout() {
        when(repository.save(any(Pet.class))).thenReturn(new Pet());
        service.addCheckout(checkout);
        verify(repository, times(1)).save(eq(checkout));
    }

    @Test
    public void UpdateCheckout() {
        checkout.setId(1L);
          when(repository.findById(any(Long.class))).thenReturn(Optional.of(checkout));
        service.updateCheckout(checkout);
        verify(repository, times(1)).save(eq(checkout));
    }

    @Test
    public void DeleteCheckout() {
        service.deleteCheckout(1L);
        verify(repository, times(1)).deleteById(eq(1L));
    }

    @Test
    public void GetCheckout() {
        when(repository.findById(any(Long.class))).thenReturn(Optional.of(checkout));
        service.getCheckoutById(1L);
        verify(repository, times(1)).findById(eq(1L));
    }
    
}

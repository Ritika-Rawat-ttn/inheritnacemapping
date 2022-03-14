package com.example.inheritancemapping.reposs;

import com.example.inheritancemapping.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository <Payment,Integer>{
}

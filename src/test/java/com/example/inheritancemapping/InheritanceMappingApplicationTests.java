package com.example.inheritancemapping;

import com.example.inheritancemapping.entities.Check;
import com.example.inheritancemapping.entities.CreditCard;
import com.example.inheritancemapping.reposs.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceMappingApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment(){
		CreditCard cc=new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		repository.save(cc);
	}

	@Test
	public void createCheckpayment(){
		Check ch=new Check();
		ch.setId(124);
		ch.setAmount(2000);
		ch.setChecknumber("1234567890");
		repository.save(ch);
	}




}

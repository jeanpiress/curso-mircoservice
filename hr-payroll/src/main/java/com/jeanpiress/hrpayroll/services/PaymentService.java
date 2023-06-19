package com.jeanpiress.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jeanpiress.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long WorkerId, int days) {
		return new Payment("bob", 200.00, days);
	}
}

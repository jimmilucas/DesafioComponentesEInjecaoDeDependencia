package com.cursospringprofessional.desafio1.services;

import org.springframework.stereotype.Service;

import com.cursospringprofessional.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		double shipment = 0.0;
		
		if (order.getBasic() < 100.00) {
			shipment = 20.00;
		} else if (order.getBasic() < 200) {
			shipment = 12.00;
		} else {
			shipment = 0;
		}
		
		return shipment;
	}
	
}

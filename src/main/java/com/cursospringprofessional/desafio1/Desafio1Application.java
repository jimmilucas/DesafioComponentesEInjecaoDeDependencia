package com.cursospringprofessional.desafio1;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursospringprofessional.desafio1.entities.Order;
import com.cursospringprofessional.desafio1.services.OrderService;


@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Order order0 = new Order(1034, 150.00, 20.0);
		Order order1 = new Order(2282, 800.00, 10.0);
		Order order2 = new Order(1309, 95.90, 0.0);
		
		System.out.println("Pedido código " + order0.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order0));
		
		System.out.println();
		
		System.out.println("Pedido código " + order1.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order1));
		
		System.out.println();
		
		System.out.println("Pedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order2));
		
	}
	

}

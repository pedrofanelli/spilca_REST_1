package controllers;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import models.Payment;


/*
 * This represents the endpoint, the external API
 */
@RestController
public class PaymentController {

	private static Logger logger = Logger.getLogger(PaymentController.class.getName());
	
	/*
	 * We are returning a Payment object
	 */
	@PostMapping("/payment")
	public ResponseEntity<Payment> createPayment(
			@RequestHeader String requestId,
			@RequestBody Payment payment) {
		logger.info("Recieved request with ID: "+requestId+" ;Payment Amount: "+payment.getAmount());
		payment.setId(UUID.randomUUID().toString());  //seteo el valor, como si fuera la info que busco
		return ResponseEntity
				.status(HttpStatus.OK)
				.header("requestId", requestId)
				.body(payment);
	}
}

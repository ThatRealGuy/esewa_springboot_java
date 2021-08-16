package com.sb.epaysb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentGateway {
	
	@GetMapping("/esewa-pay")
	public String getEsewaPay()
	{
		//change the pid everytime you do a request. use random generated in prod
		//to run http://localhost:8080/esewa-pay
		//esewa_req.html parameters can be dynamically config using thymeleaf.
		return "esewa_req.html";
	}

	
	@GetMapping("/esewa-success")
	public String getSuccess()
	{
		//capture the success transaction from url parameter and do your own thing.
		//http://localhost:8080/esewa-success?oid=sa423&amt=100.0&refId=0002721
		return "esewa_success.html";
	}
	@GetMapping("/esewa-fail")
	public String getFail()
	{
		return "esewa_fail.html";
	}
}

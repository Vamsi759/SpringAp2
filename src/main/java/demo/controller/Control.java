package demo.controller;
import demo.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Control {
	@Autowired
	Services s;
	
	
	
	@GetMapping("/home")
	public ResponseEntity<String> home() {
		//s.Save();
		return ResponseEntity.ok("heloow vamsi run");
	}

}

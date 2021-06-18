package com.AprendendoSpring.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AprendendoSpring.course.entities.User;

@RestController //indica que esta classe é um controlador rest
@RequestMapping(value = "/users")  //indica o caminho 
public class UserResourses {

	@GetMapping //informa que esta é um resposta/requisição get
	public ResponseEntity<User> findAll () {
		User u = new User(1L, "Maria", "Maria@gmail.com", "9999999", "1234567");
		return ResponseEntity.ok().body(u); //retorna um response e adciona o objeto u no corpo da resposta
	}
}

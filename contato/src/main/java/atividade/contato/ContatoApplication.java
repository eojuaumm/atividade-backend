package atividade.contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class ContatoApplication {
	
	@PostMapping("/contato")
	public String postContato() {
		return "Contato recebido com sucesso!";
	}

	@GetMapping("/contato")
	public String getContato() {
		return "Contato consultado com sucesso!";
	}

	@PutMapping("/contato")
	public String putContato() {
		return "Contato atualizado com sucesso!";
	}

	@DeleteMapping("/contato")
	public String deleteContato() {
		return "Contato deletado com sucesso!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ContatoApplication.class, args);
	}

}

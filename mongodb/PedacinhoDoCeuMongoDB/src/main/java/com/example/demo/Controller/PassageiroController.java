package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Response.PassageiroResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Documents.Passageiro;
import com.example.demo.Services.PassageiroService;

@RestController
@RequestMapping(path ="api/passageiros")
public class PassageiroController {

	@Autowired
	private PassageiroService passageiroService;
	
	@GetMapping
	public ResponseEntity<List<Passageiro>> listarTodos() {
		return ResponseEntity.ok(this.passageiroService.listarTodos());
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<Passageiro> listarPorId(@PathVariable(name ="id") String id) {
		return ResponseEntity.ok(this.passageiroService.listarPorId(id));
		
	}
	@PostMapping
	public ResponseEntity <Response<Passageiro>> cadastrar(@Valid @RequestBody Passageiro passageiro ,BindingResult result) {
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Passageiro>(erros));
		}
	return ResponseEntity.ok(new Response<Passageiro>(this.passageiroService.cadastrar(passageiro)));
	}
	@PutMapping
	public ResponseEntity<Passageiro> atualizar(@PathVariable(name ="id") String id ,@RequestBody Passageiro passageiro) {
		passageiro.setId(id);
		return ResponseEntity.ok(this.passageiroService.atualizar(passageiro));
	}
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name ="id") String id) {
		this.passageiroService.remover(id);
		return ResponseEntity.ok(1);
	}
}

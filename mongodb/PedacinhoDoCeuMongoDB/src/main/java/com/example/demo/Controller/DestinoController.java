package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.example.demo.Response.DestinoResponse;
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
import com.example.demo.Documents.Destino;
import com.example.demo.Services.DestinoService;

@RestController
@RequestMapping(path ="api/destinos")
public class DestinoController {


	@Autowired
	private DestinoService destinoService;
	
	@GetMapping
	public ResponseEntity<List<Destino>> listarTodos() {
		return ResponseEntity.ok(this.destinoService.listarTodos());
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<Destino> listarPorId(@PathVariable(name ="id") String id) {
		return ResponseEntity.ok(this.destinoService.listarPorId(id));
		
	}
	@PostMapping
	public ResponseEntity <Response<Destino>> cadastrar(@Valid @RequestBody Destino destino ,BindingResult result) {
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Destino>(erros));
		}
	return ResponseEntity.ok(new Response<Destino>(this.destinoService.cadastrar(destino)));
	}
	@PutMapping
	public ResponseEntity<Destino> atualizar(@PathVariable(name ="id") String id ,@RequestBody Destino destino) {
		destino.setId(id);
		return ResponseEntity.ok(this.destinoService.atualizar(destino));
	}
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name ="id") String id) {
		this.destinoService.remover(id);
		return ResponseEntity.ok(1);
	}
}


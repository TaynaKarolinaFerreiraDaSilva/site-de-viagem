package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.example.demo.Response.PeriodoResponse;
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
import com.example.demo.Documents.Periodo;
import com.example.demo.Services.PeriodoService;

@RestController
@RequestMapping(path ="api/periodos")
public class PeriodoController {

	@Autowired
	private PeriodoService periodoService;
	
	@GetMapping
	public ResponseEntity<List<Periodo>> listarTodos() {
		return ResponseEntity.ok(this.periodoService.listarTodos());
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<Periodo> listarPorId(@PathVariable(name ="id") String id) {
		return ResponseEntity.ok(this.periodoService.listarPorId(id));
		
	}
	@PostMapping
	public ResponseEntity <Response<Periodo>> cadastrar(@Valid @RequestBody Periodo periodo ,BindingResult result) {
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Periodo>(erros));
		}
	return ResponseEntity.ok(new Response<Periodo>(this.periodoService.cadastrar(periodo)));
	}
	@PutMapping
	public ResponseEntity<Periodo> atualizar(@PathVariable(name ="id") String id ,@RequestBody Periodo periodo) {
		periodo.setId(id);
		return ResponseEntity.ok(this.periodoService.atualizar(periodo));
	}
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name ="id") String id) {
		this.periodoService.remover(id);
		return ResponseEntity.ok(1);
	}
}



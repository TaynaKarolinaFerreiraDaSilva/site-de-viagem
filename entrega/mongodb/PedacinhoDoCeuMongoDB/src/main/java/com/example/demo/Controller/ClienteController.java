package com.example.demo.Controller;
import com.example.demo.Response.ClienteResponse;
import java.util.ArrayList;
import java.util.List;
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
import org.springframework.web.servlet.function.EntityResponse;
import com.example.demo.Documents.Cliente;
import com.example.demo.Services.ClienteService;


@RestController
@RequestMapping(path ="api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listarTodos() {
		return ResponseEntity.ok(this.clienteService.listarTodos());
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable(name ="id") String id) {
		return ResponseEntity.ok(this.clienteService.listarPorId(id));
		
	}
	@PostMapping
	public ResponseEntity <ClienteResponse<Cliente>> cadastrar(@Valid @RequestBody Cliente cliente ,BindingResult result) {
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new ClienteResponse<Cliente>(erros));
		}
	return ResponseEntity.ok(new ClienteResponse<Cliente>(this.clienteService.cadastrar(cliente)));
	}
	@PutMapping
	public ResponseEntity<Cliente> atualizar(@PathVariable(name ="id") String id ,@RequestBody Cliente cliente) {
		cliente.setId(id);
		return ResponseEntity.ok(this.clienteService.atualizar(cliente));
	}
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name ="id") String id) {
		this.clienteService.remover(id);
		return ResponseEntity.ok(1);
	}
}

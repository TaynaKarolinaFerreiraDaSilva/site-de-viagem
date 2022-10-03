package br.com.agencia.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.agencia.DAO.ClienteDAO;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Cliente;

public class MainCliente {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args, Object ClienteDao, int cpf) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setName("Bethoven silva");
		cliente.setEmail("tovinho@.com.br");
		cliente.setCpf("10910810765");
		cliente.setNasc("20181907");
		cliente.setContato("8196666-6666");
		cliente.setEndereco("rua dos céus ,numero 19");
		
		clienteDAO.save(cliente);
		
		
			for (Cliente C: ClienteDAO.getClientes()) {
				System.out.println("cliente:"+C.getName());
				System.out.println("cliente:"+C.getEmail());
				System.out.println("cliente:"+C.getCpf());
				System.out.println("cliente:"+C.getNasc());
				System.out.println("cliente:"+C.getContato());
				System.out.println("cliente:"+C.getEndereco());
			}
	
		Cliente C1 = new Cliente();
		C1.setNome("Marley lorenzo Ferreira tenório");
			C1.setEmail("");
			C1.setCpf("");
			C1.setNasc("");
			C1.setContato("");
			C1.setEndereco("");
			C1.setId_cliente(1);
			
		 ((ClienteDAO) ClienteDao).Update(C1);	
				
			
				
		 clienteDAO.deleteBycpf(cpf);
		           
	         }
	    

}




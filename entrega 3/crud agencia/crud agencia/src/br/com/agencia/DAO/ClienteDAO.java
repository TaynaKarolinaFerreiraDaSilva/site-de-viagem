package br.com.agencia.DAO;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Cliente;

public class ClienteDAO <cliente> {

	private static final ConnectionFactory ConnectionFctory = null;

	public void save(Cliente cliente) {
		String sql = "INSERT INTO cliente (name , email, cpf , nasc , contato , endereco) VALUES(?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cliente.getName());
			pstm.setString(2, cliente.getEmail());
			pstm.setInt(3, cliente.getCpf());
			pstm.setInt(4, cliente.getNasc());
			pstm.setInt(5, cliente.getContato());
			pstm.setString(6, cliente.getEndereco());
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstm!= null) {
					pstm.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
				
		}
		
		 public     List<cliente> getclientes(){
			 
				String sql = "SELECT * FROM clientes";
				
				List<cliente> clientes =  new ArrayList<cliente>();
				
				Connection Conn = null;
				PreparedStatement Pstm = null;
				ResultSet rset = null;
				
				try {
					Conn = ConnectionFctory.createConnectionToMySQL();
					
					Pstm = (PreparedStatement) Conn.prepareStatement(sql);
					
					rset = Pstm.executeQuery();
					
					while(rset.next()) {
						
						Cliente cliente = new Cliente();
						
						cliente.setId_cliente(rset.getLong("id"));
						cliente.setName(rset.getString("nome"));
						cliente.setEmail(rset.getString("email"));
						cliente.setCpf(rset.getInt("cpf"));
						cliente.setNasc(rset.getInt("nasc"));
						cliente.setContato(rset.getInt("contato"));
						cliente.setEndereco(rset.getString("endereco"));
						
						cliente.add(cliente);
						
				
								
							}	}catch (Exception e) {
								e.printStackTrace();
							}finally {
								  try {
									if (rset!=null) {
										rset.close();
									}
									if(Pstm!=null) {
										Pstm.close();
										}
									
									if(Conn!=null) {
										Conn.close();
									}
								  
									}catch(Exception e) {
										e.printStackTrace();
										
									}
								 
							   }	    
				                      return clientes;  

				          				
		                     }


			public void Update(Cliente cliente) {
				
				String sql = "UPDATE clientes SET nome = ?, email = ?, cpf = ?, nasc = ?, contato = ?, endereco = ?" +
				"WHERE id = ?";
				
				Connection  conn = null;
				PreparedStatement pstm = null;
				
				try {
					conn = ConnectionFactory.createConnectionToMySQL();
					pstm = (PreparedStatement) conn.prepareStatement(sql);
					
					pstm.setString(1, cliente.getName());
					pstm.setString(2, cliente.getEmail());
					pstm.setInt(3, cliente.getCpf());
					pstm.setInt(4, cliente.getNasc());
					pstm.setInt(5, cliente.getContato());
					pstm.setString(6, cliente.getEndereco());
					pstm.setLong(7, cliente.getId_cliente());
					
					pstm.executeQuery();
					
				}catch (Exception e) {
					e.printStackTrace();
					
				}finally {
					try {
						if(pstm!=null);
						pstm.close();
					
					
					if(conn!=null);
					conn.close();
					
					}catch (Exception e) {
						e.printStackTrace();
					}	
				}	
			}
				public void deleteBycpf(int cpf) {
					String sql = "DELETE FROM clientes where cpf = ?";

					Connection conn = null;

					PreparedStatement pstm = null;

					try {
					conn = ConnectionFactory.createConnectionToMySQL();
					pstm = (PreparedStatement) conn.prepareStatement(sql);
					pstm.setInt(cpf, cpf);

					pstm.execute();
					}catch (Exception e) {
					   e.printStackTrace();
					}finally {
					     try {
					      if(pstm !=null){
					        pstm.close();
					    }
					      if(conn !=null){
					         conn.close();
					     }
					  }catch (Exception e) {
					      e.printStackTrace();
					     }
					  
			}	   
				}

				public static void deleteById(int id) {
					// TODO Auto-generated method stub
					
				}

				public static Cliente[] getClientes() {
					// TODO Auto-generated method stub
					return null;
				}
		
}    
			

		 
						
									
					
					
				
				
			
			
		
		
	
	



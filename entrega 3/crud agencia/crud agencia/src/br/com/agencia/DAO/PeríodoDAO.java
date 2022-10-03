package br.com.agencia.DAO;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Período;

public class PeríodoDAO<período> {


	private static final ConnectionFactory ConnectionFctory = null;

	public void save(Período período){
		String sql = "INSERT INTO período (duracao da viagem) VALUES(?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, período.getDuracao_da_viagem());
			

			
			
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
		
		public List<Período> getperíodos(List<Período> períodos){
			 
			String sql = "SELECT * FROM períodos";
			
			List<período> período =  new ArrayList<período>();
			
			Connection Conn = null;
			PreparedStatement Pstm = null;
			ResultSet rset = null;
			
			try {
				Conn = ConnectionFctory.createConnectionToMySQL();
				
				Pstm = (PreparedStatement) Conn.prepareStatement(sql);
				
				rset = Pstm.executeQuery();
				
				while(rset.next()) {
					
					Período Período = new Período();

					Período.setDuracao_da_viagem(rset.getString("duracao_da_viagem"));
					
                                            
					
					período.addAll(período);
					
			
							
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
			                      return períodos;  
									
	                     }

		public void Update(Período período) {
			
			String sql = "UPDATE períodos SET duracao_da_viagem = ?" +
			"WHERE id = ?";
			
			Connection  conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ConnectionFactory.createConnectionToMySQL();
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				
				 pstm.setInt(1, período.getDuracao_da_viagem());
				 pstm.setLong(2, período.getId_periodo());
			     pstm.setLong(3, período.getId_passageiro());
				
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


      public void deleteById(int Id) {
     String sql = "DELETE FROM períodos where id = ?";

      Connection conn = null;

     PreparedStatement pstm = null;

    try {
   conn = ConnectionFctory.createConnectionToMySQL();
  pstm = (PreparedStatement) conn.prepareStatement(sql);
  pstm.setLong(Id, Id);

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

	public static Período[] getPeríodos() {
		// TODO Auto-generated method stub
		return null;
	}

	}
		

		
	 
                        
			
		                  
		
	            


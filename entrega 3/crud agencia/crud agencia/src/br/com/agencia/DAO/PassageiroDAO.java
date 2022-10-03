package br.com.agencia.DAO;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Passageiro;

public class PassageiroDAO {


	private static final ConnectionFactory ConnectionFctory = null;
	private List<Passageiro> passageiro;

	public void save(Passageiro passageiro){
		String sql = "INSERT INTO passageiro (adulto, menores, tipo_da_classe) VALUES(?,?,?,)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, passageiro.getAdulto());
			pstm.setInt(2,passageiro.getMenores());
            pstm.setString(3,passageiro.getTipo_da_classe());

			
			
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
		
		public List<Passageiro> getpassageiros(){
			 
			String sql = "SELECT * FROM passageiros";
			
			List <Passageiro> passageiros = new ArrayList<Passageiro>();
			
			Connection Conn = null;
			PreparedStatement Pstm = null;
			ResultSet rset = null;
			
			try {
				Conn = ConnectionFctory.createConnectionToMySQL();
				
				Pstm = (PreparedStatement) Conn.prepareStatement(sql);
				
				rset = Pstm.executeQuery();
				
				while(rset.next()) {
					
					Passageiro passageiro = new Passageiro();
					
					passageiro.setId_passageiro(rset.getLong("id"));
					passageiro.setAdulto(rset.getInt("adulto"));
					passageiro.setMenores(rset.getInt("menores"));
					passageiro.setTipo_da_classe(rset.getString("tipo da classe"));
                                            
					
					passageiro.add(passageiro);
					
			
							
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
			                      return passageiro ;  
		                             }


     public void deleteById(int Id) {
      String sql = "DELETE FROM passageiros where id = ?";

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

	public void Update(Passageiro p1) {
		// TODO Auto-generated method stub
		
	}

		
	}
				
								
                        
				
			
			
			
		
		
	


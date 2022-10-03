package br.com.agencia.DAO;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Classes;

public class ClasseDAO<classe, Classe> {


	private static final ConnectionFactory ConnectionFctory = null;
	private static final String Classe = null;
	private Classe classe;


	public void save(Classe classe, ConnectionFactory ConnectionFctory) {
		String sql = "INSERT INTO classes (economica, executivabussines, primeiraclasse, premiumeconomica) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ((Classes) classe).getEconomica());
			pstm.setString(2,((Classes) classe).getExecutiva_bussines());
            pstm.setString(3,((Classes) classe).getPrimeira_classe());
            pstm.setString(4,((Classes) classe).getPremium_economica());
			
			
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
		
			
		public   List<classe> getclasses( ){
			 
			String sql = "SELECT * FROM classes";
			
			List<classe> classes =  new ArrayList<classe>();
			
			Connection Conn = null;
			PreparedStatement Pstm = null;
			ResultSet rset = null;
			
			try {
				Conn = ConnectionFctory.createConnectionToMySQL();
				
				Pstm = (PreparedStatement) Conn.prepareStatement(sql);
				
				rset = Pstm.executeQuery();
				
				while(rset.next()) {
					
			Classes classe = new Classes();
					
					 classe.setId_classes(rset.getLong("id"));
					 classe.setEconomica(rset.getString("economica"));
					 classe.setExecutiva_bussines(rset.getString("Executiva_bussines"));
					classe.setPremium_economica(rset.getString("Premium_economica"));
                    classe.setPrimeira_classe(rset.getString("Primeira_classe"));  
					
				classe.add(classe);
					
			
							
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
			                      return classes;  
									
	                     }
	  	public void Update(Classes classes) {
    		String sql = "UPDATE classes SET Economica = ?, Executiva_bussines = ?, Premium_economica = ?, Primeira_classe= ?" +
    		"WHERE id = ?";
    						
    		Connection  conn = null;
    		PreparedStatement pstm = null;
    						
    		try {
    		conn = ConnectionFactory.createConnectionToMySQL();
    		pstm = (PreparedStatement) conn.prepareStatement(sql);
    							
    		pstm.setString(1, classes.getEconomica());
    		pstm.setString(2, classes.getExecutiva_bussines());
    		pstm.setString(3, classes.getPremium_economica());
    		pstm.setString(4, classes.getPrimeira_classe());
    		pstm.setLong(5, classes.getId_classes());					
    							
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


             public static void deleteById(int Id) {
            String sql = "DELETE FROM classes where id = ?";

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


			public void save(Classes classes) {
				// TODO Auto-generated method stub
				
			}


			public static Classes[] getClasses() {
				// TODO Auto-generated method stub
				return null;
			}
		
}	


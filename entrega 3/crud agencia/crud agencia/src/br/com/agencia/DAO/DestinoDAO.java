package br.com.agencia.DAO;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.ClientPreparedStatement;

import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Destino;

public class DestinoDAO<destino> {

	private static final ConnectionFactory ConnectionFctory = null;
	public static Object save;

	public void save(Destino destino) {
		String sql = "INSERT INTO destino (ida, ida_e_volta, multidestino) VALUES(?,?,?)";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, destino.getIda());
			pstm.setString(2,destino.getIda_volta());
            pstm.setString(3,destino.getMultidestino());
			
			
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
		
		public   List<destino> getdestino(){
			 
			String sql = "SELECT * FROM destinos";
			
			List<destino> destinos =  new ArrayList<destino>();
			
			Connection Conn = null;
			PreparedStatement Pstm = null;
			ResultSet rset = null;
			
			try {
				Conn = ConnectionFctory.createConnectionToMySQL();
				
				Pstm = (PreparedStatement) Conn.prepareStatement(sql);
				
				rset = Pstm.executeQuery();
				
				while(rset.next()) {
					
					Destino destino = new Destino();
					
					destino.setId_destino(rset.getLong("id"));
					destino.setIda(rset.getString("ida"));
					destino.setIda_volta(rset.getString("ida_volta"));
					destino.setMultidestino(rset.getString("multidestino"));
					
					destino.add(destino);
					
			
							
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
			                   return destinos;  
		                   } 
                     
                                              
           

	                    
   public void Update(Destino destino) {
   String sql = "UPDATE destinos SET Ida= ?, Ida_volta = ?, Multidestino = ?" +
    "WHERE id = ?";
			                    	  				
	Connection  conn = null;
	PreparedStatement pstm = null;
			                    	  				
	try {
	conn = ConnectionFactory.createConnectionToMySQL();
	pstm = (PreparedStatement) conn.prepareStatement(sql);
			                    	  				
	pstm.setString(1, destino.getIda());
    pstm.setString(2, destino.getIda_volta());
	pstm.setString(3, destino.getMultidestino());
	pstm.setLong(4, destino.getId_destino());					
			                    	  					
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
        String sql = "DELETE FROM destinos where id = ?";

        Connection conn = null;

         PreparedStatement pstm = null;

           try {
            conn = ConnectionFactory.createConnectionToMySQL();
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

	public static Destino[] getdestinos() {
		// TODO Auto-generated method stub
		return null;
	}


      
      }
		
	

	

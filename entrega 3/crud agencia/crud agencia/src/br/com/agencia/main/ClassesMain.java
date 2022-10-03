package br.com.agencia.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.agencia.DAO.ClasseDAO;
import br.com.agencia.DAO.ClienteDAO;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Classes;

public class ClassesMain<Classe> {

	private static int id;

	public static <classeDAO> void main(String[] args) {
	
ClasseDAO classeDAO = new ClasseDAO();
		
		Classes classes= new Classes();
		classes.setPrimeira_classe("Bethoven silva");

                classeDAO.save(classes);
                
            	for(Classes Cl :ClasseDAO.getClasses()) {
        			System.out.println("classes:"+Cl.getEconomica());
        			System.out.println("classes:"+Cl.getPremium_economica());
        			System.out.println("classes:"+Cl.getExecutiva_bussines());
                    System.out.println("classes:"+Cl.getPrimeira_classe());
            	}
            	
            	 Classes C2 = new Classes();
                 C2.setEconomica("");
                 C2.setPremium_economica("");
                 C2.setExecutiva_bussines("");	
                 C2.setPrimeira_classe("");			          			
                 C2.setId_classes(0);

                   classeDAO.Update(C2);	
                   
                   ClienteDAO.deleteById(id);
	     }


}
	
                        
	
	


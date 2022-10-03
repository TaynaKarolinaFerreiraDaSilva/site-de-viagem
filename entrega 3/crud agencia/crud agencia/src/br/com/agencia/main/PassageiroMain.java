package br.com.agencia.main;

import br.com.agencia.DAO.ClasseDAO;
import br.com.agencia.DAO.PassageiroDAO;
import br.com.agencia.model.Passageiro;
import br.com.agencia.model.Período;

public class PassageiroMain {

	private static int id;

	public static void main(String[] args) {
	
PassageiroDAO passageiroDAO = new PassageiroDAO();
		
		Passageiro passageiro= new Passageiro();
		passageiro.setAdulto("28");
                passageiro.setTipo_da_classe("primeira classe");
                
            passageiroDAO.save(passageiro);

        	
				for(Passageiro P : passageiroDAO.getpassageiros()) {
					System.out.println("passageiro:"+P.getAdulto());
					System.out.println("passageiro:"+P.getMenores());
					System.out.println("passageiro:"+P.getTipo_da_classe());
                           }
    
				Passageiro P1 = new Passageiro();
				P1.setAdulto("");
				P1.setMenores("");
				P1.setId_período(1);	
	                       
				passageiroDAO.Update(P1);	
				
				ClasseDAO.deleteById(id);
	}
	        }

                      

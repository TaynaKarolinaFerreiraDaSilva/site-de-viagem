/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import View.Login;
import javax.swing.text.View;

/**
 *
 * @author Remakker
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper Helper;
public LoginController(Login view) {
        this.view = view;
        this.Helper = new LoginHelper(view);
                
  }

  public void fizTarefa() {
         System.out.Println("Busquei algo no banco de dados");
         this.view.exibemensagem( "executei o fiz tarefa "); 
         usuario modelo
                
        modelo = new Usuario(0 , Nome , Senha);
    
    }  
  
  
public void entrarnosistema() {
       //pegar um usuario da view
       Usuario Usuario =  Helper.obtermodelo();
   
    
}
    
    
    
    
 
   


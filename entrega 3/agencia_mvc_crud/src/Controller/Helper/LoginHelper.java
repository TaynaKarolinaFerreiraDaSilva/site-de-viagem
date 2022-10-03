/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Login;

/**
 *
 * @author Remakker
 */
public class LoginHelper {
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String Senha = view.getTextSenha().getText();
        usuario modelo = new usuario(0, nome , Senha);
        return modelo;
    }
    public void SetarModelo(Usuario modelo){
        String nome = modelo.getnome();
        String senha = modelo.getsenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha)
    }

    public Controller.Usuario obtermodelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void limpar tela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
  }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Remakker
 */
public class Passageiro {
    private long id_passageiro;
	private int adulto;
	private int menores;
	private String tipo_da_classe;

    public Passageiro(long id_passageiro, int adulto, int menores, String tipo_da_classe) {
        this.id_passageiro = id_passageiro;
        this.adulto = adulto;
        this.menores = menores;
        this.tipo_da_classe = tipo_da_classe;
    }

    public long getId_passageiro() {
        return id_passageiro;
    }

    public void setId_passageiro(long id_passageiro) {
        this.id_passageiro = id_passageiro;
    }

    public int getAdulto() {
        return adulto;
    }

    public void setAdulto(int adulto) {
        this.adulto = adulto;
    }

    public int getMenores() {
        return menores;
    }

    public void setMenores(int menores) {
        this.menores = menores;
    }

    public String getTipo_da_classe() {
        return tipo_da_classe;
    }

    public void setTipo_da_classe(String tipo_da_classe) {
        this.tipo_da_classe = tipo_da_classe;
    }
        
}

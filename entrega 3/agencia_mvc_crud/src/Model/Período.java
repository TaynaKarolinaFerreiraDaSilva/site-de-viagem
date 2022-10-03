/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Remakker
 */
public class Período {
    	private long id_periodo;
	private int duracao_da_viagem;

    public Período(long id_periodo, int duracao_da_viagem) {
        this.id_periodo = id_periodo;
        this.duracao_da_viagem = duracao_da_viagem;
    }

    public long getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(long id_periodo) {
        this.id_periodo = id_periodo;
    }

    public int getDuracao_da_viagem() {
        return duracao_da_viagem;
    }

    public void setDuracao_da_viagem(int duracao_da_viagem) {
        this.duracao_da_viagem = duracao_da_viagem;
    }
        
}

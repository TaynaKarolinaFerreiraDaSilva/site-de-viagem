/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Remakker
 */
public class Destino {
    private long id_destino;
	private String ida;
	private String ida_volta;
	private String multidestino;

    public Destino(long id_destino, String ida, String ida_volta, String multidestino) {
        this.id_destino = id_destino;
        this.ida = ida;
        this.ida_volta = ida_volta;
        this.multidestino = multidestino;
    }

    public long getId_destino() {
        return id_destino;
    }

    public void setId_destino(long id_destino) {
        this.id_destino = id_destino;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getIda_volta() {
        return ida_volta;
    }

    public void setIda_volta(String ida_volta) {
        this.ida_volta = ida_volta;
    }

    public String getMultidestino() {
        return multidestino;
    }

    public void setMultidestino(String multidestino) {
        this.multidestino = multidestino;
    }
        
    
}

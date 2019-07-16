/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Estudiante
 */
public class Cajita
{
    private String comida = "";
    private String bebida = "";
    private String juguete = "";
    // -------------------------------------------
    public Cajita() {
    }
    // -------------------------------------------

    public String getComida() {
        return comida;
    }

    public String getBebida() {
        return bebida;
    }

    public String getJuguete() {
        return juguete;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }
   
}
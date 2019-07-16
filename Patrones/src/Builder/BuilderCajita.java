/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

public abstract class BuilderCajita
{
     protected Cajita cajita;
    // ------------------------------
    public Cajita getCajita() {
        return this.cajita;
    }
    // ------------------------------
     public void crearNuevoCajita() {
        this.cajita = new Cajita();
    }
    // ------------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract void construirComida();
     public abstract void construirBebida();
     public abstract void construirJuguete();
}
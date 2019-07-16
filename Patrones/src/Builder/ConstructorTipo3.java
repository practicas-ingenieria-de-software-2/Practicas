/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

public class ConstructorTipo3 extends BuilderCajita {
    public ConstructorTipo3() {
    }
    // ------------------------------
    @Override
     public void construirComida() {
        this.cajita.setComida( "Nuggets" );
    }
    // ------------------------------
    @Override
     public void construirBebida() {
        this.cajita.setBebida( "Sprite" );
    }
    // ------------------------------
    @Override
     public void construirJuguete() {
        this.cajita.setJuguete( "Señor Cara de Papa" );
    } 
}

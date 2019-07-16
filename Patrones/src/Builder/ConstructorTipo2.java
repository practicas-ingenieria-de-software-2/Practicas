/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

public class ConstructorTipo2 extends BuilderCajita {
    public ConstructorTipo2() {
    }
    // ------------------------------
    @Override
     public void construirComida() {
        this.cajita.setComida( "Perro Caliente" );
    }
    // ------------------------------
    @Override
     public void construirBebida() {
        this.cajita.setBebida( "Limonada" );
    }
    // ------------------------------
    @Override
     public void construirJuguete() {
        this.cajita.setJuguete( "Woody" );
    } 
}

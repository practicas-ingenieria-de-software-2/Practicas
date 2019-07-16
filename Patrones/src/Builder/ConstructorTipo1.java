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
public class ConstructorTipo1 extends BuilderCajita {
    public ConstructorTipo1() {
    }
    // ------------------------------
    @Override
     public void construirComida() {
        this.cajita.setComida( "Hamburguesa" );
    }
    // ------------------------------
    @Override
     public void construirBebida() {
        this.cajita.setBebida( "coca cola" );
    }
    // ------------------------------
    @Override
     public void construirJuguete() {
        this.cajita.setJuguete( "Buzz" );
    } 
}

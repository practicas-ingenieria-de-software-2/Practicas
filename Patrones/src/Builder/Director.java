/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

public class Director
{
    public Director() {
    }
    // --------------------------
     public void construir( BuilderCajita builder )
    {
        builder.crearNuevoCajita();
        builder.construirComida();
        builder.construirBebida();
        builder.construirJuguete();
    }
}
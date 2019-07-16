/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Jonathan Galvis
 */
public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto Director
         Director director = new Director();
        // Crear los objetos ConcreteBuilder
         BuilderCajita Menu1  = new ConstructorTipo1();
         BuilderCajita Menu2 = new ConstructorTipo2();
         BuilderCajita Menu3  = new ConstructorTipo3();
        // Construir un coche con equipamiento base
         director.construir( Menu1 );
         Cajita MenuTipo1 = Menu1.getCajita();
        // Construir un coche con equipamiento medio
         director.construir( Menu2 );
         Cajita MenuTipo2 = Menu2.getCajita();
        // Construir un coche con equipamiento full
         director.construir( Menu3 );
         Cajita MenuTipo3 = Menu3.getCajita();
        // Mostrar la información de cada coche creado
        mostrarCaracteristicas( MenuTipo1 );
        mostrarCaracteristicas( MenuTipo2 );
        mostrarCaracteristicas( MenuTipo3 );
    }
    // --------------------------------
    public static void mostrarCaracteristicas( Cajita cajita )
    {
        System.out.println( "Comida: " + cajita.getComida() );
        System.out.println( "Bebida: " + cajita.getBebida() );
        System.out.println( "Juguete " + cajita.getJuguete() );
        System.out.println("===================================");
    }
}
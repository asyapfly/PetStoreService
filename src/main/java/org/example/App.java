package org.example;

import static org.example.PetSwagger.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        createPet(142, "Nagayna");
        updatePet(142, "Nagayna 2");
        getByPetId(142);
        deleteById(142);
    }
}

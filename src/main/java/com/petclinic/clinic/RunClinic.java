package com.petclinic.clinic;

/**
 * @author Vladislav Volkov
 * @since 2017.02.06
 */

public class RunClinic {

    public static void main(String[] args) throws Exception {

        // Create client database for 20 elements.
        final Clinic clients = new Clinic(20);
        final Menu menu = new Menu();



        // Intro:
        System.out.println("Hello! Welcome to our PetClinic. Paradise for your pets!\n");

        menu.call();

    }
}
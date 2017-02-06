package com.petclinic.clinic;

/**
 * @author Vladislav Volkov
 * @since 2017.02.06
 */

class Pet {

    private String name;

    public Pet(String petName) {
        name = petName;
    }

    // Create pet name getter.
    String getName() {
        return this.name;
    }
}
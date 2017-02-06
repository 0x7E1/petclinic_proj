package com.petclinic.clinic;

/**
 * @author Vladislav Volkov
 * @since 2017.02.06
 */

class Client {

    private String name;
    private String petName;
    private String phoneNumber;
    private String address;

    // Client with pet.
    Client(String name, String petName) {
        this.name = name;
        Pet pet = new Pet(petName);
        this.petName = pet.getName();
    }


    /**
     * Create getters for Client and Pet names.
     * @return names of Client and Pet.
     */
    // Get client name.
    public String getName() {
        return this.name;
    }
    // Get pet name.
    public String getPetName() {
        return this.petName;
    }

    // Set client phone number.
    public void setClientPhoneNumber(String number) {

    }

    // Set client and pet address.
    public void setClientAddress(String address) {

    }
}
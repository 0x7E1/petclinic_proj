package com.petclinic.clinic;

/**
 * @author Vladislav Volkov
 * @since 2017.02.06
 */

class Clinic {

    private final Client[] clients;

    Clinic(int amount) {
        this.clients = new Client[amount];
    }

    public void addClient(int id, Client client) {
        if ((id >= 0) && (id <= clients.length))
            this.clients[id] = client;
        else
            System.out.println("ERROR! Invalid client ID.");
    }
}
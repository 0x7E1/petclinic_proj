package com.petclinic.clinic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Vladislav Volkov
 * @since 2017.02.06
 */

class Menu {

    void call() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte action;

        // Menu:
        System.out.println("1. Add client or pet.\n" +
                "2. Remove client or pet.\n" +
                "3. Search client or pet.\n" +
                "4. Edit client data\n");

        loop: while (true) {
            try {
                System.out.print("Select action: ");
                action = Byte.parseByte(reader.readLine());
                switch (action) {
                    case 1:
                        add();
                        break loop;
                    case 2:
                        remove();
                        break loop;
                    case 3:
                        search();
                        break loop;
                    case 4:
                        edit();
                        break loop;
                    default:
                        System.out.println("Unknown action! Repeat enter please.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Invalid input data. Enter a number.");
            }
        }
    }

    private void add() {
        System.out.println("\nMethod add() has been called");
    }

    private void remove() {
        System.out.println("Method remove() has been called");
    }

    private void search() {
        System.out.println("Method search() has been called");
    }

    private void edit() {
        System.out.println("Method edit() has been called");
    }
}

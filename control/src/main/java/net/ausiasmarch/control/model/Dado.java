package net.ausiasmarch.control.model;

import java.util.Random;

public class Dado {

    public int getDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;  // Número aleatorio entre 1 y 6
    }
}

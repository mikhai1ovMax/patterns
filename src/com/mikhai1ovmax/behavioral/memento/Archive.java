package com.mikhai1ovmax.behavioral.memento;

public class Archive {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

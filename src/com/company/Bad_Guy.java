package com.company;

public class Bad_Guy extends GameEntity {
    private int closeUpDamage;
    private int distanceDamage;

    public void attackClose(GameEntity victim) {
        victim.takeDamage(closeUpDamage);
    }

    public void attackFromFar(GameEntity victim) {
        victim.takeDamage(distanceDamage);
    }
    public String toString () {
        return new String("Close Up Damage: "+ closeUpDamage+ "\n"+ "Distance Damage: "+ distanceDamage);
    }

    public Bad_Guy() {
        this.closeUpDamage = (200);
        this.distanceDamage = (100);
    }
}

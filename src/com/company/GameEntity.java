package com.company;

import java.awt.*;

public class GameEntity {
    private java.awt.Rectangle rect = new Rectangle(5, 6, 16, 20);
    protected int Health;

    public int getHealth() {
        return Health;
    }

    public boolean doesCollide(GameEntity other) {
        if (rect.intersects(other.rect))
            return true;
        else
            return false;
    }

    public void takeDamage(int amount){
        this.Health -= amount;
    }
@Override
    public String toString(){
        return new String("The health is; "+ this.Health);
    }
}

package com.company;

public class Boss extends Bad_Guy{
    private int specialDamage1;
    private int specialDamage2;
    private int specialDamage3;

    public void attackClose(GameEntity victim){
        int damage = chooseSpecialAttack();
        victim.takeDamage(damage);
    }

    public int chooseSpecialAttack(){
        int value = Main.ran.nextInt(3);
        if(value == 0){
            return specialDamage1;
        }
        if(value == 1){
            return specialDamage2;
        }
        if(value == 2){
            return specialDamage3;
        }
        return 0;
    }

    public Boss(){
        this.specialDamage1 = 400;
        this.specialDamage2 = 550;
        this.specialDamage3 = 700;
        this.Health = 1000;
    }
    public String toString () {
        return new String("Boss:\nSpecial Damage 1: "+ + this.specialDamage1+ "\n"+ "Special Damage 2: "+ this.specialDamage2+ "\n"+ "Special Damage 3: "+ this.specialDamage3+ "\n"+ "Health: "+ this.Health);
    }

}

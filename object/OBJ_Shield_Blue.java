package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Blue extends Entity{
    public OBJ_Shield_Blue(GamePanel gp) {
        super(gp);
        this.gp = gp;
        
        type = type_shield;
        name = "Blue Shield";
        down1 = setup("/objects/shield_Blue",gp.tileSize, gp.tileSize);
        defenseValue = 2;
        description = "[" + name + "]\nA shiny blur shield!";
        price = 250;
    }

    public void update() {
        spriteCounter--;      
    }
}


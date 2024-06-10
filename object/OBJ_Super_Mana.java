package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Super_Mana extends Entity{

    GamePanel gp;

    public OBJ_Super_Mana(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_mana;
        name = "Super Mana";
        value = 10;
        down1 = setup("/objects/super_mana", gp.tileSize, gp.tileSize);
        description = "[Red Potion]\nHeals your life by " + value + ".";
        price = 400;
    }
    public boolean use(Entity entity){
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You drink the " + name + "!\n" + "Your mana has been recovered by " + value + ".";
        entity.mana += value;
        gp.playSE(2);
        return true;
    }
    public void update() {
        spriteCounter--;      
    }
}

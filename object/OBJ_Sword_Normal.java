package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Sword_Normal extends Entity {
    GamePanel gp;

    public OBJ_Sword_Normal(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_sword;
        name = "Normal Sword";
        down1 = setup("/objects/sword_normal",gp.tileSize,gp.tileSize);
        attackValue = 1;  
        attackArea.width = 36;
        attackArea.height = 36;
        description = "[" + name + "]\nAn old sword.";
        price = 25;
        knockBackPower = 2;
        motion1_duration = 5;
        motion2_duration = 25;
    }
    
    public void update() {
        spriteCounter--;      
    }
}
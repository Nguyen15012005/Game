package monster;

import java.util.Random;

import entity.Entity;
import main.GamePanel;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;
import object.OBJ_Rock;

public class MON_Green_Slime extends Entity{
    GamePanel gp;
    public MON_Green_Slime(GamePanel gp) {
        super(gp);

        this.gp = gp;
        
        type = type_monster;
        name = "Green_Slime";
        defaultSpeed = 1;
        speed = 4;
        maxLife = 10;
        life = maxLife;
        attack = 10;
        defense = 0;
        exp = 20;
        projectile = new OBJ_Rock(gp);

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        getImage();
    }
    public void getImage() {
        up1 = setup("/monsters/cell1",gp.tileSize,gp.tileSize);
        up2 = setup("/monsters/cell2",gp.tileSize,gp.tileSize);
        down1 = setup("/monsters/cell1",gp.tileSize,gp.tileSize);
        down2 = setup("/monsters/cell2",gp.tileSize,gp.tileSize);
        left1 = setup("/monsters/cell1",gp.tileSize,gp.tileSize);
        left2 = setup("/monsters/cell2",gp.tileSize,gp.tileSize);
        right1 = setup("/monsters/cell1",gp.tileSize,gp.tileSize);
        right2 = setup("/monsters/cell2",gp.tileSize,gp.tileSize);
    }
    public void setAction(){

        if (onPath == true){

            // Check if it stops chasing
            checkStopChasingOrNot(gp.player, 15, 100);

            // Search the direction to go
            searchPath(getGoalCol(gp.player), getGoalRow(gp.player));

            //Check if it shoots a projectile
            checkShootOrNot(200, 30);
        }
        else {
            //Check if it starts chasing 
            checkStopChasingOrNot(gp.player, 5, 100);

            //Get a random direction
            getRandomDirection();
        }
    }    
    public void damageReaction(){

        actionLockCounter = 0;
        direction = gp.player.direction;

    }
    public void checkDrop(){
        //CAST A DIE
        int i = new Random().nextInt(100)+1;

        //SET THE MONSTER DROP
        if (i < 50){
            dropItem(new OBJ_Coin_Bronze(gp));
        }
        if (i >= 50 && i < 75){
            dropItem(new OBJ_Heart(gp));
        }
        if (i >= 75 && i < 100){
            dropItem(new OBJ_ManaCrystal(gp));
        }
    }
}

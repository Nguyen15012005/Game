package main;

import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_Majin_Buu;
import monster.MON_Cell;
import monster.MON_Frieza;
import monster.MON_Green_Slime;
import monster.MON_Octopus;
import monster.MON_Orc;
import monster.MON_Pi;
import monster.MON_Piccolo;
import monster.MON_Vegeta;
import object.OBJ_Axe;
import object.OBJ_Chest;
import object.OBJ_Coin_Bronze;
import object.OBJ_Door;
import object.OBJ_Heart;
import object.OBJ_Key;
import object.OBJ_Lantern;
import object.OBJ_ManaCrystal;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import object.OBJ_Super_Mana;
import object.OBJ_Tent;
import tile_interactive.IT_DryTree;

/**
 * AssetSetter
 */
public class AssetSetter {

    public GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp; 
    }

    public void setObject(){

        int mapNum = 0;
        int i = 0;
        // gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        // gp.obj[mapNum][i].worldX = gp.tileSize*25;
        // gp.obj[mapNum][i].worldY = gp.tileSize*23;
        // i++;
        // gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        // gp.obj[mapNum][i].worldX = gp.tileSize*21;
        // gp.obj[mapNum][i].worldY = gp.tileSize*19;
        // i++;
        gp.obj[mapNum][i] = new OBJ_Lantern(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*18;
        gp.obj[mapNum][i].worldY = gp.tileSize*20;
        i++;
        gp.obj[mapNum][i] = new OBJ_Super_Mana (gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*16;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        // gp.obj[mapNum][i] = new OBJ_Potion_Red (gp);
        // gp.obj[mapNum][i].worldX = gp.tileSize*21;
        // gp.obj[mapNum][i].worldY = gp.tileSize*20;
        // i++;
        // gp.obj[mapNum][i] = new OBJ_Potion_Red(gp);
        // gp.obj[mapNum][i].worldX = gp.tileSize*20;
        // gp.obj[mapNum][i].worldY = gp.tileSize*20;
        // i++;
        gp.obj[mapNum][i] = new OBJ_Tent (gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*19;
        gp.obj[mapNum][i].worldY = gp.tileSize*20;
        i++;
        gp.obj[mapNum][i] = new OBJ_Axe (gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*33;
        gp.obj[mapNum][i].worldY = gp.tileSize*7;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*12;
        gp.obj[mapNum][i].worldY = gp.tileSize*12;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*14;
        gp.obj[mapNum][i].worldY = gp.tileSize*28;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp, new OBJ_Key(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*30;
        gp.obj[mapNum][i].worldY = gp.tileSize*29;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*38;
        gp.obj[mapNum][i].worldY = gp.tileSize*13;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*30;
        gp.obj[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*13;
        i++;
    }

    public void setNPC(){
        int mapNum = 0;
        int i = 0;

        //Map 0
        gp.npc[mapNum][i] = new NPC_OldMan(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*21;
        gp.npc[mapNum][i].worldY = gp.tileSize*21;
        i++;

        //Map 1
        mapNum = 1;
        i = 0;
        gp.npc[mapNum][i] = new NPC_Merchant(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*12;
        gp.npc[mapNum][i].worldY = gp.tileSize*7;
        i++;
    }
    public void setMonster(){

        int mapNum = 0;
        int i = 0;

        //Frieza 
        gp.monster[mapNum][i] = new MON_Piccolo(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*37;
        gp.monster[mapNum][i].worldY = gp.tileSize*9;
        i++;

        gp.monster[mapNum][i] = new MON_Green_Slime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*37;
        gp.monster[mapNum][i].worldY = gp.tileSize*10;
        i++;
        gp.monster[mapNum][i] = new MON_Green_Slime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*37;
        gp.monster[mapNum][i].worldY = gp.tileSize*8;
        i++;
        gp.monster[mapNum][i] = new MON_Green_Slime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*36;
        gp.monster[mapNum][i].worldY = gp.tileSize*9;
        i++;
        gp.monster[mapNum][i] = new MON_Green_Slime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*38;
        gp.monster[mapNum][i].worldY = gp.tileSize*9;
        i++;
        gp.monster[mapNum][i] = new MON_Green_Slime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*39;
        gp.monster[mapNum][i].worldY = gp.tileSize*9;
        i++;

        //Cell
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*35;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*36;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*37;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*38;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*33;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*35;
        gp.monster[mapNum][i].worldY = gp.tileSize*41;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*22;
        gp.monster[mapNum][i].worldY = gp.tileSize*42;
        i++;
        gp.monster[mapNum][i] = new MON_Cell(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*22;
        gp.monster[mapNum][i].worldY = gp.tileSize*41;
        i++;
        gp.monster[mapNum][i] = new MON_Pi(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*22;
        gp.monster[mapNum][i].worldY = gp.tileSize*40;
        i++;

        gp.monster[mapNum][i] = new MON_Majin_Buu(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*23;
        gp.monster[mapNum][i].worldY = gp.tileSize*12;
        i++;
        gp.monster[mapNum][i] = new MON_Vegeta(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*12;
        gp.monster[mapNum][i].worldY = gp.tileSize*9;
        i++;
        
        gp.monster[mapNum][i] = new MON_Frieza(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*12;
        gp.monster[mapNum][i].worldY = gp.tileSize*31;
        i++;

        // gp.monster[mapNum][i] = new MON_Octopus(gp);
        // gp.monster[mapNum][i].worldX = gp.tileSize*22;
        // gp.monster[mapNum][i].worldY = gp.tileSize*23;
        // i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*22;
        gp.monster[mapNum][i].worldY = gp.tileSize*23;
        i++;
    }
    public void setInteractiveTile(){

        int mapNum = 0;
        int i = 0;
        
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 12);i++; 
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 12);i++;

        gp.iTile[mapNum][i] = new IT_DryTree(gp, 18, 40);i++; 
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 17, 40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 16, 40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 15, 40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 40);i++;

        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 27);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 27);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 28);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 29);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 30);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 30);i++;
        
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 38, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 39, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 38, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 39, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 38, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 39, 16);i++;

        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 40);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 40);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 40);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 39);i++;
        
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 30);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 35, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 31);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 35, 32);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 32);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 32);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 35, 33);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 33);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 33);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 35, 34);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 34);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 37, 34);i++;
        
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 23);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 24);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 25);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 25);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 26);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 27);i++;

        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 22, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 23, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 24, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 22, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 23, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 24, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 22, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 23, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 24, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 16);i++;

        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 28);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 27);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 26);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 25);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 24);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 23);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 22);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 21);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 20);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 19);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 18);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 18);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 18);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 17);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 16);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 15);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 14);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 13);i++;
        // gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 12);i++;
    }
}     
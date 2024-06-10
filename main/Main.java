package main;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

/**
 * Main
 */
public class Main {

    public static JFrame window;

    public static void main(String[] args) throws FileNotFoundException {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Goku Adventure"); 
        // window.setBounds(0, 0, 300, 500);

        GamePanel gp = new GamePanel();
        window.add(gp);

        gp.config.loadConfig();
        if (gp.fullScreenOn == true){
            window.setUndecorated(true);
        }

        window.pack();
 
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.setupGame();
        gp.startGameThread();

        // 1 Update: update information such as character 
        // 2 draw the screen with the updated information 
    }
}
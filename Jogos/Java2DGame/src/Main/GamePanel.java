package Main;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {
    //Configurações de tela
    //Tamanho por pixel
    final int originalTileSize = 16; //16x16 tamanho
    final int scale = 3; //Escala
    //Tamanho da tela (relativa a resolução da tela)
    final int tileSize = originalTileSize * scale; // 48x48 tamanho
    final int maxScreenCol = 16; // tamanho max coluna
    final int maxScreenRow = 12; // tamanho max linha
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    //FPS
    int FPS = 60;

    KeyHandler keyH =  new KeyHandler(); // Instanciando classe KeyHandler
    Thread gameThread; // Basicamente cria tempo (Algo que não para)

    //Posição básica dos players
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // tamanho da classe (JPanel)
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); /* Com isso ativo basicamente melhora a resolução do jogo, pois
        Todos os design dos jogos serão feitos fora do Idea */
        this.addKeyListener(keyH); // KeyHandler adicionado ao GamePanel
        this.setFocusable(true); // Esse GamePanel pode ser "focado" para receber inputs do teclado
    }

    public void startGameThread() {
        gameThread = new Thread(this); // Intanciando um Thread
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; // 0.0166666 segundos
        double nextDrawTime = System.nanoTime() + drawInterval; //Tempo para cada repintura

        while (gameThread != null) {

            update();
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000; // Transformar em Segundos
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime); /* Basicamente ele dorme por um tempo antes de ativar novamente
                Melhorando performance */

                nextDrawTime += drawInterval; // Atualizando o tempo

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void update() { // update do jogo
        if (keyH.upPressed == true) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed == true) {
            playerY += playerSpeed;
        } else if (keyH.leftPressed == true) {
            playerX -= playerSpeed;
        } else if (keyH.rightPressed == true) {
            playerX += playerSpeed;
        }

    }

    public void paintComponent(Graphics g) { // Método base do JPanel não criado por mim
        super.paintComponent(g);
        //A classe Graphics2D é herdada pela classe Graphics e ela da mais controle sobre gráficos 2D
        Graphics2D g2 = (Graphics2D) g; //A única coisa que muda é que o graphics 2D tem mais funções;
        g2.setColor(Color.white); // Ele faz com que a cor default dos objetos seja essa
        g2.fillRect(playerX, playerY, tileSize, tileSize); // Cria um retângulo e colore ele com a cor
        g2.dispose(); // Faz com que a máquina virtual Java ao fechar encerra todo o programa


    }

}

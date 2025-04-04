package Sorting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BreakoutGame extends JPanel implements ActionListener, KeyListener {
    // Game variables
    private int ballX = 150;
    private int ballY = 200;
    private int ballXSpeed = 2;
    private int ballYSpeed = 2;
    private int paddleX = 150;
    private final int paddleY = 360;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private boolean gameOver = false;
    private int score = 0;
    private int totalBoxes = 20;
    private boolean[] boxVisible = new boolean[totalBoxes];

    private JButton replayButton;

    public BreakoutGame() {
        JFrame frame = new JFrame("Breakout Ball Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.add(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(this);

        // Add mouse listener
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!gameOver && isBallClicked(e.getX(), e.getY())) {
                    score += 5; // Increase score when the ball is clicked
                }
            }
        });

        Timer timer = new Timer(5, this);
        timer.start();

        // Initialize block visibility
        for (int i = 0; i < totalBoxes; i++) {
            boxVisible[i] = true;
        }

        // Create and set up the replay button
        replayButton = new JButton("Replay");
        replayButton.setBounds(250, 250, 100, 30);
        replayButton.setVisible(false); // Initially hidden
        replayButton.addActionListener(e -> resetGame());
        this.setLayout(null); // Use absolute positioning
        this.add(replayButton);

        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 400);

        if (!gameOver) {
            g.setColor(Color.WHITE);
            g.fillRect(paddleX, paddleY, 60, 10);
            g.setColor(Color.RED);
            g.fillOval(ballX, ballY, 20, 20);

            for (int i = 0; i < totalBoxes; i++) {
                if (boxVisible[i]) {
                    g.setColor(Color.GREEN);
                    g.fillRect((i % 10) * 60 + 20, (i / 10) * 30 + 30, 50, 20);
                }
            }

            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Score: " + score, 10, 20);
        } else {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("Game Over", 240, 200);
            g.setFont(new Font("Arial", Font.PLAIN, 16));
            g.drawString("Your Score: " + score, 250, 230);
            replayButton.setVisible(true); // Show the replay button
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            if (ballX < 0 || ballX > 580) {
                ballXSpeed = -ballXSpeed;
            }
            if (ballY < 0) {
                ballYSpeed = -ballYSpeed;
            }
            if (ballY >= paddleY && ballX >= paddleX && ballX <= paddleX + 60) {
                ballYSpeed = -ballYSpeed;
            }

            ballX += ballXSpeed;
            ballY += ballYSpeed;

            for (int i = 0; i < totalBoxes; i++) {
                int boxX = (i % 10) * 60 + 20;
                int boxY = (i / 10) * 30 + 30;
                if (boxVisible[i] && ballY + 20 >= boxY && ballY <= boxY + 20 &&
                        ballX + 20 >= boxX && ballX <= boxX + 50) {
                    boxVisible[i] = false;
                    ballYSpeed = -ballYSpeed;
                    score += 10;
                }
            }

            if (leftPressed && paddleX > 0) {
                paddleX -= 3;
            }
            if (rightPressed && paddleX < 540) {
                paddleX += 3;
            }

            boolean allBoxesCleared = true;
            for (int i = 0; i < totalBoxes; i++) {
                if (boxVisible[i]) {
                    allBoxesCleared = false;
                    break;
                }
            }

            if (allBoxesCleared || ballY > paddleY + 20) {
                gameOver = true;
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (key == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }
        if (key == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
    }

    public void keyTyped(KeyEvent e) {}

    private void resetGame() {
        ballX = 150;
        ballY = 200;
        ballXSpeed = 2;
        ballYSpeed = 2;
        paddleX = 150;
        gameOver = false;
        score = 0;
        for (int i = 0; i < totalBoxes; i++) {
            boxVisible[i] = true;
        }
        replayButton.setVisible(false); // Hide the replay button
        repaint();
    }

    private boolean isBallClicked(int mouseX, int mouseY) {
        return (mouseX >= ballX && mouseX <= ballX + 20) &&
                (mouseY >= ballY && mouseY <= ballY + 20);
    }

    public static void main(String[] args) {
        new BreakoutGame();
    }
}


package BrickBreakerGame;


import javax.swing.JFrame;

    /**
     *
     * @author pankaj
     */
    public class MyApp {
        public static void main(String[] args) {
            JFrame obj = new JFrame();
            GameProject gameplay = new GameProject();
            obj.setBounds(10,10,700,600);
            obj.setTitle("BrickBreaker");
            obj.setResizable(false);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gameplay);
        }

    }

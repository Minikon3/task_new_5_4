import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    int win_width = 640;
    int win_height = 640;
    String background_image_path;
    Main(){
        super("Картинка");
        setSize(win_width, win_height);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Main app = new Main();
        Image img= Toolkit.getDefaultToolkit().getImage(args[0]);
        app.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(img,0,0,null);
            }
        });
        app.setVisible(true);
        while (true){
            app.repaint();
        }
    }
}
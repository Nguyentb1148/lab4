import javax.swing.*;

public class NguyenGUI extends JFrame{

    private JPanel nguyen;

    public NguyenGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(nguyen);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new NguyenGUI("Nguyen");
        frame.setVisible(true);
    }
}

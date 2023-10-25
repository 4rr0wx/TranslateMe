package GUI;

public class MainFrame {
    public MainFrame() {
        //create new frame
        javax.swing.JFrame frame = new javax.swing.JFrame("Example Window");
        //set frame size
        frame.setSize(500, 500);
        //set frame layout
        frame.setLayout(new java.awt.FlowLayout());
        //create button
        javax.swing.JButton button = new javax.swing.JButton("Press me!");
        //add button to frame
        frame.add(button);
        //set frame to visible
        frame.setVisible(true);
        //set frame to close on exit
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);


    }
}

package ZipCodeDB;

import javax.swing.*;

public class GUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);

        // When the user clicks the X in the title bat, then it stops running the main program
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack(); // makes the JFrame the size of internal components (makes the panel big enough to include the stuff in it)

    }


}

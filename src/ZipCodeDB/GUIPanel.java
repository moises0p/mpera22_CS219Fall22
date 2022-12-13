package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the base class, GUIPanel is the derived class

public class GUIPanel extends JPanel {

    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db;

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(submit);
        this.submit.addActionListener(new SubmitButtonListener());


        this.submit = new JButton("Northernmost");
        this.add(submit);
        this.submit.addActionListener(new SubmitButtonListener2());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database();
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit


            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }

    class SubmitButtonListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit


            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);

            output.setText(db.getNorthern().toString());
            System.out.println();
        }
    }

}


package swing;



import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {

    JList<String> countryList;

    CountryCapitalList() {

        DefaultListModel<String> model = new DefaultListModel<>();

        model.addElement("USA");
        model.addElement("India");
        model.addElement("Vietnam");
        model.addElement("Canada");
        model.addElement("Denmark");
        model.addElement("France");
        model.addElement("Great Britain");
        model.addElement("Japan");
        model.addElement("Africa");
        model.addElement("Greenland");
        model.addElement("Singapore");

        countryList = new JList<>(model);

        // Map to store country-capital pairs
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String country = countryList.getSelectedValue();
                    if (country != null && capitalMap.containsKey(country)) {
                        System.out.println("Capital of " + country + " is: " + capitalMap.get(country));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setTitle("Country Capital List");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderingWindow {

    public static class window extends JFrame {

        JTextField initialPrice = new JTextField();
        JTextField tax = new JTextField();
        JTextField finalPrice = new JTextField();

        public window() {

            // Window Settings

            setTitle("Burger Order");
            setSize(620, 600);
            setLocationRelativeTo(null);
            setLayout(null);


            // On-Top Title

            JLabel title = new JLabel("Menú Básico (8€)");
            title.setFont(new Font("Arial", Font.BOLD, 24));
            title.setBounds(10, 10, 400, 30);
            add(title);


            // Burguer Selection Panel

            ButtonGroup burgerGroup = new ButtonGroup();
            JRadioButton burger1 = new JRadioButton("Pollo");
            JRadioButton burger2 = new JRadioButton("Cerdo");
            JRadioButton burger3 = new JRadioButton("Ternera (+1€)");
            JRadioButton burger4 = new JRadioButton("Vegana (+1€)");
            burgerGroup.add(burger1);
            burgerGroup.add(burger2);
            burgerGroup.add(burger3);
            burgerGroup.add(burger4);
            burger1.setSelected(true);
            burger1.setBounds(20, 70, 150, 30);
            burger2.setBounds(20, 100, 150, 30);
            burger3.setBounds(20, 130, 150, 30);
            burger4.setBounds(20, 160, 150, 30);
            add(burger1);
            add(burger2);
            add(burger3);
            add(burger4);

            JPanel burgerSelectionPanel = new JPanel();
            burgerSelectionPanel.setBounds(10, 50, 200, 160);
            burgerSelectionPanel.setBorder(BorderFactory.createTitledBorder("Carne"));
            add(burgerSelectionPanel);


            // Bread Selection Panel

            ButtonGroup breadGroup = new ButtonGroup();
            JRadioButton bread1 = new JRadioButton("Normal");
            JRadioButton bread2 = new JRadioButton("Integral");
            JRadioButton bread3 = new JRadioButton("Centeno");
            breadGroup.add(bread1);
            breadGroup.add(bread2);
            breadGroup.add(bread3);
            bread1.setSelected(true);
            bread1.setBounds(220, 70, 150, 30);
            bread2.setBounds(220, 100, 150, 30);
            bread3.setBounds(220, 130, 150, 30);
            add(bread1);
            add(bread2);
            add(bread3);

            JPanel breadSelectionPanel = new JPanel();
            breadSelectionPanel.setBounds(210, 50, 200, 160);
            breadSelectionPanel.setBorder(BorderFactory.createTitledBorder("Pan"));
            add(breadSelectionPanel);


            // Fries Selection Panel

            ButtonGroup friesGroup = new ButtonGroup();
            JRadioButton fries1 = new JRadioButton("Fritas");
            JRadioButton fries2 = new JRadioButton("Gajo");
            JRadioButton fries3 = new JRadioButton("Caseras (+1€)");
            friesGroup.add(fries1);
            friesGroup.add(fries2);
            friesGroup.add(fries3);
            fries1.setSelected(true);
            fries1.setBounds(420, 70, 150, 30);
            fries2.setBounds(420, 100, 150, 30);
            fries3.setBounds(420, 130, 150, 30);
            add(fries1);
            add(fries2);
            add(fries3);

            JPanel friesSelectionPanel = new JPanel();
            friesSelectionPanel.setBounds(410, 50, 200, 160);
            friesSelectionPanel.setBorder(BorderFactory.createTitledBorder("Patatas"));
            add(friesSelectionPanel);


            // Drinks Selection Panel

            ButtonGroup drinksGroup = new ButtonGroup();
            JRadioButton drinks1 = new JRadioButton("Agua");
            JRadioButton drinks2 = new JRadioButton("Cola");
            JRadioButton drinks3 = new JRadioButton("Naranja");
            JRadioButton drinks4 = new JRadioButton("Limón");
            JRadioButton drinks5 = new JRadioButton("Cerveza");
            drinksGroup.add(drinks1);
            drinksGroup.add(drinks2);
            drinksGroup.add(drinks3);
            drinksGroup.add(drinks4);
            drinksGroup.add(drinks5);
            drinks1.setSelected(true);
            drinks1.setBounds(20, 230, 150, 30);
            drinks2.setBounds(130, 230, 150, 30);
            drinks3.setBounds(240, 230, 150, 30);
            drinks4.setBounds(350, 230, 150, 30);
            drinks5.setBounds(460, 230, 150, 30);
            add(drinks1);
            add(drinks2);
            add(drinks3);
            add(drinks4);
            add(drinks5);

            JPanel drinksSelectionPanel = new JPanel();
            drinksSelectionPanel.setBounds(10, 210, 600, 65);
            drinksSelectionPanel.setBorder(BorderFactory.createTitledBorder("Bebida"));
            add(drinksSelectionPanel);


            // Extra Selection Panel

            JCheckBox extra1 = new JCheckBox("Hamburguesa Doble (+2€)");
            JCheckBox extra2 = new JCheckBox("Extra Queso (+0.50€)");
            JCheckBox extra3 = new JCheckBox("Extra Patatas (+1€)");
            extra1.setBounds(20, 295, 200, 30);
            extra2.setBounds(20, 325, 200, 30);
            extra3.setBounds(20, 355, 200, 30);
            add(extra1);
            add(extra2);
            add(extra3);

            JPanel extraSelectionPanel = new JPanel();
            extraSelectionPanel.setBounds(10, 275, 300, 125);
            extraSelectionPanel.setBorder(BorderFactory.createTitledBorder("Extras"));
            add(extraSelectionPanel);


            // Sauce Selection Panel

            JSpinner sauce1 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            JSpinner sauce2 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            JSpinner sauce3 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            JSpinner sauce4 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            sauce1.setBounds(380, 300, 50, 30);
            sauce2.setBounds(540, 300, 50, 30);
            sauce3.setBounds(380, 340, 50, 30);
            sauce4.setBounds(540, 340, 50, 30);
            add(sauce1);
            add(sauce2);
            add(sauce3);
            add(sauce4);

            JLabel sauceLabel1 = new JLabel("Ketchup");
            JLabel sauceLabel2 = new JLabel("Mostaza");
            JLabel sauceLabel3 = new JLabel("Barbacoa");
            JLabel sauceLabel4 = new JLabel("Thai");
            sauceLabel1.setBounds(320, 300, 100, 30);
            sauceLabel2.setBounds(480, 300, 100, 30);
            sauceLabel3.setBounds(320, 340, 100, 30);
            sauceLabel4.setBounds(480, 340, 100, 30);
            add(sauceLabel1);
            add(sauceLabel2);
            add(sauceLabel3);
            add(sauceLabel4);

            JPanel sauceSelectionPanel = new JPanel();
            sauceSelectionPanel.setBounds(310, 275, 300, 125);
            sauceSelectionPanel.setBorder(BorderFactory.createTitledBorder("Salsas (0.50€ cada una)"));
            add(sauceSelectionPanel);


            // Delivery Selection

            ButtonGroup deliveryGroup = new ButtonGroup();
            JRadioButton delivery1 = new JRadioButton("Entrega a domicilio");
            JRadioButton delivery2 = new JRadioButton("Recogida en local (-20% dto)");
            deliveryGroup.add(delivery1);
            deliveryGroup.add(delivery2);
            delivery1.setSelected(true);
            delivery1.setBounds(40, 410, 250, 30);
            delivery2.setBounds(40, 440, 250, 30);
            add(delivery1);
            add(delivery2);


            // Calculate Button

            JButton calculateButton = new JButton("Calcular");
            calculateButton.setBounds(330, 410, 260, 60);
            calculateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    double price = 8;
                    if (burger3.isSelected() || burger4.isSelected()) price++;
                    if (fries3.isSelected()) price++;
                    if (extra1.isSelected()) price += 2;
                    if (extra2.isSelected()) price += 0.5;
                    if (extra3.isSelected()) price++;
                    price += ((Integer) sauce1.getValue()) * 0.5;
                    price += ((Integer) sauce2.getValue()) * 0.5;
                    price += ((Integer) sauce3.getValue()) * 0.5;
                    price += ((Integer) sauce4.getValue()) * 0.5;
                    if (delivery2.isSelected()) price *= 0.8;

                    double taxAmount = price * 0.21;
                    double finalPrice = price + taxAmount;

                    initialPrice.setText(String.format("%.2f", price));
                    tax.setText(String.format("%.2f", taxAmount));
                    OrderingWindow.window.this.finalPrice.setText(String.format("%.2f", finalPrice));

                }
            });
            add(calculateButton);


            // Price Section

            JLabel initialPriceLabel = new JLabel("Precio Inicial");
            initialPriceLabel.setBounds(159, 480, 100, 30);
            add(initialPriceLabel);

            initialPrice.setBounds(150, 510, 100, 30);
            initialPrice.setEditable(false);
            add(initialPrice);

            JLabel taxLabel = new JLabel("IVA (21%)");
            taxLabel.setBounds(280, 480, 100, 30);
            add(taxLabel);

            tax.setBounds(260, 510, 100, 30);
            tax.setEditable(false);
            add(tax);

            JLabel finalPriceLabel = new JLabel("Precio Final");
            finalPriceLabel.setBounds(383, 480, 100, 30);
            add(finalPriceLabel);

            finalPrice.setBounds(370, 510, 100, 30);
            finalPrice.setEditable(false);
            add(finalPrice);


            // Other Window Settings

            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);

        }

    }

    public static void main(String[] args) {

        window win = new window();

    }

}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Restaurant {

    private double firstNumber;
    private double secondNumber;
    private String operation;

    private double coldCoffeeRate = 40;
    private double hotCoffeerate = 30;
    private double coldDrinkRate = 25;
    private double teaRate = 15;

    private double vegBurgerRate = 30;
    private double paneerBurgerRate = 40;
    private double cheeseBurgerRate = 50;
    private double chickenBurgerRate = 60;
    private double deliveryCharge = 50;
    private double tax = 15;

    public JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JTabbedPane tabbedPane;
    private JTextField headingLabel;
    private JCheckBox coldCoffeeCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox coldDrinkCheckBox;
    private JCheckBox hotCoffeeCheckBox;
    private JCheckBox vegBurgerCheckBox;
    private JCheckBox chickenBurgerCheckBox;
    private JCheckBox cheeseBurgerCheckBox;
    private JCheckBox paneerBurgerCheckBox;
    private JCheckBox taxCheckBox;
    private JCheckBox homeDeliveryCheckBox;
    private JTextField deliveryChargeField;
    private JTextField costOfMealsField;
    private JTextField costOfDrinksField;
    private JTextField totalField;
    private JTextField subTotalField;
    private JTextField taxField;
    private JButton calculateButton;
    private JButton exitButton;
    private JButton resetButton;
    private JButton receiptButton;
    private JTextField calculatorField;
    private JButton a0Button;
    private JButton equalbutton;
    private JButton dotButton;
    private JButton cButton;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton sumButton;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton minusButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton mulButton;
    private JButton perButton;
    private JButton negButton;
    private JButton ACButton;
    private JButton divButton;
    private JTextArea receiptField;
    private JLabel costOfDrinksLabel;
    private JLabel costOfMealsLabel;
    private JLabel deliveryChargeLabel;
    private JLabel subTotalLabel;
    private JLabel taxLabel;
    private JLabel totalLabel;
    private JTextField coldCoffeField;
    private JTextField hotCoffeField;
    private JTextField coldDrinkField;
    private JTextField teaField;
    private JTextField vegBurgerField;
    private JTextField paneerBurgerField;
    private JTextField cheeseBurgerField;
    private JTextField chickenBurgerField;
    private JPanel panel7;
    private JTextField coldCoffeRateField;
    private JTextField hotCoffeRateField;
    private JTextField coldDrinkRateField;
    private JTextField teaRateField;
    private JTextField vegBurgerRateField;
    private JTextField paneerBurgerRateField;
    private JTextField cheeseBurgerRateField;
    private JTextField chickenBurgerRateField;
    private JLabel qtyLabel;
    private JLabel rateLabel;
    private JLabel qtyLabel1;
    private JLabel rateLabel1;
    private JLabel mealsLabel;
    private JLabel drinksLabel;

    private void updateTax()
    {
        double value, value1;

        if (taxCheckBox.isSelected()) {
            if (costOfMealsField.getText().isEmpty())
                value = 0;
            else
                value = Double.parseDouble(costOfMealsField.getText());

            if (costOfDrinksField.getText().isEmpty())
                value1 = 0;
            else
                value1 = Double.parseDouble(costOfDrinksField.getText());

            double result = ((value + value1) * tax) / 100;
            taxField.setText(String.format("%.2f", result));
        } else
            taxField.setText(null);
    }

    private void updateSub() {
        double one, two, three;
        if (costOfDrinksField.getText().isEmpty())
            one = 0;
        else
            one = Double.parseDouble(costOfDrinksField.getText());

        if (costOfMealsField.getText().isEmpty())
            two = 0;
        else
            two = Double.parseDouble(costOfMealsField.getText());

        if (deliveryChargeField.getText().isEmpty())
            three = 0;
        else
            three = Double.parseDouble(deliveryChargeField.getText());

        subTotalField.setText(String.format("%.2f", (one + two + three)));
    }


    public Restaurant() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a0Button.getText();
                calculatorField.setText(s);
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + dotButton.getText();
                calculatorField.setText(s);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a1Button.getText();
                calculatorField.setText(s);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a2Button.getText();
                calculatorField.setText(s);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a3Button.getText();
                calculatorField.setText(s);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a4Button.getText();
                calculatorField.setText(s);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a5Button.getText();
                calculatorField.setText(s);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a6Button.getText();
                calculatorField.setText(s);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a7Button.getText();
                calculatorField.setText(s);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a8Button.getText();
                calculatorField.setText(s);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = calculatorField.getText() + a9Button.getText();
                calculatorField.setText(s);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder(calculatorField.getText());
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);

                calculatorField.setText(sb.toString());
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorField.setText(null);
            }
        });
        perButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "%";
                firstNumber = Double.parseDouble(calculatorField.getText());
                calculatorField.setText(null);
            }
        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "+";
                firstNumber = Double.parseDouble(calculatorField.getText());
                calculatorField.setText(null);
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "-";
                firstNumber = Double.parseDouble(calculatorField.getText());
                calculatorField.setText(null);
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "*";
                firstNumber = Double.parseDouble(calculatorField.getText());
                calculatorField.setText(null);
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "/";
                firstNumber = Double.parseDouble(calculatorField.getText());
                calculatorField.setText(null);
            }
        });
        negButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(calculatorField.getText());
                firstNumber = -1 * firstNumber;
                calculatorField.setText(String.format("%.2f", firstNumber));
            }
        });
        equalbutton.addComponentListener(new ComponentAdapter() {
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(calculatorField.getText());
                double result = 0;
                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                    case "%":
                        result = (firstNumber * secondNumber) / 100;
                        break;
                }
                calculatorField.setText(String.format("%.2f", result));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coldCoffeeCheckBox.setSelected(false);
                coldDrinkCheckBox.setSelected(false);
                hotCoffeeCheckBox.setSelected(false);
                teaCheckBox.setSelected(false);

                vegBurgerCheckBox.setSelected(false);
                paneerBurgerCheckBox.setSelected(false);
                cheeseBurgerCheckBox.setSelected(false);
                chickenBurgerCheckBox.setSelected(false);

                taxCheckBox.setSelected(false);
                homeDeliveryCheckBox.setSelected(false);

                receiptField.setText("");
                calculatorField.setText("");

                coldCoffeField.setText(null);
                coldCoffeRateField.setText(null);

                hotCoffeRateField.setText(null);
                hotCoffeField.setText(null);

                coldDrinkField.setText(null);
                coldDrinkRateField.setText(null);

                teaField.setText(null);
                teaRateField.setText(null);

                costOfDrinksField.setText(null);
                costOfMealsField.setText(null);
                deliveryChargeField.setText(null);

                subTotalField.setText(null);
                taxField.setText(null);
                totalField.setText(null);

                vegBurgerRateField.setText(null);
                vegBurgerField.setText(null);

                paneerBurgerField.setText(null);
                paneerBurgerRateField.setText(null);

                cheeseBurgerField.setText(null);
                cheeseBurgerRateField.setText(null);

                chickenBurgerField.setText(null);
                chickenBurgerRateField.setText(null);

            }
        });
        homeDeliveryCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (homeDeliveryCheckBox.isSelected())
                    deliveryChargeField.setText(String.format("%.2f", deliveryCharge));
                else
                    deliveryChargeField.setText(null);
                updateSub();
            }
        });
        coldCoffeeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!coldCoffeField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(coldCoffeField.getText());

                    if (coldCoffeeCheckBox.isSelected()) {
                        coldCoffeRateField.setText(String.format("%.2f", coldCoffeeRate));
                        if (costOfDrinksField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfDrinksField.getText());

                        result = value1 + (value * coldCoffeeRate);
                        if (result < 0)
                            result = 0;
                        costOfDrinksField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfDrinksField.getText().isEmpty()) {
                            costOfDrinksField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfDrinksField.getText());
                            result = value1 - (value * coldCoffeeRate);
                            if (result < 0)
                                result = 0;
                            costOfDrinksField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }

            }

        });
        hotCoffeeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!hotCoffeField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(hotCoffeField.getText());

                    if (hotCoffeeCheckBox.isSelected()) {
                        hotCoffeRateField.setText(String.format("%.2f", hotCoffeerate));
                        if (costOfDrinksField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfDrinksField.getText());

                        result = value1 + (value * hotCoffeerate);
                        if (result < 0)
                            result = 0;
                        costOfDrinksField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfDrinksField.getText().isEmpty()) {
                            costOfDrinksField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfDrinksField.getText());
                            result = value1 - (value * hotCoffeerate);
                            if (result < 0)
                                result = 0;
                            costOfDrinksField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }

            }
        });
        coldDrinkCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!coldDrinkField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(coldDrinkField.getText());

                    if (coldDrinkCheckBox.isSelected()) {
                        coldDrinkRateField.setText(String.format("%.2f", coldDrinkRate));
                        if (costOfDrinksField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfDrinksField.getText());

                        result = value1 + (value * coldDrinkRate);
                        if (result < 0)
                            result = 0;
                        costOfDrinksField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfDrinksField.getText().isEmpty()) {
                            costOfDrinksField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfDrinksField.getText());
                            result = value1 - (value * coldDrinkRate);
                            if (result < 0)
                                result = 0;
                            costOfDrinksField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }
            }
        });
        teaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!teaField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(teaField.getText());

                    if (teaCheckBox.isSelected()) {
                        teaRateField.setText(String.format("%.2f", teaRate));
                        if (costOfDrinksField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfDrinksField.getText());

                        result = value1 + (value * teaRate);

                        if (result < 0)
                            result = 0;

                        costOfDrinksField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfDrinksField.getText().isEmpty()) {
                            costOfDrinksField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfDrinksField.getText());
                            result = value1 - (value * teaRate);
                            if (result < 0)
                                result = 0;

                            costOfDrinksField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }
            }
        });
        vegBurgerCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!vegBurgerField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(vegBurgerField.getText());

                    if (vegBurgerCheckBox.isSelected()) {
                        vegBurgerRateField.setText(String.format("%.2f", vegBurgerRate));
                        if (costOfMealsField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfMealsField.getText());

                        result = value1 + (value * vegBurgerRate);
                        if (result < 0)
                            result = 0;
                        costOfMealsField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfMealsField.getText().isEmpty()) {
                            costOfMealsField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfMealsField.getText());
                            result = value1 - (value * vegBurgerRate);
                            if (result < 0)
                                result = 0;
                            costOfMealsField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }

            }
        });
        paneerBurgerCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!paneerBurgerField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(paneerBurgerField.getText());

                    if (paneerBurgerCheckBox.isSelected()) {
                        paneerBurgerRateField.setText(String.format("%.2f", paneerBurgerRate));
                        if (costOfMealsField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfMealsField.getText());

                        result = value1 + (value * paneerBurgerRate);
                        if (result < 0)
                            result = 0;
                        costOfMealsField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfMealsField.getText().isEmpty()) {
                            costOfMealsField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfMealsField.getText());
                            result = value1 - (value * paneerBurgerRate);
                            if (result < 0)
                                result = 0;
                            costOfMealsField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }


            }
        });
        cheeseBurgerCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cheeseBurgerField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(cheeseBurgerField.getText());

                    if (cheeseBurgerCheckBox.isSelected()) {
                        cheeseBurgerRateField.setText(String.format("%.2f", cheeseBurgerRate));
                        if (costOfMealsField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfMealsField.getText());

                        result = value1 + (value * cheeseBurgerRate);
                        if (result < 0)
                            result = 0;
                        costOfMealsField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfMealsField.getText().isEmpty()) {
                            costOfMealsField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfMealsField.getText());
                            result = value1 - (value * cheeseBurgerRate);
                            if (result < 0)
                                result = 0;
                            costOfMealsField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }

            }
        });
        chickenBurgerCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!chickenBurgerField.getText().isEmpty()) {
                    double value1;
                    double result;
                    double value = Double.parseDouble(chickenBurgerField.getText());

                    if (chickenBurgerCheckBox.isSelected()) {
                        chickenBurgerRateField.setText(String.format("%.2f", chickenBurgerRate));
                        if (costOfMealsField.getText().isEmpty())
                            value1 = 0;
                        else
                            value1 = Double.parseDouble(costOfMealsField.getText());

                        result = value1 + (value * chickenBurgerRate);
                        if (result < 0)
                            result = 0;
                        costOfMealsField.setText(String.format("%.2f", result));
                    } else {
                        if (costOfMealsField.getText().isEmpty()) {
                            costOfMealsField.setText(null);
                        } else {
                            value1 = Double.parseDouble(costOfMealsField.getText());
                            result = value1 - (value * chickenBurgerRate);
                            if (result < 0)
                                result = 0;
                            costOfMealsField.setText(String.format("%.2f", result));
                        }
                    }
                    updateSub();
                    updateTax();
                }

            }
        });


        taxCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTax();

            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value, value1;
                if (subTotalField.getText().isEmpty())
                    value = 0;
                else
                    value = Double.parseDouble(subTotalField.getText());

                if (taxField.getText().isEmpty())
                    value1 = 0;
                else
                    value1 = Double.parseDouble(taxField.getText());

                totalField.setText(String.format("%.2f", (value + value1)));
            }
        });
        receiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cod, com, dc, tc, tot;
                if (costOfDrinksField.getText().isEmpty())
                    cod = 0;
                else
                    cod = Double.parseDouble(costOfDrinksField.getText());
                if (costOfMealsField.getText().isEmpty())
                    com = 0;
                else
                    com = Double.parseDouble(costOfMealsField.getText());

                if (deliveryChargeField.getText().isEmpty())
                    dc = 0;
                else
                    dc = Double.parseDouble(deliveryChargeField.getText());

                if (taxField.getText().isEmpty())
                    tc = 0;
                else
                    tc = Double.parseDouble(taxField.getText());

                if (totalField.getText().isEmpty())
                    tot = 0;
                else
                    tot = Double.parseDouble(totalField.getText());

                String s = "     Drinks Price : $" + cod + "\n     Meals Price : $" + com + "\n     Delivery Charge : $" + dc + "\n     Tax : $" + tc + "\n";
                receiptField.setText("");
                receiptField.append("\n\n\n");
                receiptField.append("        THE BURGER'S SHOP\n");
                receiptField.append("    _______________________\n");

                receiptField.append("    THANK YOU FOR VISITING US\n");
                receiptField.append("    _______________________\n");

                receiptField.append(s);
                receiptField.append("    _______________________\n");
                receiptField.append("    Total Price : $" + tot + "\n");
                receiptField.append("    _______________________\n");


            }
        });
    }

    public void createUIComponents() {
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        calculateButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        receiptButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        resetButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        coldCoffeRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        hotCoffeRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        coldDrinkRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        teaRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        vegBurgerRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        paneerBurgerRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cheeseBurgerRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        chickenBurgerRateField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        costOfDrinksField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        costOfMealsField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        deliveryChargeField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        subTotalField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        taxField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        totalField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        coldCoffeField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        hotCoffeField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        coldDrinkField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        teaField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        vegBurgerField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        paneerBurgerField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cheeseBurgerField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        chickenBurgerField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


    }
}

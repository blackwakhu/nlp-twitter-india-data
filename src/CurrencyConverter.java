import javax.swing.*;
import java.awt.*;

public class CurrencyConverter {

    private float deposit;

    private String activity;
    private String currency_selected;
    private float currency_con;

    public static void main(String[] args){
        new CurrencyConverter();
    }
    public CurrencyConverter(){
        JFrame frame = new JFrame("Currency Converter");
        JPanel panel = new JPanel();

        JLabel currencyLabel = new JLabel("enter the amount");
        JLabel currencyLabel1 = new JLabel("the currency is");

        JTextField currencyText = new JTextField(10);

        JRadioButton buy = new JRadioButton("buy");
        JRadioButton sell = new JRadioButton("sell");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(buy);
        buttonGroup.add(sell);

        JButton currencyButton = new JButton("convert");

        String[] currency = {"USD", "EUR", "JPY", "CAD", "POUND", "AUD", "RUP", "SRAND", "RFR", "NAIRA", "TSH", "USH"};
        JComboBox currencyCombo = new JComboBox(currency);

        panel.setLayout(new GridBagLayout());

        GridBagConstraints gridBag = new GridBagConstraints();

        currencyText.setText("0.00");

        gridBag.gridx = 0; gridBag.gridy = 0;
        panel.add(currencyLabel, gridBag);

        gridBag.gridx = 1; gridBag.gridy = 1;
        panel.add(currencyCombo, gridBag);

        gridBag.gridx = 0; gridBag.gridy = 1;
        panel.add(currencyText, gridBag);

        gridBag.gridx = 0; gridBag.gridy = 2;
        panel.add(buy, gridBag);

        gridBag.gridx = 1; gridBag.gridy = 2;
        panel.add(sell, gridBag);

        gridBag.gridx = 1; gridBag.gridy = 3;
        panel.add(currencyButton, gridBag);

        gridBag.gridx = 0; gridBag.gridy = 4;
        panel.add(currencyLabel1, gridBag);

        buy.addItemListener(e1 -> {
            activity = "buy";
        });

        sell.addItemListener(e1 -> {
            activity = "sell";
        });

        currencyButton.addActionListener(e -> {
            deposit = Float.parseFloat(currencyText.getText());
            currency_selected = currencyCombo.getItemAt(currencyCombo.getSelectedIndex()).toString();
            if (activity == "buy") {
                if (currency_selected == "USD") currency_con = Currency.buyUSD(deposit);
                else if (currency_selected == "EUR") currency_con = Currency.buyEUR(deposit);
                else if (currency_selected == "JPY") currency_con = Currency.buyJPY(deposit);
                else if (currency_selected == "CAD") currency_con = Currency.buyCAD(deposit);
                else if (currency_selected == "POUND") currency_con = Currency.buyPOUND(deposit);
                else if (currency_selected == "AUD") currency_con = Currency.buyAUD(deposit);
                else if (currency_selected == "RUP") currency_con = Currency.buyRUP(deposit);
                else if (currency_selected == "SRAND") currency_con = Currency.buySRAND(deposit);
                else if (currency_selected == "RFR") currency_con = Currency.buyRFR(deposit);
                else if (currency_selected == "NAIRA") currency_con = Currency.buyNAIRA(deposit);
                else if (currency_selected == "TSH") currency_con = Currency.buyTSH(deposit);
                else if (currency_selected == "USH") currency_con = Currency.buyUSH(deposit);
            }else if (activity == "sell") {
                if (currency_selected == "USD") currency_con = Currency.sellUSD(deposit);
                else if (currency_selected == "EUR") currency_con = Currency.sellEUR(deposit);
                else if (currency_selected == "JPY") currency_con = Currency.sellJPY(deposit);
                else if (currency_selected == "CAD") currency_con = Currency.sellCAD(deposit);
                else if (currency_selected == "POUND") currency_con = Currency.sellPOUND(deposit);
                else if (currency_selected == "AUD") currency_con = Currency.sellAUD(deposit);
                else if (currency_selected == "RUP") currency_con = Currency.sellRUP(deposit);
                else if (currency_selected == "SRAND") currency_con = Currency.sellSRAND(deposit);
                else if (currency_selected == "RFR") currency_con = Currency.sellRFR(deposit);
                else if (currency_selected == "NAIRA") currency_con = Currency.sellNAIRA(deposit);
                else if (currency_selected == "TSH") currency_con = Currency.sellTSH(deposit);
                else if (currency_selected == "USH") currency_con = Currency.sellUSH(deposit);
            }
            currencyLabel1.setText("the currency amount is "+currency_con);
        });

        frame.add(panel);

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

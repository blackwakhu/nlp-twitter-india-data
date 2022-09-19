# Currency_exchange-java
in the currency java project is a simple beginner project which deals with the exchange rates of some of the currency to an unknown currency
it consists of tow classes 
1. Currency class
2. CurrencyConverter class

in the Currency class:
  this contains all the process done in forex exchange 
  for examle the buyUSD() method is for buying us dollars while the sellUSD() is for selling the us dollars
  inorder to execute this methods you need to first include the deposit 
  they are mearnt to return the respective exchange
  for buying the rate is multiplied by the deposit
  for selling the rate is divided by the deposit

in the CurrencyConverter class:
  this contains the GUI
  all the currency are defined in the JComboBox
  the deposit is entered using a JTextField
  The choice whetherto buy is represented using a JRadioButton which is in turn limited to only two options using a buttongroup
  the deposit JTextField is set to 0
  their is a converter button which when pressed produces a corresponding amount that has been gotten from linking the deposit and the currency choosen to
  the corresponding method is the Currency class
  when clicked the amount corresponding is represented by a JLabel

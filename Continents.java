import java.util.ArrayList;
//import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;

public class Continents implements ActionListener{
  JFrame frame;
  JPanel panel;
  JLabel label, label1;
  JComboBox<String> combo;
  JButton button, button2;
  static int contIndex;
  static int cityIndex;
  static String output = "testing output";


  static int continent = 4;
  static ArrayList<String> contList;
  static ArrayList<String> contList0;
  static ArrayList<String> contList1;
  static ArrayList<String> contList2;
  static ArrayList<String> contList3;
  static ArrayList<String> contList4;
  static ArrayList<String> contList5;
  static ArrayList<String> contList6;
  //static JComboBox<String> mycombo;

  public Continents(){
    //choose list
    contList = new ArrayList<String>();
    contList.add("Choose a Continent!");
    contList.add("North America");
    contList.add("South America");
    contList.add("Europe");
    contList.add("Africa");
    contList.add("Asia");
    contList.add("Oceania");
    contList.add("Antartica");


    //North America
    contList1 = new ArrayList<String>();
    contList1.add("Toronto, Canada");
    contList1.add("New York, USa");
    contList1.add("Chicago, USA");
    contList1.add("Mexico City, Mexico");
    contList1.add("Vancouver, Canada");
    contList1.add("San Fransisco, USA");
    

    //South America
    contList2 = new ArrayList<String>();
    contList2.add("Lima, Peru");
    contList2.add("Montevideo, Urugray");
    contList2.add("Rio de Janeiro, Brazil");
    contList2.add("Sao Paulo, Brazil");
    contList2.add("Belgata, Columbia");
    contList2.add("Buenos Aires, Argentina");


    //Europe
    contList3 = new ArrayList<String>();
    contList3.add("London, England");
    contList3.add("Copenhagen, Denmark");
    contList3.add("Paris, France");
    contList3.add("Lisbon, Portugal");
    contList3.add("Vienna, Austria");
    contList3.add("Frankfurt, Germany");


    //Africa
    contList4 = new ArrayList<String>();
    contList4.add("Rabat, Morocco");
    contList4.add("Kinshasa, Democratic Republic of the Congo");
    contList4.add("Cairo, Egypt");
    contList4.add("Cape Town, South Africa");
    contList4.add("Lagos, Nigeria");
    contList4.add("Tunis, Tunisia");


    //Asia
    contList5 = new ArrayList<String>();
    contList5.add("Beijing, China");
    contList5.add("Riyabh, Saudi Arabia");
    contList5.add("Nur-Sultan, Kazakhstan");
    contList5.add("Moscow, Russia");
    contList5.add("Toyko, Japan");
    contList5.add("Hong Kong, Hong Kong");


    //Australia
    contList6 = new ArrayList<String>();
    contList6.add("Perth, Australia");
    contList6.add("Wellington, New Zealand");
    contList6.add("Auckland, New Zealand");
    contList6.add("Syndey Australia");
    contList6.add("Canberra, Australia");
    contList6.add("Port Moresby, Papua New Guinea");

    //Australia
    contList6 = new ArrayList<String>();
    contList6.add("Fort McMurray, USA");
    contList6.add("Who tf lives here");

    frame = new JFrame("jframe givs me 100% but drains my wouol");
    panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    label = new JLabel("Welcome to the Continents Program!!");
    label1 = new JLabel(output);
    button = new JButton("b");
    
    button2 = new JButton("Find a random city!!!");


    // istg this is the most scuffed code i've ever seen holy shit it creates 3 warnings and tries to kill itself it's a fckinb abomination but it works
    /* 
    Object[] comboArray = contList.toArray();

    combo = new JComboBox(comboArray);
    */

    combo = new JComboBox<String>(contList.toArray(new String[contList.size()]));
 
    button.addActionListener(this);
    button2.addActionListener(this);

    combo.addActionListener(this);
      

 
    frame.add(panel);


    c.fill = GridBagConstraints.HORIZONTAL;
    label.setHorizontalAlignment(SwingConstants.CENTER);
    c.gridwidth = 3;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 0;
    panel.add(label, c);

    label1.setHorizontalAlignment(SwingConstants.CENTER);
    c.gridy = 3;
    panel.add(label1, c);


    c.fill = GridBagConstraints.HORIZONTAL;
    c.insets = new Insets(10,10,10,10);  //top padding
    c.gridy = 2;
    panel.add(combo, c);

    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridy = 1;
    panel.add(button2, c);

    frame.setSize(500,300);
    //frame.pack();
    frame.setVisible(true);

  } //END construtor




  //getMajorCity function
  public static String getMajorCity(int contNumber){

    

    switch(contNumber){
      case 1:
      output = "North America: Mexico City, Mexico";
      break;

      case 2:
      output = "South America: Sao Paulo, Brazil";
      break;
      
      case 3:
      output = "Europe: Moscow, Russia";
      break;
      
      case 4:
      output = "Africa: Lagos, Nigeria";
      break;
      
      case 5:
      output = "Asia: Shanghai, China";
      break;

      case 6:
      output = "Australia: Sydney, Australia";
      break;

      case 7:
      output = "Antartica: McMurdo Station, US";
      break;      

      default:
      output = "Undefined Continent";
    }//END Switch

    return output;
    
  } //END function

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == button2){

      if (combo.getSelectedIndex() > 0){

      output = getMajorCity(combo.getSelectedIndex());
      label1.setText(output);

      }
    
    }

  }



  

  public static void main(String args[]){
 
     new Continents();
   
   } //END of Main
 

} //END Class

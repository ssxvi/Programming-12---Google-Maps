import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class Continents implements ActionListener{
  JFrame frame;
  JPanel panel;
  JLabel label;
  JButton button, button2;


  static int continent = 4;
  static ArrayList<String> contList;
  static JComboBox<ArrayList> mycombo;

  public Continents(){

    frame = new JFrame("jframe givs me 100% but drains my wouol");
    panel = new JPanel();
    label = new JLabel("Welcome to the Continents Program!!");
    button = new JButton("b");
    
    button2 = new JButton("BB");


    button.addActionListener(this);
    button2.addActionListener(this);
    




    frame.add(panel);

    panel.add(label);

    panel.add(button);
    panel.add(button2);

    frame.setSize(300,300);
    frame.setVisible(true);
  } //END construtor

  public static void main(String args[]){
  contList = new ArrayList<String>();
  contList.add("Choose a Continent!");
  contList.add("North America");
  contList.add("South America");
  contList.add("Europe");
  contList.add("Africa");
  contList.add("Asia");
  contList.add("Australia");
  contList.add("Antartica");
  System.out.println(getMajorCity(continent));


  Continents inst1 = new Continents();
  }



  //getMajorCity function
  public static String getMajorCity(int contNumber){

    String output;

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
    // TODO Auto-generated method stub
    System.out.println(e.getActionCommand());
  }

  
} //END Class

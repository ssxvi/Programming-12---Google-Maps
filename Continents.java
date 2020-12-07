//import Java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Continents implements ActionListener{
  JFrame frame;
  JPanel panel;
  JButton button, button2;


  static int continent = 4;
  //static ArrayList<String> contList;

  public Continents(){

    frame = new JFrame("Poggeur");
    panel = new JPanel();
    button = new JButton("b");

    button = new JButton("b");


    button.addActionListener(this);
    button.addActionListener(this);
    
    panel.add(button);

    frame.add(panel);

    frame.setSize(300,300);
    frame.setVisible(true);
  } //END construtor

  public static void main(String args[]){
  //contList = new ArrayList<String>;
  //contList.add()
  System.out.println(getMajorCity(continent));
  }

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
    
  } //END Main

  
} //END Class
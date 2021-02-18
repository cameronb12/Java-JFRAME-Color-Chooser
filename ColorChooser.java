package colorchooser;

import java.util.HashMap;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.BorderLayout;



public class ColorChooser {

    public static void main(String[] args) {
        createFrame();
    }
    
    static void createFrame(){  
        System.out.println("What color shall the rectangle be: ");
        
        //Creating the Panel
        RectangleP panel = new RectangleP();
        panel = new RectangleP();
        panel.setC(getColor());
                
        //Creating the Jframe setup
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("HashMap Drawing");
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    static Color getColor(){
        HMap CM = new HMap();
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        x = x.toLowerCase();
        Color yes = (Color)CM.HMap.get(x);
        System.out.println(yes);
        //Returns the Input of the color
        return yes;
    }
    
 
       
}

class HMap extends HashMap{
        //Creating the hashmap
        static HashMap HMap = new HashMap();
        
        public HMap(){
            setUpHMap();
        }
        //Creating the color List
        private static void setUpHMap(){
            HMap.put("black",Color.black);
            HMap.put("blue",Color.blue);
            HMap.put("cyan",Color.cyan);
            HMap.put("darkgray",Color.darkGray);
            HMap.put("gray",Color.gray);
            HMap.put("green",Color.green);
            HMap.put("lightgray",Color.lightGray);
            HMap.put("magenta",Color.magenta);
            HMap.put("orange",Color.orange);
            HMap.put("pink",Color.pink);
            HMap.put("red",Color.red);
            HMap.put("white",Color.white);
            HMap.put("yellow",Color.yellow);
        }
}

class RectangleP extends JPanel{
    static Color c;
    public void setC(Color c){this.c = c;}
    
    public void paint(Graphics g){
        g.setColor(c);
        g.fillRect(7,7,100,100);
        g.dispose();
    }
    
}

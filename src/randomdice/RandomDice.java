/*This is a random dice game that you can use to play number gambling games
Made by: Rita Costa
*/

package randomdice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class RandomDice extends JFrame implements ActionListener {

    
    JButton BTNrollDice = new JButton("Roll Dice");
    
    //Constructor
    public RandomDice() {
        setSize(400,400);
        
        setTitle("Random Dice");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(BTNrollDice);
        
        BTNrollDice.addActionListener(this);
    }
    
    //Event actions
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==(BTNrollDice)){
            
            double generatedNumber = Math.random(); //Generates a random number between 0.1 and 0.9
            int randomNumber = (int) (generatedNumber*7)+1; //Converts the random number to integer and multiplies it by 7(6+1) are the dice options, so we limit the random numbers range
            JOptionPane.showMessageDialog(null,randomNumber,"Dice Number",JOptionPane.INFORMATION_MESSAGE);
        }
            
    }


    //main
    public static void main(String[] args) {
            // Call RandomDice
            new RandomDice();
    }

    

    

}
    


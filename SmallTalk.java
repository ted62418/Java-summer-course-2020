import javax.swing.JOptionPane;

public class SmallTalk
{
    public static void main(String[] arg)
    {
        //hi hru
        JOptionPane.showInputDialog("Hi! How are you!");
                
        //name
        JOptionPane.showInputDialog("I'm doing well! What's your name?");
                
        //hobbies
        JOptionPane.showInputDialog("I'm Teresa. What do like to do for fun?");
        
        //work or school
        JOptionPane.showInputDialog(" I enjoy listening to music and I'm "
                + "learning how to code. Do you go to work or school? I do "
                + "both and it's a bit stressful.");
        
        //nice to meet you, have a good day
        //REMEMBER TO USE NULL WITH MSG DIALOG!!
        JOptionPane.showMessageDialog(null,"It's been great talking to you! " + 
                "Have a great day!");
        //close prog
        System.exit(0);
    }
        
}


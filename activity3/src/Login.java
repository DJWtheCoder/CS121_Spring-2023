import javax.swing.JOptionPane;
public class Login {
    public static void main (String[] args){
        String userName = "TheKing";
        String Password = "impervious";
        String name = JOptionPane.showInputDialog("What is your username?");
        String pw = JOptionPane.showInputDialog("What is your password?");

        if (userName.equals(name) && Password.equals(pw)) {
            //If both inputs match the userName and password variables, print “Welcome to CS121.”
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        }else if (userName.equals(name)) {
            //If only one matches, print a message that tells the user which input was incorrect.
            JOptionPane.showMessageDialog(null, "Your password was incorrect!");
        }else if (Password.equals(pw)) {
            JOptionPane.showMessageDialog(null, "Your username was incorrect!");
        }else {
            //If only one matches, print a message that tells the user which input was incorrect.
            JOptionPane.showMessageDialog(null, "Both your username and password were incorrect!");
        }
    }
}

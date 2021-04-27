package frame;

public class Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
    }
    
}

import javax.swing.JOptionPane;

public class Madness {

    public static void main(String[] args) {
        int res = JOptionPane.showConfirmDialog(null, "Me amas?", "Una preguntita", JOptionPane.YES_NO_OPTION);
         if(res == JOptionPane.YES_OPTION){
             JOptionPane.showMessageDialog(null, "Yo tambien papi!", "<3", JOptionPane.INFORMATION_MESSAGE);
         }else{
             JOptionPane.showMessageDialog(null, "Yo tampoco, ja! ni gran cosa que fueras uchhh!", "No jo..s", JOptionPane.ERROR_MESSAGE);
         }
    }
}
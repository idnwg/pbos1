import javax.swing.JOptionPane;

public class DialogInputOutput {
    public static void main(String[] args) {
        String pelajaran = JOptionPane.showInputDialog(
                null, 
                "Anda sedang belajar apa?", 
                "Input", 
                JOptionPane.QUESTION_MESSAGE
        );

        if (pelajaran != null && !pelajaran.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Belajar " + pelajaran + " sangat mudah", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}

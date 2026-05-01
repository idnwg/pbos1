import javax.swing.JOptionPane;

public class DialogInputOutput {
    public static void main(String[] args) {
        // Menampilkan dialog input (Terdapat icon tanda tanya karena tipe QUESTION_MESSAGE)
        String pelajaran = JOptionPane.showInputDialog(
                null, 
                "Anda sedang belajar apa?", 
                "Input", 
                JOptionPane.QUESTION_MESSAGE
        );

        // Memastikan user mengisi input dan tidak menekan tombol Cancel
        if (pelajaran != null && !pelajaran.trim().isEmpty()) {
            // Menampilkan dialog pesan (Terdapat icon huruf 'i' karena tipe INFORMATION_MESSAGE)
            JOptionPane.showMessageDialog(
                    null, 
                    "Belajar " + pelajaran + " sangat mudah", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
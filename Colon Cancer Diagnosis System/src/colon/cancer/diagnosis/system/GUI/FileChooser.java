package colon.cancer.diagnosis.system.GUI;

import colon.cancer.diagnosis.system.*;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends JFrame {
    public static String showFileChooser(){
        try
        {
            
           //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex)
        {
            System.out.println("EXCEPTION");
        }
        JFileChooser fChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("CSV", new String[]{"csv"});
        fChooser.setFileFilter(filter);
        int returnVal = fChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
           
            String path = fChooser.getSelectedFile().getAbsolutePath();
            path = path.replace('\\', '/');
            return path;
        }
        return "Wrong File Path!";
    }
}

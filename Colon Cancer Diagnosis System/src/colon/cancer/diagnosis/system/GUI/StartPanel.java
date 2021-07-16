
package colon.cancer.diagnosis.system.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel {
    public JButton fileChooserButton , StartButton;
    public String filePath;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel, DataSetPathLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText, DataSetPathText;
    public OptionsPanel optionsFrame;
    
    public StartPanel()
    {
        setOpaque(false);
        ImageIcon startIcon = new ImageIcon("Icons\\power.png");
        Image startImg = startIcon.getImage();
        Image resizedStartImg = startImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        startIcon = new ImageIcon(resizedStartImg);
        
        ImageIcon attachIcon = new ImageIcon("Icons\\attached.png");
        Image attachImg = attachIcon.getImage();
        Image resizedAttachImg = attachImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        attachIcon = new ImageIcon(resizedAttachImg);
        
       
        numberOfPatientLabel = new JLabel("Number of Patients : ");
        numberOfPatientLabel.setSize(200, 200);
        numberOfPatientLabel.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberofPatientText = new JTextField("62" , 10);
        numberofPatientText.setHorizontalAlignment(SwingConstants.CENTER);
        numberofPatientText.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberofPatientText.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        numberOfGenesLabel = new JLabel("Number of Genes : ");
        numberOfGenesLabel.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfGenesText= new JTextField("201" , 10);
        numberOfGenesText.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfGenesText.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        numberOfGenesText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTrainedLabel = new JLabel("Number of Trained Patients : ");
        numberOfTrainedLabel.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfTrainedText = new JTextField("32" , 10);
        numberOfTrainedText.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfTrainedText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTrainedText.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        numberOfTestLabel  = new JLabel("Number of Test Patients : ");
        numberOfTestLabel.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfTestText = new JTextField("30" , 10);
        numberOfTestText.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        numberOfTestText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTestText.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        DataSetPathLabel  = new JLabel("Dataset Path : ");
        DataSetPathLabel.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        DataSetPathText = new JTextField("./colon Cancer Dataset.csv" , 50);
        DataSetPathText.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        DataSetPathText.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        DataSetPathText.setEditable(false);
        fileChooserButton = new JButton("Choose File");
        fileChooserButton.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        fileChooserButton.setIcon(attachIcon);
        fileChooserButton.setFocusable(false);
        StartButton = new JButton("Start");
        StartButton.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        StartButton.setIcon(startIcon);
        StartButton.setFocusable(false);
        
        JLabel Title = new JLabel("Dataset Setup", SwingConstants.CENTER);
        Title.setFont(new Font("Lucida Fax", Font.BOLD, 35));
        add(Title);
        JComponent []Containers = new JComponent[6];
        
         for(int i = 0; i< 6;i++)
        {
            Containers[i] = new JPanel();
            Containers[i].setLayout(new BorderLayout(10,10));
            Containers[i].setOpaque(false);
        }
        
        
        Containers[0].add(numberOfPatientLabel, BorderLayout.LINE_START);
        Containers[0].add(numberofPatientText, BorderLayout.LINE_END);
        
        
        Containers[1].add(numberOfGenesLabel, BorderLayout.LINE_START);
        Containers[1].add(numberOfGenesText, BorderLayout.LINE_END);
        
        Containers[2].add(numberOfTrainedLabel, BorderLayout.LINE_START);
        Containers[2].add(numberOfTrainedText, BorderLayout.LINE_END);
        
        Containers[3].add(numberOfTestLabel, BorderLayout.LINE_START);
       
        Containers[3].add(numberOfTestText, BorderLayout.LINE_END);
        JComponent Cont = new JPanel();
        Cont.setOpaque(false);
        Cont.setLayout(new BorderLayout(10,10));
        Cont.add(DataSetPathLabel,BorderLayout.LINE_START);
        Cont.add(DataSetPathText);
        Containers[4].add(Cont, BorderLayout.CENTER);
        
        Containers[4].add(fileChooserButton, BorderLayout.LINE_END);
     
        Containers[5].add(StartButton, BorderLayout.CENTER);
      
        for(JComponent com: Containers)
        {
           // LayoutManager layout = new BorderLayout(10, 10);
            //com.setLayout(layout);
            add(com);
        }
        
        
        
    }
    
}

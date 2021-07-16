package colon.cancer.diagnosis.system.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OptionsPanel extends JPanel{
    public JButton graphButton;
    public JButton searchButton;
    public JButton AddButton;
    public JButton alo;
    public OptionsPanel(){
       setOpaque(false);
        ImageIcon graphIcon = new ImageIcon("Icons\\pie-chart.png");
        Image graphImg = graphIcon.getImage();
        Image resizedGraphImg = graphImg.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        graphIcon = new ImageIcon(resizedGraphImg);
        
        ImageIcon addIcon = new ImageIcon("Icons\\add.png");
        Image addImg = addIcon.getImage();
        Image resizedAddImg = addImg.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        addIcon = new ImageIcon(resizedAddImg);
        
        ImageIcon searchIcon = new ImageIcon("Icons\\search.png");
        Image searchImg = searchIcon.getImage();
        Image resizedSearchImg = searchImg.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        searchIcon = new ImageIcon(resizedSearchImg);
        
        GridLayout layout = new GridLayout(2,3);
        layout.setHgap(100);
        layout.setVgap(150);
        setLayout(layout);   
        
        graphButton = new JButton("Show Graph");
        graphButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        graphButton.setIcon(graphIcon);
        graphButton.setFocusable(false);
        searchButton = new JButton("Search");
        searchButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        searchButton.setIcon(searchIcon);
        searchButton.setFocusable(false);
        AddButton = new JButton("Add");
        AddButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        AddButton.setIcon(addIcon);
        AddButton.setFocusable(false);
        
        graphButton.setPreferredSize(new Dimension(200, 75));
        
         
        JPanel No1 = new JPanel();
        No1.setOpaque(false);
       add(No1);
        JLabel Title = new JLabel("Menu", SwingConstants.CENTER);
        Title.setOpaque(false);
        Title.setFont(new Font("Lucida Fax", Font.BOLD, 35));  
        add(Title);
        JPanel No2 = new JPanel();
        No2.setOpaque(false);
       add(No2);
       
       add(graphButton);
        add(AddButton);
        add(searchButton);
 
        
    }    
}

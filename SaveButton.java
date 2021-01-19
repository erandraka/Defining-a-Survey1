import javax.swing.*;

public class SaveButton { 
    public static void main(String[] args) {
        JFrame f=new JFrame("Save Button");  
        JButton b=new JButton("Save");  
        b.setBounds(50,100,95,30);  
        f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
}
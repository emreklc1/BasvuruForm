
package basvuruform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class BasvuruForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("İŞ BAŞVURU FORMU");
        JLabel lb = new JLabel("Ad:");
        lb.setBounds(50, 25, 100, 30);
        JTextArea area = new JTextArea();
        area.setBounds(70, 30, 100, 20);

        JLabel lb1 = new JLabel("Soyad:");
        lb1.setBounds(25, 70, 100, 30);
        JTextArea area1 = new JTextArea();
        area1.setBounds(70, 70, 100, 20);

        JLabel lb2 = new JLabel("Doğum Tarihi:");
        lb2.setBounds(25, 110, 100, 30);
        String gün[] = {"Gün", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        JComboBox cb = new JComboBox(gün);
        cb.setBounds(110, 110, 50, 30);

        String ay[] = {"Ay", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        JComboBox cb1 = new JComboBox(ay);
        cb1.setBounds(170, 110, 70, 30);

        String yil[] = {"Yıl", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
        JComboBox cb2 = new JComboBox(yil);
        cb2.setBounds(250, 110, 70, 30);

        JLabel lb3 = new JLabel("Cinsiyet:");
        lb3.setBounds(25, 150, 100, 30);
        JRadioButton rb = new JRadioButton("Kadın");
        rb.setBounds(80, 150, 75, 30);
        JRadioButton rb1 = new JRadioButton("Erkek");
        rb1.setBounds(160, 150, 75, 30);
        
        JLabel lb4 = new JLabel("Programlama Dili");
        lb4.setBounds(25, 250, 100, 30);

        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("PHP");
        l.addElement("JAVA");
        l.addElement("C++");
        l.addElement("HTML");
        JList list = new JList(l);
        list.setBounds(150, 230, 100, 75);
        JButton btn = new JButton("Kaydet");
        btn.setBounds(150, 350, 100, 30);
        
        btn.addActionListener(new ActionListener() {
            String liste="";
            @Override
            public void actionPerformed(ActionEvent e) {
               String ad="Adı="+(area.getText());
               System.out.println(ad);
               String soyad="Soyadı="+(area1.getText());
               System.out.println(soyad);
              
                System.out.println("Doğum Tarihi="+cb.getSelectedItem()+"."+cb1.getSelectedItem()+"."+cb2.getSelectedItem());
                
                if (rb.isSelected()) {
                    System.out.println("Cinsiyet="+rb.getText());
                }else{
                System.out.println("Cinsiyet="+rb1.getText());
                }
                
                if (list.getSelectedIndex() !=-1) {
                    liste = "Seçilen Programlama Dili : " + list.getSelectedValue();
                }
                System.out.println(liste);
            }
            
        });

        frame.add(area);
        frame.add(lb);
        frame.add(area1);
        frame.add(lb1);
        frame.add(lb2);
        frame.add(cb);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(lb3);
        frame.add(rb);
        frame.add(rb1);
        frame.add(lb4);
        frame.add(list);
        frame.add(btn);
        
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
}

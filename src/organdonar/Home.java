
package organdonar;

import java.awt.event.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;
import java.sql.*;
import javax.swing.event.MenuListener;


class Home extends JFrame implements ActionListener{

    
    Home(){
        
        super("Organ Donar");
        setSize(1900,1000);
        
        
        /////////////////////////////////////////////////
        
        JPanel p1=new JPanel();
        p1.setLayout(new BorderLayout());
        add(p1);
        
        ImageIcon i1=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\donateorgan\\home.png");
        Image i11=i1.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon i111=new ImageIcon(i11);
        
        JLabel l1=new JLabel(i111); 
        p1.add(l1,"Center");
        
        /////////////////////////////////////////////////////////////////
        
        JButton bsignup=new JButton("To Donate or To Receive any body part 'press it'");
        p1.add(bsignup,"South");
        
        bsignup.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
             new SignupForm().setVisible(true);
              
           }
         });
        
        //////////////////////////////////////////////////
        
        JMenuBar mb=new JMenuBar();
        
        JMenu a=new JMenu("Login");
        mb.add(a);
        JMenuItem m1=new JMenuItem("Login Form");
        a.add(m1);
        m1.addActionListener(this);
        
        JMenu x=new JMenu("Register");
        mb.add(x);
        JMenuItem m2=new JMenuItem("Register");
        x.add(m2);
        m2.addActionListener(this);
        
        JMenu c=new JMenu("Organ Detail");
        mb.add(c);
        JMenuItem m3=new JMenuItem("View Organ Detail");
        c.add(m3);
        m3.addActionListener(this);
        
        JMenu d=new JMenu("Contact-Us");
        mb.add(d);
        JMenuItem m4=new JMenuItem("Contact-Us");
        d.add(m4);
        m4.addActionListener(this);
        
        JMenu e=new JMenu("About-Us");
        mb.add(e);
        JMenuItem m5=new JMenuItem("About-Us");
        e.add(m5);
        m5.addActionListener(this);
      
        setJMenuBar(mb);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        JPanel p3=new JPanel();
        p3.setLayout(new GridLayout(6,1,0,19));
        p3.setPreferredSize(new Dimension(200, 600));
        add(p3,"West");
        
        ImageIcon iheart=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\heart.jpeg");
        Image ih=iheart.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton heart=new JButton(new ImageIcon(ih));
        heart.setToolTipText("HEART");
        p3.add(heart);
        
        
        ImageIcon ihand=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\hand.jpeg");
        Image ihh=ihand.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton hand=new JButton(new ImageIcon(ihh));
        hand.setToolTipText("HAND");
        p3.add(hand);
        
       
        ImageIcon ibone=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\bone.jpeg");
        Image ibn=ibone.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton bone=new JButton(new ImageIcon(ibn));
        bone.setToolTipText("BONE");
        p3.add(bone);
        
        ImageIcon ibMarrow=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\boneMarrow.jpeg");
        Image ibm=ibMarrow.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton bMarrow=new JButton(new ImageIcon(ibm));
        bMarrow.setToolTipText("BONE MARROW");
        p3.add(bMarrow);
       
        ImageIcon iface=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\face.jpeg");
        Image ifa=iface.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton face=new JButton(new ImageIcon(ifa));
        face.setToolTipText("FACE");
        p3.add(face);
        
        ImageIcon icornea=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\cornea.jpeg");
        Image ic=icornea.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton cornea=new JButton(new ImageIcon(ic));
        cornea.setToolTipText("CORNEA");
        p3.add(cornea);
        
        /////////////////////////////////////////////////////////    
              
        JPanel p4=new JPanel();
        p4.setLayout(new GridLayout(6,1,0,19));
        p4.setPreferredSize(new Dimension(200, 600));
        add(p4,"East");
        
        ImageIcon ikidney=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\kidney.jpeg");
        Image ik=ikidney.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton kidney=new JButton(new ImageIcon(ik));
        kidney.setToolTipText("KIDNEY");
        p4.add(kidney);
        
        ImageIcon iliver=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\liver.jpeg");
        Image il=iliver.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton liver=new JButton(new ImageIcon(il));
        liver.setToolTipText("LIVER");
        p4.add(liver);
        
        ImageIcon itendon=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\tendon.jpeg");
        Image it=itendon.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton tendon=new JButton(new ImageIcon(it));
        tendon.setToolTipText("TENDON");
        p4.add(tendon);
        
        ImageIcon iskin=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\skin.jpeg");
        Image is=iskin.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton skin=new JButton(new ImageIcon(is));
        skin.setToolTipText("SKIN");
        p4.add(skin);
        
        ImageIcon iintestines=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\intestines.jpeg");
        Image itt=iintestines.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton intestines=new JButton(new ImageIcon(itt));
        intestines.setToolTipText("INTESTINES");
        p4.add(intestines);
        
        ImageIcon iplatelet=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\platelet.jpeg");
        Image ip=iplatelet.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton platelet=new JButton(new ImageIcon(ip));
        platelet.setToolTipText("PLATELET");
        p4.add(platelet);
               
        ///////////////////////////////////////////////////////////
        
        JPanel p2=new JPanel();
        p2.setPreferredSize(new Dimension(200, 15));
        p2.setLayout(new GridLayout(1,1));
        JLabel footer=new JLabel("See you again....");
        footer.setOpaque(true);
        footer.setBackground(Color.white);
        p2.add(footer);
        add(p2,"South");
        
        //////////////////////////////////////////////////////////////////////
        
        JPanel p5=new JPanel();
        p5.setLayout(new GridLayout(1,3));
        p5.setPreferredSize(new Dimension(200, 100));
        add(p5,"North");
        
        JLabel hleft=new JLabel();
        hleft.setOpaque(true);
        hleft.setBackground(Color.red);
        p5.add(hleft);
        
        JLabel header=new JLabel("     Organ Donar");
        header.setFont(new Font("Arial",Font.CENTER_BASELINE,70));
        header.setForeground(Color.red);
        header.setOpaque(true);
        header.setBackground(Color.white);
        p5.add(header);
        
        JLabel hright=new JLabel();
        hright.setOpaque(true);
        hright.setBackground(Color.red);
        
        p5.add(hright);
        
        //////////////////////////////////////////////////////
       
    }
    
       public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        
        if(msg.equals("About-Us")){
            new About_us().setVisible(true);
           
        }
        else if(msg.equals("Contact-Us")){
            new Contact_us().setVisible(true);
        } 
        else if(msg.equals("Register")){
            new SignupForm().setVisible(true);
        }
        else if(msg.equals("Login Form")){
            new LoginForm().setVisible(true);
        }
        
        else if(msg.equals("View Organ Detail")){
            new OrganDetails().setVisible(true);
        }
        }   

    public static void main(String[] args) {
        
        new Home().setVisible(true);
        
    }
  
}



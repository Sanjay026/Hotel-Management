import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Radio extends JPanel{
	Radio(){
		setLayout(null);
		setBorder(BorderFactory.createLoweredBevelBorder());
	    ButtonGroup bg=new ButtonGroup();
		JRadioButton jr=new JRadioButton("Mr.");
		JRadioButton jr2=new JRadioButton("Mrs.");
		bg.add(jr);
		bg.add(jr2);
		add(jr);
		add(jr2);
		jr.setBounds(5,15,60,10);
		jr2.setBounds(5,45 ,60,10);
	     
	}
}
class Guest extends JPanel {
    
	Guest(){
		setLayout(null);
		setBorder(BorderFactory.createRaisedBevelBorder());
		String s[]={"New","Existing"};
		JLabel jcl=new JLabel("Status");
		//JList jl=new JList(s);
		//JScrollPane jsp=new JScrollPane(jl);
		//jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JComboBox jsp=new JComboBox(s);
		
		JLabel Jl=new JLabel("Reservation Number");
		JLabel Jl1=new JLabel("First Name");
		JLabel Jl2=new JLabel("Last Name");
		JLabel Jl4=new JLabel("Mobile Number");
		JLabel Jl3=new JLabel("Address");
		JLabel Jl5=new JLabel("Email");
		JTextField jtt=new JTextField(30);
		JTextField jtt1=new JTextField(30);
		JTextField jtt2=new JTextField(30);
		JTextField jtt3=new JTextField(30);
		JTextField jtt4=new JTextField(30);
		JTextField jtt5=new JTextField(30);
		Radio r=new Radio();
		add(r);
		add(jcl);
		add(Jl);
		add(Jl1);
		add(Jl2);
		add(Jl3);
		add(Jl4);
		add(Jl5);
		add(jtt);
		add(jtt1);
		add(jtt2);
		add(jtt3);
		add(jtt4);
		add(jtt5);
		add(jsp);
		jcl.setBounds(200,75,50,10);
		jsp.setBounds(290,70,100,20);
		r.setBounds(65,35,70,70);
		Jl.setBounds(12,160,200,10);
		Jl1.setBounds(12,190,200,10);
		Jl2.setBounds(12,220,200,10);
		Jl4.setBounds(12,250,200,10);
		Jl3.setBounds(12,310,200,10);
		Jl5.setBounds(12,280,200,10);
		jtt.setBounds(200,158,200,20);
		jtt1.setBounds(200,188,200,20);
		jtt2.setBounds(200,218,200,20);
		jtt5.setBounds(200,278,200,20);
		jtt4.setBounds(200,248,200,20);
		jtt3.setBounds(200,308,200,60);
		
	}
	
	  
}
class Stay extends JPanel{
	Stay(){
		Integer kk1[]=new Integer[52];
		for(int i=0;i<52;){
			kk1[i]=++i; 
		}
		Integer kk[]=new Integer[10];
		for(int i=0;i<10;){
			kk[i]=++i; 
		}
//		Integer kh[]=new Integer[24];
//		for(int i=0;i<24;){
//			kh[i]=++i;
//		}
		setLayout(null);
		setBorder(BorderFactory.createLoweredBevelBorder());
	    JLabel jl1=new JLabel("No. of Adults");
		JLabel jl2=new JLabel("No. of Children");
		JLabel jl3=new JLabel("Pay per");
		JLabel jl4=new JLabel("Day");
		JComboBox jcb3=new JComboBox(kk);
		JComboBox jcb2=new JComboBox(kk);
		JComboBox jcb1=new JComboBox(kk1);
		JPanel jp=new JPanel();
		JRadioButton jb=new JRadioButton("Hour");
		JRadioButton jb1=new JRadioButton("Day");
		JRadioButton jb2=new JRadioButton("Week");
		ButtonGroup bg=new ButtonGroup();
		bg.add(jb);
		bg.add(jb1);
		bg.add(jb2);
		Font f=new Font("Estrangelo Edessa",Font.BOLD,15);
		jl3.setFont(f);
		jl3.setBounds(25,10,100,20);
		jb.setBounds(28,45,100,15);
		jb1.setBounds(28,75,100,15);
		jb2.setBounds(28,105,100,15);
		jl4.setBounds(180,45,100,15);
		jcb1.setBounds(290,43,50,20);
		jl1.setBounds(180,75,100,15);
		jl2.setBounds(180,105,100,15);
		jcb2.setBounds(290,73,50,20);
		jcb3.setBounds(290,103,50,20);
		add(jcb2);
		add(jcb3);
		add(jl1);
		add(jl2);
		add(jcb1);
		add(jl4);
		add(jl3);
        add(jb2);	
		add(jb);
		add(jb1);
	    jb.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent arg) {
				// TODO Auto-generated method stub
	    		jl4.setText("Hour");
	    		
	    	}
	     });
	     jb1.addActionListener(new ActionListener(){
		    	@Override
				public void actionPerformed(ActionEvent arg) {
					// TODO Auto-generated method stub
		    		jl4.setText("Day");
		    	}
		     });
	     jb2.addActionListener(new ActionListener(){
		    	@Override
				public void actionPerformed(ActionEvent arg) {
					// TODO Auto-generated method stub
		    		jl4.setText("Week");
					
				}
		     });
		
		
		
		
		
	}
}
class Room extends JPanel{
	
	Room(){
		ArrayList<Integer>alo=new ArrayList();
		
		Integer kk[]=new Integer[10];
		for(int i=0;i<10;){
			kk[i]=++i; 
		}
		int j=100,r=0,f;
		
		Integer kkk[]=new Integer[100];
		for(int k=0;k<100;){
			    r++;
			int t=r*j;
			for(int jj=1;jj<=20;jj++){
			     f=t+jj;
			     kkk[k]=f;
			     alo.add(f);
			     k++;
			}
		}
		
		Stay st=new Stay();
		setLayout(null);
		setBorder(BorderFactory.createRaisedBevelBorder());
		JLabel bl=new JLabel("No. of Rooms");
		JLabel bl1=new JLabel("Room Number");
		JLabel bl2=new JLabel("Room Selected");
		JLabel jll=new JLabel("Staying Details");
		JTextField jtf=new JTextField();
		JComboBox jcb=new JComboBox(kk);
		JList jrl=new JList(kkk);
		jrl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane jsp=new JScrollPane(jrl);
		bl.setBounds(12,20,100,10);
		bl1.setBounds(12,80,100,10);
		bl2.setBounds(12,150,100,20);
		jcb.setBounds(200,18,200,20);
		jsp.setBounds(200,78,200,60);
		jtf.setBounds(200,148,200,20);
		st.setBounds(450,30,420,150);
		jll.setBounds(447,5,200,20);
		Font ff=new Font("Monospaced",Font.BOLD,15);
		jll.setFont(ff);
		add(jll);
		add(bl);
		add(bl1);
		add(bl2);
		add(jcb);
		add(jsp);
		add(jtf);
		add(st);
		jrl.addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
			     int dd=jrl.getSelectedIndex();
			     jtf.setText(alo.get(dd).toString());
				
			}
		});
		
	}
}
class Billing extends JPanel{
	Billing(){
		setLayout(null);
		setBorder(BorderFactory.createEtchedBorder());
		JLabel jl=new JLabel("Rate");
		JLabel jl1=new JLabel("Total Charge");
		JLabel jl2=new JLabel("Other Charge");
		JLabel jl3=new JLabel("Sub Total");
		JLabel jl4=new JLabel("Discount%");
		JLabel jl5=new JLabel("Grand Total");
		JLabel jl6=new JLabel("Deposit Paid");
		JLabel jl7=new JLabel("Remaining Balance");
		JTextField tf=new JTextField();
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JTextField tf3=new JTextField();
		JTextField tf4=new JTextField();
		JTextField tf5=new JTextField();
		JTextField tf6=new JTextField();
		JTextField tf7=new JTextField();
		jl.setBounds(12,20,200,10);
		jl1.setBounds(12,50,200,10);
		jl2.setBounds(12,80,200,10);
		jl3.setBounds(12,110,200,10);
		jl4.setBounds(12,140,200,10);
		jl5.setBounds(12,170,200,10);
		jl6.setBounds(12,200,200,10);
		jl7.setBounds(12,230,200,10);
		tf.setBounds(170,18,150,20);
		tf1.setBounds(170,48,150,20);
		tf2.setBounds(170,78,150,20);
		tf3.setBounds(170,108,150,20);
		tf4.setBounds(170,138,150,20);
		tf5.setBounds(170,168,150,20);
		tf6.setBounds(170,198,150,20);
		tf7.setBounds(170,228,150,20);
	    add(jl);
		add(jl1);
		add(jl2);
		add(jl3);
		add(jl4);
		add(jl5);
		add(jl6);
		add(jl7);
		add(tf);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		
		
		
	}
}
class Check extends JPanel{
	Check(){
		setLayout(null);
		setBorder(BorderFactory.createEtchedBorder());
		JLabel jl=new JLabel("Check In Date");
		JLabel jl1=new JLabel("Check In Time");
		JLabel jl2=new JLabel("Check Out Date");
		JLabel jl3=new JLabel("Check Out Time");
		JTextField tf=new JTextField();
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JTextField tf3=new JTextField();
		jl.setBounds(10,20,100,20);
		jl1.setBounds(10,65,100,20);
		jl2.setBounds(10,110,100,20);
		jl3.setBounds(10,155,100,20);
		tf.setBounds(180,20,150,20);
		tf1.setBounds(180,65,150,20);
		tf2.setBounds(180,110,150,20);
		tf3.setBounds(180,155,150,20);
		add(jl);
		add(jl1);
		add(jl2);
		add(jl3);
		add(tf);
		add(tf1);
		add(tf2);
		add(tf3);
		
		
	}
}
 
class Detail extends JPanel{
	Detail(){
		setLayout(null);
		setBorder(BorderFactory.createRaisedBevelBorder());
		Check ch=new Check();
		Billing bl=new Billing();
		bl.setBounds(390,10,350,270);
		ch.setBounds(10,10,350,200);
	    add(ch);
	    add(bl);
		JPanel jp=new JPanel();
		jp.setBorder(BorderFactory.createLoweredBevelBorder());
		jp.setBounds(10,230,350,150);
		add(jp);
		JPanel jp1=new JPanel();
		jp1.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		jp1.setBounds(390,290,350,100);
		add(jp1);
		JLabel jl=new JLabel("Vehicle Company");
		JLabel jl1=new JLabel("Vehicle Model");
		JLabel jl2=new JLabel("Plate No.");
		JLabel jl3=new JLabel("ID Type");
		JLabel jl4=new JLabel("ID Number");
		JTextField jtf=new JTextField();
		JTextField jtf1=new JTextField();
		JTextField jtf2=new JTextField();
		JTextField jtf3=new JTextField();
		JTextField jtf4=new JTextField();
		
		jp.setLayout(null);
		JLabel jll=new JLabel("Vehicle Information");
		Font ff=new Font("Monospaced",Font.BOLD,15);
		JLabel jid=new JLabel("Identification Details");
		jid.setFont(ff);
		jll.setFont(ff);
		jll.setBounds(10,10,200,20);
		jl.setBounds(10,50,100,20);
		jl1.setBounds(10,80,100,20);
		jl2.setBounds(10,110,100,20);
		jtf.setBounds(180,50,150,20);
		jtf1.setBounds(180,80,150,20);
		jtf2.setBounds(180,110,150,20);
		jp.add(jll);
		jp.add(jl);
		jp.add(jl1);
		jp.add(jl2);
	    jp.add(jtf);
	    jp.add(jtf1);
		jp.add(jtf2);
		jp1.setLayout(null);
		jid.setBounds(10,10,200,20);
		jl3.setBounds(10,40,100,20);
		jl4.setBounds(10,70,100,20);
		jtf3.setBounds(170,40,150,20);
		jtf4.setBounds(170,70,150,20);
		jp1.add(jid);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jtf3);
		jp1.add(jtf4);
		
		
		
		
		
	}
}

public class Hotel_Management {
      Hotel_Management(){
    	  JFrame jf=new JFrame();
    	  Guest g=new Guest();
    	  Room r=new Room();
    	  Detail d=new Detail();
    	  jf.setLayout(null);
    	  JLabel jl=new JLabel("Guest Information");
    	  JLabel jll=new JLabel("Room Information");
    	  JLabel jlll=new JLabel("Detailed Infromation");
    	  JButton bt=new JButton("Save");
    	  JButton bt1=new JButton("Find");
    	  JButton bt2=new JButton("Cancel");
    	  JButton bt3=new JButton("Delete");
    	  Font f=new Font("Monospaced",Font.BOLD,20);
    	  jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	  jll.setFont(f);
    	  jf.setUndecorated(false);
    	  jl.setFont(f);
    	  jlll.setFont(f);
    	  jlll.setBounds(550,30,240,20);
    	  jll.setBounds(30,470,240,20);
    	  jl.setBounds(30, 30, 240, 20);
    	  g.setBounds(40,55,450,400);
    	  r.setBounds(40,495,900,200);
    	  d.setBounds(560,55,750,400);
    	  bt.setBounds(1030,550,100,50);
    	  bt1.setBounds(1180,550,100,50);
    	  bt2.setBounds(1030,630,100,50);
    	  bt3.setBounds(1180,630,100,50);
    	  jf.setSize(900,900);
    	  jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    	  jf.add(jlll);
    	  jf.add(d);
    	  jf.add(bt1);
    	  jf.add(bt);
    	  jf.add(bt2);
    	  jf.add(bt3);
    	  jf.add(jl);
    	  jf.add(jll);
    	  jf.add(g);
    	  jf.add(r);
   	      jf.setVisible(true);
    	  }
      public static void main(String...r){
    	  SwingUtilities.invokeLater(new Runnable(){
    		  public void run(){
    			  new Hotel_Management();
    		  }
    	  });
      }
}

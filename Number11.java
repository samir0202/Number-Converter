import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Number11 extends JFrame implements ActionListener
{
	JLabel lb1=new JLabel("NUMBER'S");
	JLabel lb2=new JLabel("CONVERTOR ");
	JTextField tf1=new JTextField(10);
	JTextField tf2=new JTextField(10);
	JButton btn1=new JButton("DEC To BIT");
	JButton btn2=new JButton("BIT To DEC");
	JButton btn3=new JButton("DEC To OCT");
	JButton btn4=new JButton("OCT To DEC");
	JButton btn5=new JButton("DEC To HEX");
	JButton btn6=new JButton("HEX To DEC");
	JButton btn7=new JButton("CLEAR");
	JButton btn8=new JButton("CLOSE");
	Container cn;
	Number11()
	{
		super("Convertor By Samir K Dubey");
		cn=getContentPane();
		btn1.setBackground(Color.green);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.green);
		btn4.setBackground(Color.green);
		btn5.setBackground(Color.green);
		btn6.setBackground(Color.green);
		btn7.setBackground(Color.cyan);
		btn8.setBackground(Color.pink);
		lb1.setBackground(Color.pink);
		lb1.setFont(new Font("Forte",Font.BOLD,20));
		lb2.setFont(new Font("Forte",Font.BOLD,20));
		lb1.setForeground(Color.red);
		lb2.setForeground(Color.red);
		btn7.setForeground(Color.blue);
		btn8.setForeground(Color.red);
		tf1.setForeground(Color.black);
		tf1.setBackground(Color.black);
		tf2.setBackground(Color.black);
		tf2.setForeground(Color.blue);
		tf1.setFont(new Font("arial",Font.BOLD,18));
		tf2.setFont(new Font("arial",Font.BOLD,18));
		setLayout(new GridLayout(6,2,10,10));
		add(lb1); add(lb2);
		add(tf1); add(tf2);
		add(btn1); add(btn2);
		add(btn3); add(btn4);
		add(btn5); add(btn6);
		add(btn7); add(btn8);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		setSize(284,320);
		setResizable(false);
		tf1.setEnabled(false);
		tf2.setEnabled(false);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
		}	});
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			int n, r,i=1;
			int bin=0;
			String s=JOptionPane.showInputDialog(null,"Enter Decimal Number:");
			n=Integer.parseInt(s);
			while(n!=0)
			{
				r=n%2;
				bin= bin+r*i;
				i=i*10;
				n=n/2;
			}
			tf1.setText("BINARY=");
			tf2.setText(String.valueOf(bin));
		}
		else if(e.getSource()==btn2)
		{
			int n,r;
			int dec=0;
			int m=1;
			String s=JOptionPane.showInputDialog(null,"Enter Binary Number:");
			n=Integer.parseInt(s);
			while(n>0)
			{
				r=n%10;
				dec=dec+r*m;
				n=n/10;
				m=m*2;
			}
			tf1.setText("DECIMAL=");
			tf2.setText(String.valueOf(dec));
		}
		else if(e.getSource()==btn3)
		{
			int n, r,i=1;
			int oct=0;
			String s=JOptionPane.showInputDialog(null,"Enter Decimal Number:");
			n=Integer.parseInt(s);
			while(n!=0)
			{
				r=n%8;
				oct= oct+r*i;
				i=i*10;
				n=n/8;
			}
			tf1.setText("OCTAL=");
			tf2.setText(String.valueOf(oct));
		}
		else if(e.getSource()==btn4)
		{
			int n,r;
			int dec=0;
			int m=1;
			String s=JOptionPane.showInputDialog(null,"Enter Octal Number:");
			n=Integer.parseInt(s);
			while(n>0)
			{
				r=n%10;
				dec=dec+r*m;
				n=n/10;
				m=m*8;
			}
			tf1.setText("DECIMAL=");
			tf2.setText(String.valueOf(dec));
			
		}
		else if(e.getSource()==btn5)
		{
			int n, r,i=1;
			int bin=0;
			String s=JOptionPane.showInputDialog(null,"Enter Decimal Number:");
			n=Integer.parseInt(s);
			String str = Integer.toHexString(n);
			tf1.setText("HEXADEC.=");
			tf2.setText(String.valueOf(str));
		}
		else if(e.getSource()==btn6)
		{
			String s=JOptionPane.showInputDialog(null,"Enter Hexadecimal Number:");
			int num = Integer.parseInt(s,16);
			tf1.setText("DECIMAL=");
			tf2.setText(String.valueOf(num));
		}
		else if(e.getSource()==btn7)
		{
			tf1.setText("");
			tf2.setText("");
		}
		else if(e.getSource()==btn8)
		{
			System.exit(0);
		}
	}
	public static void main(String k[])
	{
		new Number11();
	}
}
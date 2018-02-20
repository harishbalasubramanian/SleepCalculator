import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class two extends JFrame{
	public JButton calc;
	public JTextField field;
	public JTextField field2;
	public JTextField low;
	public JTextField mid1;
	public JTextField mid2;
	public JTextField high;
	public JComboBox box;
	public JPanel panel;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;
	public JPanel panel5;
	public JPanel panel6;
	public JPanel panel7;
	public JPanel panel8;
	public JPanel panel9;
	public JPanel panel10;
	public JPanel panel11;
	public String t;
	public int a;
	public int b;
	public int c;
	public int d;
	public int num1;
	public int num2;
	public int num3;
	public boolean v;
	public static String[] arr = {"AM", "PM"};
	public two(){
		super("Sleep Calculator");
		setLayout(new GridLayout());
		JLabel l = new JLabel("Sleep Calculator");
		l.setFont(new Font("Serif", Font.PLAIN, 20));
		
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();
		panel11 = new JPanel();
		
		panel.add(l);
		JLabel q = new JLabel("1. Enter the time you want to wake up");
		panel1.add(q);
		JLabel w = new JLabel("2. Press Calculate");
		panel2.add(w);
		calc = new JButton("Calculate");
		calc.setPreferredSize(new Dimension(120,60));
		calc.addActionListener(
				new ActionListener(){

					
					public void actionPerformed(ActionEvent arg0) {
						try{
						a = Integer.parseInt(field.getText());
						
						if(a > 12){
							field.setText("Invalid Input");
						}
						b = Integer.parseInt(field2.getText());
						if(b>59){
							field2.setText("Invalid Input");
						}
						if(a<12 && b <59){
						if(a == 12){
							a = 0;
						}
						if(v == false){
							a += 12;
						}
						a *= 60;
						c = a+b;
						int r = cal1(c);
						r -= 15;
						if(r<0){
							r = 1439 + r;
						}
						int o = r/60;
						int p = r%60;
						
						if(o == 0){
							o = 12;
						}
						if(o>12){
							o -= 12;
						}
						if(r>719){
							
							high.setText(o+":0"+p+" AM");
							if(p > 9){
								high.setText(o+":"+p+" AM");

							}
						}
						if(r<720){
							high.setText(o+":0"+p+" PM");
							if(p > 9){
								high.setText(o+":"+p+" PM");

							}
						}
						r -= 90;
						if(r<0){
							r = 1439 + r;
						}
						o = r/60;
						p = r%60;
						
						if(o == 0){
							o = 12;
						}
						if(o>12){
							o -= 12;
						}
						if(r>719){
							
							mid2.setText(o+":0"+p+" AM");
							if(p > 9){
								mid2.setText(o+":"+p+" AM");

							}
						}
						if(r<720){
							mid2.setText(o+":0"+p+" PM");
							if(p > 9){
								mid2.setText(o+":"+p+" PM");

							}
						}
						r -= 90;
						if(r<0){
							r = 1439 + r;
						}
						o = r/60;
						p = r%60;
						
						if(o == 0){
							o = 12;
						}
						if(o>12){
							o -= 12;
						}
						if(r>719){
							
							mid1.setText(o+":0"+p+" AM");
							if(p > 9){
								mid1.setText(o+":"+p+" AM");

							}
						}
						if(r<720){
							mid1.setText(o+":0"+p+" PM");
							if(p > 9){
								mid1.setText(o+":"+p+" PM");

							}
						}
						r -= 90;
						if(r<0){
							r = 1439 + r;
						}
						o = r/60;
						p = r%60;
						
						if(o == 0){
							o = 12;
						}
						if(o>12){
							o -= 12;
						}
						if(r>719){
							
							low.setText(o+":0"+p+" AM");
							if(p > 9){
								low.setText(o+":"+p+" AM");

							}
						}
						if(r<720){
							low.setText(o+":0"+p+" PM");
							if(p > 9){
								low.setText(o+":"+p+" PM");

							}
						}
						}
						}catch(Exception e){
							field.setText("Invalid Input");
							field2.setText("Invalid Input");
						}
					}
					
				}
				
				
				
		);
		panel3.add(calc);
		field = new JTextField();
		field.setPreferredSize(new Dimension(120,60));
		panel4.add(field);
		JLabel lu = new JLabel(":");
		panel4.add(lu);
		field.addKeyListener(
				new KeyListener(){

					@Override
					public void keyPressed(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyReleased(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyTyped(KeyEvent y) {
						char u = y.getKeyChar();
						
						if(!(Character.isDigit(u)) || u == KeyEvent.VK_BACK_SPACE || u == KeyEvent.VK_DELETE){
							y.consume();
						}
					}
					
				}
				
		);
		
		field2 = new JTextField();
		field2.setPreferredSize(new Dimension(120,60));
		panel4.add(field2);
		field2.addKeyListener(
				new KeyListener(){

					@Override
					public void keyPressed(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyReleased(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyTyped(KeyEvent y) {
						char u = y.getKeyChar();
						
						if(!(Character.isDigit(u)) || u == KeyEvent.VK_BACK_SPACE || u == KeyEvent.VK_DELETE){
							y.consume();
						}
					}
					
				}
				
		);
		JLabel e = new JLabel("These are the times that you should sleep");
		panel5.add(e);
		low = new JTextField();
		low.setPreferredSize(new Dimension(120,60));
		low.setEditable(false);
		panel6.add(low);
		mid1 = new JTextField();
		mid1.setPreferredSize(new Dimension(120,60));
		mid1.setEditable(false);
		panel6.add(mid1);
		mid2 = new JTextField();
		mid2.setPreferredSize(new Dimension(120,60));
		mid2.setEditable(false);
		panel6.add(mid2);
		high = new JTextField();
		high.setPreferredSize(new Dimension(120,60));
		high.setEditable(false);
		panel6.add(high);
		box = new JComboBox(arr);
		box.setPreferredSize(new Dimension(60, 30));
		panel4.add(box);
		box.addItemListener(
				new ItemListener(){
					public void itemStateChanged(ItemEvent a) {
						int x = box.getSelectedIndex();
						if (x == 1){
							v = true;
						}
						if(x == 0){
							v = false;
						}
					}
					
				}
				
		);
		panel11.add(panel);
		panel11.add(panel1);
		panel11.add(panel2);
		panel11.add(panel4);
		panel11.add(panel3);
		panel11.add(panel5);
		panel11.add(panel6);
		panel11.add(panel7);
		panel11.add(panel8);
		panel11.add(panel9);
		panel11.add(panel10);
		panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));
		panel11.add(Box.createVerticalGlue());
		add(panel11);
	}
	public int cal1(int k){
		int q = k-270;
		return q;
	}
	
}

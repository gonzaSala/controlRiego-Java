package parcial2;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.Box;
import java.awt.Window.Type;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Font;

public class controlRiego extends JFrame {
		private int line = 0;
		private int nivel = 0;
		private JPanel contentPane;
		private int columna = 52;
		private JButton bomba2;
		private JButton bomba3;
		private JTextField txt1;
		private JTextField txt2;
		private JTextField txt3;
		private JButton bomba1;
		private JTextField level;
		private JTextField state;
		private AbstractButton campoTexto;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						controlRiego frame = new controlRiego();
						frame.setVisible(true);
						frame.setTitle("*** Control de Riego ***");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public controlRiego() {
			setBackground(new Color(255, 255, 255));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 548, 394);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(0, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Caudal");
			lblNewLabel.setBounds(73, 45, 78, 20);
			contentPane.add(lblNewLabel);
			
			JLabel lblControlDeBombas = new JLabel("Control de Bombas");
			lblControlDeBombas.setBounds(300, 45, 163, 20);
			contentPane.add(lblControlDeBombas);
			
			txt1 = new JTextField();
			txt1.setText("Desactivada");
			txt1.setHorizontalAlignment(SwingConstants.CENTER);
			txt1.setEditable(false);
			txt1.setBounds(367, 103, 96, 19);
			contentPane.add(txt1);
			txt1.setColumns(10);
			
			txt2 = new JTextField();
			txt2.setHorizontalAlignment(SwingConstants.CENTER);
			txt2.setText("Desactivada");
			txt2.setEditable(false);
			txt2.setColumns(10);
			txt2.setBounds(367, 131, 96, 19);
			contentPane.add(txt2);
			
			txt3 = new JTextField();
			txt3.setText("Desactivada");
			txt3.setHorizontalAlignment(SwingConstants.CENTER);
			txt3.setEditable(false);
			txt3.setColumns(10);
			txt3.setBounds(367, 162, 96, 19);
			contentPane.add(txt3);
			
			bomba1 = new JButton("Bomba 1");
			bomba1.addActionListener(new ActionListener() {
				@SuppressWarnings("unlikely-arg-type")
				public void actionPerformed(ActionEvent e) {
				      String textFieldValue = txt1.getText();

				
					if (textFieldValue.equals("Desactivada")) {
						txt1.setText("Activada");
						nivel++;
					}
					if (textFieldValue.equals("Activada")) {
						txt1.setText("Desactivada");
						nivel--;
					}
					if(nivel == 0) {
						state.setText("");
					}
					if(nivel == 1) {
						state.setText("Normal");
					}
					if(nivel == 2) {
						state.setText("Precaucion");
					}
					if(nivel == 3) {
						state.setText("Peligro");
					}
				
					
				}
			});
			bomba1.setBounds(249, 102, 85, 21);
			contentPane.add(bomba1);
			
			bomba2 = new JButton("Bomba 2");
			bomba2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				      String textFieldValue1 = txt2.getText();

					if (textFieldValue1.equals("Desactivada")) {
						txt2.setText("Activada");
						nivel++;
					}
					if (textFieldValue1.equals("Activada")) {
						txt2.setText("Desactivada");
						nivel--;
					}
					if(nivel == 0) {
						state.setText("");
					}
					if(nivel == 1) {
						state.setText("Normal");
					}
					if(nivel == 2) {
						state.setText("Precaucion");
					}
					if(nivel == 3) {
						state.setText("Peligro");
					}
				}
			});
			bomba2.setBounds(249, 130, 85, 21);
			contentPane.add(bomba2);
			
			bomba3 = new JButton("Bomba 3");
			bomba3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				      String textFieldValue2 = txt3.getText();

					if (textFieldValue2.equals("Desactivada")) {
						txt3.setText("Activada");
						nivel++;
					}
					if (textFieldValue2.equals("Activada")) {
						txt3.setText("Desactivada");
						nivel--;
					}
					if(nivel == 0) {
						state.setText("");
					}
					if(nivel == 1) {
						state.setText("Normal");
					}
					if(nivel == 2) {
						state.setText("Precaucion");
					}
					if(nivel == 3) {
						state.setText("Peligro");
					}
				}
			});
			bomba3.setBounds(249, 161, 85, 21);
			contentPane.add(bomba3);
			
			JLabel lblNewLabel_2 = new JLabel("Estado");
			lblNewLabel_2.setBounds(339, 252, 45, 13);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_1 = new JLabel("0   10  20  30  40  50  60   70  80  90  100");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_1.setBounds(27, 84, 227, 13);
			contentPane.add(lblNewLabel_1);
			
			
			JLabel lblNewLabel_3 = new JLabel("Nivel");
			lblNewLabel_3.setBounds(84, 252, 45, 13);
			contentPane.add(lblNewLabel_3);
			
			
			
			JSpinner spinner = new JSpinner();
			spinner.addChangeListener(e -> {
	            //campoTexto.setText(spinner.getValue().toString());
	            int valorSpinner = Integer.parseInt(spinner.getValue().toString());
	            if(valorSpinner == 0) {
	            	line = 0;
	            	level.setText("Bajo");
				    repaint(); 
	            }
	            if(valorSpinner == 10) {
	            	line = 20;
	            	level.setText("Bajo");
				    repaint(); 
	            }
	            if(valorSpinner == 20) {
	            	line = 40;
	            	level.setText("Bajo");
				    repaint(); 
	            }
	            if(valorSpinner == 30) {
	            	line = 60;
	            	level.setText("Bajo");
				    repaint(); 
	            }
	            if(valorSpinner == 40) {
	            	line = 80;
	            	level.setText("Medio");
				    repaint(); 
	            }
	            if(valorSpinner == 50) {
	            	line = 100;
	            	level.setText("Medio");

				    repaint(); 
	            }
	            if(valorSpinner == 60) {
	            	line = 120;
	            	level.setText("Medio");

				    repaint(); 
	            }
	            if(valorSpinner == 70) {
	            	line = 140;
	            	level.setText("Medio");

				    repaint(); 
	            }
	            if(valorSpinner == 80) {
	            	line = 160;
	            	level.setText("Medio");

				    repaint(); 
	            }
	            if(valorSpinner == 90) {
	            	line = 180;
					level.setText("Alto");

				    repaint(); 
	            }
	            if(valorSpinner == 100) {
	            	line = 200;
					level.setText("Alto");

				    repaint(); 
	            }
	        });
			spinner.setModel(new SpinnerNumberModel(0, 0, 100, 10));
			
			spinner.setBounds(55, 161, 96, 42);
			contentPane.add(spinner);
			
			level = new JTextField();
			
			
			level.setBounds(55, 275, 96, 42);
			contentPane.add(level);
			level.setColumns(10);
			
			state = new JTextField();
			
			state.setBounds(312, 275, 96, 42);
			contentPane.add(state);
			state.setColumns(10);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setBackground(new Color(255, 255, 255));
			progressBar.setBounds(27, 99, 203, 52);
			contentPane.add(progressBar);
		}
		
		public void paint(Graphics g) {
			 super.paint(g);
			 g.setColor (Color.black);
		
			 g.setColor (Color.red);
			 g.drawLine(35+line,180,35+line,130);
		}
	}
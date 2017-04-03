package br.edu.ifpr;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controller extends JPanel {

	private boolean x = true;
	private boolean end = false;
	private int count = 0;
	private int matrix[][] = new int[3][3];

	public Controller() {
		repaint();
		Mouse rato = new Mouse();
		this.addMouseMotionListener(rato);
		this.addMouseListener(rato);
	}

	public class Mouse implements MouseMotionListener, MouseListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			//System.out.println("x " + e.getX() + "," + "y " + e.getY());
		}

		@Override
		public void mouseClicked(MouseEvent e) {

			if (!end) {
				// 1
				if ((e.getX() > 0 && e.getX() < 90) && (e.getY() > 0 && e.getY() <= 90)) {
					if ((matrix[0][0] != 1) && (matrix[0][0] != 2)) {
						if (x) {
							matrix[0][0] = 1;
							x = false;
						} else {
							matrix[0][0] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 2
				if ((e.getX() > 91 && e.getX() < 190) && (e.getY() > 0 && e.getY() <= 90)) {
					if ((matrix[0][1] != 1) && (matrix[0][1] != 2)) {
						if (x) {
							matrix[0][1] = 1;
							x = false;
						} else {
							matrix[0][1] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 3
				if ((e.getX() > 191 && e.getX() < 290) && (e.getY() > 0 && e.getY() < 90)) {
					if ((matrix[0][2] != 1) && (matrix[0][2] != 2)) {
						if (x) {
							matrix[0][2] = 1;
							x = false;
						} else {
							matrix[0][2] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 4
				if ((e.getX() > 0 && e.getX() < 90) && (e.getY() > 91 && e.getY() < 180)) {
					if ((matrix[1][0] != 1) && (matrix[1][0] != 2)) {
						if (x) {
							matrix[1][0] = 1;
							x = false;
						} else {
							matrix[1][0] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 5
				if ((e.getX() > 91 && e.getX() < 190) && (e.getY() > 91 && e.getY() < 180)) {
					if ((matrix[1][1] != 1) && (matrix[1][1] != 2)) {
						if (x) {
							matrix[1][1] = 1;
							x = false;
						} else {
							matrix[1][1] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 6
				if ((e.getX() > 191 && e.getX() < 290) && (e.getY() > 91 && e.getY() < 180)) {
					if ((matrix[1][2] != 1) && (matrix[1][2] != 2)) {
						if (x) {
							matrix[1][2] = 1;
							x = false;
						} else {
							matrix[1][2] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 7
				if ((e.getX() > 0 && e.getX() < 90) && (e.getY() > 180 && e.getY() < 260)) {
					if ((matrix[2][0] != 1) && (matrix[2][0] != 2)) {
						if (x) {
							matrix[2][0] = 1;
							x = false;
						} else {
							matrix[2][0] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 8
				if ((e.getX() > 91 && e.getX() < 190) && (e.getY() > 181 && e.getY() < 270)) {
					if ((matrix[2][1] != 1) && (matrix[2][1] != 2)) {
						if (x) {
							matrix[2][1] = 1;
							x = false;
						} else {
							matrix[2][1] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
				// 9
				if ((e.getX() > 191 && e.getX() < 290) && (e.getY() > 181 && e.getY() < 270)) {
					if ((matrix[2][2] != 1) && (matrix[2][2] != 2)) {
						if (x) {
							matrix[2][2] = 1;
							x = false;
						} else {
							matrix[2][2] = 2;
							x = true;
						}
						count++;
						repaint();
						validar();
					}
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Linhas Verticais
		g.drawLine(90, 10, 90, 250);
		g.drawLine(190, 10, 190, 250);
		
		// Linhas Horizontais
		g.drawLine(10, 90, 270, 90);
		g.drawLine(10, 180, 270, 180);

		// 1
		if (matrix[0][0] == 1) {
			g.drawLine(30, 30, 65, 65);
			g.drawLine(65, 30, 30, 65);
		}
		if (matrix[0][0] == 2)
			g.drawArc(20, 20, 50, 50, 0, 360);

		// 2
		if (matrix[0][1] == 1) {
			g.drawLine(120, 30, 155, 65);
			g.drawLine(120, 65, 155, 30);
		}
		if (matrix[0][1] == 2)
			g.drawArc(115, 20, 50, 50, 0, 360);

		// 3
		if (matrix[0][2] == 1) {
			g.drawLine(210, 30, 245, 65);
			g.drawLine(245, 30, 210, 65);
		}
		if (matrix[0][2] == 2)
			g.drawArc(210, 20, 50, 50, 0, 360);

		// 4
		if (matrix[1][0] == 1) {
			g.drawLine(30, 110, 65, 145);
			g.drawLine(65, 110, 30, 145);
		}
		if (matrix[1][0] == 2)
			g.drawArc(20, 110, 50, 50, 0, 360);

		// 5
		if (matrix[1][1] == 1) {
			g.drawLine(115, 110, 150, 145);
			g.drawLine(150, 110, 115, 145);
		}
		if (matrix[1][1] == 2)
			g.drawArc(115, 110, 50, 50, 0, 360);

		// 6
		if (matrix[1][2] == 1) {
			g.drawLine(215, 115, 250, 150);
			g.drawLine(250, 115, 215, 150);
		}
		if (matrix[1][2] == 2)
			g.drawArc(210, 110, 50, 50, 0, 360);

		// 7
		if (matrix[2][0] == 1) {
			g.drawLine(30, 200, 70, 240);
			g.drawLine(70, 200, 30, 240);
		}
		if (matrix[2][0] == 2)
			g.drawArc(20, 200, 50, 50, 0, 360);

		// 8
		if (matrix[2][1] == 1) {
			g.drawLine(115, 200, 150, 235);
			g.drawLine(150, 200, 115, 235);
		}
		if (matrix[2][1] == 2)
			g.drawArc(115, 200, 50, 50, 0, 360);

		// 9
		if (matrix[2][2] == 1) {
			g.drawLine(215, 200, 250, 235);
			g.drawLine(250, 200, 215, 235);
		}
		if (matrix[2][2] == 2)
			g.drawArc(215, 200, 50, 50, 0, 360);
	}

	public void validar() {
		if (((matrix[0][0] == 1) && (matrix[0][1] == 1) && (matrix[0][2] == 1))	|| 
			((matrix[0][0] == 2) && (matrix[0][1] == 2) && (matrix[0][2] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[1][0] == 1) && (matrix[1][1] == 1) && (matrix[1][2] == 1)) ||
				  ((matrix[1][0] == 2) && (matrix[1][1] == 2) && (matrix[1][2] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[2][0] == 1) && (matrix[2][1] == 1) && (matrix[2][2] == 1)) ||
				  ((matrix[2][0] == 2) && (matrix[2][1] == 2) && (matrix[2][2] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[0][0] == 1) && (matrix[1][0] == 1) && (matrix[2][0] == 1)) ||
				  ((matrix[0][0] == 2) && (matrix[1][0] == 2) && (matrix[2][0] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[0][1] == 1) && (matrix[1][1] == 1) && (matrix[2][1] == 1))
				|| ((matrix[0][1] == 2) && (matrix[1][1] == 2) && (matrix[2][1] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[0][2] == 1) && (matrix[1][2] == 1) && (matrix[2][2] == 1)) ||
				  ((matrix[0][2] == 2) && (matrix[1][2] == 2) && (matrix[2][2] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[0][0] == 1) && (matrix[1][1] == 1) && (matrix[2][2] == 1)) || 
				  ((matrix[0][0] == 2) && (matrix[1][1] == 2) && (matrix[2][2] == 2))) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}else if (((matrix[2][0] == 1) && (matrix[1][1] == 1) && (matrix[0][2] == 1)) || 
				  ((matrix[2][0] == 2) && (matrix[1][1] == 2) && (matrix[0][2] == 2)) ) {

			if (!x) {
				JOptionPane.showMessageDialog(null, "player - X win");
			} else
				JOptionPane.showMessageDialog(null, "player - O win");
			end = true;
			newGame();
		}
		if(count == 9){
			JOptionPane.showMessageDialog(null, "Velha win");
			newGame();
		}
	}
	
	public void newGame(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matrix[i][j] = 0;
			}
		}
		end = false;
		x = true;
		count = 0;
		repaint();
	}
}
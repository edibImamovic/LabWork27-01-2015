package ba.bitcamp.edibimamovic.exercises;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIExercises {

	public static void main(String[] args) throws AWTException {

		JFrame frame = new JFrame("Mouse pointer");
		JPanel panel = new JPanel();

		panel.addMouseMotionListener(new MouseListener());

		frame.add(panel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Scanner in = new Scanner(System.in);
		frame.setVisible(true);
		Robot r = new Robot();
		while (true) {
			System.out.println("Enter x, y");
			int x = in.nextInt();
			int y = in.nextInt();
			r.mouseMove(x, y);
		}

	}

	private static class MouseListener extends MouseAdapter {

		@Override
		public void mouseMoved(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println(x + "," + y);

		}
	}

}

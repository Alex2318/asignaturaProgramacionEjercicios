import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;


public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//Generamos player1 de la clase Jugador
		Jugador player1=new Jugador();
		//Inicalizamos cada uno de los atributos de la clase jugador
		player1.setNombre("�lex");
		player1.setApellidos("Monchol� Berlanga");
		player1.setEdad(31);
		player1.setId(001);
		//Hace una llamada al m�todo toString definido en la clase Jugador.
		System.out.println(player1.toString());
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Generamos una ventana principal.
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	}
}

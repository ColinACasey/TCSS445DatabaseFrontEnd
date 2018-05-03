/*
 * DataBase: GroupProject
 * Colin Casey
 */

/**
 * This is the class that starts the program.
 * @author caseycao
 */
public class GUIMain {
	
	/**
	 * Starts the GUI.
	 * @param theArgs Command line arguments
	 */
	public static void main(final String[] theArgs) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().start();
            }
        });		
	}
}

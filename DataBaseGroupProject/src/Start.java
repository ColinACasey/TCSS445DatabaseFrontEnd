/*
 * DataBase: GroupProject
 * Colin Casey
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This is the very first panel shown on start up.
 * @author caseycao
 */
public class Start extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Used to set button size.
     */
    private static final Dimension MY_BUTTON = new Dimension(100, 100);
    
    /**
     * Button used to open find panel.
     */
    private JButton myFind;
    
    /**
     * Button used to open add panel.
     */
    private JButton myAdd;
    
    /**
     * Button used to open exit panel.
     */
    private JButton myExit;
    
	/**
	 * Creates panel.
	 */
    public Start() {
        //Buttons are made.
        buttonMakerFind();
        buttonMakerAdd();
        buttonMakerExit();
        
        //Buttons are added to frame.
        add(myFind, BorderLayout.WEST);
        add(myAdd, BorderLayout.EAST);
        add(myExit, BorderLayout.SOUTH);
    }
    
    
	/**
	 * Used to make find button.
	 */
	private void buttonMakerFind() {
		myFind = new JButton("Find");
		myFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				//System.exit(1);
			}
		});
		myFind.setPreferredSize(MY_BUTTON);
	}
	
	/**
	 * Used to make add button.
	 */
	private void buttonMakerAdd() {
		myAdd = new JButton("Add");
		myAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				//System.exit(1);
			}
		});
		myAdd.setPreferredSize(MY_BUTTON);
	}
	
	/**
	 * Used to make exit button.
	 */
	private void buttonMakerExit() {
		myExit = new JButton("Exit");
		myExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				//System.exit(1);
			}
		});
		myExit.setPreferredSize(MY_BUTTON);
	}
}

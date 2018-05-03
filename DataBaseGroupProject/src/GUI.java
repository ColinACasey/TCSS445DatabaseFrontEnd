/*
 * DataBase: GroupProject
 * Colin Casey
 */

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This class is where the main frame is made and
 * used.
 * @author Colin
 */
public class GUI implements Observer, PropertyChangeListener{
	
    /**
     * This is used to set the dimension of the frame on open.
     */
    private static final Dimension MY_DIMENSION = new Dimension(650, 650);
    
	/**
     * Used to set button size.
     */
    private static final Dimension MY_BUTTON = new Dimension(100, 100);

    /**
     * Used to add Panels to homepage.
     */
	private static final String MY_ADD = "MY_ADD";
	private static final String MY_START = "MY_START";
	private static final String MY_FIND = "MY_FIND";
	
    /**
     * Start Panel. First Panel Shown.
     */
    public JPanel myStart = new JPanel();
    
    /**
     * Find Panel.
     */
    private JPanel myFind;
    
    /**
     * Add Panel.
     */
    private JPanel myAdd;
    
    /**
     * A deck of cards.
     */
    private JPanel myCards;
    
    /**
     * HomePAge frame that all buttons are placed into.
     */
    public JFrame myHomePage = new JFrame("Book Store");
    
    /**
     * Button used to open find panel.
     */
    private JButton myBackButton;
    
    /**
     * Button used to open find panel.
     */
    private JButton myFindButton;
    
    /**
     * Button used to open add panel.
     */
    private JButton myAddButton;
    
    /**
     * Button used to open exit panel.
     */
    private JButton myExitButton;
    
    /**
     * Builds on to the main frame.
     */
	public void start() {	
    	//Sets all the values for the HomePage frame
    	myHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	myHomePage.setSize(MY_DIMENSION);
    	final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        myHomePage.setLocation(dim.width / 2 -  myHomePage.getSize().width / 2, 
                dim.height / 2 - myHomePage.getSize().height / 2);
        
        //Can now see the HomePage frame
        myHomePage.setVisible(true);
        
        //make Panels start.
        makeStart();
        //make all panels
        myAdd = new Add();
        myFind = new Find();
        myAdd.addPropertyChangeListener(this);
        myHomePage.addPropertyChangeListener(this);
        myStart.addPropertyChangeListener(this);
        
        myCards = new JPanel(new CardLayout());
        myCards.add(myStart, MY_START);
        myCards.add(myAdd, MY_ADD);
        myCards.add(myFind, MY_FIND);
        myHomePage.add(myCards, BorderLayout.CENTER); 
        
        buttonMakerBack();
        myHomePage.add(myBackButton, BorderLayout.NORTH);
	}
	
	/**
	 * Creates panel.
	 * @return 
	 */
    public void makeStart() {
        //Buttons are made.
        buttonMakerFind();
        buttonMakerAdd();
        buttonMakerExit();
        
        //Buttons are added to frame.
        myStart.add(myFindButton, BorderLayout.WEST);
        myStart.add(myAddButton, BorderLayout.CENTER);
        myStart.add(myExitButton, BorderLayout.SOUTH);
    }
    
	/**
	 * Used to make back button.
	 */
	private void buttonMakerBack() {
		myBackButton = new JButton("Back");
		myBackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				CardLayout c1 = (CardLayout)(myCards.getLayout());
				c1.show(myCards, MY_START);
			}
		});
		myBackButton.setMaximumSize(MY_BUTTON);
	}
    
	/**
	 * Used to make find button.
	 */
	private void buttonMakerFind() {
		myFindButton = new JButton("Find");
		myFindButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				CardLayout c1 = (CardLayout)(myCards.getLayout());
				c1.show(myCards, MY_FIND);
			}
		});
		myFindButton.setPreferredSize(MY_BUTTON);
	}
	
	/**
	 * Used to make add button.
	 */
	private void buttonMakerAdd() {
		myAddButton = new JButton("Add");
		myAddButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				CardLayout c1 = (CardLayout)(myCards.getLayout());
				c1.show(myCards, MY_ADD);
			}
		});
		myAddButton.setPreferredSize(MY_BUTTON);
		myAddButton.addPropertyChangeListener(this);
	}
	
	/**
	 * Used to make exit button.
	 */
	private void buttonMakerExit() {
		myExitButton = new JButton("Exit");
		myExitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				System.exit(1);
			}
		});
		myExitButton.setPreferredSize(MY_BUTTON);
	}
	
    //methods that are not used.
	@Override
	public void propertyChange(PropertyChangeEvent theEvent) {	
	}

	@Override
	public void update(Observable arg0, Object arg1) {
	}
}

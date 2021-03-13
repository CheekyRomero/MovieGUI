// GUI based version of the  Movie application from chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGUI extends JFrame implements ActionListener
{

  // instance variables for this class
  String[] quotes = {"Game over man! Game over man!", "I'm your huckleberry...", "You're gonna need a bigger boat!"};
  String[] movies = {"*** Aliens (1986) ***", "*** Tombstone (1993) ***", "*** Jaws (1975) ***"};
  int rando = (int) (Math.random() * 3);

  Font myFont = new Font("Times New Roman", Font.BOLD, 24);
  JLabel quote = new JLabel(quotes[rando]);
  JLabel movie = new JLabel("");
  JButton button = new JButton("Show Movie");

  // Create a custom constructor for this class
  public MovieGUI()
  {
    super("Movie Quote App");
    setSize(320, 160);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 1));
    getContentPane().setBackground(new Color(152, 224, 190));
    setVisible(true);
    quote.setFont(myFont);
    movie.setFont(myFont);
    button.setForeground(Color.RED);
    add(quote);
    add(button);
    add(movie);
    button.addActionListener(this);
  }

  // Event handling method
  @Override
  public void actionPerformed(ActionEvent evt)
  {
    movie.setText(movies[rando]);
  }

  public static void main(String[] args)
  {
    MovieGUI myFrame = new MovieGUI();
  }
}

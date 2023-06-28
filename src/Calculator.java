
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;


//implementing ActionListener interface
public class Calculator implements ActionListener{
	 //Creating variables for our calculations
    double number, answer;
    int calculation;
    
		JFrame jf;//Creating object of JFrame class
		JFrame frame;
	    //Creating objects of Components
	    JLabel displaylabel= new JLabel();
	    JTextField textField = new JTextField();
	    JButton onButton = new JButton("ON");
	    JButton offButton = new JButton("OFF");
	    JButton buttonZero = new JButton("0");
	    JButton buttonOne = new JButton("1");
	    JButton buttonTwo = new JButton("2");
	    JButton buttonThree = new JButton("3");
	    JButton buttonFour = new JButton("4");
	    JButton buttonFive = new JButton("5");
	    JButton buttonSix = new JButton("6");
	    JButton buttonSeven = new JButton("7");
	    JButton buttonEight = new JButton("8");
	    JButton buttonNine = new JButton("9");
	    JButton buttonDot = new JButton(".");
	    JButton buttonClear = new JButton("C");
	    JButton buttonDelete = new JButton("DEL");
	    JButton buttonEqual = new JButton("=");
	    JButton buttonMul = new JButton("x");
	    JButton buttonDiv = new JButton("/");
	    JButton buttonPlus = new JButton("+");
	    JButton buttonMinus = new JButton("-");
	    JButton buttonSquare = new JButton("x\u00B2");
	    JButton buttonReciprocal = new JButton("1/x");
	    JButton buttonSqrt = new JButton("\u221A");
	 
	    Calculator()//Creating constructor of the class
	    {
	        createGUI();
	        addComponents();
	        addActionEvent();
	        	    }
	    public void createGUI()
	    {
	        jf=new JFrame();
	        jf.setTitle("Calculator");//Setting title of the JFrame
	        jf.setSize(310,500);//Setting size
	        jf.getContentPane().setLayout(null);//Setting Layout
	        jf.getContentPane().setBackground(Color.darkGray);//Setting Background Color
	        jf.setResizable(false);//Preventing window from resizing
	        jf.setLocationRelativeTo(null);//Setting location to the center of the screen
	        jf.setVisible(true);//Setting window's visibility
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
	    }
	
	    public void addComponents() {
	        //Setting property of Label
	        displaylabel.setBounds(240, 0, 50, 50);
	        displaylabel.setForeground(Color.WHITE);
	        displaylabel.setFont(new Font("Arial", Font.BOLD, 20));
	        jf.add(displaylabel);
	        
	      //Setting property of text field
	        textField.setBounds(10, 40, 270, 40);
	        textField.setFont(new Font("Arial", Font.BOLD, 20));
	       
	        textField.setEditable(false);
	        textField.setHorizontalAlignment(SwingConstants.RIGHT);
	        jf.add(textField);
	        
	        //Setting property of on button
	        onButton.setBounds(220, 90, 60, 35);
	        onButton.setSelected(true);
	        onButton.setFont(new Font("Arial", Font.BOLD, 13));
	        onButton.setBackground(Color.WHITE);
	        onButton.setForeground(Color.BLACK);
	        jf.add(onButton);
	        
	        //Setting property of off button
	        offButton.setBounds(220, 130, 60, 35);
	        offButton.setSelected(false);
	        offButton.setFont(new Font("Arial", Font.BOLD, 13));
	        offButton.setBackground(Color.WHITE);
	        offButton.setForeground(Color.BLACK);
	        jf.add(offButton);
	        //Setting property of button x
	        buttonMul.setBounds(10, 230, 60, 40);
	        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonMul.setForeground(Color.BLACK);
	        buttonMul.setBackground(Color.WHITE);
	        
	        jf.add(buttonMul);
	        
	        // Setting property of button 8
	        buttonEight.setBounds(80, 230, 60, 40);
	        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonEight.setForeground(Color.BLACK);  
	        buttonEight.setBackground(Color.WHITE);
	        jf.add(buttonEight);
	 
	        //Setting property of button 9
	        buttonNine.setBounds(150, 230, 60, 40);
	        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonNine.setForeground(Color.BLACK);
	        buttonNine.setBackground(Color.WHITE);
	        jf.add(buttonNine);
	 
	        //Setting property of button 4
	        buttonPlus.setBounds(10, 290, 60, 40);
	        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonPlus.setBackground(Color.WHITE);
	        buttonPlus.setForeground(Color.BLACK);
	        jf.add(buttonPlus);
	 
	       //Setting property of button 5
	        buttonFive.setBounds(80, 290, 60, 40);
	        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonFive.setForeground(Color.BLACK);
	        buttonFive.setBackground(Color.WHITE);
	        jf.add(buttonFive);
	 
	        //Setting property of button 6
	        buttonSix.setBounds(150, 290, 60, 40);
	        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonSix.setForeground(Color.BLACK);
	        buttonSix.setBackground(Color.WHITE);
	        jf.add(buttonSix);
	 
	        //Setting property of button 1
	        buttonOne.setBounds(220, 350, 60, 40);
	        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonOne.setForeground(Color.BLACK);
	        buttonOne.setBackground(Color.WHITE);
	        jf.add(buttonOne);
	 
	        //Setting property of button 2
	        buttonTwo.setBounds(80, 350, 60, 40);
	        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonTwo.setForeground(Color.BLACK);
	        buttonTwo.setBackground(Color.WHITE);
	        jf.add(buttonTwo);
	        
	        //Setting property of button 3
	        buttonThree.setBounds(150, 350, 60, 40);
	        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonThree.setForeground(Color.BLACK);
	        buttonThree.setBackground(Color.WHITE);
	        jf.add(buttonThree);
	 
	        //Setting property of dot button
	        buttonDot.setBounds(220, 410, 60, 40);
	        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonDot.setForeground(Color.BLACK);
	        buttonDot.setBackground(Color.WHITE);
	        jf.add(buttonDot);
	 
	        //Setting property of button 0
	        buttonZero.setBounds(80, 410, 130, 40);
	        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonZero.setForeground(Color.BLACK);
	        buttonZero.setBackground(Color.WHITE);
	        jf.add(buttonZero);
	 
	       //Setting property of button =
	        buttonEqual.setBounds(10, 350, 60, 100);
	        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonEqual.setForeground(Color.BLACK);
	        buttonEqual.setBackground(Color.WHITE);
	        jf.add(buttonEqual);
	 
	       //Setting property of button /
	        buttonDiv.setBounds(10, 110, 60, 40);
	        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonDiv.setBackground(Color.WHITE);
	        buttonDiv.setForeground(Color.BLACK);	       
	        jf.add(buttonDiv);
	 
	        //Setting property of button square root
	        buttonMinus.setBounds(10, 170, 60, 40);
	        buttonMinus.setFont(new Font("Arial", Font.BOLD, 18));
	        buttonMinus.setBackground(Color.WHITE);
	        buttonMinus.setForeground(Color.BLACK);
	        jf.add(buttonMinus);
	 
	        //Setting property of button seven
	        buttonSeven.setBounds(220, 230, 60, 40);
	        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonSeven.setForeground(Color.BLACK);
	        buttonSeven.setBackground(Color.WHITE);
	        
	        jf.add(buttonSeven);
	 
	        //Setting property of button -
	        buttonSqrt.setBounds(220, 170, 60, 40);
	        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 22));
	        buttonSqrt.setForeground(Color.BLACK);
	        buttonSqrt.setBackground(Color.WHITE);
	        jf.add(buttonSqrt);
	        //Setting property of button +
	        buttonFour.setBounds(220, 290, 60, 40);
	        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
	        buttonFour.setForeground(Color.BLACK);
	        buttonFour.setBackground(Color.WHITE);
	        
	        jf.add(buttonFour);
	 
	        //Setting property of button square
	        buttonSquare.setBounds(80, 170, 60, 40);
	        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
	       
	        buttonSquare.setForeground(Color.BLACK);
	        buttonSquare.setBackground(Color.WHITE);
	        jf.add(buttonSquare);
	 
	        //Setting property of reciprocal button
	        buttonReciprocal.setBounds(150, 170, 60, 40);
	        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
	        buttonReciprocal.setForeground(Color.BLACK);
	        buttonReciprocal.setBackground(Color.WHITE);
	        jf.add(buttonReciprocal);
	 
	        //Setting property of delete button
	        buttonDelete.setBounds(150, 110, 60, 40);
	        buttonDelete.setFont(new Font("Arial", Font.BOLD, 13));
	        buttonDelete.setBackground(Color.WHITE);
	        buttonDelete.setForeground(Color.BLACK);
	        jf.add(buttonDelete);
	 
	        //Setting property of clear button
	        buttonClear.setBounds(80, 110, 60, 40);
	        buttonClear.setFont(new Font("Arial", Font.BOLD, 18));
	        buttonClear.setBackground(Color.WHITE);
	        buttonClear.setForeground(Color.BLACK);
	        jf.add(buttonClear);
	 
	    }
	public void addActionEvent() {
		//Registering ActionListener to buttons
        onButton.addActionListener(this);
        offButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
 
 
    }
	
	 //Overriding actionPerformed() method
   
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		 if (source==onButton) {
	            enable();//Calling enable() function
	        } else if (source==offButton) {
	            disable();//Calling disable function
	        } else if (source==buttonClear) {
	            //Clearing texts of label and text field
	            displaylabel.setText("");
	            textField.setText("");
	        } else if (source == buttonDelete) {
	        	  //Setting functionality for delete button(backspace)
	            int length = textField.getText().length();
	            int number = length - 1;
	 
	        	
	        	if(length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
 
            }
            if (textField.getText().endsWith("")) {
                displaylabel.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
 
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            displaylabel.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            displaylabel.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            displaylabel.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            displaylabel.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
 
        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            displaylabel.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    displaylabel.setText("");
                
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    displaylabel.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    displaylabel.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    displaylabel.setText("");
                    break;
 
            }
        }
 
 
    }
	
	
	
	
	
		 
		 public void enable() {
		        onButton.setEnabled(false);
		        offButton.setEnabled(true);
		        textField.setEnabled(true);
		        displaylabel.setEnabled(true);
		        buttonClear.setEnabled(true);
		        buttonDelete.setEnabled(true);
		        buttonDiv.setEnabled(true);
		        buttonSqrt.setEnabled(true);
		        buttonSquare.setEnabled(true);
		        buttonReciprocal.setEnabled(true);
		        buttonMinus.setEnabled(true);
		        buttonSeven.setEnabled(true);
		        buttonEight.setEnabled(true);
		        buttonNine.setEnabled(true);
		        buttonMul.setEnabled(true);
		        buttonFour.setEnabled(true);
		        buttonFive.setEnabled(true);
		        buttonSix.setEnabled(true);
		        buttonPlus.setEnabled(true);
		        buttonOne.setEnabled(true);
		        buttonTwo.setEnabled(true);
		        buttonThree.setEnabled(true);
		        buttonEqual.setEnabled(true);
		        buttonZero.setEnabled(true);
		        buttonDot.setEnabled(true);
		 
		    }
		 
		    public void disable() {
		        onButton.setEnabled(true);
		        offButton.setEnabled(false);
		        textField.setText("");
		        displaylabel.setText(" ");
		        buttonClear.setEnabled(false);
		        buttonDelete.setEnabled(false);
		        buttonDiv.setEnabled(false);
		        buttonSqrt.setEnabled(false);
		        buttonSquare.setEnabled(false);
		        buttonReciprocal.setEnabled(false);
		        buttonMinus.setEnabled(false);
		        buttonSeven.setEnabled(false);
		        buttonEight.setEnabled(false);
		        buttonNine.setEnabled(false);
		        buttonMul.setEnabled(false);
		        buttonFour.setEnabled(false);
		        buttonFive.setEnabled(false);
		        buttonSix.setEnabled(false);
		        buttonPlus.setEnabled(false);
		        buttonOne.setEnabled(false);
		        buttonTwo.setEnabled(false);
		        buttonThree.setEnabled(false);
		        buttonEqual.setEnabled(false);
		        buttonZero.setEnabled(false);
		        buttonDot.setEnabled(false);
		    }
	
	 public static void main(String[] args)
	    {
	            new Calculator();
	
	
	
	    }
}





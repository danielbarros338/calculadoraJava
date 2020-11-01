package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootLayoutController {
    @FXML private Button equalButton, divButton, eraseButton, minusButton, clearButton, multButton, dotButton, plusButton, exitButton,
    oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton;
    @FXML private Label resultScreen, partialScreen;
    
    private String numberScreen = "";
    private double numMemory1, numMemory2;
    private String operator = "";
    
    @FXML void exitAction(ActionEvent event){
    	System.exit(0);
    }
    
    @FXML void zeroAction(ActionEvent event) {
    	String zero = "0";
    	this.numberScreen += zero;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML void oneButton(ActionEvent event) {
    	String one = "1";
    	this.numberScreen += one;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML void twoAction(ActionEvent event) {
    	String two = "2";
    	this.numberScreen += two;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML void threeAction(ActionEvent event) {
    	String three = "3";
    	this.numberScreen += three;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML void fourAction(ActionEvent event) {
    	String four = "4";
    	this.numberScreen += four;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void fiveAction(ActionEvent event) {
    	String five = "5";
    	this.numberScreen += five;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void sixAction(ActionEvent event) {
    	String six = "6";
    	this.numberScreen += six;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void sevenAction(ActionEvent event) {
    	String seven = "7";
    	this.numberScreen += seven;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void eightAction(ActionEvent event) {
    	String eight = "8";
    	this.numberScreen += eight;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void nineAction(ActionEvent event) {
    	String nine = "9";
    	this.numberScreen += nine;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void plusAction(ActionEvent event) {
    	this.numMemory1 = Double.parseDouble(this.numberScreen);
    	this.operator = "+";
    	this.numberScreen = "";
    }

    @FXML
    void minusAction(ActionEvent event) {
    	this.numMemory1 = Double.parseDouble(this.numberScreen);
    	this.operator = "-";
    	this.numberScreen = "";
    }

    @FXML
    void multAction(ActionEvent event) {
    	this.numMemory1 = Double.parseDouble(this.numberScreen);
    	this.operator = "*";
    	this.numberScreen = "";
    }

    @FXML
    void divAction(ActionEvent event) {
    	this.numMemory1 = Double.parseDouble(this.numberScreen);
    	this.operator = "/";
    	this.numberScreen = "";
    }

    @FXML
    void clearAction(ActionEvent event) {
    	this.numberScreen = "";
    	this.partialScreen.setText(numberScreen);
    	this.resultScreen.setText(numberScreen);
    }

    @FXML
    void dotAction(ActionEvent event) {
    	String dot = ".";
    	numberScreen += dot;
    	this.partialScreen.setText(numberScreen);
    }

    @FXML
    void eraseAction(ActionEvent event) {
    	this.numberScreen = numberScreen.substring(0, this.numberScreen.length()-1);
    	this.partialScreen.setText(numberScreen);
    }
    
    @FXML
    void equalAction(ActionEvent event) {
    	double res = 0;
    	numMemory2 = Double.parseDouble(numberScreen);
    	
    	switch(operator) {
    		case "+" : res = numMemory1 + numMemory2;
    		break;
    		case "-" : res = numMemory1 - numMemory2;
    		break;
    		case "*" : res = numMemory1 * numMemory2;
    		break;
    		case "/" : res = numMemory1 / numMemory2;
    		break;
    	}
    	
    	if(res%2 == 0) {
    		int resInt = (int) res;
    		this.resultScreen.setText(Integer.toString(resInt));
    	} else {
    		this.resultScreen.setText(Double.toString(res));
    	}
    	
    	this.numberScreen = "";
    }

}

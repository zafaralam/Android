package com.zafaralam.thenewboston;

import com.zafaralam.thenewboston.controller.CalcLogic;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {

	Button clear, del, nine, eight, seven, six, five, four, three, two, one,
			zero, divide, multiply, sub, add, dot, equals;
	float tvTotal;
	String tvDisplay, previousOp = "=";
	TextView display;
	int startPos, endPos;
	CalcLogic logic = new CalcLogic();
	boolean startNumber = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);
		setValues();

		add.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tvDisplay.length() > 0)
					tvDisplay = tvDisplay + "+";
				display.setText(tvDisplay);
			}
		});

		sub.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				// if (tvDisplay.length() > 0)
				tvDisplay = tvDisplay + "-";
				display.setText(tvDisplay);
			}
		});

		multiply.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tvDisplay.length() > 0)
					tvDisplay = tvDisplay + "x";
				display.setText(tvDisplay);
			}
		});

		divide.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tvDisplay.length() > 0)
					tvDisplay = tvDisplay + "/";
				display.setText(tvDisplay);
			}
		});

		clear.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = "";
				tvTotal = 0;
				startPos = 0;
				endPos = 0;
				previousOp = "=";
				startNumber = true;
				logic.setTotal("0");
				display.setText(tvDisplay);
			}
		});

		one.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "1";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		two.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "2";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		three.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "3";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		four.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "4";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		five.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "5";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		six.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "6";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		seven.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "7";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		eight.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "8";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		nine.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "9";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		zero.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvDisplay = tvDisplay + "0";
				endPos++;
				display.setText(tvDisplay);
			}
		});

		dot.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tvDisplay.length() == 0) {
					tvDisplay = tvDisplay + "0.";
					endPos = endPos + 2;
				} else {
					tvDisplay = tvDisplay + ".";
					endPos++;
				}
				display.setText(tvDisplay);
			}
		});

		del.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tvDisplay.length() > 0) {
					String tmpStr = tvDisplay;
					tvDisplay = "";
					tvDisplay = tmpStr.substring(0, tmpStr.length() - 1);
					endPos--;
				}
				display.setText(tvDisplay);
			}
		});
	}

	protected void setValues() {

		tvTotal = 0;
		startPos = 0;
		endPos = 0;
		display = (TextView) findViewById(R.id.tvCalDisplay);
		tvDisplay = "";
		clear = (Button) findViewById(R.id.bClear);
		del = (Button) findViewById(R.id.bBacksapce);
		nine = (Button) findViewById(R.id.bNine);
		eight = (Button) findViewById(R.id.bEight);
		seven = (Button) findViewById(R.id.bSeven);
		six = (Button) findViewById(R.id.bSix);
		five = (Button) findViewById(R.id.bFive);
		four = (Button) findViewById(R.id.bFour);
		three = (Button) findViewById(R.id.bThree);
		two = (Button) findViewById(R.id.bTwo);
		one = (Button) findViewById(R.id.bOne);
		zero = (Button) findViewById(R.id.bZero);
		divide = (Button) findViewById(R.id.bDivide);
		multiply = (Button) findViewById(R.id.bMultiply);
		sub = (Button) findViewById(R.id.bSubtraction);
		add = (Button) findViewById(R.id.bAddition);
		dot = (Button) findViewById(R.id.bDot);
		equals = (Button) findViewById(R.id.bEquals);

	}

	protected void calculateTotal(char operator) {

	}
}

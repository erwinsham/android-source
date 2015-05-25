package com.bloc.securitypackages;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Color extends Object {
	// Name of the color
	String mName;
	// Alpha value
	int mAlpha;
	// Red value
	int mRed;
	// Green value
	int mGreen;
	// Blue value
	int mBlue;
	// Orange value
	int mOrange;
	// OrangeRed value
	int mOrangeRed;
	// LimeGreen value
	int mLimeGreen;
	

	public Color(int red, int green, int blue, int orange, int orangeRed, int limeGreen) {
		this(null, red, green, blue, orange, orangeRed, limeGreen);
	}

	public Color(String name, int red, int green, int blue, int orange, int orangeRed, int limeGreen) {
		mName = name;
		mRed = red;
		mGreen = green;
		mBlue = blue;
		mOrange = orange;
		mOrangeRed = orangeRed;
		mLimeGreen = limeGreen;
	}
}
package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;
	// amount of meals
	int mMeals;
	//amount of times play
	int mPlay;

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/

	float getHairLength () {
		return mHairLength;
	}
	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/

	void setHairLength (float hairLength) {
		mHairLength = hairLength;	
	}
	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/
	String getGender() {
		return mGender;
	}
	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/
	void setGender (String gender) {
		mGender = gender;
	}
	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/
	String getSize() {
		return mSize;
	}
	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/
	void setSize (String size) {
		mSize = size;
	}
	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/
	int getAge() {
		return mAge;
	}
	
	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/
	void setAge (int age) {
		mAge = age;
	}
	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/
	float getWeight() {
		return mWeight;
	}
	
	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/
	void setWeight (float weight) {
		mWeight = weight;
	}
	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/
	String getColor() {
		return mColor;
	}
	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/
	void setColor (String color) {
		mColor = color;
	}
	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/

	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
	void feed () {
		 
		 //increase mMeals
		
			
			mWeight = mWeight + WEIGHT_GAIN;
				
			if (++mMeals % 3 == 0) {
				if (mSize.equals("tiny")){
					mSize = "small";
				} else if(mSize.equals("small")){
					mSize = "average";		
				} else if(mSize.equals("average")){
					mSize = "large";
				} else if(mSize.equals("large")){
				
				}
			}
		 
		  
	}	
	 
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/
	
	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
	 void play () {
		
		mWeight = mWeight - WEIGHT_LOSS;
				
		if (++mPlay % 6 == 0) {
			if (mSize.equals("large")){
				mSize = "average";
			} else if(mSize.equals("average")){
				mSize = "small";	
			} else if(mSize.equals("small")){
				mSize = "tiny";	
			} else if(mSize.equals("tiny")){
				
			}	
		}
		
		
		
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/

	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/
	void cutHair () {
		//mHairLength - HAIR_CUT_LENGTH;
		if (mHairLength > 0f) {
			mHairLength = mHairLength - HAIR_CUT_LENGTH;
		}
	}
}

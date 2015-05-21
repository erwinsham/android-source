package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;
    
	/*
	 * PopSong
	 *
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and number of weeks on billboard
	 */
	 PopSong() {
		Artist artistOne = new Artist("firstName", "lastName");
		Artist artistTwo = new Artist("firstName", "lastName");
		Artist [] artists = {artistOne, artistTwo};
		this.mEnsemble = new Ensemble ("name", artists);
		this.mTitle = "title";
		this.mYearReleased = 2013;
		this.mWeeksOnBillboard = 36;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first PopSong constructor
	/************************************************/
		
	/*
	 * PopSong
	 * 
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	 PopSong(Ensemble ensemble, String title){
		 this.mYearReleased = 0;
		 this.mEnsemble = ensemble;
		 this.mTitle = "title";
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second PopSong constructor
	/************************************************/
	
	/*
	 * PopSong
	 *
	 * Side-effects: Sets the weeks on billboard to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	 PopSong (Ensemble ensemble, String title, int yearReleased){
		 this.mWeeksOnBillboard = 0;
		 this.mEnsemble = ensemble;
		 this.mTitle = "title";
		 this.mYearReleased = yearReleased;
		 
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third PopSong constructor
	/************************************************/
	
	/*
	 * PopSong
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100 (int)
	 */
	 PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {
        this.mEnsemble = ensemble;
        this.mTitle = "title";
        this.mYearReleased = yearReleased;
		this.mWeeksOnBillboard = weeksOnBillboard;
    }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the fourth PopSong constructor
	/************************************************/
}
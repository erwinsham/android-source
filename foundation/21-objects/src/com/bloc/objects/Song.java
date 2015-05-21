package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Defailt Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	Song() {
		Artist artistOne = new Artist("firstName", "lastName");
		Artist artistTwo = new Artist("firstName", "lastName");
		Artist [] artists = {artistOne, artistTwo};
		this.mEnsemble = new Ensemble("name", artists);
		this.mTitle = "title of the song";
		this.mYearReleased = 2013;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/
	
	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	Song(Ensemble ensemble, String title) {
		this.mYearReleased = 0;
		this.mEnsemble = ensemble;
		this.mTitle = title;
	}
	
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/
	
	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	 Song (Ensemble ensemble, String title, int yearReleased) {
		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mYearReleased = yearReleased;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
}
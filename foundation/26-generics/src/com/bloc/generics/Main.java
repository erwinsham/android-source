package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		ActionFigure actionfigure = new ActionFigure();
		Toy<Thing> toyActionFigure = new Toy<Thing>(actionfigure);
		
		Book book = new Book();
		Toy<Thing> toyBook = new Toy<Thing>(book);
		
		Spoon spoon = new Spoon();
		Toy<Thing> toySpoon = new Toy<Thing>(spoon);
		
		toyBox.addToy(toySpoon); 
		toyBox.addToy(toyActionFigure);
		toyBox.addToy(toyBook);
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}

package br.com.logique.jokenpo.core;

import java.util.Random;

public class Jokenpo {
	public final static int ROCK = 0;
	public final static int PAPER = 1;
	public final static int SCISSORS = 2;
	
	private final Random random = new Random();
	private final int[] totalChoice = new int[3];
	private final int[] choices;
	private final int maxRounds;
	
	public Jokenpo() {
		maxRounds = 100;
		choices = new int[maxRounds];
	}
	
	public Jokenpo(int maxRound) {
		this.maxRounds = maxRound;
		choices = new int[maxRound];
	}
	
	public int[] start() {
		int choice;
		
		for (int i = 0; i < maxRounds; ++i) {
			choice = random.nextInt(3);
			choices[i] = choice;
			++totalChoice[choice];
		}
		
		return choices;
	}
	
	public int getMaxRounds() {
		return maxRounds;
	}
	
	public int[] getChoices() {
		return choices;
	}
	
	public int[] getTotalChoice() {
		return totalChoice;
	}

	public int getTotalRock() {
		return totalChoice[ROCK];
	}
	
	public int getTotalPaper() {
		return totalChoice[PAPER];
	}
	
	public int getTotalScissors() {
		return totalChoice[SCISSORS];
	}
}

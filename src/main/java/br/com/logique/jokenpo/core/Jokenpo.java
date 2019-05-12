package br.com.logique.jokenpo.core;

import java.util.Random;

public class Jokenpo {
	public final static int ROCK = 0;
	public final static int PAPER = 1;
	public final static int SCISSORS = 2;
	
	private final int[] totalChoice = new int[3];
	private final int maxRounds;
	
	public Jokenpo() {
		maxRounds = 100;
	}
	
	public Jokenpo(int maxRound) {
		this.maxRounds = maxRound;
	}
	
	public void start() {
		Random random = new Random();
		int choice;
		
		for (int i = 0; i < maxRounds; ++i) {
			choice = random.nextInt(3);
			++totalChoice[choice];
		}
	}
	
	public int getMaxRounds() {
		return maxRounds;
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

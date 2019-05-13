package br.com.logique.jokenpo;

import br.com.logique.jokenpo.core.Jokenpo;

public class App {
    public static void main(String[] args) {
    	Jokenpo jokenpo = new Jokenpo();
    	jokenpo.play(100);

    	String draw = String.format("Empates: %d.", jokenpo.getTotalPaper());
    	String lose = String.format("Derrotas: %d.", jokenpo.getTotalScissors());
    	String win = String.format("Vitórias: %d.", jokenpo.getTotalRock());
    	
    	System.out.println(draw);
    	System.out.println(lose);
    	System.out.println(win);
    }
}

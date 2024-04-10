package br.com.firstProgramacao.watchOnline.classification;

public class Recommendation {
    private String recommendation;

    public void filter(Classification classification){
        if (classification.getClassification() >= 8) {
            System.out.println("Top 10 of the week!");
        } else if (classification.getClassification() >= 5) {
            System.out.println("Top 50 if the week!");
        } else {
            System.out.println("Add to your list!");
        }
    }
}

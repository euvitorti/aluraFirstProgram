package br.com.firstProgramacao.watchOnline.calculator;

import br.com.firstProgramacao.watchOnline.models.Title;

public class CalculatorTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title time){
        this.totalTime += time.getDuration();
    }
}

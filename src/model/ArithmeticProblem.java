package model;

import util.Util;
import util.Domain;

import java.util.ArrayList;

public class ArithmeticProblem extends Problem {

    public ArithmeticProblem(Domain domain, int t){
        this.operators = implementOperators(t-1);
        this.terms = Util.makeTerms(domain, t);
    }

    public ArrayList<String> implementOperators(int numTerms) {
        ArrayList<String> operators = new ArrayList<String>();
        for(int i=0; i<numTerms; i++) operators.add("+");
        return operators;
    }

    public String toString() {
        return super.toString();
    }
}

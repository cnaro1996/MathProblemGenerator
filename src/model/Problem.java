package model;

import util.Util;

import java.util.ArrayList;

/**
 *
 */
public abstract class Problem{

    //term and operator order are their indices.
    protected ArrayList<Util.Term> terms;
    protected ArrayList<String> operators;

    /**
     * Defines the list of operators the problem includes. The list should be
     * the length of the terms list minus one.
     * @return
     */
    public abstract ArrayList<String> implementOperators(int numTerms);

    public String toString() {
        if(operators == null) return "Uninitialized operators list.";

        String result = "";
        for(int i=0; i<terms.size()-1; i++){
            result += terms.get(i).toString() + " " + operators.get(i).toString() + " ";
        }
        result += terms.get(terms.size()-1).toString();
        return result;
    }


}

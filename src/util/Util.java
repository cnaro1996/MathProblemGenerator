package util;

import java.util.ArrayList;
import java.util.Random;


public class Util {

    /**
     * Makes a list of random terms in the specified domain.
     * @param domain the domain the terms should be from.
     * @param num the number of terms.
     * @return an ArrayList of random terms.
     */
    public static ArrayList<Term> makeTerms(Domain domain, int num) {
        if (num < 2) throw new IllegalArgumentException("Cannot have less than 2 terms in a problem.");

        Random randomGen = new Random();
        ArrayList<Term> terms = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            if (domain == Domain.INTEGERS || domain == Domain.NATURALS) {
                terms.add(new Term(domain, randomGen.nextInt()));
            } else if (domain == Domain.NEGATIVEINTEGERS) {
                terms.add(new Term(domain, -randomGen.nextInt()));
            } else if (domain == Domain.RATIONALS) {
                terms.add(new Term(domain, randomGen.nextFloat()));
            }
        }

        return terms;
    }

    public static class Term<T>{
        T value;
        Domain domain;

        public Term(Domain domain, T value) {
            this.domain = domain;
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }
    }

    /**
     * An object to represent a pattern to order the operators of a problem in.
     */
    public static class Template {
        // Can we throw the operators of the pattern in any order?
        boolean anyOrder;
        // Can we throw the operators of the pattern in any position?
        boolean anyPosition;

    }

}

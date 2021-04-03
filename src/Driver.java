import model.ArithmeticProblem;
import util.Domain;

import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        ArrayList<ArithmeticProblem> problems = new ArrayList<>(10);

        for(int i=0; i<10; i++) {
            problems.add(new ArithmeticProblem(Domain.INTEGERS, i + 2));
        }

        for(int i=0; i<problems.size(); i++){
            System.out.println(problems.get(i).toString() + "\n");
        }

        System.out.println(new ArithmeticProblem(Domain.INTEGERS, 2));
    }
}

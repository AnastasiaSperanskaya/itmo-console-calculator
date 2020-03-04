package calc;

import java.util.ArrayList;
import java.lang.Math;

public class MathFunctions {
    final private String[] advOperatorList = { "sqrt", "sin", "cos"};
    private ArrayList<String> formattedInput;

    public MathFunctions(ArrayList<String> formattedUserInput) {
        this.formattedInput = formattedUserInput;
    }

    public ArrayList<String> evaluateFunctions() {
        double x = 0.0;

        for (String operator : advOperatorList) {
            for (int i = 0; i < formattedInput.size(); i++) {
                if (formattedInput.get(i).equals(operator)) {

                    x = Double.parseDouble(formattedInput.get(i + 2));

                    switch (operator) {
                        case "sqrt":
                            formattedInput.set(i, Math.sqrt(x) + "");
                            break;
                        case "sin":
                            formattedInput.set(i, Math.sin(x) + "");
                            break;
                        case "cos":
                            formattedInput.set(i, Math.cos(x) + "");
                            break;
                    }
                    formattedInput.remove(i + 3);
                    formattedInput.remove(i + 2);
                    formattedInput.remove(i + 1);
                }

            }
        }

        return formattedInput;
    }
}
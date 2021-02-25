package equation;

public class Test {
    public static void main(String args[]) {
        FirstDegree equation = new FirstDegree();
        equation.setA(3.3);
        equation.setB(3.3);
        System.out.println(equation.solve());
    }
}

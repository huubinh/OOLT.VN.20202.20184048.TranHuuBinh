package equation;

public class Test {
    public static void main(String args[]) {
        FirstDegree equation = new FirstDegree();
        equation.setA(0);
        equation.setB(0);
        System.out.println(equation.solve());
        
        SystemFirstDegree equ = new SystemFirstDegree();
        equ.setA11(1);
        equ.setA12(2);
        equ.setB1(4);
        equ.setA21(3);
        equ.setA22(5);
        equ.setB2(11);
        System.out.println(equ.solve());
        
        SecondDegree e = new SecondDegree();
        e.setA(1);
        e.setB(-6);
        e.setC(9);
        System.out.println(e.solve());
    }
}

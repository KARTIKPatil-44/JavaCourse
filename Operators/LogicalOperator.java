package Operators;

public class LogicalOperator {
    public static void main(String [] args){
        System.out.println((3>4) && (5>2)); // false && true => false
        System.out.println((3>4) || (3>2)); // false || true => true
        System.out.println(!(3>4));         // !false => true
    }
}

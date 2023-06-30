package explain;

import com.sun.security.jgss.GSSUtil;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 17:50
 */
public class client {
    public static void main(String[] args) {
        Context context =new Context();

        Variable variable1=new Variable("a");
        Variable variable2=new Variable("b");
        Variable variable3=new Variable("c");
        Variable variable4=new Variable("d");
        Variable variable5=new Variable("e");

        context.assign(variable1,1);
        context.assign(variable2,2);
        context.assign(variable3,3);
        context.assign(variable4,4);
        context.assign(variable5,5);

        AbstractExpression expression =new Minus(variable1,new Plus(new Minus(variable2,variable3),variable4));
        int interpret = expression.interpret(context);
        System.out.println(expression);
        System.out.println(interpret);


    }
}

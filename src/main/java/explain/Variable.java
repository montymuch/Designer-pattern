package explain;

/**
 * @author 27518
 * @version 1.0
 * @description: 变量类
 * @date 2023/6/29 17:40
 */
public class Variable extends  AbstractExpression{
    private  String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}

package explain;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 17:44
 */
public class Plus extends AbstractExpression{
    //+
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }
    public String toString(){
        return "(" +left.toString()+" + " +right.toString()+")";
    }
}

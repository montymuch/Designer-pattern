package explain;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 27518
 * @version 1.0
 * @description: 环境角色类
 * @date 2023/6/29 17:42
 */
public class Context {
    private Map<Variable,Integer> map=new HashMap<>();

    public void assign(Variable var,Integer value){
        map.put(var,value);
    }
    public int getValue(Variable var){
        Integer integer = map.get(var);
        return integer;
    }
}

package memento.white_box;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 16:51
 */
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;
    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
    public int getVit() {
        return vit;
    }
    public void setVit(int vit) {
        this.vit = vit;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {

        this.def = def;
    }
}


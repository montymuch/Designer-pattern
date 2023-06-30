package mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure=new MediatorStructure();
        HouserOwner houserOwner=new HouserOwner("张三",mediatorStructure);
        Tenant tenant=new Tenant("李四",mediatorStructure);

        //中介者
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouserOwner(houserOwner);

        tenant.constract("我要租三居室的房子");
        houserOwner.constract("我有你要租吗？");
    }
}

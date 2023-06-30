package mediator;

public class MediatorStructure extends Mediator{
    //聚合房屋拥有者和租房对象
    private HouserOwner houserOwner;
    private Tenant tenant;

    public HouserOwner getHouserOwner() {
        return houserOwner;
    }

    public void setHouserOwner(HouserOwner houserOwner) {
        this.houserOwner = houserOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if(person==houserOwner){
            tenant.getMessage(message);
        }else {
            houserOwner.getMessage(message);
        }
    }
}

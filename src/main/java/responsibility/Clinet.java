package responsibility;

public class Clinet {
    public static void main(String[] args) {
        LeaveRequest leaveRequest =new LeaveRequest("张三",3,"身体不适");
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();
        //设置处理链
      groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}

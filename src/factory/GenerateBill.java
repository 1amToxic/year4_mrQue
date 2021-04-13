package factory;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Plan p = getPlanFactory.getPlan(GetPlanFactory.PlanType.COMMERCIALPLAN);
        p.getRate();
        p.caculateBill(5);
    }
}

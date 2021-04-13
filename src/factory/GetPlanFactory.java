package factory;

public class GetPlanFactory {
    public Plan getPlan(PlanType planType){
        if(planType == null){
            return  null;
        }
        if(planType == PlanType.COMMERCIALPLAN){
            return new CommercialPlan();
        }
        if(planType == PlanType.DOMESTICPLAN){
            return new DomesticPlan();
        }
        return null;
    }
    public enum PlanType {
        DOMESTICPLAN("DOMESTICPLAN"),
        COMMERCIALPLAN("COMMERCIALPLAN");

        public final String label;

        private PlanType(String label) {
            this.label = label;
        }

    }
}

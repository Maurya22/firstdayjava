package abc.salary;

@Deprecated // means after some time or futher updation this class is deleted.
public class SalaryCalculator {
    public static double calculate(SalariedIndividual s1){
        int noOfDaysWork = s1.getDaysWorkedInMonth();
        int costPerDay =s1.getCommercialPerDays();
        int totalCost = noOfDaysWork*costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 *totalCostAfterPt;
        return totalCostAfterPt-tds;
    }

}

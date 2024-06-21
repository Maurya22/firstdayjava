package abc.salary;

public interface SalariedIndividual {
    int getDaysWorkedInMonth() ;


    int getCommercialPerDays() ;

//    non - abstract method also called as default method

    default double calculate(){
        int noOfDaysWork = this.getDaysWorkedInMonth();
        int costPerDay =this.getCommercialPerDays();
        int totalCost = noOfDaysWork*costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 *totalCostAfterPt;
        return totalCostAfterPt-tds;
    }

}

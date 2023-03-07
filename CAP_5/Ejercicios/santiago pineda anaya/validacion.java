package cap_5;
public class validacion {
    public void policyInNoFaultState(AutoPolicy policy)
   {
    if (policy.getState()=="CT"|| policy.getState() == "MA"|| policy.getState()=="ME"||policy.getState()=="NH"|| policy.getState()=="NJ"|| policy.getState()=="NY"|| policy.getState()=="PA"|| policy.getState()=="VT") {
       
      System.out.println("The auto policy:");
      System.out.printf("Account:"+ policy.getAccountNumber()+"%d; Car: %s; State %s %s a no-fault state%n%n",policy.getAccountNumber(), policy.getMakeAndModel(),policy.getState(),
      (policy.isNoFaultState() ? "is": "is not"));   

    } else {
    }
   }
}

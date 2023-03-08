package CAP_5.Ejercicios.Santiago_Pineda._530;


public class AutoPolicyTest
{
public static void main(String[] args)
{
// create two AutoPolicy objects
AutoPolicy policy1 = new AutoPolicy(0, null, null);
validacion validado=new validacion();
salida salid =new salida();

salid.mostrar2();
policy1.setState("CT");
policy1.setMakeAndModel("i");
policy1.setAccountNumber(8);

validado.policyInNoFaultState(policy1);
 } 
} 

  
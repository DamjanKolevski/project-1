package project_1;
import java.util.Scanner;
public class Skalazaocenuvanje {
public static void main(String[] args) {
double max=0, bodovi=0, procent=0;
Scanner tastatura = new Scanner (System.in);
System.out.println("Vnesi go maksimalniot broj na bodovi na testot");
max = tastatura.nextDouble();
System.out.println("Vneseto go maksimalniot broj koj go osvoil studentot");
bodovi = tastatura.nextDouble();
procent = bodovi/max*100;
if (bodovi>max) {
	System.out.println("Studentot gi nadminal standardite, no za zal tolku poeni nemoze da se dobie");
	System.exit(0);
}
procent=bodovi/max*100;
if (procent<51) {
	System.out.println("studentot padnal");
}
else if(procent<=60 && procent>=51) {
	System.out.println("studentot dobil 6");
}
else if(procent<=70 && procent>=61) {
	System.out.println("studentot dobil 7");
}
else if(procent<=80 && procent>=71) {
	System.out.println("studentot dobil 8");
}
else if(procent<=90 && procent>=81) {
	System.out.println("studentot dobil 9");
}
else if(procent<=100 && procent>=91) {
	System.out.println("studentot dobil 10");
  }

}
	
}


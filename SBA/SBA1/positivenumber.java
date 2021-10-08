import java.util.*;
public class positivenumber {
static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		int []a=new int [100];
		int sum=0;
		// TODO Auto-generated method stub
		System.out.println("Enter values");
	for(int i=0;i<10;i++) {
		a[i]=ui.nextInt();
		if(a[i]>0) {
			sum+=a[i];
		}
	}
	System.out.println(sum);
	ui.close();
	}

}


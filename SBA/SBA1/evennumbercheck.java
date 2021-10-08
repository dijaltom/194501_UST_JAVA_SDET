
public class evennumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=1;
		for(int i=1;i<50;i++) {
			if(count>10) {
				continue;
			}
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
				count++;
			}
		}
	}

}

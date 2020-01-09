import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row =1;
		int val;
		while(row<=n) {
			val =1;
			
			for(int csp= 1;csp<=nsp;csp++) {
				System.out.print("\t");
			}
			for(int cst = 1;cst<=nst;cst++) {
				System.out.print(val+"\t");
				if(cst<=nst/2)
					val++;
				else
					val--;
			}
			System.out.println();
			nsp = nsp-1;
			nst= nst+2;
			row = row+1;
			
		}

	}

}

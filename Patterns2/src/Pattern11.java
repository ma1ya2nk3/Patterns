import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row =1;
		int val=1;
		while(row<=n) {
			val = row;
			for(int csp= 1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst = 1;cst<=nst;cst++) {
				System.out.print(val);
			}
			System.out.println();
			nsp = nsp-1;
			nst= nst+2;
			row = row+1;
			
		}

	}

}

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = 1;
		int nst = n/2;
		int row = 1;
		while(row<=n) {
			for(int cst = 1;cst<=nst;cst++) {
				System.out.print("*");
			}
			for(int csp =1;csp<=nsp;csp++ ) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			System.out.println();
			if(row<=n/2) {
				nsp = nsp+2;
				nst = nst-1;
			}else {
				nsp = nsp-2;
				nst = nst+1;
			}
			row = row+1;
		}
		

	}

}

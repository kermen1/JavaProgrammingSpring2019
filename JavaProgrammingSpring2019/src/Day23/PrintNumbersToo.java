package Day23;

public class PrintNumbersToo {

	public static void main(String[] args) {
		int num = 50;
		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				continue;
			}
			if (i % 20 == 0) {
				break;
			}
			System.out.print(i+", ");
		}

	}


	}



/*interview question wite the code to print */
class Pattrens {
	public int Exmethod() {
		int y;
		return y = 7;
	}

	public static void main(String[] args) {
		int x = 5;
		for (int i = 1; i <= x; i++) {// rows outer loop
			for (int j = 1; j <= i; j++) {// a ascii value 97 + i vale -1
				System.out.print((char) ('a' + i - 1) + " ");
			}
			System.out.println();
		}
		// 1 half pyramid
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2 inverted half pyramid
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		// 3 hollow rectangle
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				if (i == 1 || j == 1 || i == x || j == x) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// 4 inverted pyramid
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 5 "right-aligned inverted triangle
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= x - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 123 pyramid x=5
		int number = 1;
		for (int i = 1; i < x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}
}
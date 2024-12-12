class stars {
	public static void main (String[] args) {
		int allRows = Integer.parseInt(args[0]);
		int row, numOfStarts;

		for (row=1; row<=allRows; row++){
			for (numOfStarts=1; numOfStarts<=row; numOfStarts++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

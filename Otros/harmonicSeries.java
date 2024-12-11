class harmonicSeries {
	public static void main (String[] args) {
		int limit = Integer.parseInt(args[0]);
		double result = 0.0;

		while (limit > 0) {
			result = result + (double) 1/limit;
			limit--;
		}
		System.out.println("Harmonic Series result: "+result);
	}
}

package hw5Q2JavaConditionalStatement;

public class CompareAge {

	public static void main(String[] args) {
		int ageOfAlex = 21;
		int ageOfJenifer = 21;
		if (ageOfAlex % 2 == 0 && (ageOfAlex < ageOfJenifer)) {
			System.out.println("Alex is " + ageOfAlex + ", which is an even number and he is younger then Jenifer,"
					+ ageOfJenifer + ",the age of Jenifer.");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex > ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an even number and he is younger then Jenifer,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex < ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an odd number and he is yonger then Jenifer,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex > ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an odd number and he is older then Jenifer,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex != ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an even number and they are not same age,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an even number and they are the same age,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex != ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an odd number and they are not the same age,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 1 && !(ageOfAlex == ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an odd number and they are not the same age,"
					+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer) || (ageOfAlex > ageOfJenifer)) {
			System.out.println(
					"Alex is" + ageOfAlex + ", which is an even number and they are the same age or (Alex may be older)"
							+ ageOfJenifer + "the age of Jenifer");
		} else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer) || (ageOfAlex < ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex
					+ ", which is an even number and they are the same age or (Alex may be younger)" + ageOfJenifer
					+ "the age of Jenifer");
		} else if (ageOfAlex % 2 == 1 && (ageOfAlex == ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ", which is an odd number and they are the same age "
					+ ageOfJenifer + " the age of Jenifer");
		}
	}
}

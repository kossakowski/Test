
public class ExceptionTraining {

	public static void main(String[] args) {
		int[] arr = new int[9];
        try {
            System.out.println(arr[10]);
        } catch (Exception ex) {
            System.out.println("Problem with code detected");
        }

	}

}

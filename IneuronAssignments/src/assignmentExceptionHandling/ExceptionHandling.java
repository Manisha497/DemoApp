package assignmentExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int x1 =100/0;
			System.out.println(x1);
			try {

			} catch (ArithmeticException e) {

			} finally {

			}
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			try {

			} catch (ArithmeticException ae) {

			} finally {

			}
		}

		finally {
			try {

			} catch (ArithmeticException e) {
				

			} finally {
				
			}
		}

	}

}

import java.io.*;

class ArrayDemo{

	public static void main(String[] args) throws IOException{

		float arr[] = new float[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Accepting the input from users
		System.out.println("\nEnter the values to be inserted in an array:\n");

		arr[0] = Float.parseFloat(br.readLine());
		arr[1] = Float.parseFloat(br.readLine());
		arr[2] = Float.parseFloat(br.readLine());


		//Printing the values of Array
		System.out.println("\nPrinting the values of Array");

		for(int i = 0; i < 3; i++){
			System.out.println(arr[i]);
		}

	}


}

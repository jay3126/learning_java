/**
 * 
 */
package test;

import java.util.Arrays;

/**
 * @author janmejay.rai
 *
 */
public class ArrayDemo {

	/**
	 * 
	 */
	public ArrayDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] myList = {1.24, 43.545, 54.32432, 65.76576, 545984.434, 09043.545, 5454.2323, 434.545, 54354.545};

		// displaying the elements of the array
		for(int i = 0; i < myList.length; i++){
			System.out.println(myList[i]);
		}

		// summing all the elements of the array
		double total = 0;
		for(int j = 0; j < myList.length; j++){
			total += myList[j];
		}
		System.out.println("\nTotal of array is: " + total);

		// finding max element in the array.
		double max = myList[0];
		for(int k = 0; k < myList.length; k++){
			if(myList[k] > max){
				max = myList[k];
			}
		}
		System.out.println("\nMax value is: " + max);

		ArrayDemo arry = new ArrayDemo();
		System.out.println("\n<-------------- Passing arguments as arrays ----------------->");
		arry.printArr(new double[]{323.434, 646565.676767, 34324.54564, 56565.4645, 2424.356456, 47567.456757});

		System.out.println("\n<----------------- Reverse of array ------------------------->");
		double[] abc = arry.revArr(new double[]{54.55454, 7676.345434, 7676.243324, 0, 432, 0.43243, 54654.544});
		arry.printArr(abc);

		System.out.println("\n<------------------------- Sorting of Array ---------------------------->");
		Arrays.sort(abc);
		arry.printArr(abc);
	}

	public double[] printArr(double[] arr){
		for(double element: arr){
			System.out.println(element);
		}
		return arr;
	}

	public double[] revArr(double[] arr1){
		double[] revArray = new double[arr1.length];
		int j = 0;
		for(int l = arr1.length -1; l >= 0; l--){
			revArray[j] = arr1[l];
			j++;
		}
		return revArray;
	}
}

package dataStructure;

public class ArraysDemo {
	
	//find the maximum of the array values
	
	int maxInArray(int[] x){
		int max = x[0];
		for(int i=0; i<x.length; i++){
			if(x[i] > max){
				max = x[i];
			}
		}
		return max;
	}
	
	//========================================/
	// compute the average of the array values
	
	int averageOfArrayValues(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		return sum/a.length;
	}
	
	//========================================/
	// copy to another array
	int[] copyToAnotherArray(int[] a){
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
	
	//========================================/
	// reverse the elements within an array
	void reverseElements(int[] a){
		int n = a.length;
		for(int i= 0; i<n/2; i++){
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
			
		}
	}
	
	//matrix-matrix multiplication (squarematrices)
	
	double[][] matrixMultiply(double[][] a, double[][] b){
		double[][] result = new double[a.length][b.length];
		for(int i = 0; i<a.length; i++)
			for(int j = 0; j < b.length; j++){
				for(int k=0; k<a.length;k++){
					result[i][j] += a[i][k] * b[k][j];
				}
				
			}
		
		return result;
	}

}

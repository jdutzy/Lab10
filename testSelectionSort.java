import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {
	}
	
	@Test
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/
		SelectionSort sorter = new SelectionSort();
       arr = sorter.basicSelectionSort(arr);
       for (int i = 0; i < arr.length; ++i)
       {
               assertEquals("Error in positive at position " + i, Sortedarr[i], arr[i]);
      
       }
	}
	
	@Test
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		/** Test data contains negative values only **/
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		 for (int i = 0; i < arr.length; ++i)
	        {
	                assertEquals("Error in negative at position " + i, Sortedarr[i], arr[i]);
	       
	        }
	}
	
	@Test
	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = 0;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -8;
		Sortedarr[2] = -7;
		Sortedarr[3] = 0;
		Sortedarr[4] = 9;
		/** Test data contains with both positive, negative and zeros **/
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		 for (int i = 0; i < arr.length; ++i)
	        {
	                assertEquals("Error in mixed at position " + i, Sortedarr[i], arr[i]);
	       
	        }
	}
	
	@Test
	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 8;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 7;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 8;
		Sortedarr[4] = 10;
		/** Test data contains duplicates **/
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		 for (int i = 0; i < arr.length; ++i)
	        {
	                assertEquals("Error in duplicates at position " + i, Sortedarr[i], arr[i]);
	       
	        }
	}
	}
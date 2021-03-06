/**
 * Remove Element
 * 
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * http://leetcode.com/questions/208/remove-element
 */
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A.length == 0) {
			return 0;
		}
		int newSize = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem) {
				A[newSize] = A[i];
				newSize++;
			}
		}
		return newSize;
	}
}

package binary;

public class AddBinary {
	/**
	 * Low
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
        if (a == null || b == null)
            return "";
        else if (a == "") 
        	return b;
        else if (b == "")
        	return a;
        char arrA[] = a.length() >= b.length() ? a.toCharArray() : b.toCharArray();
        char arrB[] = a.length() < b.length() ? a.toCharArray() : b.toCharArray();
        int i = arrB.length - 1;
        int p = arrA.length - 1;
        boolean upgrade = false;
        while (i >= 0) {
        	if (arrA[p] == '0') {
        		if (upgrade && arrB[i] == '1') {
        			arrA[p] = '0';
        		} else if (upgrade || arrB[i] == '1') {
        			arrA[p] = '1';
        			upgrade = false;
        		} 
        	} else {
        		if (upgrade && arrB[i] == '1') {
        			arrA[p] = '1';
        		} else if (upgrade || arrB[i] == '1') {
        			arrA[p] = '0';
        			upgrade = true;
        		} 
        	}
        	i--;
        	p--;
        }
        
        while (p >= 0) {
        	if (upgrade) {
        		if (arrA[p] == '1') {
        			arrA[p] = '0';
        		} else {
        			arrA[p] = '1';
        			upgrade = false;
        			break;
        		}
        	}
            p--;
            
        }
        return upgrade ? 1 + new String(arrA) : new String(arrA);
        
    }
	
	public static void main(String argv[]) {
		System.out.println(new AddBinary().addBinary("11", "1"));
	}
}
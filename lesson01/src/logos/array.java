package logos;

public class array {
	public static void main(String[] args) {
		
		
	    int[] intArray = {1,3,10,5,4,7,6,8,9,11};

        int num = intArray[0];

        for (int j : intArray) {
            if (j > num)
                num = j;
        }

        System.out.println(num);
        
        for (int j : intArray) {
            if (j < num)
            	num = j;
        }
        System.out.println(num);
	}

}

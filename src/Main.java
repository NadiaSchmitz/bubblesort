
public class Main {

	public static void main(String[] args) {

		int i;
		int[] my_array = {1,0,256,3,40,-9,2,22,222,4,91,-91,10,122,6};
		
		System.out.println("Array: ");
		for (i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + "  ");
		}
		
		bubblesort(my_array);
		
		System.out.println();
		System.out.println();
		System.out.println("Sortierung mit Bubblesort: ");
		for (i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + "  ");
		}

	}
	
	public static void bubblesort(int[] my_array) {
		int i = 0, j, check;
		boolean sort = false;
		
		while (!sort) {
			sort = true;
			for (j = 0; j < my_array.length - 1; j++) {
				
				if (my_array[j] > my_array[j + 1]) {
					sort = false;
					check = my_array[j];
					my_array[j] = my_array[j+1];
					my_array[j + 1] = check;
				}
			}
			
			i++;
		}
	}

}

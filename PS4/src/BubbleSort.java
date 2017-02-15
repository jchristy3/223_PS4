
public class BubbleSort {
	
	public static void sort(int[] a){
		int last = a.length - 1;		//last is set to end position
		int temp;
		for(int i = 0; i < last; i++){	//from 0 to last
			if(a[i] > a[i+1]){ 			//if(left > right)	
				temp = a[i];
				a[i] = a[i+1];			//exchange
				a[i++] = temp;
			}
			else i++;
			
			if(i == last){				//decrement last to new value
				last = i - 1;
				i = 0;
			}
		}
	}
}

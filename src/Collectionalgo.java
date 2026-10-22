 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectionalgo 
{
	public static void main(String[] args) 
	{
        List<Integer> list = Arrays.asList(5, 2, 8, 1);
        Collections.sort(list);
        System.out.println(list); // [1, 2, 5, 8]
     
        //binarySearch(List<T>, key)
        List<Integer> list1 = Arrays.asList(1, 2, 5, 8);
        int index = Collections.binarySearch(list1, 5);
        System.out.println(index); // 2
        
        //reverse(List<T>)
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        Collections.reverse(list2);
        System.out.println(list2);
        
        //shuffle(List<T>)
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4);
        Collections.shuffle(list3);
        System.out.println(list3);
        
        //swap(List<T>, i, j)
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.swap(list4, 0, 2);
        System.out.println(list4);
        
        //fill(List<T>, value)
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.fill(list5, 0);
        System.out.println(list5);
        
        //copy(List<T> dest, List<T> src)
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0));

        Collections.copy(dest, src);
        System.out.println(dest);
	
	
	
	
	
	}
}
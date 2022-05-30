package fa.training.sortingdemo.test;

import fa.training.sortingdemo.ArrayListSortingExample;
import fa.training.sortingdemo.ArraySortingExample;
import fa.training.sortingdemo.SortingComparableExample;
import fa.training.sortingdemo.SortingComparatorExample;

public class TestSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySortingExample arraySorting = new ArraySortingExample();
		arraySorting.sortArray();
		
		ArrayListSortingExample arrayListSorting = new ArrayListSortingExample();
		arrayListSorting.sortArrayList();
		
		SortingComparableExample sortComparable = new SortingComparableExample();
		sortComparable.sortElementWithComparable();
		
		SortingComparatorExample sortingComparator = new SortingComparatorExample();
		sortingComparator.sortElementComparator();
		

	}

}

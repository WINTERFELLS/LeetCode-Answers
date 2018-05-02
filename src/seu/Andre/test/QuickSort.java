package seu.Andre.test;

public class QuickSort {

	private void quicksort(int[] nums){
		qsort(nums, 0, nums.length-1);
	}

	private void qsort(int[] nums, int low, int high) {

		int privot;
		if(low < high){
			privot = partition(nums, low, high);
			qsort(nums, low, privot-1);
			qsort(nums, privot+1, high);
		}
	}

	private int partition(int[] nums, int low, int high) {
		int privotkey = nums[low];
		while(low < high){
			while(low < high && nums[high] > privotkey){
				high--;
			}
			swap(nums, low, high);
			while(low < high && nums[low] < privotkey){
				low++;
			}
			swap(nums, low, high);
		}
		return low;
	}

	private void swap(int[] nums, int low, int high) {

		int temp = nums[low];
		nums[low] = nums[high];
		nums[high] = temp;
	}
}

class InsertSort{
	public void insertSort(int[] nums){
		int j = 0;
		int temp = 0;
		for(int i = 0; i < nums.length; i++){
			temp = nums[i];
			for(j = i; j > 0 && temp < nums[j-1]; j--){
				nums[j] = nums[j-1];
			}
			nums[j] = temp;
		}
	}
}

class SelectSort{
	public void selectSort(int[] nums){
		for(int i = 0; i < nums.length; i++){
			int temp = nums[i];
			for(int j = i; j < nums.length; j++){
				if(nums[temp] > nums[j]){
					temp = j;
				}
			}
			int t = nums[temp];
			nums[temp] = nums[i];
			nums[i] = t;
		}
	}
}


class BubbleSort{
	public void bubbleSort(int[] nums){
		for(int i = 0; i < nums.length; i++){
			for(int j = i; j < nums.length; j++){
				if(nums[i] >= nums[j]){
					int t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		}
	}
}

class MergeSort{

	public void mergeSort(int[] nums){
		mSort(nums, 0, nums.length);
	}

	private void mSort(int[] nums, int low, int high) {

		int middle = (low+high)/2;
		if(low < high){
			mSort(nums, low, middle);
			mSort(nums, middle+1, high);
			merge(nums, low, middle, high);
		}
	}

	private void merge(int[] nums, int low, int middle, int high) {
		int temp[] = new int[high-low+1];
		int i = low;
		int j = middle+1;
		int k = 0;
		while(i <= middle && j <= high){
			if(nums[i] < nums[j]){
				temp[k] = nums[i];
				k++;
				i++;
			}else{
				temp[k] = nums[j];
				k++;
				j++;
			}
		}
		while(i <= middle){
			temp[k] = nums[i];
			k++;
			i++;
		}
		while(j <= high){
			temp[k] = nums[j];
			k++;
			j++;
		}
		for(int k2 = 0; k2 <temp.length; k2++){
			nums[k2+low] = temp[k2];
		}
	}
}
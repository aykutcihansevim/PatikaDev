## Merge Sort Project
<details><summary>Turkish</summary>
  <p>
  <h1>Merge Sort Nedir? </h1>
    Merge sort’un özelliği problemi parçalara bölmesidir ve problem parçalara bölündüğünde zaman karmaşıklığı logaritmik zamana iner. Bu da exponiensel olanlara göre çok daha iyi sonuç vermesi anlamına gelmektedir. 
    Merge sort’ta ana mantık parçala ve fethet’dir. Parçala ve fethet’in mantığı ;
    1. Problem küçük parçalara bölünür.
    2. Daha küçük parçalara bölünen problemler çözülür.
    3. Çözülmüş küçük parçalar tekrar birleştirilir.

  `Average case`; aradığımız sayının ortada olmasıdır.   
  `Worst case`; aradığımız sayının sonda olmasıdır.   
  `Best case`; aradığımız sayının dizinin en başında olmasıdır. 

- Average case: `O(nlogn)`

- Worst case: `O(nlogn)`

- Best case: `O(nlogn)` 
  

Kaynak : [Link](https://www.javatpoint.com/merge-sort)

# Örnek
Elimizde [18,26,32,6,43,15,9,1] şeklinde bir dizi olduğunu varsayalım.
1. Merge sort divide and conquer mantığına dayanarak bu diziyi en ufak parçaya ulaşıncaya kadar böler. Yani 8 elemanlık dizi 4-4 daha sonra 2-2-2-2 ve son olarak da 1-1-1-1-1-1-1-1 şeklinde en ufak parçaya bölünür.
2. Böldüğü en ufak parçaları tekrar eski haline birleştirir ancak bu sefer sıralayarak birleştirir. Örneğin elimizde 9 ve 1 var bunları tekrar birleştirirken 1 9 diye sıralayarak birleştirir. Ve ilk birleştirmede elimizde  kendi içinde sıralı 2şer elemanlı 4 grup olmuş olur. 2. Birleştirmede kendi içinde sıralı 4er elemanlı 2 grup ve son birleştirmede de sıralı 8 elemanlı diziyi elde etmiş oluruz.
3. Merge sort türüne göre aşamalar aşağıdaki gibi olacaktır.

```
- Step 1 -              [18,26,32,6]     [43,15,9,1]     
- Step 2 -       [18,26]      [32,6]     [43,15]    [9,1]        
- Step 3 -   [18]   [26]   [32]   [6]   [43]   [15]   [9]   [1]   
- Step 4 -       [18,26]      [6,32]     [15,43]    [1,9] 
- Step 5 -              [6,18,26,32]     [1,9,15,43]  
- Step 6 -                 [1,6,9,15,18,26,32,43]

```

### Java Kod Örneği
```Java
/* Java program for Merge Sort */
public class MergeSort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
```

### Çıktı
    Given Array
    12 11 13 5 6 7 

    Sorted array
    5 6 7 11 12 13  

 
  </p>

# Görevler
## [16, 21, 11, 8, 12, 22]  

### 1 - Yukarı verilen dizinin Merge Sort türüne göre aşamalarını yazınız. 

```
[16,21,11,8,12,22] -> Merge Sort

- Step 1 -              [16,21,11]     [8,12,22]     
- Step 2 -          [16]   [21,11]     [8]      [12,22]       
- Step 3 -  [16]    [21]      [11]     [8]      [12]    [22]   
- Step 4 -          [16]   [11,21]     [8]      [12,22] 
- Step 5 -              [11,16,21]     [8,12,22]  
- Step 6 -                 [8,11,12,16,21,22]

```

### 2 - Big-O gösterimini yazınız.

- Big-O Notation : `O(nlogn)`
- Time Complexity : `nlogn`



</details>




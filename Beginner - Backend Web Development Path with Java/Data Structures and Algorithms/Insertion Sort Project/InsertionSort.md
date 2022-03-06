## Insertion Sort Project
<details><summary>Turkish</summary>
  <p>
  <h1>Insertion Sort Nedir? </h1>
  Ekleme Sıralaması(Insertion Sort) algoritmasında, problemimiz verilen sırasız bir diziyi sıralamak üzerine kuruludur. 

  Algoritma her seferinde dizinin üzerinde ileri doğru ilerleyerek, dizinin bir elemanını alıp geriye doğru elemanlar ile bir bir sıralar ve her bir sıralamasında, eğer sıraladığı elemandan daha küçükse o elemanla yer değiştirerek bir geriye atar. 

  `Average case`; aradığımız sayının ortada olmasıdır.   
  `Worst case`; aradığımız sayının sonda olmasıdır.   
  `Best case`; aradığımız sayının dizinin en başında olmasıdır.  
  
   Olası konumları tek bir konumla daraltana kadar, öğeyi içerebilecek listenin yarısını tekrar tekrar bölerek çalışır.

  - Average case: `O(n^2)`

  - Worst case: `O(n^2)`

  - Best case: `O(n)`

Kaynak : [Link](http://cagataykiziltan.net/algoritmalar/1-siralama-algoritmalari/1-araya-sokma-siralamasi/)

### Java Kod Örneği
```Java
public class Insertion {
    public static void main(String [] args)
    {
        int[] arr = {31,1,56,33,777,123,25,15,17,20,11,10,1,23,3};
        Insertion dz = new Insertion();
        dz.insertionSort(arr);
        dz.print(arr);
    }

    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int deger = arr[i];
            int j = i-1;
    
            while (j>=0 && arr[j] > deger)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = deger;
        }
    }
            
    private void print(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i != temp)
            {
                System.out.print(arr[i] + " ");
                temp = i;
            }
        }
    }
}

```

### Çıktı
    1 3 10 11 15 17 20 23 25 31 33 56 123 777 

  <h1>Selection Sort Nedir? </h1>
  Seçim Sıralaması(Selection Sort), algoritması çalışma mantığı olarak dizideki en küçük elemanı bulup, en küçük sayıyla baştaki sayıyı yer değiştirir.  

  Daha sonra tekrar en küçük sayıyı arar ancak bu sefer en başa attığı sayıya bakmaz, ikinci elemandan itibaren aramaya başlar. Bu şekilde diziyi sıralı hale getirir.   
  
  - Worst case: `O(n^2)`

  - Best case: `O(n^2)`

Kaynak : [Link](http://cagataykiziltan.net/algoritmalar/1-siralama-algoritmalari/2-secmeli-siralama/)

### Java Kod Örneği
```Java
public class Selection {
    public static void main(String [] args)
    {
        int[] arr = {31,1,56,33,777,123,25,15,17,20,11,10,1,23,3};
        Selection dz = new Selection();
        dz.selectionSort(arr);
        dz.print(arr);
    }

    void selectionSort(int arr[])
    {
        for (int i = 0; i<arr.length-1;i++) 
        {
            int index = i;

            //kalan alt dizideki daha küçük sayıyı bul.
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[j]<arr[index])
                {
                index = j;
                }
            }

        //kalan alt dizideki en küçük sayıyı değiştir.
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
        }
    }
            
    private void print(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i != temp)
            {
                System.out.print(arr[i] + " ");
                temp = i;
            }
        }
    }
}

```

### Çıktı
    1 3 10 11 15 17 20 23 25 31 33 56 123 777 

  </p>

# Görevler
## [22, 27, 16, 2, 18, 6]  

### 1 - Yukarı verilen dizinin Insertion Sort türüne göre aşamalarını yazınız. 

  `[22,27,16,2,18,6]` -> Insertion Sort

  - `Step 1 - [22,27,16,2,18,6]` Değişim olmaz    22 < 27
  - `Step 2 - [16,22,27,2,18,6]` Değişim olur     16 < 22 < 27
  - `Step 3 - [2,16,22,27,18,6]` Değişim olur     2  < 16 < 22 < 27
  - `Step 4 - [2,16,18,22,27,6]` Değişim olur     2  < 16 < 18 < 22 < 27
  - `Step 5 - [2,6,16,18,22,27]` Değişim olur     2  < 6  < 16 < 18 < 22 < 27

  `[22,27,16,2,18,6]` -> Selection Sort

  - `Step 1 - [2,27,16,22,18,6]` Değişim olur     
  - `Step 2 - [2,6,16,22,18,27]` Değişim olur     
  - `Step 3 - [2,6,16,18,22,27]` Değişim olur 

### 2 - Big-O gösterimini yazınız.
 - Big-O Notation : `O(n^2)`  

 - Time Complexity : `(n^2+n)/2`  

 - Average case: `O(n^2)`  

 - Worst case: `O(n^2)`  

 - Best case: `O(n)`  


### 3 - Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
  `Average case`

### 4 - `[7,3,5,8,2,9,4,15,6]` dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

  `[7,3,5,8,2,9,4,15,6]` -> Insertion Sort
  - `Step 1 - [3,7,5,8,2,9,4,15,6]` Değişim olur  3 < 7
  - `Step 2 - [3,5,7,8,2,9,4,15,6]` Değişim olur  3 < 5 < 7
  - `Step 3 - [3,5,7,8,2,9,4,15,6]` Değişim olmaz 3 < 5 < 7 < 8
  - `Step 4 - [2,3,5,7,8,9,4,15,6]` Değişim olur  2 < 3 < 5 < 7 < 8

  `[7,3,5,8,2,9,4,15,6]` -> Selection Sort

  - `Step 1 - [2,3,5,8,7,9,4,15,6]` Değişim olur  
  - `Step 2 - [2,3,4,8,7,9,5,15,6]` Değişim olur  
  - `Step 3 - [2,3,4,5,7,9,8,15,6]` Değişim olur  
  - `Step 4 - [2,3,4,5,6,9,8,15,7]` Değişim olur 
</details>
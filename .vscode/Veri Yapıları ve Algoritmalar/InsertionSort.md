## Insertion Sort Project
Insertion Sort algoritmasında, problemimiz verilen sırasız bir diziyi sıralamak üzerine kuruludur. Algoritma her seferinde dizinin üzerinde ileri doğru ilerleyerek, dizinin bir elemanını alıp geriye doğru elemanlar ile bir bir sıralar ve her bir sıralamasında, eğer sıraladığı elemandan daha küçükse o elemanla yer değiştirerek bir geriye atar. 
`Average case`; aradığımız sayının ortada olmasıdır. `Worst case`; aradığımız sayının sonda olmasıdır. `Best case`; aradığımız sayının dizinin en başında olmasıdır.

## Tasks
[22,27,16,2,18,6]

# 1 - Yukarı verilen dizinin sort türüne göre aşamalarını yazınız. "Insertion Sort"

[22,27,16,2,18,6] -> Insertion Sort

- `Step 1 - [22,27,16,2,18,6]` Değişim olmaz    22 < 27
- `Step 2 - [16,22,27,2,18,6]` Değişim olur     16 < 22 < 27
- `Step 3 - [2,16,22,27,18,6]` Değişim olur     2  < 16 < 22 < 27
- `Step 4 - [2,16,18,22,27,6]` Değişim olur     2  < 16 < 18 < 22 < 27
- `Step 5 - [2,6,16,18,22,27]` Değişim olur     2  < 6  < 16 < 18 < 22 < 27

[22,27,16,2,18,6] -> Selection Sort

- `Step 1 - [2,27,16,22,18,6]` Değişim olur     
- `Step 2 - [2,6,16,22,18,27]` Değişim olur     
- `Step 3 - [2,6,16,18,22,27]` Değişim olur 


# 2 - Big-O gösterimini yazınız.
- Big-O Notation : `O(n^2)`

- Time Complexity : `(n^2+n)/2`

- Average case: `O(n^2)`

- Worst case: `O(n^2)`

- Best case: `O(n)`

# 3 - Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
`Average case`

# 4 - [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
[7,3,5,8,2,9,4,15,6] -> Insertion Sort

- `Step 1 - [3,7,5,8,2,9,4,15,6]` Değişim olur  3 < 7
- `Step 2 - [3,5,7,8,2,9,4,15,6]` Değişim olur  3 < 5 < 7
- `Step 3 - [3,5,7,8,2,9,4,15,6]` Değişim olmaz 3 < 5 < 7 < 8
- `Step 4 - [2,3,5,7,8,9,4,15,6]` Değişim olur  2 < 3 < 5 < 7 < 8

[7,3,5,8,2,9,4,15,6] -> Selection Sort

- `Step 1 - [2,3,5,8,7,9,4,15,6]` Değişim olur  
- `Step 2 - [2,3,4,8,7,9,5,15,6]` Değişim olur  
- `Step 3 - [2,3,4,5,7,9,8,15,6]` Değişim olur  
- `Step 4 - [2,3,4,5,6,9,8,15,7]` Değişim olur  
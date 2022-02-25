## Merge Sort Project
Merge sort’un özelliği problemi parçalara bölmesidir ve problem parçalara bölündüğünde zaman karmaşıklığı logaritmik zamana iner. Bu da exponiensel olanlara göre çok daha iyi sonuç vermesi anlamına gelmektedir. 
Merge sort’ta ana mantık parçala ve fethet’dir. Parçala ve fethet’in mantığı ;
1. Problem küçük parçalara bölünür.
2. Daha küçük parçalara bölünen problemler çözülür.
3. Çözülmüş küçük parçalar tekrar birleştirilir.

# Örnek
Elimizde [18,26,32,6,43,15,9,1] şeklinde bir dizi olduğunu varsayalım.
1. Merge sort divide and conquer mantığına dayanarak bu diziyi en ufak parçaya ulaşıncaya kadar böler. Yani 8 elemanlık dizi 4-4 daha sonra 2-2-2-2 ve son olarak da 1-1-1-1-1-1-1-1 şeklinde en ufak parçaya bölünür.
2. Böldüğü en ufak parçaları tekrar eski haline birleştirir ancak bu sefer sıralayarak birleştirir. Örneğin elimizde 9 ve 1 var bunları tekrar birleştirirken 1 9 diye sıralayarak birleştirir. Ve ilk birleştirmede elimizde  kendi içinde sıralı 2şer elemanlı 4 grup olmuş olur. 2. Birleştirmede kendi içinde sıralı 4er elemanlı 2 grup ve son birleştirmede de sıralı 8 elemanlı diziyi elde etmiş oluruz.
3. Merge sort türüne göre aşamalar aşağıdaki gibi olacaktır.

- `Step 1 -              [18,26,32,6]     [43,15,9,1]`     
- `Step 2 -       [18,26]      [32,6]     [43,15]    [9,1]`        
- `Step 3 -   [18]   [26]   [32]   [6]   [43]   [15]   [9]   [1]`   
- `Step 4 -       [18,26]      [6,32]     [15,43]    [1,9]` 
- `Step 5 -              [6,18,26,32]     [1,9,15,43]`  
- `Step 6 -                 [1,6,9,15,18,26,32,43]`

## Tasks
[16,21,11,8,12,22] => Merge Sort

# 1 - Yukarı verilen dizinin sort türüne göre aşamalarını yazınız. "Merge Sort"

- `Step 1 -              [16,21,11]     [8,12,22]`     
- `Step 2 -          [16]   [21,11]     [8]      [12,22]`        
- `Step 3 -  [16]    [21]      [11]     [8]      [12]    [22]`   
- `Step 4 -          [16]   [11,21]     [8]      [12,22]` 
- `Step 5 -              [11,16,21]     [8,12,22]`  
- `Step 6 -                 [8,11,12,16,21,22]`

# 2 - Big-O gösterimini yazınız.    
- Big-O Notation : `O(nlogn)`
- Time Complexity : `nlogn`




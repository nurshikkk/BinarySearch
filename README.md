# BinarySearch
### Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
### Этот вид поиска использует подход «Разделяй и властвуй», требует предварительной сортировки набора данных. Алгоритм делит входную коллекцию на равные половины, и с каждой итерацией сравнивает целевой элемент с элементом в середине. Поиск заканчивается при нахождении элемента. Иначе продолжаем искать элемент, разделяя и выбирая соответствующий раздел массива. Целевой элемент сравнивается со средним.
#### Example:
![binarysearch screenshot](https://www.geeksforgeeks.org/wp-content/uploads/Binary-Search.png)

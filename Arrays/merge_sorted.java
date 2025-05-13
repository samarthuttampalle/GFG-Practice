void merge_sorted(arr1, arr2, m, n)
{
    arr3[m+n] // merged array
    i=0,j=0,k=0
    while(i < m && j < n) 
    {
        if arr1[i] < arr2[j] :
            arr3[k++] = arr1[i++]
        else :
            arr3[k++] = arr2[j++]
    }
    while(i < m)
        arr3[k++] = arr1[i++]
    while(j < n)
        arr3[k++] = arr2[j++]
}
class MultidimensionalArray2{
public static void main(String args[]){
//create 3d array
int[][][]a={{{1,-2,3},{-4,-5,-6},{-7}},{{3,5.l,4,6,8},{4,9}}};
//for each loop to iterate through elements of 3d array
for(int[][] array2D:a){
for(int[] array1D:array2D){
for(int item: array1D){
System.out.println(item);}
}
}
}
}

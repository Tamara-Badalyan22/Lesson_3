package Sorting;

public class TestArray {
    //Bubble Sort
    public void BubbleSort(int[] userArray){
        for (int i = 0; i < userArray.length-1; i++) {
            for (int j = 0; j < userArray.length - 1 - i; j++) {
                if (userArray[j] > userArray[j + 1]) {
                    int tmp = userArray[j];
                    userArray[j] = userArray[j + 1];
                    userArray[j + 1] = tmp;
                }
            }
        }
    }

    //Print array
    public void PrintArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}

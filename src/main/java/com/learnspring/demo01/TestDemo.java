package com.learnspring.demo01;

import org.junit.Test;

public class TestDemo {


    @Test
    public void demo() {

        int arr[] = {1, 5, 3, 8};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                   /* int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;*/

                   arr[j+1] = arr[j] + arr[j+1];
                   arr[j] = arr[j+1] - arr[j];
                   arr[j+1] = arr[j+1] - arr[j];
                    System.out.println();
                }
            }
        }

        for (int i : arr)
        {
            System.out.println(i);
        }
    }

}

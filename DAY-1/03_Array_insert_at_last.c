// 1.Write a program in C to insert a new element to an array at last position:

#include <stdio.h>

int main()
{
  int arr[20], n_size, n_element, i;

  printf("Enter the size: ");
  scanf("%d", &n_size);

  printf("Enetr the array elements: ");
  for (i = 0; i <= n_size - 1; i++)
    scanf("%d", &arr[i]);

  printf("The Array: ");
  for (i = 0; i <= n_size - 1; i++)
    printf("\t%d", arr[i]);

  printf("\nEnter the new element: ");
  scanf("%d", &n_element);
  arr[n_size] = n_element;

  printf("The New Array: ");
  for (i = 0; i <= n_size; i++)
    printf("\t%d", arr[i]);

  return 0;
}

// OUTPUT:
/*
Enter the size: 5
Enetr the array elements: 10 20 30 40 50
The Array:      10      20      30      40      50
Enter the new element: 90
The New Array:  10      20      30      40      50      90
*/
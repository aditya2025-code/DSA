// Q2.Write a program in C to insert a new element to an array at any specific position:

#include <stdio.h>

int main()
{
  int arr[20], n_size, n_element, n_index, i;

  printf("Enter the size: ");
  scanf("%d", &n_size);

  printf("Enetr the array elements: ");
  for (i = 0; i <= n_size - 1; i++)
    scanf("%d", &arr[i]);

  printf("The Array: ");
  for (i = 0; i <= n_size - 1; i++)
    printf("\t%d", arr[i]);

  printf("\nEnter the position & new element to add in the array: ");
  scanf("%d %d", &n_index, &n_element);
  for (i = n_size; i >= n_index; i--)
    arr[i] = arr[i - 1];
  arr[n_index - 1] = n_element;

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
Enter the position & new element to add in the array: 3 90
The New Array:  10      20      90      30      40      50
*/
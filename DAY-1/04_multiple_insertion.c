// 1.Write a program in C to insert multiple new element to an array at different position:

#include <stdio.h>

void array_update(int arr[], int size, int element, int index)
{
  for (int i = size; i >= index; i--)
    arr[i] = arr[i - 1];
  arr[index - 1] = element;
}

int main()
{
  int arr[20], n_size, n_element, n_index, i;

  printf("Enter the size: ");
  scanf("%d", &n_size);

  printf("Enetr the array elements: ");
  for (i = 0; i <= n_size - 1; i++)
    scanf("%d", &arr[i]);

  printf("To END the program enter -1 twice :)\n");
  do
  {
    printf("\nThe Array: ");
    for (i = 0; i <= n_size - 1; i++)
      printf("\t%d", arr[i]);
    printf("\n\nEnter the position & new element to add in the array: ");
    scanf("%d %d", &n_index, &n_element);
    if (n_index == -1)
      break;
    array_update(arr, n_size, n_element, n_index);
    n_size++;
  } while (n_index);

  return 0;
}

// OUTPUT:
/*
Enter the size: 5
Enetr the array elements: 10 20 30 40 50
To END the program enter -1 twice :)

The Array:      10      20      30      40      50

Enter the position & new element to add in the array: 2 90

The Array:      10      90      20      30      40      50

Enter the position & new element to add in the array: 1 120

The Array:      120     10      90      20      30      40      50

Enter the position & new element to add in the array: 3 150

The Array:      120     10      150     90      20      30      40      50

Enter the position & new element to add in the array: -1 -1
*/
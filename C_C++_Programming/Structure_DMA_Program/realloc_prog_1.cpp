#include <iostream>
using namespace std;

int main()
{
    int *arr;
    int n,m;

    // Declare the size of an array
    cout << "\n"
         << "Enter the size : ";
    cin >> n;

    // Allocate the memory to the pointer
    arr = (int *)calloc(n, sizeof(int));

    // Check the memory is allocated or not
    if (arr == NULL)
    {
        cout << "\n"
             << "Out of memory";
    }
    else
    {
        // Memory allocated successfully
        cout << "\n"
             << "Memory allocated successfully.";

        for (int i = 0; i < n; i++)
        {
            *(arr + i) = i;
        }

        // print the element
        for (int i = 0; i < n; i++)
        {
            cout << " "
                 << *(arr + i);
        }
        // Give any new number of value
        cout << "\n"
             << "Enter the new size: ";
        cin >> m;
        // Reallocate the memory
        arr = (int *)realloc(arr, n * sizeof(int));

        // Memory allocated successfully
        cout << "\n"
             << "Memory re-allocated successfully.";

        for (int i = n; i < m; i++)
        {
            *(arr + i) = i;
        }

        // print the element
        for (int i = 0; i < m; i++)
        {
            cout << " "
                 << *(arr + i);
        }
        free(arr);
        cout << "\n"
             << *(arr);
    }
    return 0;
}

// // #include <stdio.h>
// // #include <stdlib.h>
// // int main()
// // {
// // 	int index = 0, i = 0, n,
// // 		*marks; // this marks pointer hold the base address
// // 				// of the block created
// // 	int ans;
// // 	marks = (int*)malloc(sizeof(
// // 		int)); // dynamically allocate memory using malloc
// // 	// check if the memory is successfully allocated by
// // 	// malloc or not?
// // 	if (marks == NULL) {
// // 		printf("memory cannot be allocated");
// // 	}
// // 	else {
// // 		// memory has successfully allocated
// // 		printf("Memory has been successfully allocated by "
// // 			"using malloc\n");
// // 		printf("\n marks = %pc\n",
// // 			marks); // print the base or beginning
// // 					// address of allocated memory
// // 		do {
// // 			printf("\n Enter Marks\n");
// // 			scanf("%d", &marks[index]); // Get the marks
// // 			printf("would you like to add more(1/0): ");
// // 			scanf("%d", &ans);

// // 			if (ans == 1) {
// // 				index++;
// // 				marks = (int*)realloc(
// // 					marks,
// // 					(index + 1)
// // 						* sizeof(
// // 							int)); // Dynamically reallocate
// // 								// memory by using realloc
// // 				// check if the memory is successfully
// // 				// allocated by realloc or not?
// // 				if (marks == NULL) {
// // 					printf("memory cannot be allocated");
// // 				}
// // 				else {
// // 					printf("Memory has been successfully "
// // 						"reallocated using realloc:\n");
// // 					printf(
// // 						"\n base address of marks are:%pc",
// // 						marks); ////print the base or
// // 								///beginning address of
// // 								///allocated memory
// // 				}
// // 			}
// // 		} while (ans == 1);
// // 		// print the marks of the students
// // 		for (i = 0; i <= index; i++) {
// // 			printf("marks of students %d are: %d\n ", i,
// // 				marks[i]);
// // 		}
// // 		free(marks);
// // 	}
// // 	return 0;
// }

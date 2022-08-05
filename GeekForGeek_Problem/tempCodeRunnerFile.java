t low = 0;
        int high = n - 1;
        while (low <= high) {
        int mid = low + (high - low) / 2;
        if (((mid == n - 1) || arr[mid + 1] <= arr[mid]) &&
        ((mid == 0) || (arr[mid] > arr[mid - 1]))) {
        return mid;
        } else if (mid != n - 1 || mid != 0) {
        if (arr[mid] <= arr[mid + 1]) {
        low = mid + 1;
        } else if (arr[mid] <= arr[mid - 1]) {
        high = mid - 1;
        }

        else if ((arr[mid] >= arr[mid + 1]) && (arr[mid] >= arr[mid - 1])) {
        return mid;
        }
        }
        }
        ret
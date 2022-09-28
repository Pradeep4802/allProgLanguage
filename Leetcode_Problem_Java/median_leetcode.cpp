#include <iostream>
using namespace std;

class Solution
{
public:

    // First Method: Binary Search
    double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
    {
        if (nums2.size())
            return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.size();
        int n2 = nums2.size();
        int low = 0, high = n1;

        while (low <= high)
        {
            int cut1 = (low + high) >> 1;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? INT_MIN : nums1[cut1 - 1];
            int left2 = cut2 == 0 ? INT_MIN : nums2[cut2 - 1];

            int right1 = cut1 == n1 ? INT_MAX : nums1[cut1];
            int right2 = cut2 == n2 ? INT_MAX : nums2[cut2];

            if (left1 <= right2 && left2 <= right1)
            {
                if ((n1 + n2) % 2 == 0)
                    return (max(left1, left2) + min(right1, right2)) / 2.0;
                else
                    return max(left1, left2);
            }
            else if (left1 > right2)
            {
                high = cut1 - 1;
            }
            else
            {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }

    // 2nd Method : brute force approach
    double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
    {
        vector<int> v;

        for (int i = 0; i < a.size(); i++)
        {
            v.push_back(a[i]);
        }
        for (int i = 0; i < b.size(); i++)
        {
            v.push_back(b[i]);
        }
        sort(v.begin(), v.end());
        if (v.size() == 0)
            return 0;
        if (v.size() % 2 != 0)
        {
            return v[v.size() / 2];
        }
        else
        {
            int a = v.size() / 2;
            double b = v[a];
            double c = v[a - 1];
            return (b + c) / 2;
        }
    };

    int main()
    {
        Solution s;
        int arr1[] = {7, 12, 14, 15};
        int arr2[] = {1, 2, 3, 4, 9, 11};
        cout << (s.findMedianSortedArrays(arr1, arr2));
        return 0;
    }
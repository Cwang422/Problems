#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
	vector<int> twoSum(vector<int>& nums, int target)
	{
		vector<int> result;
		for (int i = 0; i < nums.size(); i++) 
		{
			for(int j = i+1 ; j < nums.size(); j++)
			{
				if (nums[i] + nums[j] == target)
				{
					result.push_back(nums[i]);
					result.push_back(nums[j]);
				}
			}
			
		}
		return result;


	}
};

int main()
{

	vector<int> vect{1,2,3,4,5,6,7,8,9};
	Solution sol;
	for (int x : sol.twoSum(vect,9))
	{
		cout << x << '\n';
	}

	//vect.push_back(1);
	//vect.push_back(2);
	//vect.push_back(3);


	/* for (int x : vect) 
	{
		cout << x << '\n';
	}
	*/

	//cout << "Hello, World!";
	return 0;
}
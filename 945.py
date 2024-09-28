class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        nums.sort()
        steps = 0
        
        for i in range(1, len(nums)):
            if nums[i] <= nums[i - 1]:
                increment = nums[i - 1] - nums[i] + 1
                nums[i] += increment
                steps += increment
                
        return steps

        

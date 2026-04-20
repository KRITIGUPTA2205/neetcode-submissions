class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen=set(nums)
        lng=0
        for num in nums:
            if num-1 not in seen:
                cn=num
                l=1
                while cn+1 in seen:
                    cn=cn+1
                    l+=1
                lng=max(lng,l)
        return lng
        
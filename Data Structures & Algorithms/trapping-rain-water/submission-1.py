class Solution:
    def trap(self, height: List[int]) -> int:
        n=len(height)
        left_height=[0]*n
        right_height=[0]*n
        trap=[0]*n
        for i in range(1,n):
            left_height[i]=max(left_height[i-1],height[i-1])
        for i in range(n-2,-1,-1):
            right_height[i]=max(right_height[i+1],height[i+1])
        for i in range(0,n):
            x=min(left_height[i],right_height[i])-height[i]
            if x>=0:
                trap[i]=x
        sums=0
        for t in trap:
            sums+=t
        return sums
        
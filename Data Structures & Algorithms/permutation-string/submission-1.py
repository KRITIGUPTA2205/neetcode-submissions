class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        count1=[0]*26
        for i in range(len(s1)):
            count1[ord(s1[i])-ord('a')]+=1
        count2=[0]*26
        left=0
        n=len(s1)
        for right in range(len(s2)):
            count2[ord(s2[right])-ord('a')]+=1
            while right-left+1>n:
                count2[ord(s2[left])-ord('a')]-=1
                left+=1
            if count1==count2:
                return True
        return False

        

        
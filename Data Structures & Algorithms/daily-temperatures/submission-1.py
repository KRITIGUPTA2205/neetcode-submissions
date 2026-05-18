class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n=len(temperatures)
        result=[0]*n
        st=[]
        for i in range(n):
            while st and temperatures[i]>temperatures[st[-1]]:
                idx=st.pop()
                result[idx]=i-idx
            st.append(i)
        return result  
        
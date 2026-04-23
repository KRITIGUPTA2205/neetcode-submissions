class Solution:
    def isValid(self, s: str) -> bool:
        st=[]
        for i in range(len(s)):
            c=s[i]
            if c=='(' or c=='[' or c=='{':
                st.append(c)
            else:
                if len(st)==0:
                    return False
                if c==')' and st[-1]!='(':
                    return False
                if c==']' and st[-1]!='[':
                    return False
                if c=='}' and st[-1]!='{':
                    return False
                st.pop()
        if len(st)!=0:
            return False
        return True
        

        
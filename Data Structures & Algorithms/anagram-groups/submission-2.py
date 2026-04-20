class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for s in strs:
            sort_s=tuple(sorted(s))
            if sort_s in map:
                map[sort_s].append(s)
            else:
                map[sort_s]=[s]
        return list(map.values())
        
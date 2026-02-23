class Solution:
    def letterCombinations(self, digits: str):
        dig = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        
        def comb(s, i, a=[]):
            if len(i) == 0:
                if not s:
                    return []
                a += [s]
                return a
            
            cur = i[0]
            new_i = i[1:]
            for x in dig[cur]:
                comb(s + x, new_i)
            return a
        return comb("", digits)
        
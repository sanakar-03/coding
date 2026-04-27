class Solution:
    def wordBreak(self, s: str, wordDict: list[str]) -> bool:
        word_set = set(wordDict)
        n = len(s)
        dp = [-1] * (n + 1)

        def rec(ind):
            if ind == n:
                return True
            if dp[ind] != -1:
                return dp[ind]

            for i in range(ind, n):
                if s[ind:i+1] in word_set:
                    if rec(i + 1):
                        dp[ind] = True
                        return True

            dp[ind] = False
            return False

        return rec(0)
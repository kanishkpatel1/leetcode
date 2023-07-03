class Solution:
    def findPrimePairs(self, n: int) -> List[List[int]]:
        # sieve of Eratosthenes
        vis = [False] * (n + 1)
        for i in range(2, int(n**0.5) + 1):
            if not vis[i]:
                for j in range(2 * i, n + 1, i):
                    vis[j] = True

        ans = []

        for i in range(2, n // 2 + 1):
            x = i
            y = n - i

            if not vis[x] and not vis[y] and x <= y:
                ans.append([x, y])

        return ans

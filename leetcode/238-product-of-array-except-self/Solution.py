class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        k = [0] * len(nums)
        p = 1
        nan = -1

        for idx, n in enumerate(nums):
            if n == 0:
                if nan == -1:
                    nan = idx
                else:
                    return [0] * len(nums)
            else:
                p *= n


        for idx, n in enumerate(nums):
            if nan == -1:
                k[idx] = int(p/n)
            else:
                k[idx] = 0 if idx != nan else p 
            

            
        return k
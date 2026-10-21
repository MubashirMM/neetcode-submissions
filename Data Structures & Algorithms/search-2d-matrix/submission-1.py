class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        for i in range(0,m):
            start=0
            end=len(matrix[i])-1
            while(start<=end):
                mid=(start+end)//2
                if(matrix[i][mid]==target):
                    return True
                elif(matrix[i][mid]>target):
                    end=mid-1
                else:
                    start=mid+1

        return False
class MedianFinder:

    def __init__(self):
        self.data=[]
        

    def addNum(self, num: int) -> None:
        self.data.append(num);
        self.data.sort();

    def findMedian(self) -> float:
        n=len(self.data)
        if(n==1):
            return self.data[0]
        mid=self.data[n//2]
        if n%2==1:
            return mid
        mid2=self.data[n//2-1]
        return (mid+mid2)/2
           
            
        
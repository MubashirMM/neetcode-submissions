from collections import defaultdict
class TimeMap:

    def __init__(self):
        self.data=defaultdict(list)
        


    def set(self, key: str, value: str, timestamp: int) -> None:
        self.data[key].append((value,timestamp))
        

    def get(self, key: str, timestamp: int) -> str:
        res=""
        n=len(self.data[key])
        for i in range(n):
           v,t=self.data[key][i]
           if t<=timestamp:
            res=v
        return res
        
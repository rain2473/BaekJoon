def solution(price, money, count):
    return (count*(count+1)//2*price - money) * ((count*(count+1)//2*price - money)>0)
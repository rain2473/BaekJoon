def solution(my_str, n):
    answer = []
    for i in range(len(my_str)//n+1*(len(my_str)%n!=0)):
        answer.append(my_str[n*i:n*(i+1)])
    return answer
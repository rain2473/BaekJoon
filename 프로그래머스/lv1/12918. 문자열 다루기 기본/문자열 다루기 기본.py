def solution(s):
    answer = True
    if len(s) != 4 and len(s) != 6:
        answer = False
    else:
        try: s = int(s)
        except:
            answer = False
    return answer
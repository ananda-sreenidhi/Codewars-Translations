def late_ride(n):
    return sum([int(i) for i in list(str(n // 60) + str(n%60))])

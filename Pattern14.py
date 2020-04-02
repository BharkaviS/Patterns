'''
Input:
Tenth

Output:
*e***
****h
**n**
T**t*

Input:
ManGoose

Output:
*a******
*******e
***G****
M*******
**n*****
****oo**
******s*
'''

s=input()
k=s
a=list(k.lower())
b=set(a)
a=list(b)
a.sort()
for i in range(0,len(a)):
    for j in range(0,len(s)):
        c=s[j].lower()
        if(c==a[i]):
            print(s[j],end="")

        else:
            print("*",end="")
    print()




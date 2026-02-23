def linsearch(a,s):
    for i in range(0,n):
        if(a[i]==s):
            return i
    return -1
def binsearch(a,s):
    n=len(a)
    l=0
    h=n-1
    while l<=h:
        m=(l+h)//2
        if(a[m]==s):
            return m
        elif(a[m]<s):
            l=m+1
        elif(a[m]>s):
            h=m-1
    return -1
a=[]
n=eval(input("enter any number"))
for i in range(0,n):
    x=eval(input("enter the value"))
    a.append(x)
a.sort()
for i in a:
    print(i)
print("1 for linear search")
print("2 for binary search")
ch=eval(input("enter which operation to perform"))
while(ch<=2):
    if ch==1:
        print("linear search")
        s=eval(input("enter the searching element"))
        z=linsearch(a,s)
        if(z!=-1):
            print("the element is available at ",z," position")
        else:
            print("the element not available",z)
    elif ch==2:
        print("binary search")
        s=eval(input("enter the searching element"))
        z=binsearch(a,s)
        if(z!=-1):
            print("the element is available at ",z," position")
        else:
            print("the element not available",z)
    else:
        print("enter the correct choice")
    ch=eval(input("press 1 or 2 to continue"))

    

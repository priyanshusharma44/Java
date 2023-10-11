#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
    int n,x=2;
    int i;
    printf("Enter n: ");
    scanf("%d",&n);
    while (n)
    {
        for(i = 2;i < x;i++)
                if(x%i==0)
                   break;
            if(i==x){
                printf("%d ",x );
                n--;
            }
            x++;
    }
    
    return 0;
}
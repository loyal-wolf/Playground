#include <bits/stdc++.h>
using namespace std;
int main() {
   int n,i,j,k;
   cin>>n;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++)
    {if(i%2==1)
    {if(j==n)
       cout<<i+1;
     else
       cout<<i;
    }
     else{
     {if(j==1)
       cout<<i+1;
     else
       cout<<i;} 
    }
    }
    cout<<"\n";}
    return 0;
}
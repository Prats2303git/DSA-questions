#include <bits/stdc++.h>
using namespace std;
 
#define int long long int
 
int main()
{
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        string x,s;
        cin>>x>>s;
        bool check = false;
        
        for(int i=0; i<=6; i++)
        {
            if(x.find(s)!=-1)
            {
                check = false;
                cout<<i<<endl;
                break;
            }
            x += x;
        }
        if(!check)
        cout<<-1<<endl;
    }
}

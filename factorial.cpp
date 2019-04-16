
#include <iostream.h>
using namespace std;
int main ()
{int n;
cin>>n;
cout<<"factorial to be calculated";
int p=1;
do
{p=p*n;
n=n-1;
}while(n>0);
cout<<"factorail is = "<<p;

return 0;
}

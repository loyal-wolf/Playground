#include <iostream>
#include <cstring>
using namespace std;
int main()
{
string a,b;
  getline(cin,a);
  for(int i=a.length()-1;i>=0;i--)
    b+=a.at(i);
std::cout<<b;
}
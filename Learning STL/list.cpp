#include<iostream>
#include<list>
using namespace std;
int main()
{
    list<int> l;
    l.push_back(10);
    l.push_back(20);
    l.push_back(30);
    l.push_back(40);

    for(int x : l)
    {
        cout<<x<<" ";
    }
    // l.erase(l.end()-2,l.end());

    l.pop_back();

     for(int x : l)
    {
        cout<<x<<" ";
    }
    cout <<"Size is : "<<l.size();
    return 0;
}
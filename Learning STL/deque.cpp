#include<iostream>
#include<deque>
using namespace std;
int main()
{
    deque<int>d ;
    d.push_back(10);
    d.push_front(5);
    for(int x : d)
    {
        cout<<x<<" ";
    }

    //remove first element
    d.pop_front(); // remove first element
    d.pop_back();
    for(int x : d)
    {
        cout<<x<<" ";
    }

    cout << d.empty();// check if deque is empty 0 is false 1 is true

    return 0;
}
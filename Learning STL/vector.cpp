#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector<int> v;
    cout << "Size" << v.size();
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);
    cout << "Siz => " << v.size();
    cout << " Capacity => " << v.capacity(); // capacity is the maximum size of the vector
    v.push_back(40);
    cout << "Siz => " << v.size();
    cout << " Capacity => " << v.capacity();
    v.push_back(50);
    cout << "Siz => " << v.size();
    cout << " Capacity => " << v.capacity();

    // create a vector of 4 elements of type int and assign values to 10

        vector<int>
            v1(4, 10);
    for (int x : v1)
    {
        cout << x << " ";
    }
}
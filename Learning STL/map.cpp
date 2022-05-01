#include <iostream>
#include <map>
using namespace std;

int main()
{

    map<int, string> no;
    no[1] = "one";
    no[2] = "two";
    cout << no[1] << endl;
    no.insert({3, "three"});
    // cout << no[1] << endl;
    for (auto i : no)
    {
        cout << i.first << " " << i.second << endl;
    }

    // erase by key
    no.erase(1);
    for (auto i : no)
    {
        cout << i.first << " " << i.second << endl;
    }
    cout << "Size is:" << no.size() << endl; 
  
    


    return 0;
}

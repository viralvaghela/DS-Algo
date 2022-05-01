#include <iostream>
#include <queue>
using namespace std;

int main()
{
    queue<string> q;
    q.push("cat");
    q.push("dog");
    q.push("bird");

    cout << q.front() << endl;
    cout << "Size is:" << q.size() << endl;
    q.pop();
    cout << "After pop Size is:" << q.size() << endl;
    cout << " Front is : " << q.front() << endl
         << endl
         << endl;

    while (!q.empty())
    {
        cout << q.front() << endl;
        q.pop();
    }

    cout << "Size is:" << q.size() << endl;
    return 0;
}
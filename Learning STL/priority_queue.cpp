#include <iostream>
#include <queue>
using namespace std;

int main()
{

    priority_queue<int> pq; // default is max_heap
    pq.push(10);
    pq.push(20);
    pq.push(4);
    pq.push(5);
    pq.push(15);
    int size = pq.size();
    cout << "Size is:" << size << endl;
    for (int i = 0; i < size; i++)
    {
        cout << pq.top() << endl;
        pq.pop();
    }

    // create min heap
    priority_queue<int, vector<int>, greater<int>> min_heap;
    min_heap.push(20);
    min_heap.push(10);
    min_heap.push(4);
    min_heap.push(5);
    min_heap.push(15);
    size = min_heap.size();
    cout << "Size of Min heap  is:" << size << endl;
    for (int i = 0; i < size; i++)
    {
        cout << min_heap.top() << endl;
        min_heap.pop();
    }
    cout <<"Size after pop all elements of min heap : "<< min_heap.size();
    return 0;
}
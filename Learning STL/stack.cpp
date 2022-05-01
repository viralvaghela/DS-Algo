#include <iostream>
#include <stack>
using namespace std;
class Animal //ignore this funny logic of stack of animals lol :D
{
public:
    string name;
    int age, weight;
    Animal(string name, int age, int weight)
    {
        this->name = name;
        this->age = age;
        this->weight = weight;
    }
    string getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    int getWeight()
    {
        return weight;
    }
};

int main()
{
    stack<Animal> AnimalStack;
    AnimalStack.push(Animal("cat", 2, 5));
    AnimalStack.push(Animal("dog", 3, 10));
    AnimalStack.push(Animal("bird", 1, 2));

    cout<<"Top animal is " << AnimalStack.top().getName() << endl;


    // while (!AnimalStack.empty())
    // {
    //     Animal animal = AnimalStack.top();
    //     cout << animal.getName() << " " << animal.getAge() << " " << animal.getWeight() << endl;
    //     AnimalStack.pop();
    // }
    return 0;
}
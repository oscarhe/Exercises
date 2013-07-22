// An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement opreations such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in LinkedList data structure.

import java.util.LinkedList;

public class StackQueue7 {

    public static abstract class Animal {

        private int position ;
        private String name;

        public Animal(String name) {

            this.name = name;

            position++;

        }

        public String getName() {

            return name;

        }

        public int getPosition() {

            return position;

        }

        public void setPosition(int n) {

            position = n;

        }

    }

    public static class Dog extends Animal {

        public Dog(String name) {
            
            super(name);   
            
        }

    }

    public static class Cat extends Animal {

        public Cat(String name) {

            super(name);

        }

    }

    public static class AnimalQueue {

        private LinkedList<Dog> dogQueue = new LinkedList<Dog>();
        private LinkedList<Cat> catQueue = new LinkedList<Cat>();
        
        private int position = 0;

        public void enqueue(Animal a) {

            a.setPosition(position);
            position++;

            if(a instanceof Dog) {

                dogQueue.addLast((Dog)a);

            } else {

                catQueue.addLast((Cat)a);

            }

        }

        public Animal dequeueAny() {

            if(dogQueue.size() == 0) {

                return catQueue.poll();

            }

            if(catQueue.size() == 0) {

                return dogQueue.poll();

            }

            if(dogQueue.peek().getPosition() < catQueue.peek().getPosition()) {

                return dogQueue.poll();

            } else {

                return catQueue.poll();

            }

        }

    }

    public static void main(String[] args) {

        Dog d1 = new Dog("DA");
        Dog d2 = new Dog("DB");
        Dog d3 = new Dog("DC");
        Cat c1 = new Cat("CA");
        Cat c2 = new Cat("CB");
        Cat c3 = new Cat("CC");

        AnimalQueue a = new AnimalQueue();

        a.enqueue(d1);
        a.enqueue(c1);
        a.enqueue(d2);
        a.enqueue(c2);
        a.enqueue(d3);
        a.enqueue(c3);

        System.out.println(a.dequeueAny().getName() + " " + a.dequeueAny().getName());

    }

}

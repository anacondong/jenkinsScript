package src.main.java

class MyClass {

    // Fields (properties)
    def myField

    // Constructor
    MyClass() {
        myField = "Hello from MyClass!"
    }

    // Method
    def sayHello() {
        println myField
    }

    static void main(String[] args) {
        // Create an instance of MyClass
        def myInstance = new MyClass()

        // Call the sayHello() method on the instance
        myInstance.sayHello()
    }
}

package org.jd.multiple.choice.questions;

/*
 * 
 * Explanation: The order of execution is:
 * 
 * 1. The static block will execute whenever the class is loaded by JVM. 
 * 2. Instance block will execute whenever an object is created, and they are
 * invoked before the constructors. For example, if there are two objects, the
 * instance block will execute two times for each object. 
 * 3. The constructor will execute after the instance block, and it also execute every time the object is created. 
 * 4. A method is always executed at the end.
 * 
 * 2. The Javadoc is a tool that is used to generate API documentation in HTML
 * format from the Java source files. In other words, it is a program (tool)
 * that reads a collection of source files into an internal form.
 * 
 * The Javadoc command line syntax is, Javadoc [options] [packagenames]
 * [sourcefiles] [@files]
 * 
 * The javap tool is used to get the information of any class or interface. It
 * is also known as a disassembler. The javaw command is identical to java that
 * displays a window with error information, and the javah command is used to
 * generate native method functions.
 * 
 * 3. Variable Shadowing

Explanation: There are following reasons for considering a variable shadowing, they are listed below:

    When we define a variable in a local scope with a variable name same as the name of a variable defined in an instance scope.
    When a subclass declares a variable with the same name as of the parent class variable.
    When a method is overridden in the child class.

Hence, the correct answer is option (b).

  4. Marker Interface

Explanation: An interface with no methods and fields is known as the marker interface. In other words, an empty interface (containing no fields and methods) is called a marker interface. In Java, the most commonly used marker interfaces are Serializable, Cloneable, Remote, and ThreadSafe interfaces. Marker interfaces are also known as the Tag interface. It is used to tell the JVM or compiler that the particular class has special behavior.

Following is the code snippet of a maker interface:

public interface Cloneable 
{
    // empty 
}
  
  5. Error and Exception class

Explanation: According to the class hierarchy of Throwable class, the Error and Exception classes are the direct subclasses of the Throwable class, as shown below.
Java Multiple Choice Questions

The RuntimeException, IOException, and VirtualMachineError classes are the subclasses of the Exception and Error classes.

  6. Explanation: When a String is created using a new operator, it always created in the heap memory. Whereas when we create a string using double quotes, it will check for the same value as of the string in the string constant pool. If it is found, returns a reference of it else create a new string in the string constant pool.
  
  7. 
 */
package Collections.mk;

public class ALL_List {
}
//ArrayList: A dynamic array that grows and shrinks as needed. It's suitable for random access and fast iteration but can be slower for frequent insertions or deletions.
// 
//LinkedList: A doubly-linked list where elements are connected with pointers. It's efficient for insertions and deletions but less efficient for random access.
//
//Vector: Similar to ArrayList, but it's synchronized, making it thread-safe for concurrent access. It's less commonly used due to the availability of ArrayList and Collections.synchronizedList().
//
//Stack: A specialized list that follows the Last-In-First-Out (LIFO) principle. It's typically used for implementing tasks like parsing expressions or tracking function calls.
//
//CopyOnWriteArrayList: A thread-safe variant of ArrayList that creates a new copy of the underlying array whenever an element is modified, ensuring safe concurrent access without locks.
//
//Collections.nCopies: Creates an immutable list containing a specified number of copies of a given object.
//
//Arrays.asList: Wraps an existing array into a list, providing a List interface to array elements.
//
//AbstractList: An abstract base class that provides a skeletal implementation of the List interface. Developers can extend it to create custom list implementations.
//
//LinkedList.Deque: The Deque interface, implemented by LinkedList, provides double-ended queue functionality, allowing elements to be added or removed from both ends.
//
//Immutable List: Some libraries and frameworks provide immutable list implementations, like java.util.ImmutableList in Google's Guava library.
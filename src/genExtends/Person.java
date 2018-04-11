package genExtends;

public class Person {

}
class female extends Person{
	
	
}
class girl extends female{
	
}
class Container<T extends female>{
	T key;
	void set(T t) {
		this.key = t;
	}
	T get() {
		return this.key;
	}
}
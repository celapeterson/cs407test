all: FriendlyGreeter.java
	javac FriendlyGreeter.java
	java FriendlyGreeter

clean: 
	rm -rf FriendlyGreeter.class
	

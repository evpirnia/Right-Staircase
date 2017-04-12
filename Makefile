program=staircase

default:
	javac $(program).java

clean:
	/bin/rm -f $(program).class

cr:
	javac $(program).java
	java $(program)

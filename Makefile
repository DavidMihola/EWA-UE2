default:
	mkdir classes
	javac -classpath {$CLASSPATH}:classes -d classes src/java/memory/MemoryBoardState.java
	javac -classpath {$CLASSPATH}:classes -d classes src/java/memory/MemoryCard.java
	javac -classpath {$CLASSPATH}:classes -d classes src/java/memory/MemoryBoard.java
	javac -classpath {$CLASSPATH}:classes -d classes src/java/memory/GameTable.java
	javac -classpath {$CLASSPATH}:classes -d classes src/java/beans/TableBean.java

install-david:
	rm -rf /var/lib/tomcat6/webapps/memory	
	mkdir /var/lib/tomcat6/webapps/memory
	cp -r web/* /var/lib/tomcat6/webapps/memory/
	cp -r classes /var/lib/tomcat6/webapps/memory/WEB-INF

clean:
	rm -rf ./classes

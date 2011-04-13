default:
	mkdir classes
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryBoardState.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryCard.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryBoard.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/GameTable.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/timer/Timer.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/beans/TimerBean.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/beans/TableBean.java
	javac -classpath ${CLASSPATH}:/usr/share/java/servlet-api-2.5.jar:classes -d classes src/java/servlets/TableServlet.java

install-david: default
	rm -rf /var/lib/tomcat6/webapps/memory	
	mkdir /var/lib/tomcat6/webapps/memory
	cp -r web/* /var/lib/tomcat6/webapps/memory/
	cp -r classes /var/lib/tomcat6/webapps/memory/WEB-INF

install-florian: default
	rm -rf WebContent
	mkdir WebContent
	cp -r web/* WebContent
	cp -r classes WebContent/WEB-INF

war: install-florian
	jar cvf UE2-AG_17_gruppe-9902433-0005273-0304850.war -C WebContent .

love: war
	zip -r UE2-AG_17_gruppe-9902433-0005273-0304850 src WebContent UE2-AG_17_gruppe-9902433-0005273-0304850.war

clean:
	rm -rf ./classes
	rm -rf WebContent
	rm -rf UE2-AG_17_gruppe-9902433-0005273-0304850.war
	rm -rf UE2-AG_17_gruppe-9902433-0005273-0304850.zip

default:
	mkdir classes
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryBoardState.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryCard.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/MemoryBoard.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/memory/GameTable.java
	javac -classpath ${CLASSPATH}:classes -d classes src/java/beans/TableBean.java
	javac -classpath ${CLASSPATH}:/usr/share/java/servlet-api-2.5.jar:classes -d classes src/java/servlets/TableServlet.java

install-david:
	rm -rf /var/lib/tomcat6/webapps/memory	
	mkdir /var/lib/tomcat6/webapps/memory
	cp -r web/* /var/lib/tomcat6/webapps/memory/
	cp -r classes /var/lib/tomcat6/webapps/memory/WEB-INF

install-florian:
	rm -rf WebContent
	mkdir WebContent
	cp -r web/* WebContent
	cp -r classes WebContent/WEB-INF

clean:
	rm -rf ./classes

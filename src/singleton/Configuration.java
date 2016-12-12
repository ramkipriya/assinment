package singleton;

public class Configuration {
private static Configuration instance;
private int connection;
private int portNumber;
private String url;
private int timeout;

private Configuration(){
	
}
public static Configuration getInstance(){
	if(instance== null){
		instance=new Configuration();
		
	}return instance;
}

public int getConnection() {
	return connection;
}

public void setConnection(int connection) {
	this.connection = connection;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public int getTimeout() {
	return timeout;
}

public void setTimeout(int timeout) {
	this.timeout = timeout;
}
public int getPortNumber() {
	return portNumber;
}

public void setPortNumber(int portNumber) {
	this.portNumber = portNumber;
}
}

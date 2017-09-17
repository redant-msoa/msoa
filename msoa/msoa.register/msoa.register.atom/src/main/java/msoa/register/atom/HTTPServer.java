package msoa.register.atom;

import java.util.Map;

import org.eclipse.jetty.server.Server;
import org.springframework.beans.factory.annotation.Autowired;

import msoa.register.atom.handle.AtomHandler;

public class HTTPServer {
	
	private String name;
	private int port;
	private Map<String,Object> param;
	@Autowired
	private AtomHandler atomHandler;
	private Server server;
	
	public void start() throws Exception{
		if(server==null||server.isStopped()){
			server = new Server(port);
			server.setHandler(new AtomHandler());
			server.start();
			server.join();
		}
	}
	
	public void stop() throws Exception{
		if(server!=null){
			server.stop();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Map<String, Object> getParam() {
		return param;
	}

	public void setParam(Map<String, Object> param) {
		this.param = param;
	}

	

	public AtomHandler getAtomHandler() {
		return atomHandler;
	}

	public void setAtomHandler(AtomHandler atomHandler) {
		this.atomHandler = atomHandler;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}
	
	

}

public class Server {
    private int port;
    private String hostName;
    private Server(int port , String hostName){
        this.port = port;
        this.hostName = hostName;
    }
    public void viewServer(){
        System.out.println("Port is: "+this.port+",Hostname is: "+ this.hostName);
    }
    public static class Builder{
        private int port = 80;
        private String hostname = "localhost";
        public Builder port(int port){
            this.port = port;
            return this;
        }
        public Builder hostName(String hostname){
            this.hostname = hostname;
            return this;
        }
        public Server build(){
            return new Server(port , hostname);
        }
    }
}

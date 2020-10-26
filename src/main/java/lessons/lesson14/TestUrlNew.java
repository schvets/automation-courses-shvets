package lessons.lesson14;


// http://google.com.ua:8080/search/searchImage?debug&remote=true&test&enable=false
public class TestUrlNew {
    private String protocol =  "";
    private String domain =  "";;
    private String port =  "";
    private String path =  "";
    private String param = "";

    public String getProtocol() {
        return protocol;
    }

    public String getPomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getParam() {
        return param;
    }

    public static class Builder {
        private TestUrlNew url;

        public Builder() {
            url = new TestUrlNew();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = this.url.protocol + protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = this.url.domain + domain + ".";
            return this;
        }

        public Builder withPort(int port) {
            if (port > 65553 || port <= 0) {
                port = 80;
            }
            url.port =  String.valueOf(port);
            return this;
        }

        public Builder withPath(String path) {
            url.path = this.url.path + path + "/";
            return this;
        }

        public Builder withParam(String param) {
            url.param = this.url.param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            url.param = this.url.param + key + "=" + value+ "&";
            return this;
        }

        public String build() {
            String resultUrl = "";
            if(url.protocol !=null && !url.protocol.isEmpty())
                resultUrl += url.protocol;

            if(!url.protocol.endsWith("://"))
                resultUrl += "://";

            if(url.domain !=null && !url.domain.isEmpty())
                resultUrl += url.domain;

            if(url.domain.endsWith("."))
                resultUrl += ".";

            if(url.port !=null && !url.port.isEmpty())
                resultUrl += ":" + url.port;

            if(url.path !=null && !url.path.isEmpty())
                resultUrl += url.path.startsWith("/") ? url.path : "/" + url.path;

            if(url.param !=null && !url.param.isEmpty())
                resultUrl += "?" + url.param;

            return resultUrl;
        }

//        public Test build() {
//            return new Test(protocol, domain, port, path, param);
//        }
    }
}

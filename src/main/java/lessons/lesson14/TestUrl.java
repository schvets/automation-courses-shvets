package lessons.lesson14;

public class TestUrl {
    private String domain;
    private String port;
    private String path;
    private String param;
    private String protocol;


    private TestUrl(Builder builder) {
        this.domain = builder.domain;
        this.port = builder.port;
        this.path = builder.path;
        this.param = builder.param;
        this.protocol = builder.protocol;
    }

    @Override
    public String toString() {
        return "TestUrl: " + this.protocol + this.domain + this.port + this.path + this.param;
    }

    public static class Builder {
        private String protocol = "";
        private String domain = "";
        private String port = "";
        private String path = "";
        private String param = "";


        public Builder withProtocol(String protocol) {
            if (protocol.endsWith("://")) {
                this.protocol = protocol;
            } else this.protocol = protocol + "://";
            return this;
        }

        public Builder withDomain(String domain) {
            if (!this.domain.endsWith(".") && this.domain == "") {
                this.domain = this.domain + domain;
            } else this.domain = this.domain+ "." + domain;
            return this;
        }

        public Builder withPort(String port) {
            if (port.endsWith(":")) {
                this.port = port;
            } else this.port = ":" + port ;
            return this;
        }

        public Builder withPath(String path) {
            if (path.startsWith("/")) {
                this.path = this.path + path;
            } else this.path =  this.path + "/" +path ;
            return this;
        }

        public Builder withParam(String param) {
            if (this.param.startsWith("?")) {
                this.param = this.param +param + "&";
            } else this.param =  "?" + param  + "&";
            return this  ;
        }

        public Builder withParam(String param1, String param2) {
            if (this.param.startsWith("?")) {
                this.param = this.param +param1 + "=" +  param2 + "&";
            } else this.param =  "?" + this.param +param1 + "=" +  param2+ "&";
            return this  ;

        }

        public String build() {
            String url = String.valueOf(new TestUrl(this));
            return url;
        }
    }
}
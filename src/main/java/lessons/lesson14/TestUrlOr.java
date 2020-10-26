package lessons.lesson14;



public class TestUrlOr {

    public String protocol;
    public String domain;
    public String port;
    public String path;
    public String param;

    public static class Builder {
        private TestUrlOr url;

        public Builder() {
            url = new TestUrlOr();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            url.port = ":" + port;
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder withParam(String param) {
            url.param = "?" + param;
            return this;
        }

        public Builder withParam(String key, String value) {
            url.protocol = "?" + key + "+" + value;
            return this;
        }

        public String build() {
            String result = "";
            new StringBuilder()
                    .append(url.protocol)
                    .append(url.domain)
                    .append(url.port)
                    .append(url.path)
                    .append(url.param)
                    .toString();
            return result;
        }
    }

}
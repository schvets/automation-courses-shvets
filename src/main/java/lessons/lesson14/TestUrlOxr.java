package lessons.lesson14;


public class TestUrlOxr {
        public String protocol = "";
        public String domain = "";
        public String port = "";
        public String path = "";
        public String params = "";

        public static class Builder {
            private TestUrlOxr url;

            public Builder() {
                url = new TestUrlOxr();
            }

            public Builder withProtocol(String protocol) {
                url.protocol = protocol;
                if (!protocol.endsWith("://")) {
                    url.protocol = url.protocol + "://";
                }
                return this;
            }

            public Builder withDomain(String domain) {
                if (!domain.endsWith(".")) {
                    url.domain = url.domain + domain + ".";
                }

                return this;
            }

            public Builder withPort(String port) {
                url.port = ":" + port;
                return this;
            }

            public Builder withPath(String path) {
                if (!path.startsWith("/")) {
                    url.path = url.path + "/" + path;
                }else {
                    url.path = url.path +  path;
                }
                return this;
            }

            public Builder withParam(String param) {
                if (!param.endsWith("&")) {
                    url.params = url.params + param + "&";

                } else {
                    url.params = url.params + param;
                }

                return this;
            }

            public Builder withParam(String key, String value) {

                url.params = url.params + key + "=" + value + "&";
                return this;
            }

            public String build() {
                url.domain = url.domain.endsWith(".") ? url.domain.substring(0, url.domain.length() - 1) : url.domain;
                url.path = url.path.endsWith("") ? url.path + Character.toString('?') : url.path;
                url.params = url.params.endsWith("&") ? url.params.substring(0, url.params.length() - 1) : url.params;
                return new StringBuilder().append(url.protocol).append(url.domain).append(url.port).append(url.path)
                        .append(url.params).toString();

            }
        }


    }
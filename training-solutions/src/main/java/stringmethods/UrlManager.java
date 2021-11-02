package stringmethods;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        protocol = getProtocolFromUrl(url);
        host = getHostFromUrl(url);
        port = getPortFromUrl(url);
        path = getPathFromUrl(url);
        query = getQueryFromUrl(url);
    }

    private String getProtocolFromUrl(String url) {
        int startIndex = url.indexOf("://");
        return url.substring(0, startIndex);
    }

    private String getHostFromUrl(String url) {
        int startIndex = getProtocolFromUrl(url).length() + 3;
        int endIndex = url.indexOf(':', startIndex);
        if (endIndex < 0) {
            endIndex = url.indexOf('/', startIndex);
        }
        return url.substring(startIndex, endIndex);
    }

    private int getPortFromUrl(String url) {
        int startIndex = getProtocolFromUrl(url).length() +
                getHostFromUrl(url).length() + 3;
        int endIndex = url.indexOf("/", startIndex);
        if (url.indexOf(':', startIndex) >= 0){
            return Integer.parseInt(url.substring(startIndex + 1, endIndex));
        }
        else {
            return -1;
        }
    }

    private String getPathFromUrl(String url) {
        int startIndex = getProtocolFromUrl(url).length() +
                getHostFromUrl(url).length() + 4;
        if (getPortFromUrl(url) >= 0) {
            startIndex += String.valueOf(getPortFromUrl(url)).length() + 1;
        }
        int endIndex = url.indexOf('?');
        return url.substring(startIndex, endIndex);
    }

    private String getQueryFromUrl(String url) {
        int startIndex = getProtocolFromUrl(url).length() +
                getHostFromUrl(url).length() + 5 + getPathFromUrl(url).length();
        if (getPortFromUrl(url) >= 0) {
            startIndex += String.valueOf(getPortFromUrl(url)).length() + 1;
        }
        return url.substring(startIndex);
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        return query.contains(key);
    }

    public String getProperty(String key) {
        if (!hasProperty(key)) {
            return "";
        }
        int indexOfKey = query.indexOf(key);
        int indexOfProperty = query.indexOf('=', indexOfKey) + 1;
        int indexOfNextKey = query.indexOf('&', indexOfProperty);
        return query.substring(indexOfProperty, indexOfNextKey);
    }

    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/" +
                "fdsnws/event/1/query?format=geojson&starttime=2014-01-01&" +
                "endtime=2014-01-02");

        System.out.println(urlManager.getProperty("starttime"));
    }
}

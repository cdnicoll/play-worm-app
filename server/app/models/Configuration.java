package models;

/**
 * Created by conicoll on 2016-01-05.
 */
public class Configuration {
    public String baseUrl;
    public String googleAnalyticsKey;

    public String getBasePath() {
        return baseUrl;
    }

    public void setBasePath(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getGoogleAnalyticsKey() {
        return googleAnalyticsKey;
    }

    public void setGoogleAnalyticsKey(String googleAnalyticsKey) {
        this.googleAnalyticsKey = googleAnalyticsKey;
    }
}

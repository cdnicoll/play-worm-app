package models;

import play.data.validation.Constraints;

/**
 * Created by conicoll on 2016-01-04.
 */
public class Character implements java.io.Serializable {
    @Constraints.Required
    private int id;

    @Constraints.Required
    private String heroName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}

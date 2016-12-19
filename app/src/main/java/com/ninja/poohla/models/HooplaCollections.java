
package com.ninja.poohla.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HooplaCollections {

    private List<Collection> collections = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HooplaCollections() {
    }

    /**
     * 
     * @param collections
     */
    public HooplaCollections(List<Collection> collections) {
        super();
        this.collections = collections;
    }

    /**
     * 
     * @return
     *     The collections
     */
    public List<Collection> getCollections() {
        return collections;
    }

    /**
     * 
     * @param collections
     *     The collections
     */
    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

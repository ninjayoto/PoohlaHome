
package com.ninja.poohla.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    private Kind kind;
    private String label;
    private List<Title> titles = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Collection() {
    }

    /**
     * 
     * @param titles
     * @param label
     * @param kind
     */
    public Collection(Kind kind, String label, List<Title> titles) {
        super();
        this.kind = kind;
        this.label = label;
        this.titles = titles;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public Kind getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The titles
     */
    public List<Title> getTitles() {
        return titles;
    }

    /**
     * 
     * @param titles
     *     The titles
     */
    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

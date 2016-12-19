
package com.ninja.poohla.models;

import java.util.HashMap;
import java.util.Map;

public class Kind {

    private Integer id;
    private String name;
    private Boolean enabled;
    private String singular;
    private String plural;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Kind() {
    }

    /**
     * 
     * @param id
     * @param enabled
     * @param name
     * @param plural
     * @param singular
     */
    public Kind(Integer id, String name, Boolean enabled, String singular, String plural) {
        super();
        this.id = id;
        this.name = name;
        this.enabled = enabled;
        this.singular = singular;
        this.plural = plural;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     * @return
     *     The singular
     */
    public String getSingular() {
        return singular;
    }

    /**
     * 
     * @param singular
     *     The singular
     */
    public void setSingular(String singular) {
        this.singular = singular;
    }

    /**
     * 
     * @return
     *     The plural
     */
    public String getPlural() {
        return plural;
    }

    /**
     * 
     * @param plural
     *     The plural
     */
    public void setPlural(String plural) {
        this.plural = plural;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

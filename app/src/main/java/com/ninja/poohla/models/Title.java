
package com.ninja.poohla.models;

import java.util.HashMap;
import java.util.Map;

public class Title {

    private Integer titleId;
    private String title;
    private Integer kindId;
    private String kind;
    private String artistName;
    private Boolean demo;
    private Boolean pa;
    private Boolean edited;
    private String artKey;
    private Boolean children;
    private String issueNumberDescription;
    private Integer episode;
    private Integer season;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Title() {
    }

    /**
     * 
     * @param edited
     * @param demo
     * @param title
     * @param episode
     * @param season
     * @param pa
     * @param artKey
     * @param kindId
     * @param children
     * @param issueNumberDescription
     * @param artistName
     * @param titleId
     * @param kind
     */
    public Title(Integer titleId, String title, Integer kindId, String kind, String artistName, Boolean demo, Boolean pa, Boolean edited, String artKey, Boolean children, String issueNumberDescription, Integer episode, Integer season) {
        super();
        this.titleId = titleId;
        this.title = title;
        this.kindId = kindId;
        this.kind = kind;
        this.artistName = artistName;
        this.demo = demo;
        this.pa = pa;
        this.edited = edited;
        this.artKey = artKey;
        this.children = children;
        this.issueNumberDescription = issueNumberDescription;
        this.episode = episode;
        this.season = season;
    }

    /**
     * 
     * @return
     *     The titleId
     */
    public Integer getTitleId() {
        return titleId;
    }

    /**
     * 
     * @param titleId
     *     The titleId
     */
    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The kindId
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * 
     * @param kindId
     *     The kindId
     */
    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The demo
     */
    public Boolean getDemo() {
        return demo;
    }

    /**
     * 
     * @param demo
     *     The demo
     */
    public void setDemo(Boolean demo) {
        this.demo = demo;
    }

    /**
     * 
     * @return
     *     The pa
     */
    public Boolean getPa() {
        return pa;
    }

    /**
     * 
     * @param pa
     *     The pa
     */
    public void setPa(Boolean pa) {
        this.pa = pa;
    }

    /**
     * 
     * @return
     *     The edited
     */
    public Boolean getEdited() {
        return edited;
    }

    /**
     * 
     * @param edited
     *     The edited
     */
    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    /**
     * 
     * @return
     *     The artKey
     */
    public String getArtKey() {
        return artKey;
    }

    /**
     * 
     * @param artKey
     *     The artKey
     */
    public void setArtKey(String artKey) {
        this.artKey = artKey;
    }

    /**
     * 
     * @return
     *     The children
     */
    public Boolean getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    public void setChildren(Boolean children) {
        this.children = children;
    }

    /**
     * 
     * @return
     *     The issueNumberDescription
     */
    public String getIssueNumberDescription() {
        return issueNumberDescription;
    }

    /**
     * 
     * @param issueNumberDescription
     *     The issueNumberDescription
     */
    public void setIssueNumberDescription(String issueNumberDescription) {
        this.issueNumberDescription = issueNumberDescription;
    }

    /**
     * 
     * @return
     *     The episode
     */
    public Integer getEpisode() {
        return episode;
    }

    /**
     * 
     * @param episode
     *     The episode
     */
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    /**
     * 
     * @return
     *     The season
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * 
     * @param season
     *     The season
     */
    public void setSeason(Integer season) {
        this.season = season;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

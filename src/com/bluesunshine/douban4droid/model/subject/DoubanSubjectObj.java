package com.bluesunshine.douban4droid.model.subject;

import com.bluesunshine.douban4droid.model.IDoubanObject;
import com.bluesunshine.douban4droid.model.common.DoubanAttributeObj;
import com.bluesunshine.douban4droid.model.common.DoubanAuthorObj;
import com.bluesunshine.douban4droid.model.common.DoubanCategoryObj;
import com.bluesunshine.douban4droid.model.common.DoubanLinkObj;
import com.bluesunshine.douban4droid.model.common.DoubanRatingObj;
import com.bluesunshine.douban4droid.model.common.DoubanTagObj;
import com.google.api.client.util.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Zhibo Wei <uglytroll@dongxuexidu.com>
 */
public class DoubanSubjectObj implements IDoubanObject {

  @Override
  public String getObjName() {
    return "subject";
  }
  
  @Key("category")
  private DoubanCategoryObj category;
  
  @Key("author")
  private List<DoubanAuthorObj> authors = new ArrayList<DoubanAuthorObj>();
  
  @Key
  private String title;
  
  @Key("summary")
  private String summary;
  
  @Key("link")
  private List<DoubanLinkObj> links = new ArrayList<DoubanLinkObj>();
  
  @Key("db:tag")
  private List<DoubanTagObj> tags = new ArrayList<DoubanTagObj>();
  
  @Key("db:attribute")
  private List<DoubanAttributeObj> attributes = new ArrayList<DoubanAttributeObj>();
  
  @Key
  private String id;
  
  @Key("gd:rating")
  private DoubanRatingObj rating;

  /**
   * @return the category
   */
  public DoubanCategoryObj getCategory() {
    return category;
  }

  /**
   * @param category the category to set
   */
  public void setCategory(DoubanCategoryObj category) {
    this.category = category;
  }

  /**
   * @return the authors
   */
  public List<DoubanAuthorObj> getAuthors() {
    return authors;
  }

  /**
   * @param authors the authors to set
   */
  public void setAuthors(List<DoubanAuthorObj> authors) {
    this.authors = authors;
  }

  public void addAuthor(DoubanAuthorObj author) {
    this.authors.add(author);
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @param links the links to set
   */
  public void setLinks(List<DoubanLinkObj> links) {
    this.links = links;
  }

  public void addLink(DoubanLinkObj link) {
    this.links.add(link);
  }
  
  public String getLinkByRel (String rel) {
    for (DoubanLinkObj obj : this.links) {
      if (obj.getRel().equalsIgnoreCase(rel)) {
        return obj.getHref();
      }
    }
    return null;
  }
  
  public List<DoubanLinkObj> getLinks() {
    return this.links;
  }

  /**
   * @return the attributes
   */
  public List<DoubanAttributeObj> getAttributes() {
    return attributes;
  }

  /**
   * @param attributes the attributes to set
   */
  public void addAttribute(DoubanAttributeObj attribute) {
    this.attributes.add(attribute);
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the rating
   */
  public DoubanRatingObj getRating() {
    return rating;
  }

  /**
   * @param rating the rating to set
   */
  public void setRating(DoubanRatingObj rating) {
    this.rating = rating;
  }

  /**
   * @return the tags
   */
  public List<DoubanTagObj> getTags() {
    return tags;
  }

  /**
   * @param tags the tags to set
   */
  public void setTags(List<DoubanTagObj> tags) {
    this.tags = tags;
  }
  
  public void addTag (DoubanTagObj tag) {
    if (this.tags == null) {
      this.tags = new ArrayList<DoubanTagObj>();
    }
    this.tags.add(tag);
  }

  /**
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * @param summary the summary to set
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }
}

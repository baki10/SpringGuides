package com.bakigoal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.util.ObjectUtils;

/**
 * Created by ilmir on 22.07.16.
 */
@JsonIgnoreProperties(ignoreUnknown = true) //any properties not bound in this type should be ignored
public class Quote {

  private Long id;

  private String quote;

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(final String quote) {
    this.quote = quote;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Quote)) {
      return false;
    }

    Quote that = (Quote) obj;

    return ObjectUtils.nullSafeEquals(this.getId(), that.getId());
  }

  @Override
  public int hashCode() {
    int hashValue = 17;
    hashValue = 37 * hashValue + ObjectUtils.nullSafeHashCode(getId());
    return hashValue;
  }

  @Override
  public String toString() {
    return getQuote();
  }
}
